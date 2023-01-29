/**
 * 0460. LFU Cache
 * Difficulty : Hard
 */

public class Solution_0460 {

    class LFUCache {
        public LFUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            if(!keyToVal.containsKey(key)) {
                return -1;
            }
            int freq = keyToFreq.get(key);
            freqToLRUKeys.get(freq).remove(key);
            if(freq == minFreq && freqToLRUKeys.get(freq).isEmpty()) {
                freqToLRUKeys.remove(freq);
                ++minFreq;
            }

            putFreq(key, freq + 1);
            return keyToVal.get(key);
        }

        public void put(int key, int value) {
            if (capacity == 0) {
                return;
            }
            if (keyToVal.containsKey(key)) {
                keyToVal.put(key, value);
                get(key); // Update key's count
                return;
            }

            if (keyToVal.size() == capacity) {
                // Evict LRU key from the minFreq list
                int keyToEvict = freqToLRUKeys.get(minFreq).iterator().next();
                freqToLRUKeys.get(minFreq).remove(keyToEvict);
                keyToVal.remove(keyToEvict);
            }
            minFreq = 1;
            putFreq(key, minFreq);    // Add new key and freq
            keyToVal.put(key, value); // Add new key and value
        }

        int capacity;
        int minFreq = 0;
        Map<Integer, Integer> keyToVal = new HashMap<>();
        Map<Integer, Integer> keyToFreq = new HashMap<>();
        Map<Integer, LinkedHashSet<Integer>> freqToLRUKeys = new HashMap<>();

        void putFreq(int key, int freq) {
            keyToFreq.put(key, freq);
            freqToLRUKeys.putIfAbsent(freq, new LinkedHashSet<>());
            freqToLRUKeys.get(freq).add(key);
        }
    }

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
