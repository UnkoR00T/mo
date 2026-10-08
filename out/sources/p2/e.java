package p2;

import fr.t;
import java.util.ArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001eR6\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010+j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010-\u001a\u0004\b!\u0010.\"\u0004\b/\u00100R\"\u00106\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u00102\u001a\u0004\b(\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lp2/e;", "Lo2/d;", "i", "()Lp2/e;", "", "group", "Loq/i0;", "f", "(Ljava/lang/Object;)V", "Lp2/c;", "anchor", "", "h", "(Lp2/c;)Z", "Lp2/o;", "writer", "", "l", "(Lp2/o;I)V", "Lp2/l;", "table", "k", "(Lp2/l;I)V", "predecessor", "g", "(Lp2/o;II)V", "j", "a", "I", "getKey", "()I", "key", "", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "sourceInformation", "c", "d", "dataStartOffset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "m", "(Ljava/util/ArrayList;)V", "groups", "Z", "()Z", "setClosed", "(Z)V", "closed", "setDataEndOffset", "(I)V", "dataEndOffset", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements o2.d {

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

    private final void f(Object group) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB == null) {
            arrayListB = new ArrayList<>();
        }
        m(arrayListB);
        arrayListB.add(group);
    }

    private final boolean h(c anchor) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB != null) {
            int size = arrayListB.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = arrayListB.get(i15);
                if (t.c(obj, anchor)) {
                    return true;
                }
                if ((obj instanceof e) && ((e) obj).h(anchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final e i() {
        Object obj;
        e eVarI;
        ArrayList<Object> arrayListB = b();
        if (arrayListB == null) {
            obj = null;
            break;
        }
        int size = arrayListB.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayListB.get(size);
            if ((obj instanceof e) && !((e) obj).getClosed()) {
                break;
            }
            size--;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return (eVar == null || (eVarI = eVar.i()) == null) ? this : eVarI;
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

    public final void g(SlotWriter writer, int predecessor, int group) {
        c cVarR1;
        ArrayList<Object> arrayListB = b();
        if (arrayListB == null) {
            arrayListB = new ArrayList<>();
            m(arrayListB);
        }
        int i15 = 0;
        if (predecessor >= 0 && (cVarR1 = writer.r1(predecessor)) != null) {
            int size = arrayListB.size();
            while (i15 < size) {
                Object obj = arrayListB.get(i15);
                if (!t.c(obj, cVarR1) && (!(obj instanceof e) || !((e) obj).h(cVarR1))) {
                    i15++;
                }
            }
            i15 = -1;
        }
        arrayListB.add(i15, writer.B(group));
    }

    @Override // o2.d
    public int getKey() {
        return this.key;
    }

    public final boolean j(c anchor) {
        ArrayList<Object> arrayListB = b();
        if (arrayListB != null) {
            for (int size = arrayListB.size() - 1; size >= 0; size--) {
                Object obj = arrayListB.get(size);
                if (obj instanceof c) {
                    if (t.c(obj, anchor)) {
                        arrayListB.remove(size);
                    }
                } else if ((obj instanceof e) && !((e) obj).j(anchor)) {
                    arrayListB.remove(size);
                }
            }
            if (arrayListB.isEmpty()) {
                m(null);
                return false;
            }
        }
        return true;
    }

    public final void k(l table, int group) {
        i().f(table.u(group));
    }

    public final void l(SlotWriter writer, int group) {
        i().f(writer.B(group));
    }

    public void m(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }
}
