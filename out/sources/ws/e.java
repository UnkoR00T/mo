package ws;

import java.util.LinkedList;
import java.util.List;
import oq.x;
import pq.v;
import us.p;
import us.q;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f214753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f214754b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f214755a;

        static {
            int[] iArr = new int[p.c.EnumC5227c.values().length];
            try {
                iArr[p.c.EnumC5227c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.c.EnumC5227c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.c.EnumC5227c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f214755a = iArr;
        }
    }

    public e(q qVar, p pVar) {
        this.f214753a = qVar;
        this.f214754b = pVar;
    }

    private final x<List<String>, List<String>, Boolean> c(int i15) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z15 = false;
        while (i15 != -1) {
            p.c cVarY = this.f214754b.y(i15);
            String strY = this.f214753a.y(cVarY.D());
            int i16 = a.f214755a[cVarY.B().ordinal()];
            if (i16 == 1) {
                linkedList2.addFirst(strY);
            } else if (i16 == 2) {
                linkedList.addFirst(strY);
            } else {
                if (i16 != 3) {
                    throw new oq.p();
                }
                linkedList2.addFirst(strY);
                z15 = true;
            }
            i15 = cVarY.C();
        }
        return new x<>(linkedList, linkedList2, Boolean.valueOf(z15));
    }

    @Override // ws.d
    public boolean a(int i15) {
        return c(i15).f().booleanValue();
    }

    @Override // ws.d
    public String b(int i15) {
        x<List<String>, List<String>, Boolean> xVarC = c(i15);
        List<String> listA = xVarC.a();
        String strV0 = v.v0(xVarC.b(), ".", null, null, 0, null, null, 62, null);
        if (listA.isEmpty()) {
            return strV0;
        }
        return v.v0(listA, "/", null, null, 0, null, null, 62, null) + '/' + strV0;
    }

    @Override // ws.d
    public String getString(int i15) {
        return this.f214753a.y(i15);
    }
}
