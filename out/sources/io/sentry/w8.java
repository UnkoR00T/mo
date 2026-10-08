package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
class w8<E> implements Collection<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<E> f95945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.sentry.util.a f95946b;

    w8(Collection<E> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f95945a = collection;
        this.f95946b = new io.sentry.util.a();
    }

    @Override // java.util.Collection
    public boolean add(E e15) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zAdd = e().add(e15);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zAdd;
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
    public boolean addAll(Collection<? extends E> collection) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zAddAll = e().addAll(collection);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zAddAll;
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
    public void clear() {
        g1 g1VarA = this.f95946b.a();
        try {
            e().clear();
            if (g1VarA != null) {
                g1VarA.close();
            }
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
    public boolean contains(Object obj) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zContains = e().contains(obj);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zContains;
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
    public boolean containsAll(Collection<?> collection) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zContainsAll = e().containsAll(collection);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zContainsAll;
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

    protected Collection<E> e() {
        return this.f95945a;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zIsEmpty = e().isEmpty();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zIsEmpty;
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return e().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zRemove = e().remove(obj);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zRemove;
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
    public boolean removeAll(Collection<?> collection) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zRemoveAll = e().removeAll(collection);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zRemoveAll;
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
    public boolean retainAll(Collection<?> collection) {
        g1 g1VarA = this.f95946b.a();
        try {
            boolean zRetainAll = e().retainAll(collection);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return zRetainAll;
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
    public int size() {
        g1 g1VarA = this.f95946b.a();
        try {
            int size = e().size();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return size;
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

    public String toString() {
        g1 g1VarA = this.f95946b.a();
        try {
            String string = e().toString();
            if (g1VarA != null) {
                g1VarA.close();
            }
            return string;
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
