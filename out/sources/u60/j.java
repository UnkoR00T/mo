package u60;

import c5.y;
import d1.x;
import er.l;
import er.p;
import er.r;
import er.s;
import f1.q;
import f1.q0;
import f1.y0;
import f3.m;
import java.util.List;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\u0099\u0001\u0010\u0011\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lu60/c;", "data", "Lf3/m;", "modifier", "Lkotlin/Function1;", "Lf1/q0;", "Loq/i0;", "loader", "endIndicator", "Lf1/e;", "errorItemContent", "Lf1/y0;", "listState", "Lkotlin/Function3;", "", "itemContent", "g", "(Lu60/c;Lf3/m;Ler/l;Ler/l;Ler/l;Lf1/y0;Ler/s;Lm2/r;II)V", "pagingListData", "index", "r", "(Lu60/c;I)V", "p", "(Lm2/r;I)Ler/l;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PagingListData<T> f195807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f195808g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PagingListData<T> pagingListData, int i15, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f195807f = pagingListData;
            this.f195808g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f195806e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            j.r(this.f195807f, this.f195808g);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f195807f, this.f195808g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PagingListData<T> f195810f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f195811g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PagingListData<T> pagingListData, int i15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f195810f = pagingListData;
            this.f195811g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f195809e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            j.r(this.f195810f, this.f195811g);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f195810f, this.f195811g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f195812a;

        public c(List list) {
            this.f195812a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f195812a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f195813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f195814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagingListData f195815c;

        public d(List list, s sVar, PagingListData pagingListData) {
            this.f195813a = list;
            this.f195814b = sVar;
            this.f195815c = pagingListData;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.f195813a.get(i15);
            int i18 = i17 & 126;
            rVar.X(-583236069);
            this.f195814b.C(eVar, Integer.valueOf(i15), obj, rVar, Integer.valueOf(i17 & 126));
            Integer numValueOf = Integer.valueOf(i15);
            boolean zG = rVar.G(this.f195815c) | ((((i17 & 112) ^ 48) > 32 && rVar.c(i15)) || (i17 & 48) == 32);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(this.f195815c, i15, null);
                rVar.v(objE);
            }
            Function0.d(numValueOf, (p) objE, rVar, (i18 >> 3) & 14);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f195816a;

        public e(List list) {
            this.f195816a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f195816a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f195817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f195818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PagingListData f195819c;

        public f(List list, s sVar, PagingListData pagingListData) {
            this.f195817a = list;
            this.f195818b = sVar;
            this.f195819c = pagingListData;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            Object obj = this.f195817a.get(i15);
            int i18 = i17 & 126;
            rVar.X(-1392429332);
            this.f195818b.C(eVar, Integer.valueOf(i15), obj, rVar, Integer.valueOf(i17 & 126));
            Integer numValueOf = Integer.valueOf(i15);
            boolean zG = rVar.G(this.f195819c) | ((((i17 & 112) ^ 48) > 32 && rVar.c(i15)) || (i17 & 48) == 32);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(this.f195819c, i15, null);
                rVar.v(objE);
            }
            Function0.d(numValueOf, (p) objE, rVar, (i18 >> 3) & 14);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"u60/j$g", "Lz3/a;", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagingListData<T> f195820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f195821b;

        g(PagingListData<T> pagingListData, y0 y0Var) {
            this.f195820a = pagingListData;
            this.f195821b = y0Var;
        }

        @Override // z3.a
        public /* bridge */ Object W0(long j15, long j16, tq.e<? super y> eVar) {
            return super.W0(j15, j16, eVar);
        }

        @Override // z3.a
        public /* bridge */ long d1(long j15, long j16, int i15) {
            return super.d1(j15, j16, i15);
        }

        @Override // z3.a
        public long h2(long available, int source) {
            boolean z15 = Float.intBitsToFloat((int) (available & BodyPartID.bodyIdMax)) < 0.0f;
            if (j.h(this.f195821b) && z15 && this.f195820a.getRetryOnOverscrollEnabled()) {
                this.f195820a.c().a();
            }
            return m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public /* bridge */ Object r2(long j15, tq.e<? super y> eVar) {
            return super.r2(j15, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195822a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f195822a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0176  */
    /* JADX WARN: Code duplicated, block: B:109:0x017a  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:128:0x0205  */
    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:132:0x0212  */
    /* JADX WARN: Code duplicated, block: B:134:0x0218  */
    /* JADX WARN: Code duplicated, block: B:136:0x024c  */
    /* JADX WARN: Code duplicated, block: B:138:0x025b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0279  */
    /* JADX WARN: Code duplicated, block: B:141:0x027b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0285  */
    /* JADX WARN: Code duplicated, block: B:145:0x0287  */
    /* JADX WARN: Code duplicated, block: B:148:0x0291  */
    /* JADX WARN: Code duplicated, block: B:150:0x0297  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    public static final <T> void g(final PagingListData<T> pagingListData, m mVar, l<? super q0, i0> lVar, l<? super q0, i0> lVar2, l<? super f1.e, i0> lVar3, final y0 y0Var, final s<? super f1.e, ? super Integer, ? super T, ? super p076m2.r, ? super Integer, i0> sVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        l<? super q0, i0> lVar4;
        int i18;
        l<? super q0, i0> lVar5;
        int i19;
        int i25;
        l<? super f1.e, i0> lVar6;
        int i26;
        boolean z15;
        final m mVar3;
        final l<? super q0, i0> lVar7;
        final l<? super f1.e, i0> lVar8;
        final l<? super q0, i0> lVar9;
        d5 d5VarM;
        l<? super q0, i0> lVarP;
        int i27;
        m mVar4;
        final l<? super q0, i0> lVar10;
        final l<? super q0, i0> lVar11;
        Object objE;
        Object objE2;
        p076m2.r.Companion companion;
        g gVar;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i28;
        m mVar5;
        final l<? super q0, i0> lVar12;
        l<? super f1.e, i0> lVar13;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objE3;
        final l<? super f1.e, i0> lVar14;
        l<? super f1.e, i0> lVar15;
        boolean z19;
        boolean z25;
        boolean z26;
        Object objE4;
        int i29;
        int i35;
        p076m2.r rVarH = rVar.h(-984070781);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(pagingListData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i36 = i16 & 2;
        if (i36 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    lVar4 = lVar;
                    int i37 = rVarH.G(lVar4) ? 256 : 128;
                    i17 |= i37;
                } else {
                    lVar4 = lVar;
                }
                i17 |= i37;
            } else {
                lVar4 = lVar;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar5 = lVar2;
                    if (rVarH.G(lVar5)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar6 = lVar3;
                        if (rVarH.G(lVar6)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 196608) == 0) {
                        if (rVarH.W(y0Var)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(sVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i36 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                lVarP = p(rVarH, 0);
                                i17 &= -897;
                            } else {
                                lVarP = lVar4;
                            }
                            if (i18 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new l() { // from class: u60.d
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j.i((q0) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar5 = (l) objE;
                            }
                            m mVar6 = mVar2;
                            i27 = i17;
                            mVar4 = mVar6;
                            lVar10 = lVarP;
                            lVar11 = lVar5;
                            if (i25 != 0) {
                                lVar6 = null;
                            }
                        } else {
                            rVarH.O();
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                            }
                            m mVar7 = mVar2;
                            i27 = i17;
                            mVar4 = mVar7;
                            lVar10 = lVar4;
                            lVar11 = lVar5;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                        }
                        objE2 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new g(pagingListData, y0Var);
                            rVarH.v(objE2);
                        }
                        gVar = (g) objE2;
                        m.Companion companion2 = m.INSTANCE;
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT = rVarH.t();
                        m mVarE = f3.j.e(rVarH, companion2);
                        androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC = n6.c(rVarH);
                        n6.i(rVarC, w0VarI, companion3.d());
                        n6.i(rVarC, e0VarT, companion3.f());
                        n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                        n6.g(rVarC, companion3.a());
                        n6.i(rVarC, mVarE, companion3.e());
                        x xVar = x.f39368a;
                        i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                        if (i28 != 1) {
                            mVar5 = mVar4;
                            lVar12 = lVar10;
                            lVar13 = lVar6;
                            rVarH.X(1504933637);
                            m mVarB = z3.d.b(mVar5, gVar, null, 2, null);
                            boolean zG = rVarH.G(pagingListData);
                            if ((i27 & 3670016) == 1048576) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z27 = zG | z16;
                            if ((57344 & i27) == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z27 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                            objE3 = rVarH.E();
                            if (!z18 || objE3 == companion.a()) {
                                lVar14 = lVar13;
                                objE3 = new l() { // from class: u60.e
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                lVar14 = lVar13;
                            }
                            lVar15 = lVar14;
                            f1.d.c(mVarB, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                            rVarH.R();
                        } else {
                            if (i28 == 2) {
                                rVarH.X(-1336928634);
                                rVarH.R();
                                throw new oq.p();
                            }
                            rVarH.X(1505521304);
                            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                            m mVarB2 = z3.d.b(mVar4, gVar, null, 2, null);
                            boolean zG2 = rVarH.G(pagingListData);
                            if ((i27 & 3670016) == 1048576) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z28 = zG2 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                            if ((i27 & 7168) == 2048) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = z28 | z25;
                            objE4 = rVarH.E();
                            if (z26 || objE4 == companion.a()) {
                                objE4 = new l() { // from class: u60.f
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                    }
                                };
                                rVarH.v(objE4);
                            }
                            lVar12 = lVar10;
                            lVar15 = lVar6;
                            mVar5 = mVar4;
                            f1.d.e(mVarB2, y0Var, null, false, fVarR, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                            rVarH.R();
                        }
                        rVarH.x();
                        if (t.k()) {
                            t.n();
                        }
                        lVar7 = lVar12;
                        mVar3 = mVar5;
                        lVar9 = lVar11;
                        lVar8 = lVar15;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        lVar7 = lVar4;
                        lVar8 = lVar6;
                        lVar9 = lVar5;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: u60.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                lVar6 = lVar3;
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(y0Var)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(sVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar8 = mVar2;
                        i27 = i17;
                        mVar4 = mVar8;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    } else {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar9 = mVar2;
                        i27 = i17;
                        mVar4 = mVar9;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new g(pagingListData, y0Var);
                        rVarH.v(objE2);
                    }
                    gVar = (g) objE2;
                    m.Companion companion4 = m.INSTANCE;
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = f3.j.e(rVarH, companion4);
                    androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion5.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion5.d());
                    n6.i(rVarC2, e0VarT2, companion5.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                    n6.g(rVarC2, companion5.a());
                    n6.i(rVarC2, mVarE2, companion5.e());
                    x xVar2 = x.f39368a;
                    i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                    if (i28 != 1) {
                        mVar5 = mVar4;
                        lVar12 = lVar10;
                        lVar13 = lVar6;
                        rVarH.X(1504933637);
                        m mVarB3 = z3.d.b(mVar5, gVar, null, 2, null);
                        boolean zG3 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z29 = zG3 | z16;
                        if ((57344 & i27) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z29 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        objE3 = rVarH.E();
                        if (z18) {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        lVar15 = lVar14;
                        f1.d.c(mVarB3, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                        rVarH.R();
                    } else {
                        if (i28 == 2) {
                            rVarH.X(-1336928634);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1505521304);
                        d1.i.f fVarR2 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                        m mVarB4 = z3.d.b(mVar4, gVar, null, 2, null);
                        boolean zG4 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z210 = zG4 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        if ((i27 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z210 | z25;
                        objE4 = rVarH.E();
                        if (z26) {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar12 = lVar10;
                        lVar15 = lVar6;
                        mVar5 = mVar4;
                        f1.d.e(mVarB4, y0Var, null, false, fVarR2, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                        rVarH.R();
                    }
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    lVar7 = lVar12;
                    mVar3 = mVar5;
                    lVar9 = lVar11;
                    lVar8 = lVar15;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar7 = lVar4;
                    lVar8 = lVar6;
                    lVar9 = lVar5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: u60.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            lVar5 = lVar2;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar6 = lVar3;
                    if (rVarH.G(lVar6)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(y0Var)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(sVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar10 = mVar2;
                        i27 = i17;
                        mVar4 = mVar10;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    } else {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar11 = mVar2;
                        i27 = i17;
                        mVar4 = mVar11;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new g(pagingListData, y0Var);
                        rVarH.v(objE2);
                    }
                    gVar = (g) objE2;
                    m.Companion companion6 = m.INSTANCE;
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = f3.j.e(rVarH, companion6);
                    androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion7.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC3 = n6.c(rVarH);
                    n6.i(rVarC3, w0VarI3, companion7.d());
                    n6.i(rVarC3, e0VarT3, companion7.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion7.c());
                    n6.g(rVarC3, companion7.a());
                    n6.i(rVarC3, mVarE3, companion7.e());
                    x xVar3 = x.f39368a;
                    i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                    if (i28 != 1) {
                        mVar5 = mVar4;
                        lVar12 = lVar10;
                        lVar13 = lVar6;
                        rVarH.X(1504933637);
                        m mVarB5 = z3.d.b(mVar5, gVar, null, 2, null);
                        boolean zG5 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z211 = zG5 | z16;
                        if ((57344 & i27) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z211 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        objE3 = rVarH.E();
                        if (z18) {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        lVar15 = lVar14;
                        f1.d.c(mVarB5, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                        rVarH.R();
                    } else {
                        if (i28 == 2) {
                            rVarH.X(-1336928634);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1505521304);
                        d1.i.f fVarR3 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                        m mVarB6 = z3.d.b(mVar4, gVar, null, 2, null);
                        boolean zG6 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z212 = zG6 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        if ((i27 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z212 | z25;
                        objE4 = rVarH.E();
                        if (z26) {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar12 = lVar10;
                        lVar15 = lVar6;
                        mVar5 = mVar4;
                        f1.d.e(mVarB6, y0Var, null, false, fVarR3, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                        rVarH.R();
                    }
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    lVar7 = lVar12;
                    mVar3 = mVar5;
                    lVar9 = lVar11;
                    lVar8 = lVar15;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar7 = lVar4;
                    lVar8 = lVar6;
                    lVar9 = lVar5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: u60.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar6 = lVar3;
            if ((i15 & 196608) == 0) {
                if (rVarH.W(y0Var)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(sVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar12 = mVar2;
                    i27 = i17;
                    mVar4 = mVar12;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                } else {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar13 = mVar2;
                    i27 = i17;
                    mVar4 = mVar13;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new g(pagingListData, y0Var);
                    rVarH.v(objE2);
                }
                gVar = (g) objE2;
                m.Companion companion8 = m.INSTANCE;
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = f3.j.e(rVarH, companion8);
                androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion9.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion9.d());
                n6.i(rVarC4, e0VarT4, companion9.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion9.c());
                n6.g(rVarC4, companion9.a());
                n6.i(rVarC4, mVarE4, companion9.e());
                x xVar4 = x.f39368a;
                i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                if (i28 != 1) {
                    mVar5 = mVar4;
                    lVar12 = lVar10;
                    lVar13 = lVar6;
                    rVarH.X(1504933637);
                    m mVarB7 = z3.d.b(mVar5, gVar, null, 2, null);
                    boolean zG7 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z213 = zG7 | z16;
                    if ((57344 & i27) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z213 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    objE3 = rVarH.E();
                    if (z18) {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    lVar15 = lVar14;
                    f1.d.c(mVarB7, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                    rVarH.R();
                } else {
                    if (i28 == 2) {
                        rVarH.X(-1336928634);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1505521304);
                    d1.i.f fVarR4 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                    m mVarB8 = z3.d.b(mVar4, gVar, null, 2, null);
                    boolean zG8 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z214 = zG8 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    if ((i27 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z214 | z25;
                    objE4 = rVarH.E();
                    if (z26) {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar12 = lVar10;
                    lVar15 = lVar6;
                    mVar5 = mVar4;
                    f1.d.e(mVarB8, y0Var, null, false, fVarR4, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                lVar7 = lVar12;
                mVar3 = mVar5;
                lVar9 = lVar11;
                lVar8 = lVar15;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar7 = lVar4;
                lVar8 = lVar6;
                lVar9 = lVar5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: u60.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                lVar4 = lVar;
                if (rVarH.G(lVar4)) {
                }
                i17 |= i37;
            } else {
                lVar4 = lVar;
            }
            i17 |= i37;
        } else {
            lVar4 = lVar;
        }
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                lVar5 = lVar2;
                if (rVarH.G(lVar5)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar6 = lVar3;
                    if (rVarH.G(lVar6)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(y0Var)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(sVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar14 = mVar2;
                        i27 = i17;
                        mVar4 = mVar14;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    } else {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            lVarP = p(rVarH, 0);
                            i17 &= -897;
                        } else {
                            lVarP = lVar4;
                        }
                        if (i18 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new l() { // from class: u60.d
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j.i((q0) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar5 = (l) objE;
                        }
                        m mVar15 = mVar2;
                        i27 = i17;
                        mVar4 = mVar15;
                        lVar10 = lVarP;
                        lVar11 = lVar5;
                        if (i25 != 0) {
                            lVar6 = null;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                    }
                    objE2 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new g(pagingListData, y0Var);
                        rVarH.v(objE2);
                    }
                    gVar = (g) objE2;
                    m.Companion companion10 = m.INSTANCE;
                    w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT5 = rVarH.t();
                    m mVarE5 = f3.j.e(rVarH, companion10);
                    androidx.compose.ui.node.c.Companion companion11 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion11.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC5 = n6.c(rVarH);
                    n6.i(rVarC5, w0VarI5, companion11.d());
                    n6.i(rVarC5, e0VarT5, companion11.f());
                    n6.i(rVarC5, Integer.valueOf(iHashCode5), companion11.c());
                    n6.g(rVarC5, companion11.a());
                    n6.i(rVarC5, mVarE5, companion11.e());
                    x xVar5 = x.f39368a;
                    i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                    if (i28 != 1) {
                        mVar5 = mVar4;
                        lVar12 = lVar10;
                        lVar13 = lVar6;
                        rVarH.X(1504933637);
                        m mVarB9 = z3.d.b(mVar5, gVar, null, 2, null);
                        boolean zG9 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z215 = zG9 | z16;
                        if ((57344 & i27) == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z215 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        objE3 = rVarH.E();
                        if (z18) {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            lVar14 = lVar13;
                            objE3 = new l() { // from class: u60.e
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        lVar15 = lVar14;
                        f1.d.c(mVarB9, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                        rVarH.R();
                    } else {
                        if (i28 == 2) {
                            rVarH.X(-1336928634);
                            rVarH.R();
                            throw new oq.p();
                        }
                        rVarH.X(1505521304);
                        d1.i.f fVarR5 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                        m mVarB10 = z3.d.b(mVar4, gVar, null, 2, null);
                        boolean zG10 = rVarH.G(pagingListData);
                        if ((i27 & 3670016) == 1048576) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z216 = zG10 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                        if ((i27 & 7168) == 2048) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z216 | z25;
                        objE4 = rVarH.E();
                        if (z26) {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        } else {
                            objE4 = new l() { // from class: u60.f
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                                }
                            };
                            rVarH.v(objE4);
                        }
                        lVar12 = lVar10;
                        lVar15 = lVar6;
                        mVar5 = mVar4;
                        f1.d.e(mVarB10, y0Var, null, false, fVarR5, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                        rVarH.R();
                    }
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    lVar7 = lVar12;
                    mVar3 = mVar5;
                    lVar9 = lVar11;
                    lVar8 = lVar15;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar7 = lVar4;
                    lVar8 = lVar6;
                    lVar9 = lVar5;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: u60.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            lVar6 = lVar3;
            if ((i15 & 196608) == 0) {
                if (rVarH.W(y0Var)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(sVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar16 = mVar2;
                    i27 = i17;
                    mVar4 = mVar16;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                } else {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar17 = mVar2;
                    i27 = i17;
                    mVar4 = mVar17;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new g(pagingListData, y0Var);
                    rVarH.v(objE2);
                }
                gVar = (g) objE2;
                m.Companion companion12 = m.INSTANCE;
                w0 w0VarI6 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = f3.j.e(rVarH, companion12);
                androidx.compose.ui.node.c.Companion companion13 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion13.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI6, companion13.d());
                n6.i(rVarC6, e0VarT6, companion13.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion13.c());
                n6.g(rVarC6, companion13.a());
                n6.i(rVarC6, mVarE6, companion13.e());
                x xVar6 = x.f39368a;
                i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                if (i28 != 1) {
                    mVar5 = mVar4;
                    lVar12 = lVar10;
                    lVar13 = lVar6;
                    rVarH.X(1504933637);
                    m mVarB11 = z3.d.b(mVar5, gVar, null, 2, null);
                    boolean zG11 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z217 = zG11 | z16;
                    if ((57344 & i27) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z217 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    objE3 = rVarH.E();
                    if (z18) {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    lVar15 = lVar14;
                    f1.d.c(mVarB11, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                    rVarH.R();
                } else {
                    if (i28 == 2) {
                        rVarH.X(-1336928634);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1505521304);
                    d1.i.f fVarR6 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                    m mVarB12 = z3.d.b(mVar4, gVar, null, 2, null);
                    boolean zG12 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z218 = zG12 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    if ((i27 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z218 | z25;
                    objE4 = rVarH.E();
                    if (z26) {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar12 = lVar10;
                    lVar15 = lVar6;
                    mVar5 = mVar4;
                    f1.d.e(mVarB12, y0Var, null, false, fVarR6, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                lVar7 = lVar12;
                mVar3 = mVar5;
                lVar9 = lVar11;
                lVar8 = lVar15;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar7 = lVar4;
                lVar8 = lVar6;
                lVar9 = lVar5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: u60.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        lVar5 = lVar2;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                lVar6 = lVar3;
                if (rVarH.G(lVar6)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((i15 & 196608) == 0) {
                if (rVarH.W(y0Var)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(sVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar18 = mVar2;
                    i27 = i17;
                    mVar4 = mVar18;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                } else {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        lVarP = p(rVarH, 0);
                        i17 &= -897;
                    } else {
                        lVarP = lVar4;
                    }
                    if (i18 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new l() { // from class: u60.d
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j.i((q0) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar5 = (l) objE;
                    }
                    m mVar19 = mVar2;
                    i27 = i17;
                    mVar4 = mVar19;
                    lVar10 = lVarP;
                    lVar11 = lVar5;
                    if (i25 != 0) {
                        lVar6 = null;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new g(pagingListData, y0Var);
                    rVarH.v(objE2);
                }
                gVar = (g) objE2;
                m.Companion companion14 = m.INSTANCE;
                w0 w0VarI7 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = f3.j.e(rVarH, companion14);
                androidx.compose.ui.node.c.Companion companion15 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion15.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC7 = n6.c(rVarH);
                n6.i(rVarC7, w0VarI7, companion15.d());
                n6.i(rVarC7, e0VarT7, companion15.f());
                n6.i(rVarC7, Integer.valueOf(iHashCode7), companion15.c());
                n6.g(rVarC7, companion15.a());
                n6.i(rVarC7, mVarE7, companion15.e());
                x xVar7 = x.f39368a;
                i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
                if (i28 != 1) {
                    mVar5 = mVar4;
                    lVar12 = lVar10;
                    lVar13 = lVar6;
                    rVarH.X(1504933637);
                    m mVarB13 = z3.d.b(mVar5, gVar, null, 2, null);
                    boolean zG13 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z219 = zG13 | z16;
                    if ((57344 & i27) == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z219 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    objE3 = rVarH.E();
                    if (z18) {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        lVar14 = lVar13;
                        objE3 = new l() { // from class: u60.e
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    lVar15 = lVar14;
                    f1.d.c(mVarB13, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                    rVarH.R();
                } else {
                    if (i28 == 2) {
                        rVarH.X(-1336928634);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(1505521304);
                    d1.i.f fVarR7 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                    m mVarB14 = z3.d.b(mVar4, gVar, null, 2, null);
                    boolean zG14 = rVarH.G(pagingListData);
                    if ((i27 & 3670016) == 1048576) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z2110 = zG14 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                    if ((i27 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z2110 | z25;
                    objE4 = rVarH.E();
                    if (z26) {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    } else {
                        objE4 = new l() { // from class: u60.f
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                            }
                        };
                        rVarH.v(objE4);
                    }
                    lVar12 = lVar10;
                    lVar15 = lVar6;
                    mVar5 = mVar4;
                    f1.d.e(mVarB14, y0Var, null, false, fVarR7, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                lVar7 = lVar12;
                mVar3 = mVar5;
                lVar9 = lVar11;
                lVar8 = lVar15;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar7 = lVar4;
                lVar8 = lVar6;
                lVar9 = lVar5;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: u60.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        lVar6 = lVar3;
        if ((i15 & 196608) == 0) {
            if (rVarH.W(y0Var)) {
                i35 = PKIFailureInfo.unsupportedVersion;
            } else {
                i35 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i35;
        }
        if ((i15 & 1572864) == 0) {
            if (rVarH.G(sVar)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i29;
        }
        if ((i17 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    lVarP = p(rVarH, 0);
                    i17 &= -897;
                } else {
                    lVarP = lVar4;
                }
                if (i18 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new l() { // from class: u60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.i((q0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar5 = (l) objE;
                }
                m mVar110 = mVar2;
                i27 = i17;
                mVar4 = mVar110;
                lVar10 = lVarP;
                lVar11 = lVar5;
                if (i25 != 0) {
                    lVar6 = null;
                }
            } else {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    lVarP = p(rVarH, 0);
                    i17 &= -897;
                } else {
                    lVarP = lVar4;
                }
                if (i18 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new l() { // from class: u60.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j.i((q0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar5 = (l) objE;
                }
                m mVar111 = mVar2;
                i27 = i17;
                mVar4 = mVar111;
                lVar10 = lVarP;
                lVar11 = lVar5;
                if (i25 != 0) {
                    lVar6 = null;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-984070781, i27, -1, "pl.gov.coi.common.ui.paging.PagingList (PagingList.kt:52)");
            }
            objE2 = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new g(pagingListData, y0Var);
                rVarH.v(objE2);
            }
            gVar = (g) objE2;
            m.Companion companion16 = m.INSTANCE;
            w0 w0VarI8 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT8 = rVarH.t();
            m mVarE8 = f3.j.e(rVarH, companion16);
            androidx.compose.ui.node.c.Companion companion17 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion17.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarI8, companion17.d());
            n6.i(rVarC8, e0VarT8, companion17.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion17.c());
            n6.g(rVarC8, companion17.a());
            n6.i(rVarC8, mVarE8, companion17.e());
            x xVar8 = x.f39368a;
            i28 = h.f195822a[pagingListData.getOrientation().ordinal()];
            if (i28 != 1) {
                mVar5 = mVar4;
                lVar12 = lVar10;
                lVar13 = lVar6;
                rVarH.X(1504933637);
                m mVarB15 = z3.d.b(mVar5, gVar, null, 2, null);
                boolean zG15 = rVarH.G(pagingListData);
                if ((i27 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2111 = zG15 | z16;
                if ((57344 & i27) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z2111 | z17 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar12)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                objE3 = rVarH.E();
                if (z18) {
                    lVar14 = lVar13;
                    objE3 = new l() { // from class: u60.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    lVar14 = lVar13;
                    objE3 = new l() { // from class: u60.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.j(pagingListData, lVar14, lVar12, sVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE3);
                }
                lVar15 = lVar14;
                f1.d.c(mVarB15, y0Var, null, false, null, null, null, false, null, (l) objE3, rVarH, (i27 >> 12) & 112, 508);
                rVarH.R();
            } else {
                if (i28 == 2) {
                    rVarH.X(-1336928634);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1505521304);
                d1.i.f fVarR8 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                m mVarB16 = z3.d.b(mVar4, gVar, null, 2, null);
                boolean zG16 = rVarH.G(pagingListData);
                if ((i27 & 3670016) == 1048576) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z2112 = zG16 | z19 | ((((i27 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVarH.W(lVar10)) || (i27 & MLKEMEngine.KyberPolyBytes) == 256);
                if ((i27 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z2112 | z25;
                objE4 = rVarH.E();
                if (z26) {
                    objE4 = new l() { // from class: u60.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE4);
                } else {
                    objE4 = new l() { // from class: u60.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.l(pagingListData, lVar10, lVar11, sVar, (q0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                lVar12 = lVar10;
                lVar15 = lVar6;
                mVar5 = mVar4;
                f1.d.e(mVarB16, y0Var, null, false, fVarR8, null, null, false, null, (l) objE4, rVarH, (i27 >> 12) & 112, 492);
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            lVar7 = lVar12;
            mVar3 = mVar5;
            lVar9 = lVar11;
            lVar8 = lVar15;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            lVar7 = lVar4;
            lVar8 = lVar6;
            lVar9 = lVar5;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: u60.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(pagingListData, mVar3, lVar7, lVar9, lVar8, y0Var, sVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(y0 y0Var) {
        q qVar = (q) v.z0(y0Var.C().j());
        return qVar != null && qVar.getIndex() == y0Var.C().getTotalItemsCount() - 1 && qVar.getOffset() + qVar.getSize() <= y0Var.C().getViewportEndOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(q0 q0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(PagingListData pagingListData, final l lVar, l lVar2, s sVar, q0 q0Var) {
        q0 q0Var2;
        List listB = pagingListData.b();
        q0Var.j(listB.size(), null, new c(listB), y2.m.b(2039820996, true, new d(listB, sVar, pagingListData)));
        if (lVar != null) {
            q0Var2 = q0Var;
            q0.c(q0Var2, null, null, y2.m.b(514985948, true, new er.q() { // from class: u60.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.k(lVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            q0Var2 = q0Var;
        }
        if (pagingListData.getIsLoading()) {
            lVar2.b(q0Var2);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(l lVar, f1.e eVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(eVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(514985948, i15, -1, "pl.gov.coi.common.ui.paging.PagingList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PagingList.kt:91)");
            }
            lVar.b(eVar);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(PagingListData pagingListData, l lVar, l lVar2, s sVar, q0 q0Var) {
        List listB = pagingListData.b();
        q0Var.j(listB.size(), null, new e(listB), y2.m.b(2039820996, true, new f(listB, sVar, pagingListData)));
        if (pagingListData.getIsLoading()) {
            lVar.b(q0Var);
        } else if (pagingListData.getAllLoaded()) {
            lVar2.b(q0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(PagingListData pagingListData, m mVar, l lVar, l lVar2, l lVar3, y0 y0Var, s sVar, int i15, int i16, p076m2.r rVar, int i17) {
        g(pagingListData, mVar, lVar, lVar2, lVar3, y0Var, sVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final l<q0, i0> p(p076m2.r rVar, int i15) {
        if (t.k()) {
            t.o(-2078525981, i15, -1, "pl.gov.coi.common.ui.paging.defaultLoader (PagingList.kt:132)");
        }
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new l() { // from class: u60.h
                @Override // er.l
                public final Object b(Object obj) {
                    return j.q((q0) obj);
                }
            };
            rVar.v(objE);
        }
        l<q0, i0> lVar = (l) objE;
        if (t.k()) {
            t.n();
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(q0 q0Var) {
        q0.c(q0Var, null, null, u60.b.f195777a.b(), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void r(PagingListData<T> pagingListData, int i15) {
        if (!(pagingListData.e() instanceof fy.c.Error) && i15 >= pagingListData.b().size() - pagingListData.getPrefetchDistance()) {
            pagingListData.c().a();
        }
    }
}
