package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
final class x8<E> extends w8<E> implements Queue<E> {
    private x8(Queue<E> queue) {
        super(queue);
    }

    static <E> x8<E> g(Queue<E> queue) {
        return new x8<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        g1 g1VarA = this.f95946b.a();
        try {
            E eElement = e().element();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return eElement;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zEquals = e().equals(obj);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zEquals;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.w8
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Queue<E> e() {
        return (Queue) super.e();
    }

    @Override // java.util.Collection
    public int hashCode() {
        g1 g1VarA = this.f95946b.a();
        try {
            int iHashCode = e().hashCode();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return iHashCode;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Queue
    public boolean offer(E e15) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zOffer = e().offer(e15);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zOffer;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Queue
    public E peek() {
        g1 g1VarA = this.f95946b.a();
        try {
            E ePeek = e().peek();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return ePeek;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Queue
    public E poll() {
        g1 g1VarA = this.f95946b.a();
        try {
            E ePoll = e().poll();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return ePoll;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Queue
    public E remove() {
        g1 g1VarA = this.f95946b.a();
        try {
            E eRemove = e().remove();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return eRemove;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        g1 g1VarA = this.f95946b.a();
        try {
            Object[] array = e().toArray();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return array;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        g1 g1VarA = this.f95946b.a();
        try {
            T[] tArr2 = (T[]) e().toArray(tArr);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return tArr2;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }
}
