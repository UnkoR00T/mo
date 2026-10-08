package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f36874a = new a("DOUBLE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f36875b = new y("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.y.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.z
        public Number b(zl.a aVar) {
            return new wl.z(aVar.q2());
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f36876c = new y("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.y.c
        {
            a aVar = null;
        }

        private Number g(String str, zl.a aVar) throws zl.d {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!aVar.J()) {
                        throw new zl.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.E());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e15) {
                throw new p("Cannot parse " + str + "; at path " + aVar.E(), e15);
            }
        }

        @Override // com.google.gson.z
        public Number b(zl.a aVar) throws IOException {
            String strQ2 = aVar.q2();
            if (strQ2.indexOf(46) >= 0) {
                return g(strQ2, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strQ2));
            } catch (NumberFormatException unused) {
                return g(strQ2, aVar);
            }
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f36877d = new y("BIG_DECIMAL", 3) { // from class: com.google.gson.y.d
        {
            a aVar = null;
        }

        @Override // com.google.gson.z
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(zl.a aVar) throws IOException {
            String strQ2 = aVar.q2();
            try {
                return wl.b0.b(strQ2);
            } catch (NumberFormatException e15) {
                throw new p("Cannot parse " + strQ2 + "; at path " + aVar.E(), e15);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ y[] f36878e = e();

    final enum a extends y {
        a(String str, int i15) {
            super(str, i15, null);
        }

        @Override // com.google.gson.z
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double b(zl.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    private y(String str, int i15) {
        super(str, i15);
    }

    private static /* synthetic */ y[] e() {
        return new y[]{f36874a, f36875b, f36876c, f36877d};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f36878e.clone();
    }

    /* synthetic */ y(String str, int i15, a aVar) {
        this(str, i15);
    }
}
