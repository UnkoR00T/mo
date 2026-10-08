package p114t0;

import c5.r;
import d1.h0;
import d1.p3;
import er.p;
import er.q;
import fr.w;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.m0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p076m2.x5;
import p076m2.z3;
import u0.d1;
import u0.k2;
import u0.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aS\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0011\u001a\u00020\f*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0014\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\f*\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ac\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0089\u0001\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00000\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b$\u0010%\u001a;\u0010'\u001a\u00020 \"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010&\u001a\u00028\u0000H\u0003¢\u0006\u0004\b'\u0010(\"\u001e\u0010+\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020 0\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006.²\u0006\u001e\u0010,\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00000\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Lf3/m;", "modifier", "Lt0/c0;", "enter", "Lt0/e0;", "exit", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Lt0/l;", "Loq/i0;", "content", "g", "(ZLf3/m;Lt0/c0;Lt0/e0;Ljava/lang/String;Ler/q;Lm2/r;II)V", "Ld1/p3;", "f", "(Ld1/p3;ZLf3/m;Lt0/c0;Lt0/e0;Ljava/lang/String;Ler/q;Lm2/r;II)V", "Ld1/h0;", "e", "(Ld1/h0;ZLf3/m;Lt0/c0;Lt0/e0;Ljava/lang/String;Ler/q;Lm2/r;II)V", "Lu0/d1;", "visibleState", "d", "(Ld1/h0;Lu0/d1;Lf3/m;Lt0/c0;Lt0/e0;Ljava/lang/String;Ler/q;Lm2/r;II)V", "T", "Lu0/k2;", "transition", "h", "(Lu0/k2;Ler/l;Lf3/m;Lt0/c0;Lt0/e0;Ler/q;Lm2/r;I)V", "Lkotlin/Function2;", "Lt0/x;", "shouldDisposeBlock", "Lt0/p0;", "onLookaheadMeasured", "a", "(Lu0/k2;Ler/l;Lf3/m;Lt0/c0;Lt0/e0;Ler/p;Lt0/p0;Ler/q;Lm2/r;II)V", "targetState", "l", "(Lu0/k2;Ler/l;Ljava/lang/Object;Lm2/r;I)Lt0/x;", "k", "(Lu0/k2;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements q<y0, v0, c5.b, x0> {

        /* JADX INFO: renamed from: t0.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class C4820a extends w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a2 f186325b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4820a(a2 a2Var) {
                super(1);
                this.f186325b = a2Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                a2.a.E(aVar, this.f186325b, 0, 0, 0.0f, 4, null);
            }
        }

        a(p0 p0Var) {
            super(3);
        }

        public final x0 c(y0 y0Var, v0 v0Var, long j15) {
            a2 a2VarO0 = v0Var.o0(j15);
            if (!y0Var.J0()) {
                return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new C4820a(a2VarO0), 4, null);
            }
            r.c((((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax) | (((long) a2VarO0.getWidth()) << 32));
            throw null;
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ x0 w(y0 y0Var, v0 v0Var, c5.b bVar) {
            return c(y0Var, v0Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<T> f186326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<T, Boolean> f186327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f186328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f186329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f186330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<x, x, Boolean> f186331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186332h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f186334k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(k2<T> k2Var, er.l<? super T, Boolean> lVar, f3.m mVar, c0 c0Var, e0 e0Var, p<? super x, ? super x, Boolean> pVar, p0 p0Var, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186326b = k2Var;
            this.f186327c = lVar;
            this.f186328d = mVar;
            this.f186329e = c0Var;
            this.f186330f = e0Var;
            this.f186331g = pVar;
            this.f186332h = qVar;
            this.f186333j = i15;
            this.f186334k = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.a(this.f186326b, this.f186327c, this.f186328d, this.f186329e, this.f186330f, this.f186331g, null, this.f186332h, rVar, g4.a(this.f186333j | 1), this.f186334k);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm2/z3;", "", "Loq/i0;", "<anonymous>", "(Lm2/z3;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements p<z3<Boolean>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f186336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ k2<x> f186337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f6<p<x, x, Boolean>> f186338h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements er.a<Boolean> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k2<x> f186339b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k2<x> k2Var) {
                super(0);
                this.f186339b = k2Var;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean a() {
                return Boolean.valueOf(k.k(this.f186339b));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "a", "(ZLtq/e;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z3<Boolean> f186340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k2<x> f186341b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f6<p<x, x, Boolean>> f186342c;

            /* JADX WARN: Multi-variable type inference failed */
            b(z3<Boolean> z3Var, k2<x> k2Var, f6<? extends p<? super x, ? super x, Boolean>> f6Var) {
                this.f186340a = z3Var;
                this.f186341b = k2Var;
                this.f186342c = f6Var;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }

            public final Object a(boolean z15, tq.e<? super i0> eVar) {
                this.f186340a.setValue(vq.b.a(z15 ? ((Boolean) k.b(this.f186342c).B(this.f186341b.p(), this.f186341b.w())).booleanValue() : false));
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(k2<x> k2Var, f6<? extends p<? super x, ? super x, Boolean>> f6Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f186337g = k2Var;
            this.f186338h = f6Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186335e;
            if (i15 == 0) {
                u.b(obj);
                z3 z3Var = (z3) this.f186336f;
                mu.g gVarQ = x5.q(new a(this.f186337g));
                b bVar = new b(z3Var, this.f186337g, this.f186338h);
                this.f186335e = 1;
                if (gVarQ.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(z3<Boolean> z3Var, tq.e<? super i0> eVar) {
            return ((c) v(z3Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f186337g, this.f186338h, eVar);
            cVar.f186336f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f186343b = new d();

        d() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Boolean bool) {
            return c(bool.booleanValue());
        }

        public final Boolean c(boolean z15) {
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class e extends w implements er.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f186344b = new e();

        e() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Boolean bool) {
            return c(bool.booleanValue());
        }

        public final Boolean c(boolean z15) {
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f186345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d1<Boolean> f186346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f186347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f186348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f186349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186351h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186352j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f186353k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(h0 h0Var, d1<Boolean> d1Var, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186345b = h0Var;
            this.f186346c = d1Var;
            this.f186347d = mVar;
            this.f186348e = c0Var;
            this.f186349f = e0Var;
            this.f186350g = str;
            this.f186351h = qVar;
            this.f186352j = i15;
            this.f186353k = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.d(this.f186345b, this.f186346c, this.f186347d, this.f186348e, this.f186349f, this.f186350g, this.f186351h, rVar, g4.a(this.f186352j | 1), this.f186353k);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f186354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f186355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0 f186356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e0 f186357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f186358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f186360h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186361j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186354b = z15;
            this.f186355c = mVar;
            this.f186356d = c0Var;
            this.f186357e = e0Var;
            this.f186358f = str;
            this.f186359g = qVar;
            this.f186360h = i15;
            this.f186361j = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.g(this.f186354b, this.f186355c, this.f186356d, this.f186357e, this.f186358f, this.f186359g, rVar, g4.a(this.f186360h | 1), this.f186361j);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class h extends w implements er.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f186362b = new h();

        h() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Boolean bool) {
            return c(bool.booleanValue());
        }

        public final Boolean c(boolean z15) {
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p3 f186363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f186364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f186365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f186366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f186367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186369h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186370j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f186371k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(p3 p3Var, boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186363b = p3Var;
            this.f186364c = z15;
            this.f186365d = mVar;
            this.f186366e = c0Var;
            this.f186367f = e0Var;
            this.f186368g = str;
            this.f186369h = qVar;
            this.f186370j = i15;
            this.f186371k = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.f(this.f186363b, this.f186364c, this.f186365d, this.f186366e, this.f186367f, this.f186368g, this.f186369h, rVar, g4.a(this.f186370j | 1), this.f186371k);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class j extends w implements er.l<Boolean, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f186372b = new j();

        j() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(Boolean bool) {
            return c(bool.booleanValue());
        }

        public final Boolean c(boolean z15) {
            return Boolean.valueOf(z15);
        }
    }

    /* JADX INFO: renamed from: t0.k$k, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C4821k extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f186373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f186374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f186375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f186376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f186377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186378g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186379h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186380j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f186381k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C4821k(h0 h0Var, boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186373b = h0Var;
            this.f186374c = z15;
            this.f186375d = mVar;
            this.f186376e = c0Var;
            this.f186377f = e0Var;
            this.f186378g = str;
            this.f186379h = qVar;
            this.f186380j = i15;
            this.f186381k = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.e(this.f186373b, this.f186374c, this.f186375d, this.f186376e, this.f186377f, this.f186378g, this.f186379h, rVar, g4.a(this.f186380j | 1), this.f186381k);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
    static final class l extends w implements q<y0, v0, c5.b, x0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<T, Boolean> f186382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k2<T> f186383c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a2 f186384b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a2 a2Var) {
                super(1);
                this.f186384b = a2Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                a2.a.E(aVar, this.f186384b, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(er.l<? super T, Boolean> lVar, k2<T> k2Var) {
            super(3);
            this.f186382b = lVar;
            this.f186383c = k2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final x0 c(y0 y0Var, v0 v0Var, long j15) {
            long jC;
            a2 a2VarO0 = v0Var.o0(j15);
            if (!y0Var.J0() || this.f186382b.b((T) this.f186383c.w()).booleanValue()) {
                jC = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
            } else {
                jC = r.INSTANCE.a();
            }
            return y0.j2(y0Var, (int) (jC >> 32), (int) (jC & BodyPartID.bodyIdMax), null, new a(a2VarO0), 4, null);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ x0 w(y0 y0Var, v0 v0Var, c5.b bVar) {
            return c(y0Var, v0Var, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt0/x;", "current", "target", "", "c", "(Lt0/x;Lt0/x;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class m extends w implements p<x, x, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f186385b = new m();

        m() {
            super(2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean B(x xVar, x xVar2) {
            return Boolean.valueOf(xVar == xVar2 && xVar2 == x.PostExit);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n extends w implements p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<T> f186386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.l<T, Boolean> f186387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f186388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c0 f186389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e0 f186390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p114t0.l, p076m2.r, Integer, i0> f186391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f186392h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(k2<T> k2Var, er.l<? super T, Boolean> lVar, f3.m mVar, c0 c0Var, e0 e0Var, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, int i15) {
            super(2);
            this.f186386b = k2Var;
            this.f186387c = lVar;
            this.f186388d = mVar;
            this.f186389e = c0Var;
            this.f186390f = e0Var;
            this.f186391g = qVar;
            this.f186392h = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            k.h(this.f186386b, this.f186387c, this.f186388d, this.f186389e, this.f186390f, this.f186391g, rVar, g4.a(this.f186392h | 1));
        }
    }

    public static final <T> void a(k2<T> k2Var, er.l<? super T, Boolean> lVar, f3.m mVar, c0 c0Var, e0 e0Var, p<? super x, ? super x, Boolean> pVar, p0 p0Var, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        p076m2.r rVar2;
        p0 p0Var2;
        f3.m mVarA;
        p0 p0Var3 = p0Var;
        p076m2.r rVarH = rVar.h(1912839215);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(k2Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.W(c0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(e0Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.G(pVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        int i18 = i16 & 64;
        int i19 = 1572864;
        if (i18 != 0) {
            i17 |= i19;
        } else if ((1572864 & i15) == 0) {
            i19 = (i15 & PKIFailureInfo.badSenderNonce) == 0 ? rVarH.W(p0Var3) : rVarH.G(p0Var3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            i17 |= i19;
        }
        if ((12582912 & i15) == 0) {
            i17 |= rVarH.G(qVar) ? 8388608 : 4194304;
        }
        int i25 = i17;
        boolean z15 = true;
        if (rVarH.r((4793491 & i25) != 4793490, i25 & 1)) {
            if (i18 != 0) {
                p0Var3 = null;
            }
            if (t.k()) {
                t.o(1912839215, i25, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:716)");
            }
            if (lVar.b(k2Var.w()).booleanValue() || lVar.b(k2Var.p()).booleanValue() || k2Var.B() || k2Var.q()) {
                rVarH.X(-232386135);
                int i26 = i25 & 14;
                int i27 = i26 | 48;
                int i28 = i27 & 14;
                boolean z16 = ((i28 ^ 6) > 4 && rVarH.W(k2Var)) || (i27 & 6) == 4;
                Object objE = rVarH.E();
                if (z16 || objE == p076m2.r.INSTANCE.a()) {
                    objE = k2Var.p();
                    rVarH.v(objE);
                }
                if (k2Var.B()) {
                    objE = k2Var.p();
                }
                rVarH.X(1844425648);
                p0 p0Var4 = p0Var3;
                if (t.k()) {
                    t.o(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                }
                int i29 = i25 & 126;
                x xVarL = l(k2Var, lVar, objE, rVarH, i29);
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                T tW = k2Var.w();
                rVarH.X(1844425648);
                if (t.k()) {
                    t.o(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:725)");
                }
                x xVarL2 = l(k2Var, lVar, tW, rVarH, i29);
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                p0Var2 = p0Var4;
                k2 k2VarN = v2.n(k2Var, xVarL, xVarL2, "EnterExitTransition", rVarH, i28 | 3072);
                c0 c0VarJ = a0.J(k2VarN, c0Var, rVarH, (i25 >> 6) & 112);
                e0 e0VarM = a0.M(k2VarN, e0Var, rVarH, (i25 >> 9) & 112);
                f6 f6VarP = x5.p(pVar, rVarH, (i25 >> 15) & 14);
                Boolean boolB = pVar.B(k2VarN.p(), k2VarN.w());
                boolean zW = rVarH.W(k2VarN) | rVarH.W(f6VarP);
                Object objE2 = rVarH.E();
                if (zW || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new c(k2VarN, f6VarP, null);
                    rVarH.v(objE2);
                }
                f6 f6VarL = x5.l(boolB, (p) objE2, rVarH, 0);
                if (k(k2VarN) && c(f6VarL)) {
                    rVarH.X(-229368781);
                    rVarH.R();
                    rVar2 = rVarH;
                } else {
                    rVarH.X(-230699766);
                    boolean z17 = i26 == 4;
                    Object objE3 = rVarH.E();
                    if (z17 || objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new p114t0.m(k2VarN);
                        rVarH.v(objE3);
                    }
                    p114t0.m mVar2 = (p114t0.m) objE3;
                    f3.m mVarG = a0.g(k2VarN, c0VarJ, e0VarM, false, null, "Built-in", rVarH, 199680, 8);
                    rVar2 = rVarH;
                    if (p0Var2 != null) {
                        rVar2.X(-230087268);
                        f3.m.Companion companion = f3.m.INSTANCE;
                        if ((3670016 & i25) != 1048576 && ((i25 & PKIFailureInfo.badSenderNonce) == 0 || !rVar2.G(p0Var2))) {
                            z15 = false;
                        }
                        Object objE4 = rVar2.E();
                        if (z15 || objE4 == p076m2.r.INSTANCE.a()) {
                            objE4 = new a(p0Var2);
                            rVar2.v(objE4);
                        }
                        mVarA = m0.a(companion, (q) objE4);
                        rVar2.R();
                    } else {
                        rVar2.X(-7404393);
                        rVar2.R();
                        mVarA = f3.m.INSTANCE;
                    }
                    f3.m mVarU = mVar.u(mVarG.u(mVarA));
                    Object objE5 = rVar2.E();
                    if (objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new p114t0.j(mVar2);
                        rVar2.v(objE5);
                    }
                    p114t0.j jVar = (p114t0.j) objE5;
                    int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                    e0 e0VarT = rVar2.t();
                    f3.m mVarE = f3.j.e(rVar2, mVarU);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC = n6.c(rVar2);
                    n6.i(rVarC, jVar, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.e(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    qVar.w(mVar2, rVar2, Integer.valueOf((i25 >> 18) & 112));
                    rVar2.x();
                    rVar2.R();
                }
                rVar2.R();
            } else {
                rVarH.X(-229362829);
                rVarH.R();
                p0Var2 = p0Var3;
                rVar2 = rVarH;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            p0Var2 = p0Var3;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new b(k2Var, lVar, mVar, c0Var, e0Var, pVar, p0Var2, qVar, i15, i16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<x, x, Boolean> b(f6<? extends p<? super x, ? super x, Boolean>> f6Var) {
        return (p) f6Var.getValue();
    }

    private static final boolean c(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0169  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void d(h0 h0Var, d1<Boolean> d1Var, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        c0 c0VarC;
        int i19;
        int i25;
        e0 e0Var2;
        int i26;
        int i27;
        int i28;
        boolean z15;
        f3.m mVar3;
        c0 c0Var2;
        e0 e0Var3;
        String str2;
        d5 d5VarM;
        f3.m mVar4;
        e0 e0VarC;
        String str3;
        Object objE;
        int i29;
        p076m2.r rVarH = rVar.h(-1238803325);
        if ((i15 & 48) == 0) {
            i17 = ((i15 & 64) == 0 ? rVarH.W(d1Var) : rVarH.G(d1Var) ? 32 : 16) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    c0VarC = c0Var;
                    if (rVarH.W(c0VarC)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        e0Var2 = e0Var;
                        if (rVarH.W(e0Var2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            if (rVarH.W(str)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((1572864 & i15) == 0) {
                            if (rVarH.G(qVar)) {
                                i29 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i29 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i29;
                        }
                        if ((599185 & i17) != 599184) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i35 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                            }
                            if (i25 != 0) {
                                e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                            } else {
                                e0VarC = e0Var2;
                            }
                            if (i27 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (t.k()) {
                                t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                            }
                            int i36 = i17 >> 3;
                            k2 k2VarT = v2.t(d1Var, str3, rVarH, d1.f193575d | (i36 & 14) | ((i17 >> 12) & 112), 0);
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = e.f186344b;
                                rVarH.v(objE);
                            }
                            c0 c0Var3 = c0VarC;
                            h(k2VarT, (er.l) objE, mVar4, c0Var3, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i36));
                            if (t.k()) {
                                t.n();
                            }
                            str2 = str3;
                            mVar3 = mVar4;
                            c0Var2 = c0Var3;
                            e0Var3 = e0VarC;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            c0Var2 = c0VarC;
                            e0Var3 = e0Var2;
                            str2 = str;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i37 = i17 >> 3;
                        k2 k2VarT2 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i37 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = e.f186344b;
                            rVarH.v(objE);
                        }
                        c0 c0Var4 = c0VarC;
                        h(k2VarT2, (er.l) objE, mVar4, c0Var4, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i37));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var4;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                e0Var2 = e0Var;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i38 = i17 >> 3;
                        k2 k2VarT3 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i38 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = e.f186344b;
                            rVarH.v(objE);
                        }
                        c0 c0Var5 = c0VarC;
                        h(k2VarT3, (er.l) objE, mVar4, c0Var5, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i38));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var5;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i39 = i17 >> 3;
                    k2 k2VarT4 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i39 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var6 = c0VarC;
                    h(k2VarT4, (er.l) objE, mVar4, c0Var6, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i39));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var6;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            c0VarC = c0Var;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i310 = i17 >> 3;
                        k2 k2VarT5 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i310 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = e.f186344b;
                            rVarH.v(objE);
                        }
                        c0 c0Var7 = c0VarC;
                        h(k2VarT5, (er.l) objE, mVar4, c0Var7, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i310));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var7;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i311 = i17 >> 3;
                    k2 k2VarT6 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i311 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var8 = c0VarC;
                    h(k2VarT6, (er.l) objE, mVar4, c0Var8, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i311));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var8;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i312 = i17 >> 3;
                    k2 k2VarT7 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i312 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var9 = c0VarC;
                    h(k2VarT7, (er.l) objE, mVar4, c0Var9, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i312));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var9;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i313 = i17 >> 3;
                k2 k2VarT8 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i313 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = e.f186344b;
                    rVarH.v(objE);
                }
                c0 c0Var10 = c0VarC;
                h(k2VarT8, (er.l) objE, mVar4, c0Var10, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i313));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var10;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                c0VarC = c0Var;
                if (rVarH.W(c0VarC)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                        }
                        int i314 = i17 >> 3;
                        k2 k2VarT9 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i314 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = e.f186344b;
                            rVarH.v(objE);
                        }
                        c0 c0Var11 = c0VarC;
                        h(k2VarT9, (er.l) objE, mVar4, c0Var11, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i314));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var11;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i315 = i17 >> 3;
                    k2 k2VarT10 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i315 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var12 = c0VarC;
                    h(k2VarT10, (er.l) objE, mVar4, c0Var12, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i315));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var12;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i316 = i17 >> 3;
                    k2 k2VarT11 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i316 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var13 = c0VarC;
                    h(k2VarT11, (er.l) objE, mVar4, c0Var13, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i316));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var13;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i317 = i17 >> 3;
                k2 k2VarT12 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i317 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = e.f186344b;
                    rVarH.v(objE);
                }
                c0 c0Var14 = c0VarC;
                h(k2VarT12, (er.l) objE, mVar4, c0Var14, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i317));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var14;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 3072;
        c0VarC = c0Var;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                e0Var2 = e0Var;
                if (rVarH.W(e0Var2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                    }
                    int i318 = i17 >> 3;
                    k2 k2VarT13 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i318 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = e.f186344b;
                        rVarH.v(objE);
                    }
                    c0 c0Var15 = c0VarC;
                    h(k2VarT13, (er.l) objE, mVar4, c0Var15, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i318));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var15;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i319 = i17 >> 3;
                k2 k2VarT14 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i319 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = e.f186344b;
                    rVarH.v(objE);
                }
                c0 c0Var16 = c0VarC;
                h(k2VarT14, (er.l) objE, mVar4, c0Var16, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i319));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var16;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 24576;
        e0Var2 = e0Var;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                if (rVarH.W(str)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
                }
                int i3110 = i17 >> 3;
                k2 k2VarT15 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i3110 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = e.f186344b;
                    rVarH.v(objE);
                }
                c0 c0Var17 = c0VarC;
                h(k2VarT15, (er.l) objE, mVar4, c0Var17, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3110));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var17;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 196608;
        if ((1572864 & i15) == 0) {
            if (rVarH.G(qVar)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i29;
        }
        if ((599185 & i17) != 599184) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i35 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                c0VarC = a0.m(null, null, false, null, 15, null).c(a0.o(null, 0.0f, 3, null));
            }
            if (i25 != 0) {
                e0VarC = a0.A(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
            } else {
                e0VarC = e0Var2;
            }
            if (i27 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (t.k()) {
                t.o(-1238803325, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:523)");
            }
            int i3111 = i17 >> 3;
            k2 k2VarT16 = v2.t(d1Var, str3, rVarH, d1.f193575d | (i3111 & 14) | ((i17 >> 12) & 112), 0);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = e.f186344b;
                rVarH.v(objE);
            }
            c0 c0Var18 = c0VarC;
            h(k2VarT16, (er.l) objE, mVar4, c0Var18, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3111));
            if (t.k()) {
                t.n();
            }
            str2 = str3;
            mVar3 = mVar4;
            c0Var2 = c0Var18;
            e0Var3 = e0VarC;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            c0Var2 = c0VarC;
            e0Var3 = e0Var2;
            str2 = str;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new f(h0Var, d1Var, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void e(h0 h0Var, boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        c0 c0VarC;
        int i19;
        int i25;
        e0 e0Var2;
        int i26;
        int i27;
        int i28;
        boolean z16;
        f3.m mVar3;
        c0 c0Var2;
        e0 e0Var3;
        String str2;
        d5 d5VarM;
        f3.m mVar4;
        e0 e0VarC;
        String str3;
        Object objE;
        int i29;
        p076m2.r rVarH = rVar.h(1799879339);
        if ((i15 & 48) == 0) {
            i17 = (rVarH.a(z15) ? 32 : 16) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    c0VarC = c0Var;
                    if (rVarH.W(c0VarC)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        e0Var2 = e0Var;
                        if (rVarH.W(e0Var2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            if (rVarH.W(str)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((1572864 & i15) == 0) {
                            if (rVarH.G(qVar)) {
                                i29 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i29 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i29;
                        }
                        if ((599185 & i17) != 599184) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (rVarH.r(z16, i17 & 1)) {
                            if (i35 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                            }
                            if (i25 != 0) {
                                e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                            } else {
                                e0VarC = e0Var2;
                            }
                            if (i27 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (t.k()) {
                                t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                            }
                            int i36 = i17 >> 3;
                            k2 k2VarX = v2.x(Boolean.valueOf(z15), str3, rVarH, (i36 & 14) | ((i17 >> 12) & 112), 0);
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = j.f186372b;
                                rVarH.v(objE);
                            }
                            c0 c0Var3 = c0VarC;
                            h(k2VarX, (er.l) objE, mVar4, c0Var3, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i36));
                            if (t.k()) {
                                t.n();
                            }
                            str2 = str3;
                            mVar3 = mVar4;
                            c0Var2 = c0Var3;
                            e0Var3 = e0VarC;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            c0Var2 = c0VarC;
                            e0Var3 = e0Var2;
                            str2 = str;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i37 = i17 >> 3;
                        k2 k2VarX2 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i37 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = j.f186372b;
                            rVarH.v(objE);
                        }
                        c0 c0Var4 = c0VarC;
                        h(k2VarX2, (er.l) objE, mVar4, c0Var4, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i37));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var4;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                e0Var2 = e0Var;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i38 = i17 >> 3;
                        k2 k2VarX3 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i38 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = j.f186372b;
                            rVarH.v(objE);
                        }
                        c0 c0Var5 = c0VarC;
                        h(k2VarX3, (er.l) objE, mVar4, c0Var5, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i38));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var5;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i39 = i17 >> 3;
                    k2 k2VarX4 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i39 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var6 = c0VarC;
                    h(k2VarX4, (er.l) objE, mVar4, c0Var6, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i39));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var6;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            c0VarC = c0Var;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i310 = i17 >> 3;
                        k2 k2VarX5 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i310 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = j.f186372b;
                            rVarH.v(objE);
                        }
                        c0 c0Var7 = c0VarC;
                        h(k2VarX5, (er.l) objE, mVar4, c0Var7, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i310));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var7;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i311 = i17 >> 3;
                    k2 k2VarX6 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i311 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var8 = c0VarC;
                    h(k2VarX6, (er.l) objE, mVar4, c0Var8, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i311));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var8;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i312 = i17 >> 3;
                    k2 k2VarX7 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i312 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var9 = c0VarC;
                    h(k2VarX7, (er.l) objE, mVar4, c0Var9, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i312));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var9;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i313 = i17 >> 3;
                k2 k2VarX8 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i313 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = j.f186372b;
                    rVarH.v(objE);
                }
                c0 c0Var10 = c0VarC;
                h(k2VarX8, (er.l) objE, mVar4, c0Var10, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i313));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var10;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                c0VarC = c0Var;
                if (rVarH.W(c0VarC)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                        }
                        int i314 = i17 >> 3;
                        k2 k2VarX9 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i314 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = j.f186372b;
                            rVarH.v(objE);
                        }
                        c0 c0Var11 = c0VarC;
                        h(k2VarX9, (er.l) objE, mVar4, c0Var11, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i314));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var11;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i315 = i17 >> 3;
                    k2 k2VarX10 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i315 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var12 = c0VarC;
                    h(k2VarX10, (er.l) objE, mVar4, c0Var12, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i315));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var12;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i316 = i17 >> 3;
                    k2 k2VarX11 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i316 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var13 = c0VarC;
                    h(k2VarX11, (er.l) objE, mVar4, c0Var13, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i316));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var13;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i317 = i17 >> 3;
                k2 k2VarX12 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i317 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = j.f186372b;
                    rVarH.v(objE);
                }
                c0 c0Var14 = c0VarC;
                h(k2VarX12, (er.l) objE, mVar4, c0Var14, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i317));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var14;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 3072;
        c0VarC = c0Var;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                e0Var2 = e0Var;
                if (rVarH.W(e0Var2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                    }
                    int i318 = i17 >> 3;
                    k2 k2VarX13 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i318 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = j.f186372b;
                        rVarH.v(objE);
                    }
                    c0 c0Var15 = c0VarC;
                    h(k2VarX13, (er.l) objE, mVar4, c0Var15, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i318));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var15;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i319 = i17 >> 3;
                k2 k2VarX14 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i319 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = j.f186372b;
                    rVarH.v(objE);
                }
                c0 c0Var16 = c0VarC;
                h(k2VarX14, (er.l) objE, mVar4, c0Var16, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i319));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var16;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 24576;
        e0Var2 = e0Var;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                if (rVarH.W(str)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
                }
                int i3110 = i17 >> 3;
                k2 k2VarX15 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i3110 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = j.f186372b;
                    rVarH.v(objE);
                }
                c0 c0Var17 = c0VarC;
                h(k2VarX15, (er.l) objE, mVar4, c0Var17, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3110));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var17;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 196608;
        if ((1572864 & i15) == 0) {
            if (rVarH.G(qVar)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i29;
        }
        if ((599185 & i17) != 599184) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            if (i35 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null));
            }
            if (i25 != 0) {
                e0VarC = a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null));
            } else {
                e0VarC = e0Var2;
            }
            if (i27 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (t.k()) {
                t.o(1799879339, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:278)");
            }
            int i3111 = i17 >> 3;
            k2 k2VarX16 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i3111 & 14) | ((i17 >> 12) & 112), 0);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = j.f186372b;
                rVarH.v(objE);
            }
            c0 c0Var18 = c0VarC;
            h(k2VarX16, (er.l) objE, mVar4, c0Var18, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3111));
            if (t.k()) {
                t.n();
            }
            str2 = str3;
            mVar3 = mVar4;
            c0Var2 = c0Var18;
            e0Var3 = e0VarC;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            c0Var2 = c0VarC;
            e0Var3 = e0Var2;
            str2 = str;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new C4821k(h0Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:84:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0161  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void f(p3 p3Var, boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        c0 c0VarC;
        int i19;
        int i25;
        e0 e0Var2;
        int i26;
        int i27;
        int i28;
        boolean z16;
        f3.m mVar3;
        c0 c0Var2;
        e0 e0Var3;
        String str2;
        d5 d5VarM;
        f3.m mVar4;
        e0 e0VarC;
        String str3;
        Object objE;
        int i29;
        p076m2.r rVarH = rVar.h(234057107);
        if ((i15 & 48) == 0) {
            i17 = (rVarH.a(z15) ? 32 : 16) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    c0VarC = c0Var;
                    if (rVarH.W(c0VarC)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        e0Var2 = e0Var;
                        if (rVarH.W(e0Var2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            if (rVarH.W(str)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((1572864 & i15) == 0) {
                            if (rVarH.G(qVar)) {
                                i29 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i29 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i29;
                        }
                        if ((599185 & i17) != 599184) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (rVarH.r(z16, i17 & 1)) {
                            if (i35 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                            }
                            if (i25 != 0) {
                                e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                            } else {
                                e0VarC = e0Var2;
                            }
                            if (i27 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (t.k()) {
                                t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                            }
                            int i36 = i17 >> 3;
                            k2 k2VarX = v2.x(Boolean.valueOf(z15), str3, rVarH, (i36 & 14) | ((i17 >> 12) & 112), 0);
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = h.f186362b;
                                rVarH.v(objE);
                            }
                            c0 c0Var3 = c0VarC;
                            h(k2VarX, (er.l) objE, mVar4, c0Var3, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i36));
                            if (t.k()) {
                                t.n();
                            }
                            str2 = str3;
                            mVar3 = mVar4;
                            c0Var2 = c0Var3;
                            e0Var3 = e0VarC;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            c0Var2 = c0VarC;
                            e0Var3 = e0Var2;
                            str2 = str;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i37 = i17 >> 3;
                        k2 k2VarX2 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i37 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = h.f186362b;
                            rVarH.v(objE);
                        }
                        c0 c0Var4 = c0VarC;
                        h(k2VarX2, (er.l) objE, mVar4, c0Var4, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i37));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var4;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                e0Var2 = e0Var;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i38 = i17 >> 3;
                        k2 k2VarX3 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i38 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = h.f186362b;
                            rVarH.v(objE);
                        }
                        c0 c0Var5 = c0VarC;
                        h(k2VarX3, (er.l) objE, mVar4, c0Var5, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i38));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var5;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i39 = i17 >> 3;
                    k2 k2VarX4 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i39 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var6 = c0VarC;
                    h(k2VarX4, (er.l) objE, mVar4, c0Var6, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i39));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var6;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            c0VarC = c0Var;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i310 = i17 >> 3;
                        k2 k2VarX5 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i310 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = h.f186362b;
                            rVarH.v(objE);
                        }
                        c0 c0Var7 = c0VarC;
                        h(k2VarX5, (er.l) objE, mVar4, c0Var7, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i310));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var7;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i311 = i17 >> 3;
                    k2 k2VarX6 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i311 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var8 = c0VarC;
                    h(k2VarX6, (er.l) objE, mVar4, c0Var8, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i311));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var8;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i312 = i17 >> 3;
                    k2 k2VarX7 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i312 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var9 = c0VarC;
                    h(k2VarX7, (er.l) objE, mVar4, c0Var9, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i312));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var9;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i313 = i17 >> 3;
                k2 k2VarX8 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i313 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = h.f186362b;
                    rVarH.v(objE);
                }
                c0 c0Var10 = c0VarC;
                h(k2VarX8, (er.l) objE, mVar4, c0Var10, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i313));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var10;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                c0VarC = c0Var;
                if (rVarH.W(c0VarC)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        if (rVarH.W(str)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((1572864 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i29;
                    }
                    if ((599185 & i17) != 599184) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        if (i35 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                        }
                        if (i25 != 0) {
                            e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                        }
                        int i314 = i17 >> 3;
                        k2 k2VarX9 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i314 & 14) | ((i17 >> 12) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = h.f186362b;
                            rVarH.v(objE);
                        }
                        c0 c0Var11 = c0VarC;
                        h(k2VarX9, (er.l) objE, mVar4, c0Var11, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i314));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var2 = c0Var11;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        c0Var2 = c0VarC;
                        e0Var3 = e0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 196608;
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i315 = i17 >> 3;
                    k2 k2VarX10 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i315 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var12 = c0VarC;
                    h(k2VarX10, (er.l) objE, mVar4, c0Var12, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i315));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var12;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i316 = i17 >> 3;
                    k2 k2VarX11 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i316 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var13 = c0VarC;
                    h(k2VarX11, (er.l) objE, mVar4, c0Var13, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i316));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var13;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i317 = i17 >> 3;
                k2 k2VarX12 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i317 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = h.f186362b;
                    rVarH.v(objE);
                }
                c0 c0Var14 = c0VarC;
                h(k2VarX12, (er.l) objE, mVar4, c0Var14, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i317));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var14;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 3072;
        c0VarC = c0Var;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                e0Var2 = e0Var;
                if (rVarH.W(e0Var2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    if (rVarH.W(str)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((1572864 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i29;
                }
                if ((599185 & i17) != 599184) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    if (i35 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                    }
                    if (i25 != 0) {
                        e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                    }
                    int i318 = i17 >> 3;
                    k2 k2VarX13 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i318 & 14) | ((i17 >> 12) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = h.f186362b;
                        rVarH.v(objE);
                    }
                    c0 c0Var15 = c0VarC;
                    h(k2VarX13, (er.l) objE, mVar4, c0Var15, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i318));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var2 = c0Var15;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    c0Var2 = c0VarC;
                    e0Var3 = e0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 196608;
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i319 = i17 >> 3;
                k2 k2VarX14 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i319 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = h.f186362b;
                    rVarH.v(objE);
                }
                c0 c0Var16 = c0VarC;
                h(k2VarX14, (er.l) objE, mVar4, c0Var16, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i319));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var16;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 24576;
        e0Var2 = e0Var;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                if (rVarH.W(str)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((1572864 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i29;
            }
            if ((599185 & i17) != 599184) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                if (i35 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
                }
                if (i25 != 0) {
                    e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i27 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
                }
                int i3110 = i17 >> 3;
                k2 k2VarX15 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i3110 & 14) | ((i17 >> 12) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = h.f186362b;
                    rVarH.v(objE);
                }
                c0 c0Var17 = c0VarC;
                h(k2VarX15, (er.l) objE, mVar4, c0Var17, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3110));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var2 = c0Var17;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                c0Var2 = c0VarC;
                e0Var3 = e0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 196608;
        if ((1572864 & i15) == 0) {
            if (rVarH.G(qVar)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i29;
        }
        if ((599185 & i17) != 599184) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            if (i35 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.i(null, null, false, null, 15, null));
            }
            if (i25 != 0) {
                e0VarC = a0.q(null, 0.0f, 3, null).c(a0.w(null, null, false, null, 15, null));
            } else {
                e0VarC = e0Var2;
            }
            if (i27 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (t.k()) {
                t.o(234057107, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:205)");
            }
            int i3111 = i17 >> 3;
            k2 k2VarX16 = v2.x(Boolean.valueOf(z15), str3, rVarH, (i3111 & 14) | ((i17 >> 12) & 112), 0);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = h.f186362b;
                rVarH.v(objE);
            }
            c0 c0Var18 = c0VarC;
            h(k2VarX16, (er.l) objE, mVar4, c0Var18, e0VarC, qVar, rVarH, (i17 & 896) | 48 | (i17 & 7168) | (i17 & 57344) | (458752 & i3111));
            if (t.k()) {
                t.n();
            }
            str2 = str3;
            mVar3 = mVar4;
            c0Var2 = c0Var18;
            e0Var3 = e0VarC;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            c0Var2 = c0VarC;
            e0Var3 = e0Var2;
            str2 = str;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new i(p3Var, z15, mVar3, c0Var2, e0Var3, str2, qVar, i15, i16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void g(boolean z15, f3.m mVar, c0 c0Var, e0 e0Var, String str, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15, int i16) {
        boolean z16;
        int i17;
        f3.m mVar2;
        int i18;
        c0 c0Var2;
        int i19;
        int i25;
        e0 e0Var2;
        int i26;
        int i27;
        int i28;
        boolean z17;
        String str2;
        f3.m mVar3;
        c0 c0Var3;
        e0 e0Var3;
        d5 d5VarM;
        int i29;
        f3.m mVar4;
        c0 c0VarC;
        e0 e0VarC;
        String str3;
        Object objE;
        int i35;
        p076m2.r rVarH = rVar.h(-1448730565);
        if ((i15 & 6) == 0) {
            z16 = z15;
            i17 = (rVarH.a(z16) ? 4 : 2) | i15;
        } else {
            z16 = z15;
            i17 = i15;
        }
        int i36 = i16 & 2;
        if (i36 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    c0Var2 = c0Var;
                    if (rVarH.W(c0Var2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        e0Var2 = e0Var;
                        if (rVarH.W(e0Var2)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 16;
                    if (i27 != 0) {
                        if ((i15 & 24576) == 0) {
                            if (rVarH.W(str)) {
                                i28 = 16384;
                            } else {
                                i28 = PKIFailureInfo.certRevoked;
                            }
                            i17 |= i28;
                        }
                        if ((196608 & i15) == 0) {
                            if (rVarH.G(qVar)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                        if ((74899 & i17) != 74898) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            if (i36 != 0) {
                                mVar4 = f3.m.INSTANCE;
                                i29 = i27;
                            } else {
                                i29 = i27;
                                mVar4 = mVar2;
                            }
                            if (i18 != 0) {
                                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                            } else {
                                c0VarC = c0Var2;
                            }
                            if (i25 != 0) {
                                e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                            } else {
                                e0VarC = e0Var2;
                            }
                            if (i29 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            if (t.k()) {
                                t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            k2 k2VarX = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = d.f186343b;
                                rVarH.v(objE);
                            }
                            er.l lVar = (er.l) objE;
                            int i37 = i17 << 3;
                            h(k2VarX, lVar, mVar4, c0VarC, e0VarC, qVar, rVarH, (i37 & 57344) | (i37 & 896) | 48 | (i37 & 7168) | (i17 & 458752));
                            if (t.k()) {
                                t.n();
                            }
                            str2 = str3;
                            mVar3 = mVar4;
                            c0Var3 = c0VarC;
                            e0Var3 = e0VarC;
                        } else {
                            rVarH.O();
                            str2 = str;
                            mVar3 = mVar2;
                            c0Var3 = c0Var2;
                            e0Var3 = e0Var2;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                        }
                    }
                    i17 |= 24576;
                    if ((196608 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((74899 & i17) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        if (i36 != 0) {
                            mVar4 = f3.m.INSTANCE;
                            i29 = i27;
                        } else {
                            i29 = i27;
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                        } else {
                            c0VarC = c0Var2;
                        }
                        if (i25 != 0) {
                            e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i29 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        k2 k2VarX2 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = d.f186343b;
                            rVarH.v(objE);
                        }
                        er.l lVar2 = (er.l) objE;
                        int i38 = i17 << 3;
                        h(k2VarX2, lVar2, mVar4, c0VarC, e0VarC, qVar, rVarH, (i38 & 57344) | (i38 & 896) | 48 | (i38 & 7168) | (i17 & 458752));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var3 = c0VarC;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        str2 = str;
                        mVar3 = mVar2;
                        c0Var3 = c0Var2;
                        e0Var3 = e0Var2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 3072;
                e0Var2 = e0Var;
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (rVarH.W(str)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((196608 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((74899 & i17) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        if (i36 != 0) {
                            mVar4 = f3.m.INSTANCE;
                            i29 = i27;
                        } else {
                            i29 = i27;
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                        } else {
                            c0VarC = c0Var2;
                        }
                        if (i25 != 0) {
                            e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i29 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        k2 k2VarX3 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = d.f186343b;
                            rVarH.v(objE);
                        }
                        er.l lVar3 = (er.l) objE;
                        int i39 = i17 << 3;
                        h(k2VarX3, lVar3, mVar4, c0VarC, e0VarC, qVar, rVarH, (i39 & 57344) | (i39 & 896) | 48 | (i39 & 7168) | (i17 & 458752));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var3 = c0VarC;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        str2 = str;
                        mVar3 = mVar2;
                        c0Var3 = c0Var2;
                        e0Var3 = e0Var2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX4 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar4 = (er.l) objE;
                    int i310 = i17 << 3;
                    h(k2VarX4, lVar4, mVar4, c0VarC, e0VarC, qVar, rVarH, (i310 & 57344) | (i310 & 896) | 48 | (i310 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            c0Var2 = c0Var;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (rVarH.W(str)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((196608 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((74899 & i17) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        if (i36 != 0) {
                            mVar4 = f3.m.INSTANCE;
                            i29 = i27;
                        } else {
                            i29 = i27;
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                        } else {
                            c0VarC = c0Var2;
                        }
                        if (i25 != 0) {
                            e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i29 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        k2 k2VarX5 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = d.f186343b;
                            rVarH.v(objE);
                        }
                        er.l lVar5 = (er.l) objE;
                        int i311 = i17 << 3;
                        h(k2VarX5, lVar5, mVar4, c0VarC, e0VarC, qVar, rVarH, (i311 & 57344) | (i311 & 896) | 48 | (i311 & 7168) | (i17 & 458752));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var3 = c0VarC;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        str2 = str;
                        mVar3 = mVar2;
                        c0Var3 = c0Var2;
                        e0Var3 = e0Var2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX6 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar6 = (er.l) objE;
                    int i312 = i17 << 3;
                    h(k2VarX6, lVar6, mVar4, c0VarC, e0VarC, qVar, rVarH, (i312 & 57344) | (i312 & 896) | 48 | (i312 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    if (rVarH.W(str)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX7 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar7 = (er.l) objE;
                    int i313 = i17 << 3;
                    h(k2VarX7, lVar7, mVar4, c0VarC, e0VarC, qVar, rVarH, (i313 & 57344) | (i313 & 896) | 48 | (i313 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            if ((196608 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                    i29 = i27;
                } else {
                    i29 = i27;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                } else {
                    c0VarC = c0Var2;
                }
                if (i25 != 0) {
                    e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i29 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                k2 k2VarX8 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = d.f186343b;
                    rVarH.v(objE);
                }
                er.l lVar8 = (er.l) objE;
                int i314 = i17 << 3;
                h(k2VarX8, lVar8, mVar4, c0VarC, e0VarC, qVar, rVarH, (i314 & 57344) | (i314 & 896) | 48 | (i314 & 7168) | (i17 & 458752));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var3 = c0VarC;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                str2 = str;
                mVar3 = mVar2;
                c0Var3 = c0Var2;
                e0Var3 = e0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                c0Var2 = c0Var;
                if (rVarH.W(c0Var2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    e0Var2 = e0Var;
                    if (rVarH.W(e0Var2)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 16;
                if (i27 != 0) {
                    if ((i15 & 24576) == 0) {
                        if (rVarH.W(str)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((196608 & i15) == 0) {
                        if (rVarH.G(qVar)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((74899 & i17) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        if (i36 != 0) {
                            mVar4 = f3.m.INSTANCE;
                            i29 = i27;
                        } else {
                            i29 = i27;
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                        } else {
                            c0VarC = c0Var2;
                        }
                        if (i25 != 0) {
                            e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                        } else {
                            e0VarC = e0Var2;
                        }
                        if (i29 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        if (t.k()) {
                            t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                        }
                        k2 k2VarX9 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = d.f186343b;
                            rVarH.v(objE);
                        }
                        er.l lVar9 = (er.l) objE;
                        int i315 = i17 << 3;
                        h(k2VarX9, lVar9, mVar4, c0VarC, e0VarC, qVar, rVarH, (i315 & 57344) | (i315 & 896) | 48 | (i315 & 7168) | (i17 & 458752));
                        if (t.k()) {
                            t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        c0Var3 = c0VarC;
                        e0Var3 = e0VarC;
                    } else {
                        rVarH.O();
                        str2 = str;
                        mVar3 = mVar2;
                        c0Var3 = c0Var2;
                        e0Var3 = e0Var2;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 24576;
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX10 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar10 = (er.l) objE;
                    int i316 = i17 << 3;
                    h(k2VarX10, lVar10, mVar4, c0VarC, e0VarC, qVar, rVarH, (i316 & 57344) | (i316 & 896) | 48 | (i316 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            e0Var2 = e0Var;
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    if (rVarH.W(str)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX11 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar11 = (er.l) objE;
                    int i317 = i17 << 3;
                    h(k2VarX11, lVar11, mVar4, c0VarC, e0VarC, qVar, rVarH, (i317 & 57344) | (i317 & 896) | 48 | (i317 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            if ((196608 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                    i29 = i27;
                } else {
                    i29 = i27;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                } else {
                    c0VarC = c0Var2;
                }
                if (i25 != 0) {
                    e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i29 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                k2 k2VarX12 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = d.f186343b;
                    rVarH.v(objE);
                }
                er.l lVar12 = (er.l) objE;
                int i318 = i17 << 3;
                h(k2VarX12, lVar12, mVar4, c0VarC, e0VarC, qVar, rVarH, (i318 & 57344) | (i318 & 896) | 48 | (i318 & 7168) | (i17 & 458752));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var3 = c0VarC;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                str2 = str;
                mVar3 = mVar2;
                c0Var3 = c0Var2;
                e0Var3 = e0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        c0Var2 = c0Var;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                e0Var2 = e0Var;
                if (rVarH.W(e0Var2)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            i27 = i16 & 16;
            if (i27 != 0) {
                if ((i15 & 24576) == 0) {
                    if (rVarH.W(str)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((196608 & i15) == 0) {
                    if (rVarH.G(qVar)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i36 != 0) {
                        mVar4 = f3.m.INSTANCE;
                        i29 = i27;
                    } else {
                        i29 = i27;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                    } else {
                        c0VarC = c0Var2;
                    }
                    if (i25 != 0) {
                        e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                    } else {
                        e0VarC = e0Var2;
                    }
                    if (i29 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    if (t.k()) {
                        t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                    }
                    k2 k2VarX13 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = d.f186343b;
                        rVarH.v(objE);
                    }
                    er.l lVar13 = (er.l) objE;
                    int i319 = i17 << 3;
                    h(k2VarX13, lVar13, mVar4, c0VarC, e0VarC, qVar, rVarH, (i319 & 57344) | (i319 & 896) | 48 | (i319 & 7168) | (i17 & 458752));
                    if (t.k()) {
                        t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    c0Var3 = c0VarC;
                    e0Var3 = e0VarC;
                } else {
                    rVarH.O();
                    str2 = str;
                    mVar3 = mVar2;
                    c0Var3 = c0Var2;
                    e0Var3 = e0Var2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 24576;
            if ((196608 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                    i29 = i27;
                } else {
                    i29 = i27;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                } else {
                    c0VarC = c0Var2;
                }
                if (i25 != 0) {
                    e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i29 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                k2 k2VarX14 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = d.f186343b;
                    rVarH.v(objE);
                }
                er.l lVar14 = (er.l) objE;
                int i3110 = i17 << 3;
                h(k2VarX14, lVar14, mVar4, c0VarC, e0VarC, qVar, rVarH, (i3110 & 57344) | (i3110 & 896) | 48 | (i3110 & 7168) | (i17 & 458752));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var3 = c0VarC;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                str2 = str;
                mVar3 = mVar2;
                c0Var3 = c0Var2;
                e0Var3 = e0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 3072;
        e0Var2 = e0Var;
        i27 = i16 & 16;
        if (i27 != 0) {
            if ((i15 & 24576) == 0) {
                if (rVarH.W(str)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((196608 & i15) == 0) {
                if (rVarH.G(qVar)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i36 != 0) {
                    mVar4 = f3.m.INSTANCE;
                    i29 = i27;
                } else {
                    i29 = i27;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
                } else {
                    c0VarC = c0Var2;
                }
                if (i25 != 0) {
                    e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
                } else {
                    e0VarC = e0Var2;
                }
                if (i29 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                if (t.k()) {
                    t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                }
                k2 k2VarX15 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = d.f186343b;
                    rVarH.v(objE);
                }
                er.l lVar15 = (er.l) objE;
                int i3111 = i17 << 3;
                h(k2VarX15, lVar15, mVar4, c0VarC, e0VarC, qVar, rVarH, (i3111 & 57344) | (i3111 & 896) | 48 | (i3111 & 7168) | (i17 & 458752));
                if (t.k()) {
                    t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                c0Var3 = c0VarC;
                e0Var3 = e0VarC;
            } else {
                rVarH.O();
                str2 = str;
                mVar3 = mVar2;
                c0Var3 = c0Var2;
                e0Var3 = e0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 24576;
        if ((196608 & i15) == 0) {
            if (rVarH.G(qVar)) {
                i35 = PKIFailureInfo.unsupportedVersion;
            } else {
                i35 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i35;
        }
        if ((74899 & i17) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i36 != 0) {
                mVar4 = f3.m.INSTANCE;
                i29 = i27;
            } else {
                i29 = i27;
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                c0VarC = a0.o(null, 0.0f, 3, null).c(a0.k(null, null, false, null, 15, null));
            } else {
                c0VarC = c0Var2;
            }
            if (i25 != 0) {
                e0VarC = a0.y(null, null, false, null, 15, null).c(a0.q(null, 0.0f, 3, null));
            } else {
                e0VarC = e0Var2;
            }
            if (i29 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            if (t.k()) {
                t.o(-1448730565, i17, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
            }
            k2 k2VarX16 = v2.x(Boolean.valueOf(z16), str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = d.f186343b;
                rVarH.v(objE);
            }
            er.l lVar16 = (er.l) objE;
            int i3112 = i17 << 3;
            h(k2VarX16, lVar16, mVar4, c0VarC, e0VarC, qVar, rVarH, (i3112 & 57344) | (i3112 & 896) | 48 | (i3112 & 7168) | (i17 & 458752));
            if (t.k()) {
                t.n();
            }
            str2 = str3;
            mVar3 = mVar4;
            c0Var3 = c0VarC;
            e0Var3 = e0VarC;
        } else {
            rVarH.O();
            str2 = str;
            mVar3 = mVar2;
            c0Var3 = c0Var2;
            e0Var3 = e0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new g(z16, mVar3, c0Var3, e0Var3, str2, qVar, i15, i16));
        }
    }

    public static final <T> void h(k2<T> k2Var, er.l<? super T, Boolean> lVar, f3.m mVar, c0 c0Var, e0 e0Var, q<? super p114t0.l, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, int i15) {
        int i16;
        e0 e0Var2;
        p076m2.r rVarH = rVar.h(1706321816);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(k2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(c0Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            e0Var2 = e0Var;
            i16 |= rVarH.W(e0Var2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            e0Var2 = e0Var;
        }
        if ((i15 & 196608) == 0) {
            i16 |= rVarH.G(qVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (t.k()) {
                t.o(1706321816, i16, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:678)");
            }
            int i17 = i16 & 112;
            int i18 = i16 & 14;
            boolean z15 = (i17 == 32) | (i18 == 4);
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new l(lVar, k2Var);
                rVarH.v(objE);
            }
            f3.m mVarA = m0.a(mVar, (q) objE);
            Object objE2 = rVarH.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = m.f186385b;
                rVarH.v(objE2);
            }
            a(k2Var, lVar, mVarA, c0Var, e0Var2, (p) objE2, null, qVar, rVarH, i17 | 196608 | i18 | (i16 & 7168) | (57344 & i16) | ((i16 << 6) & 29360128), 64);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new n(k2Var, lVar, mVar, c0Var, e0Var, qVar, i15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(k2<x> k2Var) {
        x xVarP = k2Var.p();
        x xVar = x.PostExit;
        return xVarP == xVar && k2Var.w() == xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> x l(k2<T> k2Var, er.l<? super T, Boolean> lVar, T t15, p076m2.r rVar, int i15) {
        x xVar;
        if (t.k()) {
            t.o(361571134, i15, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:848)");
        }
        rVar.J(-422486745, k2Var);
        if (k2Var.B()) {
            rVar.X(-212166497);
            rVar.R();
            if (lVar.b(t15).booleanValue()) {
                xVar = x.Visible;
            } else {
                xVar = lVar.b(k2Var.p()).booleanValue() ? x.PostExit : x.PreEnter;
            }
        } else {
            rVar.X(-211892364);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = c6.e(Boolean.FALSE, null, 2, null);
                rVar.v(objE);
            }
            a3 a3Var = (a3) objE;
            if (lVar.b(k2Var.p()).booleanValue()) {
                a3Var.setValue(Boolean.TRUE);
            }
            if (lVar.b(t15).booleanValue()) {
                xVar = x.Visible;
            } else {
                xVar = ((Boolean) a3Var.getValue()).booleanValue() ? x.PostExit : x.PreEnter;
            }
            rVar.R();
        }
        rVar.U();
        if (t.k()) {
            t.n();
        }
        return xVar;
    }
}
