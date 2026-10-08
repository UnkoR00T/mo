package t5;

import fu.r;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oq.l;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lt5/k;", "Lt5/i;", "<init>", "()V", "", "", "f", "()Ljava/util/Set;", "", "s", "", "g", "(Ljava/lang/String;)[J", "d", "()Ljava/lang/String;", "Lt5/c;", "ki", "Lt5/h;", "a", "(Lt5/c;)Lt5/h;", "Loq/k;", "e", "aliases", "core-backported-fixes"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k aliases = l.a(new er.a() { // from class: t5.j
        @Override // er.a
        public final Object a() {
            return k.c(this.f187689a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set c(k kVar) {
        return kVar.f();
    }

    private final String d() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
        } catch (Exception unused) {
            return "";
        }
    }

    private final Set<Integer> f() {
        BitSet bitSetValueOf = BitSet.valueOf(g(d()));
        int size = bitSetValueOf.size();
        if (size == 0) {
            return e1.e();
        }
        Set setC = e1.c(size);
        for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
            if (bitSetValueOf.get(iNextSetBit)) {
                setC.add(Integer.valueOf(iNextSetBit));
            }
            if (iNextSetBit == Integer.MAX_VALUE) {
                break;
            }
        }
        return e1.a(setC);
    }

    private final long[] g(String s15) {
        List listC = v.c();
        Iterator it = r.U0(s15, new char[]{','}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            try {
                listC.add(Long.valueOf(Long.parseLong((String) it.next())));
            } catch (NumberFormatException unused) {
            }
        }
        return v.g1(v.a(listC));
    }

    @Override // t5.i
    public h a(c ki4) {
        if (ki4.getAlias() == null) {
            return h.Unknown;
        }
        return e().contains(ki4.getAlias()) ? h.Fixed : h.NotFixed;
    }

    public final Set<Integer> e() {
        return (Set) this.aliases.getValue();
    }
}
