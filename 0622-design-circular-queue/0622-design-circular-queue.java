class MyCircularQueue {
    int[] q;
    int f, r;
    int size;
    int capacity;

    MyCircularQueue(int k) {
        f = -1;
        r = -1;
        size = 0;
        capacity = k;
        q = new int[k];
    }

    boolean enQueue(int x) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            f = 0;
            r = 0;
        } else {
            r = (r + 1) % capacity;
        }

        q[r] = x;
        size++;

        return true;
    }

    boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (f == r) {
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % capacity;
        }

        size--;

        return true;
    }

    int Front() {
        if (isEmpty()) {
            return -1;
        }

        return q[f];
    }

    int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return q[r];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }
}