package u0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\f\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\f\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\f\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\f\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0006*\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0006*\u0002088F¢\u0006\u0006\u001a\u0004\b\u0000\u00109\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u0006*\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0006*\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150\u0006*\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"T", "Lu0/t;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lu0/y2;", "K", "(Ler/l;Ler/l;)Lu0/y2;", "", "Lu0/p;", "a", "Lu0/y2;", "FloatToVector", "", "b", "IntToVector", "Lc5/h;", "c", "DpToVector", "Lc5/j;", "Lu0/q;", "d", "DpOffsetToVector", "Lm3/k;", "e", "SizeToVector", "Lm3/e;", "f", "OffsetToVector", "Lc5/n;", "g", "IntOffsetToVector", "Lc5/r;", "h", "IntSizeToVector", "Lm3/g;", "Lu0/s;", "i", "RectToVector", "Lkotlin/Float$Companion;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lfr/m;)Lu0/y2;", "VectorConverter", "Lkotlin/Int$Companion;", "Q", "(Lfr/s;)Lu0/y2;", "Lm3/g$a;", ip.a.f96137b, "(Lm3/g$a;)Lu0/y2;", "Lc5/h$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lc5/h$a;)Lu0/y2;", "Lc5/j$a;", "M", "(Lc5/j$a;)Lu0/y2;", "Lm3/k$a;", "(Lm3/k$a;)Lu0/y2;", "Lm3/e$a;", "R", "(Lm3/e$a;)Lu0/y2;", "Lc5/n$a;", "N", "(Lc5/n$a;)Lu0/y2;", "Lc5/r$a;", "O", "(Lc5/r$a;)Lu0/y2;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y2<Float, p> f193882a = K(new er.l() { // from class: u0.a3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.w(((Float) obj).floatValue());
        }
    }, new er.l() { // from class: u0.r3
        @Override // er.l
        public final Object b(Object obj) {
            return Float.valueOf(s3.x((p) obj));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final y2<Integer, p> f193883b = K(new er.l() { // from class: u0.b3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.C(((Integer) obj).intValue());
        }
    }, new er.l() { // from class: u0.c3
        @Override // er.l
        public final Object b(Object obj) {
            return Integer.valueOf(s3.D((p) obj));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y2<c5.h, p> f193884c = K(new er.l() { // from class: u0.d3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.u((c5.h) obj);
        }
    }, new er.l() { // from class: u0.e3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.v((p) obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y2<c5.j, q> f193885d = K(new er.l() { // from class: u0.f3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.s((c5.j) obj);
        }
    }, new er.l() { // from class: u0.g3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.t((q) obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final y2<m3.k, q> f193886e = K(new er.l() { // from class: u0.h3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.I((m3.k) obj);
        }
    }, new er.l() { // from class: u0.i3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.J((q) obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final y2<m3.e, q> f193887f = K(new er.l() { // from class: u0.j3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.E((m3.e) obj);
        }
    }, new er.l() { // from class: u0.k3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.F((q) obj);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final y2<c5.n, q> f193888g = K(new er.l() { // from class: u0.l3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.y((c5.n) obj);
        }
    }, new er.l() { // from class: u0.m3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.z((q) obj);
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final y2<c5.r, q> f193889h = K(new er.l() { // from class: u0.n3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.A((c5.r) obj);
        }
    }, new er.l() { // from class: u0.o3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.B((q) obj);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final y2<m3.g, s> f193890i = K(new er.l() { // from class: u0.p3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.G((m3.g) obj);
        }
    }, new er.l() { // from class: u0.q3
        @Override // er.l
        public final Object b(Object obj) {
            return s3.H((s) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final q A(c5.r rVar) {
        return new q((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.r B(q qVar) {
        int iRound = Math.round(qVar.getV1());
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(qVar.getV2());
        return c5.r.b(c5.r.c((((long) (iRound2 >= 0 ? iRound2 : 0)) & BodyPartID.bodyIdMax) | (((long) iRound) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p C(int i15) {
        return new p(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(p pVar) {
        return (int) pVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q E(m3.e eVar) {
        return new q(Float.intBitsToFloat((int) (eVar.getPackedValue() >> 32)), Float.intBitsToFloat((int) (eVar.getPackedValue() & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.e F(q qVar) {
        float v15 = qVar.getV1();
        float v16 = qVar.getV2();
        return m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(v15)) << 32) | (((long) Float.floatToRawIntBits(v16)) & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s G(m3.g gVar) {
        return new s(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g H(s sVar) {
        return new m3.g(sVar.getV1(), sVar.getV2(), sVar.getV3(), sVar.getV4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q I(m3.k kVar) {
        return new q(Float.intBitsToFloat((int) (kVar.getPackedValue() >> 32)), Float.intBitsToFloat((int) (kVar.getPackedValue() & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.k J(q qVar) {
        float v15 = qVar.getV1();
        float v16 = qVar.getV2();
        return m3.k.c(m3.k.d((((long) Float.floatToRawIntBits(v15)) << 32) | (((long) Float.floatToRawIntBits(v16)) & BodyPartID.bodyIdMax)));
    }

    public static final <T, V extends t> y2<T, V> K(er.l<? super T, ? extends V> lVar, er.l<? super V, ? extends T> lVar2) {
        return new z2(lVar, lVar2);
    }

    public static final y2<c5.h, p> L(c5.h.Companion companion) {
        return f193884c;
    }

    public static final y2<c5.j, q> M(c5.j.Companion companion) {
        return f193885d;
    }

    public static final y2<c5.n, q> N(c5.n.Companion companion) {
        return f193888g;
    }

    public static final y2<c5.r, q> O(c5.r.Companion companion) {
        return f193889h;
    }

    public static final y2<Float, p> P(fr.m mVar) {
        return f193882a;
    }

    public static final y2<Integer, p> Q(fr.s sVar) {
        return f193883b;
    }

    public static final y2<m3.e, q> R(m3.e.Companion companion) {
        return f193887f;
    }

    public static final y2<m3.g, s> S(m3.g.Companion companion) {
        return f193890i;
    }

    public static final y2<m3.k, q> T(m3.k.Companion companion) {
        return f193886e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q s(c5.j jVar) {
        return new q(c5.j.f(jVar.getPackedValue()), c5.j.g(jVar.getPackedValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.j t(q qVar) {
        float fN = c5.h.n(qVar.getV1());
        float fN2 = c5.h.n(qVar.getV2());
        return c5.j.b(c5.j.c((((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fN2)) & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p u(c5.h hVar) {
        return new p(hVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.h v(p pVar) {
        return c5.h.j(c5.h.n(pVar.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p w(float f15) {
        return new p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float x(p pVar) {
        return pVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q y(c5.n nVar) {
        return new q(c5.n.i(nVar.getPackedValue()), c5.n.j(nVar.getPackedValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n z(q qVar) {
        return c5.n.c(c5.n.d((((long) Math.round(qVar.getV1())) << 32) | (((long) Math.round(qVar.getV2())) & BodyPartID.bodyIdMax)));
    }
}
