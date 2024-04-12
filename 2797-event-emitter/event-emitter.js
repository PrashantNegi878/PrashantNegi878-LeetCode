class EventEmitter {
  constructor() {
    this.events = new Map();
  }

  subscribe(eventName, callback) {
    if (!this.events.has(eventName)) {
      this.events.set(eventName, []);
    }
    const subscribers = this.events.get(eventName);

    const unsubscribe = () => {
      const index = subscribers.indexOf(callback);
      if (index !== -1) {
        subscribers.splice(index, 1);
      }
    };
    subscribers.push(callback);
    return { unsubscribe };
  }

  emit(eventName, args = []) {
    const subscribers = this.events.get(eventName);
    if (!subscribers) {
      return [];
    }
    const results = [];
    for (const callback of subscribers) {
      results.push(callback(...args));
    }
    return results;
  }
}