package mp;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[][] f127349e = {new Object[]{Integer.valueOf(GF2Field.MASK), "notequal"}, new Object[]{260, "infinity"}, new Object[]{262, "lessequal"}, new Object[]{263, "greaterequal"}, new Object[]{266, "partialdiff"}, new Object[]{267, "summation"}, new Object[]{270, "product"}, new Object[]{271, "pi"}, new Object[]{272, "integral"}, new Object[]{275, "Omega"}, new Object[]{303, "radical"}, new Object[]{305, "approxequal"}, new Object[]{306, "Delta"}, new Object[]{327, "lozenge"}, new Object[]{333, "Euro"}, new Object[]{360, "apple"}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f127350f = new f();

    public f() {
        for (Object[] objArr : f127349e) {
            a(((Integer) objArr[0]).intValue(), objArr[1].toString());
        }
    }

    @Override // mp.g, hp.c
    public bp.b D1() {
        return null;
    }
}
