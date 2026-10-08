package c3;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import p076m2.w3;

/* JADX INFO: renamed from: c3.f0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 R*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001RB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JR$\u0010O\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010J¨\u0006S"}, d2 = {"Lc3/f0;", "T", "Landroid/os/Parcelable;", "Lc3/u0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lt2/e;", "persistentList", "<init>", "(Lt2/e;)V", "()V", "Lc3/w0;", "value", "Loq/i0;", "l", "(Lc3/w0;)V", "", "s", "()Ljava/util/List;", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "i", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "n", "(II)V", "start", "end", "q", "(Ljava/util/Collection;II)I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Lc3/w0;", "k", "()Lc3/w0;", "firstStateRecord", "h", "size", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateList<T> implements Parcelable, u0, List<T>, RandomAccess, gr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private w0 firstStateRecord;
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new a();

    /* JADX INFO: renamed from: c3.f0$a */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"c3/f0$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lc3/f0;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "c", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lc3/f0;", "b", "(Landroid/os/Parcel;)Lc3/f0;", "", "size", "", "e", "(I)[Lc3/f0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(Parcel parcel, ClassLoader classLoader, int i15) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object> createFromParcel(final Parcel parcel, final ClassLoader loader) {
            if (loader == null) {
                loader = a.class.getClassLoader();
            }
            return g0.a(parcel.readInt(), new er.l() { // from class: c3.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return SnapshotStateList.a.d(parcel, loader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<Object>[] newArray(int size) {
            return new SnapshotStateList[size];
        }
    }

    public SnapshotStateList(t2.e<? extends T> eVar) {
        this.firstStateRecord = g0.l(this, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(int i15, Collection collection, List list) {
        return list.addAll(i15, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarAdd = eVarJ.add(element);
            if (fr.t.c(eVarAdd, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarAdd, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection<? extends T> elements) {
        return g0.k(this, new er.l() { // from class: c3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(SnapshotStateList.g(index, elements, (List) obj));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        l lVarC;
        p0 p0Var = (p0) getFirstStateRecord();
        synchronized (w.M()) {
            lVarC = l.INSTANCE.c();
            p0 p0Var2 = (p0) w.n0(p0Var, this, lVarC);
            synchronized (g0.f22814a) {
                p0Var2.m(t2.a.b());
                p0Var2.n(p0Var2.getModification() + 1);
                p0Var2.o(p0Var2.getStructuralChange() + 1);
            }
        }
        w.V(lVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return g0.g(this).j().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return g0.g(this).j().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int index) {
        return g0.g(this).j().get(index);
    }

    public int h() {
        return g0.g(this).j().size();
    }

    public T i(int index) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        T t15 = get(index);
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarT0 = eVarJ.T0(index);
            if (fr.t.c(eVarT0, eVarJ)) {
                return t15;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarT0, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return t15;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return g0.g(this).j().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return g0.g(this).j().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // c3.u0
    /* JADX INFO: renamed from: k, reason: from getter */
    public w0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // c3.u0
    public void l(w0 value) {
        value.h(getFirstStateRecord());
        this.firstStateRecord = (p0) value;
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return g0.g(this).j().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new o0(this, 0);
    }

    public final void n(int fromIndex, int toIndex) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e.a<T> aVarBuilder = eVarJ.builder();
            aVarBuilder.subList(fromIndex, toIndex).clear();
            t2.e<T> eVarBuild = aVarBuilder.build();
            if (fr.t.c(eVarBuild, eVarJ)) {
                return;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarBuild, true);
            }
            w.V(lVarC, this);
        } while (!zF);
    }

    public final int q(Collection<? extends T> elements, int start, int end) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        int size = size();
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e.a<T> aVarBuilder = eVarJ.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            t2.e<T> eVarBuild = aVarBuilder.build();
            if (fr.t.c(eVarBuild, eVarJ)) {
                break;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarBuild, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return size - size();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i15) {
        return i(i15);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarRemoveAll = eVarJ.removeAll((Collection<? extends T>) elements);
            if (fr.t.c(eVarRemoveAll, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarRemoveAll, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<?> elements) {
        return g0.k(this, new er.l() { // from class: c3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(SnapshotStateList.o(elements, (List) obj));
            }
        });
    }

    public final List<T> s() {
        return g0.g(this).j();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        T t15 = get(index);
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVar = eVarJ.set(index, element);
            if (fr.t.c(eVar, eVarJ)) {
                return t15;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVar, false);
            }
            w.V(lVarC, this);
        } while (!zF);
        return t15;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            w3.a("fromIndex or toIndex are out of bounds");
        }
        return new x0(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return fr.j.a(this);
    }

    public String toString() {
        return "SnapshotStateList(value=" + ((p0) w.I((p0) getFirstStateRecord())).j() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List<T> listS = s();
        int size = listS.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeValue(listS.get(i15));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarAddAll = eVarJ.addAll(elements);
            if (fr.t.c(eVarAddAll, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarAddAll, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new o0(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarRemove = eVarJ.remove(element);
            if (fr.t.c(eVarRemove, eVarJ)) {
                return false;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarRemove, true);
            }
            w.V(lVarC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) fr.j.b(this, tArr);
    }

    public SnapshotStateList() {
        this(t2.a.b());
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int iK;
        t2.e<T> eVarJ;
        l lVarC;
        boolean zF;
        do {
            synchronized (g0.f22814a) {
                p0 p0Var = (p0) w.I((p0) getFirstStateRecord());
                iK = p0Var.getModification();
                eVarJ = p0Var.j();
                oq.i0 i0Var = oq.i0.f148189a;
            }
            t2.e<T> eVarAdd = eVarJ.add(index, element);
            if (fr.t.c(eVarAdd, eVarJ)) {
                return;
            }
            p0 p0Var2 = (p0) getFirstStateRecord();
            synchronized (w.M()) {
                lVarC = l.INSTANCE.c();
                zF = g0.f((p0) w.n0(p0Var2, this, lVarC), iK, eVarAdd, true);
            }
            w.V(lVarC, this);
        } while (!zF);
    }
}
