package bo;

import java.io.IOException;
import yn.a0;
import yn.t;
import yn.x;
import yn.y;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends z<Number> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a0 f20490b = f(x.f228085b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f20491a;

    class a implements a0 {
        a() {
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            if (aVar.d() == Number.class) {
                return j.this;
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20493a;

        static {
            int[] iArr = new int[ho.b.values().length];
            f20493a = iArr;
            try {
                iArr[ho.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20493a[ho.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20493a[ho.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private j(y yVar) {
        this.f20491a = yVar;
    }

    public static a0 e(y yVar) {
        return yVar == x.f228085b ? f20490b : f(yVar);
    }

    private static a0 f(y yVar) {
        return new j(yVar).new a();
    }

    @Override // yn.z
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Number b(ho.a aVar) throws IOException {
        ho.b bVarA0 = aVar.a0();
        int i15 = b.f20493a[bVarA0.ordinal()];
        if (i15 == 1) {
            aVar.O();
            return null;
        }
        if (i15 == 2 || i15 == 3) {
            return this.f20491a.b(aVar);
        }
        throw new t("Expecting number, got: " + bVarA0 + "; at path " + aVar.W());
    }

    @Override // yn.z
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ho.c cVar, Number number) throws IOException {
        cVar.C0(number);
    }
}
