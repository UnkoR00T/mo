package r2;

import java.util.ArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eRL\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`(2\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`(8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b\u001f\u0010+R\"\u00101\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010-\u001a\u0004\b%\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lr2/k;", "Lo2/d;", "", "key", "", "sourceInformation", "dataStartOffset", "<init>", "(ILjava/lang/String;I)V", "i", "()Lr2/k;", "", "group", "Loq/i0;", "f", "(Ljava/lang/Object;)V", "Lr2/i;", "anchor", "", "h", "(Lr2/i;)Z", "k", "(Lr2/i;)V", "predecessor", "g", "(Lr2/i;Lr2/i;)V", "j", "a", "I", "getKey", "()I", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "c", "d", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "groups", "Z", "()Z", "setClosed", "(Z)V", "closed", "setDataEndOffset", "(I)V", "dataEndOffset", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements o2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String sourceInformation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int dataStartOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Object> groups;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int dataEndOffset;

    public k(int i15, String str, int i16) {
        this.key = i15;
        this.sourceInformation = str;
        this.dataStartOffset = i16;
    }

    private final void f(Object group) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB == null) {
            arrayListB = new ArrayList<>();
            this.groups = arrayListB;
        }
        arrayListB.add(group);
    }

    private final boolean h(i anchor) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB != null) {
            int size = arrayListB.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = arrayListB.get(i15);
                if (fr.t.c(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof k) && ((k) obj).h(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final k i() {
        k kVarI;
        ArrayList<Object> arrayListB = b();
        Object obj = null;
        if (arrayListB != null) {
            for (int size = arrayListB.size() - 1; size >= 0; size--) {
                Object obj2 = arrayListB.get(size);
                if ((obj2 instanceof k) && !((k) obj2).getClosed()) {
                    obj = obj2;
                    break;
                }
            }
        }
        k kVar = (k) obj;
        return (kVar == null || (kVarI = kVar.i()) == null) ? this : kVarI;
    }

    @Override // o2.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getDataEndOffset() {
        return this.dataEndOffset;
    }

    @Override // o2.d
    public ArrayList<Object> b() {
        return this.groups;
    }

    @Override // o2.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getClosed() {
        return this.closed;
    }

    @Override // o2.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @Override // o2.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getSourceInformation() {
        return this.sourceInformation;
    }

    public final void g(i predecessor, i group) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB == null) {
            arrayListB = new ArrayList<>();
            this.groups = arrayListB;
        }
        int i15 = 0;
        if (predecessor != null) {
            int size = arrayListB.size();
            while (i15 < size) {
                Object obj = arrayListB.get(i15);
                if (!fr.t.c(obj, predecessor) && (!(obj instanceof k) || !((k) obj).h(predecessor))) {
                    i15++;
                }
            }
            i15 = -1;
        }
        arrayListB.add(i15, group);
    }

    @Override // o2.d
    public int getKey() {
        return this.key;
    }

    public final boolean j(i anchor) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB != null) {
            for (int size = arrayListB.size() - 1; size >= 0; size--) {
                Object obj = arrayListB.get(size);
                if (obj instanceof i) {
                    if (fr.t.c(obj, anchor)) {
                        arrayListB.remove(size);
                    }
                } else if ((obj instanceof k) && !((k) obj).j(anchor)) {
                    arrayListB.remove(size);
                }
            }
            if (arrayListB.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void k(i anchor) {
        i().f(anchor);
    }
}
