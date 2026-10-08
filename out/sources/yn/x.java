package yn;

import ao.c0;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f228084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f228085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f228086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f228087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ x[] f228088e;

    final enum a extends x {
        a(String str, int i15) {
            super(str, i15, null);
        }

        @Override // yn.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(ho.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f228084a = aVar;
        x xVar = new x("LAZILY_PARSED_NUMBER", 1) { // from class: yn.x.b
            {
                a aVar2 = null;
            }

            @Override // yn.y
            public Number b(ho.a aVar2) {
                return new ao.a0(aVar2.q2());
            }
        };
        f228085b = xVar;
        x xVar2 = new x("LONG_OR_DOUBLE", 2) { // from class: yn.x.c
            {
                a aVar2 = null;
            }

            private Number e(String str, ho.a aVar2) throws ho.d {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar2.J()) {
                            throw new ho.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.E());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e15) {
                    throw new p("Cannot parse " + str + "; at path " + aVar2.E(), e15);
                }
            }

            @Override // yn.y
            public Number b(ho.a aVar2) throws IOException {
                String strQ2 = aVar2.q2();
                if (strQ2.indexOf(46) >= 0) {
                    return e(strQ2, aVar2);
                }
                try {
                    return Long.valueOf(Long.parseLong(strQ2));
                } catch (NumberFormatException unused) {
                    return e(strQ2, aVar2);
                }
            }
        };
        f228086c = xVar2;
        x xVar3 = new x("BIG_DECIMAL", 3) { // from class: yn.x.d
            {
                a aVar2 = null;
            }

            @Override // yn.y
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public BigDecimal b(ho.a aVar2) throws IOException {
                String strQ2 = aVar2.q2();
                try {
                    return c0.b(strQ2);
                } catch (NumberFormatException e15) {
                    throw new p("Cannot parse " + strQ2 + "; at path " + aVar2.E(), e15);
                }
            }
        };
        f228087d = xVar3;
        f228088e = new x[]{aVar, xVar, xVar2, xVar3};
    }

    private x(String str, int i15) {
        super(str, i15);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f228088e.clone();
    }

    /* synthetic */ x(String str, int i15, a aVar) {
        this(str, i15);
    }
}
