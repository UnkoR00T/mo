package w7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f210705a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f210706b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f210707c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f210708d = Collections.EMPTY_LIST;

    public void e(E e15) {
        synchronized (this.f210705a) {
            try {
                ArrayList arrayList = new ArrayList(this.f210708d);
                arrayList.add(e15);
                this.f210708d = Collections.unmodifiableList(arrayList);
                Integer num = this.f210706b.get(e15);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f210707c);
                    hashSet.add(e15);
                    this.f210707c = Collections.unmodifiableSet(hashSet);
                }
                this.f210706b.put(e15, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void f(E e15) {
        synchronized (this.f210705a) {
            try {
                Integer num = this.f210706b.get(e15);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f210708d);
                arrayList.remove(e15);
                this.f210708d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f210706b.remove(e15);
                    HashSet hashSet = new HashSet(this.f210707c);
                    hashSet.remove(e15);
                    this.f210707c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f210706b.put(e15, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f210705a) {
            it = this.f210708d.iterator();
        }
        return it;
    }

    public int l3(E e15) {
        int iIntValue;
        synchronized (this.f210705a) {
            try {
                iIntValue = this.f210706b.containsKey(e15) ? this.f210706b.get(e15).intValue() : 0;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return iIntValue;
    }

    public Set<E> y2() {
        Set<E> set;
        synchronized (this.f210705a) {
            set = this.f210707c;
        }
        return set;
    }
}
