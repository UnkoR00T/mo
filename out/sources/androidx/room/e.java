package androidx.room;

import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/e;", "", "Landroidx/room/c$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/c$b;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "Loq/i0;", "c", "(Ljava/util/Set;)V", "invalidatedTablesNames", "d", "a", "Landroidx/room/c$b;", "()Landroidx/room/c$b;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c.b observer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tableIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> singleTableSet;

    public e(c.b bVar, int[] iArr, String[] strArr) {
        this.observer = bVar;
        this.tableIds = iArr;
        this.tableNames = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(strArr.length == 0) ? e1.d(strArr[0]) : e1.e();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c.b getObserver() {
        return this.observer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void c(Set<Integer> invalidatedTablesIds) {
        Set<String> setE;
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i15 = 0;
            if (length != 1) {
                Set setB = e1.b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i16 = 0;
                while (i15 < length2) {
                    int i17 = i16 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i15]))) {
                        setB.add(this.tableNames[i16]);
                    }
                    i15++;
                    i16 = i17;
                }
                setE = e1.a(setB);
            } else {
                setE = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : e1.e();
            }
        } else {
            setE = e1.e();
        }
        if (setE.isEmpty()) {
            return;
        }
        this.observer.c(setE);
    }

    public final void d(Set<String> invalidatedTablesNames) {
        Set<String> setE;
        int length = this.tableNames.length;
        if (length == 0) {
            setE = e1.e();
        } else if (length == 1) {
            Set<String> set = invalidatedTablesNames;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (r.G((String) it.next(), this.tableNames[0], true)) {
                            setE = this.singleTableSet;
                            break;
                        }
                    } else {
                        setE = e1.e();
                        break;
                    }
                }
            } else {
                setE = e1.e();
                break;
            }
        } else {
            Set setB = e1.b();
            for (String str : invalidatedTablesNames) {
                for (String str2 : this.tableNames) {
                    if (r.G(str2, str, true)) {
                        setB.add(str2);
                        break;
                    }
                }
            }
            setE = e1.a(setB);
        }
        if (setE.isEmpty()) {
            return;
        }
        this.observer.c(setE);
    }
}
