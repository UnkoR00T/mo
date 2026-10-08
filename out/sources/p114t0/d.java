package p114t0;

import androidx.compose.ui.platform.g1;
import c3.SnapshotStateList;
import er.l;
import er.p;
import er.q;
import f3.j;
import fr.t;
import fr.w;
import java.util.Iterator;
import oq.i0;
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
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;
import r0.t0;
import u0.j0;
import u0.k2;
import u0.m;
import u0.q1;
import u0.v2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0089\u0001\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00142 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u000e¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086\u0004¢\u0006\u0004\b\u001f\u0010 \u001a\u0081\u0001\u0010\"\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\"\u0010#\"\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {ip.a.f96137b, "targetState", "Lf3/m;", "modifier", "Lkotlin/Function1;", "Lt0/h;", "Lt0/v;", "transitionSpec", "Lf3/c;", "contentAlignment", "", AnnotatedPrivateKey.LABEL, "", "contentKey", "Lkotlin/Function2;", "Lt0/f;", "Loq/i0;", "content", "a", "(Ljava/lang/Object;Lf3/m;Ler/l;Lf3/c;Ljava/lang/String;Ler/l;Ler/r;Lm2/r;II)V", "", "clip", "Lc5/r;", "Lu0/j0;", "sizeAnimationSpec", "Lt0/y0;", "c", "(ZLer/p;)Lt0/y0;", "Lt0/c0;", "Lt0/e0;", "exit", "f", "(Lt0/c0;Lt0/e0;)Lt0/v;", "Lu0/k2;", "b", "(Lu0/k2;Lf3/m;Ler/l;Lf3/c;Ler/l;Ler/r;Lm2/r;II)V", "J", "UnspecifiedSize", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f186230a;

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ip.a.f96137b, "Lt0/h;", "Lt0/v;", "c", "(Lt0/h;)Lt0/v;"}, k = 3, mv = {2, 1, 0})
    static final class a<S> extends w implements l<p114t0.h<S>, v> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f186231b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v b(p114t0.h<S> hVar) {
            return d.f(a0.o(m.l(220, 90, null, 4, null), 0.0f, 2, null).c(a0.s(m.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), a0.q(m.l(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {ip.a.f96137b, "it", "b", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class b<S> extends w implements l<S, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f186232b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public final S b(S s15) {
            return s15;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f186233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f186234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<p114t0.h<S>, v> f186235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f3.c f186236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f186237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<S, Object> f186238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.r<p114t0.f, S, r, Integer, i0> f186239h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186240j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f186241k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(S s15, f3.m mVar, l<? super p114t0.h<S>, v> lVar, f3.c cVar, String str, l<? super S, ? extends Object> lVar2, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar, int i15, int i16) {
            super(2);
            this.f186233b = s15;
            this.f186234c = mVar;
            this.f186235d = lVar;
            this.f186236e = cVar;
            this.f186237f = str;
            this.f186238g = lVar2;
            this.f186239h = rVar;
            this.f186240j = i15;
            this.f186241k = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            d.a(this.f186233b, this.f186234c, this.f186235d, this.f186236e, this.f186237f, this.f186238g, this.f186239h, rVar, g4.a(this.f186240j | 1), this.f186241k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: t0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ip.a.f96137b, "Lt0/h;", "Lt0/v;", "c", "(Lt0/h;)Lt0/v;"}, k = 3, mv = {2, 1, 0})
    static final class C4815d<S> extends w implements l<p114t0.h<S>, v> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C4815d f186242b = new C4815d();

        C4815d() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final v b(p114t0.h<S> hVar) {
            return d.f(a0.o(m.l(220, 90, null, 4, null), 0.0f, 2, null).c(a0.s(m.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), a0.q(m.l(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {ip.a.f96137b, "it", "b", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class e<S> extends w implements l<S, S> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f186243b = new e();

        e() {
            super(1);
        }

        @Override // er.l
        public final S b(S s15) {
            return s15;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<S> f186244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f186245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<p114t0.h<S>, v> f186246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i<S> f186247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<S> f186248f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.r<p114t0.f, S, r, Integer, i0> f186249g;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
        static final class a extends w implements q<y0, v0, c5.b, x0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f186250b;

            /* JADX INFO: renamed from: t0.d$f$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
            static final class C4816a extends w implements l<a2.a, i0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a2 f186251b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ v f186252c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4816a(a2 a2Var, v vVar) {
                    super(1);
                    this.f186251b = a2Var;
                    this.f186252c = vVar;
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                    c(aVar);
                    return i0.f148189a;
                }

                public final void c(a2.a aVar) {
                    aVar.y(this.f186251b, 0, 0, this.f186252c.d());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar) {
                super(3);
                this.f186250b = vVar;
            }

            public final x0 c(y0 y0Var, v0 v0Var, long j15) {
                a2 a2VarO0 = v0Var.o0(j15);
                return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new C4816a(a2VarO0, this.f186250b), 4, null);
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ x0 w(y0 y0Var, v0 v0Var, c5.b bVar) {
                return c(y0Var, v0Var, bVar.getValue());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ip.a.f96137b, "it", "", "c", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
        static final class b<S> extends w implements l<S, Boolean> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ S f186253b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S s15) {
                super(1);
                this.f186253b = s15;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean b(S s15) {
                return Boolean.valueOf(t.c(s15, this.f186253b));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt0/x;", "currentState", "targetState", "", "c", "(Lt0/x;Lt0/x;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
        static final class c extends w implements p<x, x, Boolean> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f186254b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e0 e0Var) {
                super(2);
                this.f186254b = e0Var;
            }

            @Override // er.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean B(x xVar, x xVar2) {
                x xVar3 = x.PostExit;
                return Boolean.valueOf(xVar == xVar3 && xVar2 == xVar3 && !this.f186254b.getData().getHold());
            }
        }

        /* JADX INFO: renamed from: t0.d$f$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lt0/l;", "Loq/i0;", "c", "(Lt0/l;Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
        static final class C4817d extends w implements q<l, r, Integer, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<S> f186255b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f186256c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i<S> f186257d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ er.r<p114t0.f, S, r, Integer, i0> f186258e;

            /* JADX INFO: renamed from: t0.d$f$d$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
            static final class a extends w implements l<s0, r0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ SnapshotStateList<S> f186259b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ S f186260c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ i<S> f186261d;

                /* JADX INFO: renamed from: t0.d$f$d$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"t0/d$f$d$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class C4818a implements r0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SnapshotStateList f186262a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Object f186263b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ i f186264c;

                    public C4818a(SnapshotStateList snapshotStateList, Object obj, i iVar) {
                        this.f186262a = snapshotStateList;
                        this.f186263b = obj;
                        this.f186264c = iVar;
                    }

                    @Override // p076m2.r0
                    public void j() {
                        this.f186262a.remove(this.f186263b);
                        this.f186264c.h().u(this.f186263b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SnapshotStateList<S> snapshotStateList, S s15, i<S> iVar) {
                    super(1);
                    this.f186259b = snapshotStateList;
                    this.f186260c = s15;
                    this.f186261d = iVar;
                }

                @Override // er.l
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final r0 b(s0 s0Var) {
                    return new C4818a(this.f186259b, this.f186260c, this.f186261d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C4817d(SnapshotStateList<S> snapshotStateList, S s15, i<S> iVar, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar) {
                super(3);
                this.f186255b = snapshotStateList;
                this.f186256c = s15;
                this.f186257d = iVar;
                this.f186258e = rVar;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v10 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            public final void c(p114t0.l r7, p076m2.r r8, int r9) {
                /*
                    r6 = this;
                    r0 = r9 & 6
                    if (r0 != 0) goto L17
                    r0 = r9 & 8
                    if (r0 != 0) goto Ld
                    boolean r0 = r8.W(r7)
                    goto L11
                Ld:
                    boolean r0 = r8.G(r7)
                L11:
                    if (r0 == 0) goto L15
                    r0 = 4
                    goto L16
                L15:
                    r0 = 2
                L16:
                    r9 = r9 | r0
                L17:
                    r0 = r9 & 19
                    r1 = 18
                    r2 = 0
                    if (r0 == r1) goto L20
                    r0 = 1
                    goto L21
                L20:
                    r0 = r2
                L21:
                    r1 = r9 & 1
                    boolean r0 = r8.r(r0, r1)
                    if (r0 == 0) goto Lac
                    boolean r0 = p076m2.t.k()
                    if (r0 == 0) goto L38
                    r0 = -1
                    java.lang.String r1 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)"
                    r3 = -143346359(0xfffffffff774b549, float:-4.9632708E33)
                    p076m2.t.o(r3, r9, r0, r1)
                L38:
                    c3.f0<S> r0 = r6.f186255b
                    boolean r0 = r8.W(r0)
                    S r1 = r6.f186256c
                    boolean r1 = r8.G(r1)
                    r0 = r0 | r1
                    t0.i<S> r1 = r6.f186257d
                    boolean r1 = r8.G(r1)
                    r0 = r0 | r1
                    c3.f0<S> r1 = r6.f186255b
                    S r3 = r6.f186256c
                    t0.i<S> r4 = r6.f186257d
                    java.lang.Object r5 = r8.E()
                    if (r0 != 0) goto L60
                    m2.r$a r0 = p076m2.r.INSTANCE
                    java.lang.Object r0 = r0.a()
                    if (r5 != r0) goto L68
                L60:
                    t0.d$f$d$a r5 = new t0.d$f$d$a
                    r5.<init>(r1, r3, r4)
                    r8.v(r5)
                L68:
                    er.l r5 = (er.l) r5
                    r9 = r9 & 14
                    p076m2.Function0.a(r7, r5, r8, r9)
                    t0.i<S> r9 = r6.f186257d
                    r0.t0 r9 = r9.h()
                    S r0 = r6.f186256c
                    r1 = r7
                    t0.m r1 = (p114t0.m) r1
                    m2.a3 r1 = r1.a()
                    r9.x(r0, r1)
                    java.lang.Object r9 = r8.E()
                    m2.r$a r0 = p076m2.r.INSTANCE
                    java.lang.Object r0 = r0.a()
                    if (r9 != r0) goto L95
                    t0.g r9 = new t0.g
                    r9.<init>(r7)
                    r8.v(r9)
                L95:
                    t0.g r9 = (p114t0.g) r9
                    er.r<t0.f, S, m2.r, java.lang.Integer, oq.i0> r7 = r6.f186258e
                    S r0 = r6.f186256c
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                    r7.g(r9, r0, r8, r1)
                    boolean r7 = p076m2.t.k()
                    if (r7 == 0) goto Lab
                    p076m2.t.n()
                Lab:
                    return
                Lac:
                    r8.O()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: t0.d.f.C4817d.c(t0.l, m2.r, int):void");
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ i0 w(l lVar, r rVar, Integer num) {
                c(lVar, rVar, num.intValue());
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k2<S> k2Var, S s15, l<? super p114t0.h<S>, v> lVar, i<S> iVar, SnapshotStateList<S> snapshotStateList, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar) {
            super(2);
            this.f186244b = k2Var;
            this.f186245c = s15;
            this.f186246d = lVar;
            this.f186247e = iVar;
            this.f186248f = snapshotStateList;
            this.f186249g = rVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void c(r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-23915175, i15, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
            }
            l<p114t0.h<S>, v> lVar = this.f186246d;
            p114t0.h hVar = this.f186247e;
            v vVarE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (vVarE == companion.a()) {
                vVarE = lVar.b(hVar);
                rVar.v(vVarE);
            }
            v vVar = (v) vVarE;
            boolean zA = rVar.a(t.c(this.f186244b.u().a(), this.f186245c));
            k2<S> k2Var = this.f186244b;
            S s15 = this.f186245c;
            l<p114t0.h<S>, v> lVar2 = this.f186246d;
            p114t0.h hVar2 = this.f186247e;
            Object objE = rVar.E();
            if (zA || objE == companion.a()) {
                objE = t.c(k2Var.u().a(), s15) ? e0.INSTANCE.a() : lVar2.b(hVar2).getInitialContentExit();
                rVar.v(objE);
            }
            e0 e0Var = (e0) objE;
            S s16 = this.f186245c;
            k2<S> k2Var2 = this.f186244b;
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = new i.a(t.c(s16, k2Var2.w()));
                rVar.v(objE2);
            }
            i.a aVar = (i.a) objE2;
            c0 targetContentEnter = vVar.getTargetContentEnter();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            boolean zG = rVar.G(vVar);
            Object objE3 = rVar.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new a(vVar);
                rVar.v(objE3);
            }
            f3.m mVarA = m0.a(companion2, (q) objE3);
            aVar.l(t.c(this.f186245c, this.f186244b.w()));
            f3.m mVarU = mVarA.u(aVar);
            k2<S> k2Var3 = this.f186244b;
            boolean zG2 = rVar.G(this.f186245c);
            S s17 = this.f186245c;
            Object objE4 = rVar.E();
            if (zG2 || objE4 == companion.a()) {
                objE4 = new b(s17);
                rVar.v(objE4);
            }
            l lVar3 = (l) objE4;
            boolean zW = rVar.W(e0Var);
            Object objE5 = rVar.E();
            if (zW || objE5 == companion.a()) {
                objE5 = new c(e0Var);
                rVar.v(objE5);
            }
            k.a(k2Var3, lVar3, mVarU, targetContentEnter, e0Var, (p) objE5, null, y2.m.d(-143346359, true, new C4817d(this.f186248f, this.f186245c, this.f186247e, this.f186249g), rVar, 54), rVar, 12582912, 64);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<S> f186265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f186266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<p114t0.h<S>, v> f186267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f3.c f186268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l<S, Object> f186269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.r<p114t0.f, S, r, Integer, i0> f186270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f186271h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f186272j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(k2<S> k2Var, f3.m mVar, l<? super p114t0.h<S>, v> lVar, f3.c cVar, l<? super S, ? extends Object> lVar2, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar, int i15, int i16) {
            super(2);
            this.f186265b = k2Var;
            this.f186266c = mVar;
            this.f186267d = lVar;
            this.f186268e = cVar;
            this.f186269f = lVar2;
            this.f186270g = rVar;
            this.f186271h = i15;
            this.f186272j = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            d.b(this.f186265b, this.f186266c, this.f186267d, this.f186268e, this.f186269f, this.f186270g, rVar, g4.a(this.f186271h | 1), this.f186272j);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc5/r;", "<unused var>", "Lu0/q1;", "c", "(JJ)Lu0/q1;"}, k = 3, mv = {2, 1, 0})
    static final class h extends w implements p<c5.r, c5.r, q1<c5.r>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f186273b = new h();

        h() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ q1<c5.r> B(c5.r rVar, c5.r rVar2) {
            return c(rVar.getPackedValue(), rVar2.getPackedValue());
        }

        public final q1<c5.r> c(long j15, long j16) {
            return m.j(0.0f, 400.0f, c5.r.b(u0.g4.d(c5.r.INSTANCE)), 1, null);
        }
    }

    static {
        long j15 = PKIFailureInfo.systemUnavail;
        f186230a = c5.r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public static final <S> void a(S s15, f3.m mVar, l<? super p114t0.h<S>, v> lVar, f3.c cVar, String str, l<? super S, ? extends Object> lVar2, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar, r rVar2, int i15, int i16) {
        int i17;
        int i18;
        l<? super p114t0.h<S>, v> lVar3;
        int i19;
        int i25;
        f3.c cVar2;
        int i26;
        int i27;
        int i28;
        int i29;
        l<? super S, ? extends Object> lVar4;
        int i35;
        er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar3;
        boolean z15;
        f3.m mVar2;
        String str2;
        l<? super p114t0.h<S>, v> lVar5;
        f3.c cVar3;
        l<? super S, ? extends Object> lVar6;
        d5 d5VarM;
        int i36;
        f3.m mVar3;
        l<? super p114t0.h<S>, v> lVar7;
        int i37;
        f3.c cVarO;
        String str3;
        Object objE;
        Object objE2;
        int i38;
        r rVarH = rVar2.h(1501828832);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(s15) : rVarH.G(s15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                i17 |= rVarH.W(mVar) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    lVar3 = lVar;
                    if (rVarH.G(lVar3)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        cVar2 = cVar;
                        if (rVarH.W(cVar2)) {
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
                        i29 = i16 & 32;
                        if (i29 != 0) {
                            if ((196608 & i15) == 0) {
                                lVar4 = lVar2;
                                if (rVarH.G(lVar4)) {
                                    i35 = PKIFailureInfo.unsupportedVersion;
                                } else {
                                    i35 = PKIFailureInfo.notAuthorized;
                                }
                                i17 |= i35;
                            }
                            if ((1572864 & i15) == 0) {
                                rVar3 = rVar;
                                if (rVarH.G(rVar3)) {
                                    i38 = PKIFailureInfo.badCertTemplate;
                                } else {
                                    i38 = PKIFailureInfo.signerNotTrusted;
                                }
                                i17 |= i38;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i17 & 599187) != 599186) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (rVarH.r(z15, i17 & 1)) {
                                if (i39 != 0) {
                                    mVar3 = f3.m.INSTANCE;
                                    i36 = i27;
                                } else {
                                    i36 = i27;
                                    mVar3 = mVar;
                                }
                                if (i18 != 0) {
                                    objE2 = rVarH.E();
                                    if (objE2 == r.INSTANCE.a()) {
                                        objE2 = a.f186231b;
                                        rVarH.v(objE2);
                                    }
                                    lVar7 = (l) objE2;
                                } else {
                                    lVar7 = lVar3;
                                }
                                if (i25 != 0) {
                                    cVarO = f3.c.INSTANCE.o();
                                    i37 = i29;
                                } else {
                                    i37 = i29;
                                    cVarO = cVar2;
                                }
                                if (i36 != 0) {
                                    str3 = "AnimatedContent";
                                } else {
                                    str3 = str;
                                }
                                if (i37 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = b.f186232b;
                                        rVarH.v(objE);
                                    }
                                    lVar4 = (l) objE;
                                }
                                if (p076m2.t.k()) {
                                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                k2 k2VarX = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                                int i45 = i17 & 8176;
                                int i46 = i17 >> 3;
                                b(k2VarX, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i45 | (57344 & i46) | (i46 & 458752), 0);
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                str2 = str3;
                                mVar2 = mVar3;
                                lVar5 = lVar7;
                                cVar3 = cVarO;
                            } else {
                                rVarH.O();
                                mVar2 = mVar;
                                str2 = str;
                                lVar5 = lVar3;
                                cVar3 = cVar2;
                            }
                            lVar6 = lVar4;
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                            }
                        }
                        i17 |= 196608;
                        lVar4 = lVar2;
                        if ((1572864 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i38 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i39 != 0) {
                                mVar3 = f3.m.INSTANCE;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a.f186231b;
                                    rVarH.v(objE2);
                                }
                                lVar7 = (l) objE2;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i25 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                                i37 = i29;
                            } else {
                                i37 = i29;
                                cVarO = cVar2;
                            }
                            if (i36 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i37 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b.f186232b;
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            k2 k2VarX2 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            int i47 = i17 & 8176;
                            int i48 = i17 >> 3;
                            b(k2VarX2, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i47 | (57344 & i48) | (i48 & 458752), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            str2 = str3;
                            mVar2 = mVar3;
                            lVar5 = lVar7;
                            cVar3 = cVarO;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            str2 = str;
                            lVar5 = lVar3;
                            cVar3 = cVar2;
                        }
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                        }
                    }
                    i17 |= 24576;
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        if ((196608 & i15) == 0) {
                            lVar4 = lVar2;
                            if (rVarH.G(lVar4)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                        if ((1572864 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i38 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i39 != 0) {
                                mVar3 = f3.m.INSTANCE;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a.f186231b;
                                    rVarH.v(objE2);
                                }
                                lVar7 = (l) objE2;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i25 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                                i37 = i29;
                            } else {
                                i37 = i29;
                                cVarO = cVar2;
                            }
                            if (i36 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i37 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b.f186232b;
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            k2 k2VarX3 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            int i49 = i17 & 8176;
                            int i410 = i17 >> 3;
                            b(k2VarX3, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i49 | (57344 & i410) | (i410 & 458752), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            str2 = str3;
                            mVar2 = mVar3;
                            lVar5 = lVar7;
                            cVar3 = cVarO;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            str2 = str;
                            lVar5 = lVar3;
                            cVar3 = cVar2;
                        }
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    lVar4 = lVar2;
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX4 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i411 = i17 & 8176;
                        int i412 = i17 >> 3;
                        b(k2VarX4, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411 | (57344 & i412) | (i412 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 3072;
                cVar2 = cVar;
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
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        if ((196608 & i15) == 0) {
                            lVar4 = lVar2;
                            if (rVarH.G(lVar4)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                        if ((1572864 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i38 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i39 != 0) {
                                mVar3 = f3.m.INSTANCE;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a.f186231b;
                                    rVarH.v(objE2);
                                }
                                lVar7 = (l) objE2;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i25 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                                i37 = i29;
                            } else {
                                i37 = i29;
                                cVarO = cVar2;
                            }
                            if (i36 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i37 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b.f186232b;
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            k2 k2VarX5 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            int i413 = i17 & 8176;
                            int i414 = i17 >> 3;
                            b(k2VarX5, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i413 | (57344 & i414) | (i414 & 458752), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            str2 = str3;
                            mVar2 = mVar3;
                            lVar5 = lVar7;
                            cVar3 = cVarO;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            str2 = str;
                            lVar5 = lVar3;
                            cVar3 = cVar2;
                        }
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    lVar4 = lVar2;
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX6 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i415 = i17 & 8176;
                        int i416 = i17 >> 3;
                        b(k2VarX6, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i415 | (57344 & i416) | (i416 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 24576;
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX7 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i417 = i17 & 8176;
                        int i418 = i17 >> 3;
                        b(k2VarX7, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i417 | (57344 & i418) | (i418 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX8 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i419 = i17 & 8176;
                    int i4110 = i17 >> 3;
                    b(k2VarX8, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i419 | (57344 & i4110) | (i4110 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            lVar3 = lVar;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    cVar2 = cVar;
                    if (rVarH.W(cVar2)) {
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
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        if ((196608 & i15) == 0) {
                            lVar4 = lVar2;
                            if (rVarH.G(lVar4)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                        if ((1572864 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i38 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i39 != 0) {
                                mVar3 = f3.m.INSTANCE;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a.f186231b;
                                    rVarH.v(objE2);
                                }
                                lVar7 = (l) objE2;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i25 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                                i37 = i29;
                            } else {
                                i37 = i29;
                                cVarO = cVar2;
                            }
                            if (i36 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i37 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b.f186232b;
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            k2 k2VarX9 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            int i4111 = i17 & 8176;
                            int i4112 = i17 >> 3;
                            b(k2VarX9, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111 | (57344 & i4112) | (i4112 & 458752), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            str2 = str3;
                            mVar2 = mVar3;
                            lVar5 = lVar7;
                            cVar3 = cVarO;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            str2 = str;
                            lVar5 = lVar3;
                            cVar3 = cVar2;
                        }
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    lVar4 = lVar2;
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX10 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i4113 = i17 & 8176;
                        int i4114 = i17 >> 3;
                        b(k2VarX10, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4113 | (57344 & i4114) | (i4114 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 24576;
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX11 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i4115 = i17 & 8176;
                        int i4116 = i17 >> 3;
                        b(k2VarX11, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4115 | (57344 & i4116) | (i4116 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX12 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i4117 = i17 & 8176;
                    int i4118 = i17 >> 3;
                    b(k2VarX12, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4117 | (57344 & i4118) | (i4118 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 3072;
            cVar2 = cVar;
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
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX13 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i4119 = i17 & 8176;
                        int i41110 = i17 >> 3;
                        b(k2VarX13, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4119 | (57344 & i41110) | (i41110 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX14 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i41111 = i17 & 8176;
                    int i41112 = i17 >> 3;
                    b(k2VarX14, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41111 | (57344 & i41112) | (i41112 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 24576;
            i29 = i16 & 32;
            if (i29 != 0) {
                if ((196608 & i15) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX15 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i41113 = i17 & 8176;
                    int i41114 = i17 >> 3;
                    b(k2VarX15, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41113 | (57344 & i41114) | (i41114 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 196608;
            lVar4 = lVar2;
            if ((1572864 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                    i36 = i27;
                } else {
                    i36 = i27;
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a.f186231b;
                        rVarH.v(objE2);
                    }
                    lVar7 = (l) objE2;
                } else {
                    lVar7 = lVar3;
                }
                if (i25 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                    i37 = i29;
                } else {
                    i37 = i29;
                    cVarO = cVar2;
                }
                if (i36 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i37 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b.f186232b;
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                k2 k2VarX16 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                int i41115 = i17 & 8176;
                int i41116 = i17 >> 3;
                b(k2VarX16, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41115 | (57344 & i41116) | (i41116 & 458752), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar2 = mVar3;
                lVar5 = lVar7;
                cVar3 = cVarO;
            } else {
                rVarH.O();
                mVar2 = mVar;
                str2 = str;
                lVar5 = lVar3;
                cVar3 = cVar2;
            }
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
            }
        }
        i17 |= 48;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                lVar3 = lVar;
                if (rVarH.G(lVar3)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    cVar2 = cVar;
                    if (rVarH.W(cVar2)) {
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
                    i29 = i16 & 32;
                    if (i29 != 0) {
                        if ((196608 & i15) == 0) {
                            lVar4 = lVar2;
                            if (rVarH.G(lVar4)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i35 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i35;
                        }
                        if ((1572864 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i38 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i17 & 599187) != 599186) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            if (i39 != 0) {
                                mVar3 = f3.m.INSTANCE;
                                i36 = i27;
                            } else {
                                i36 = i27;
                                mVar3 = mVar;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a.f186231b;
                                    rVarH.v(objE2);
                                }
                                lVar7 = (l) objE2;
                            } else {
                                lVar7 = lVar3;
                            }
                            if (i25 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                                i37 = i29;
                            } else {
                                i37 = i29;
                                cVarO = cVar2;
                            }
                            if (i36 != 0) {
                                str3 = "AnimatedContent";
                            } else {
                                str3 = str;
                            }
                            if (i37 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = b.f186232b;
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                            }
                            k2 k2VarX17 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                            int i41117 = i17 & 8176;
                            int i41118 = i17 >> 3;
                            b(k2VarX17, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41117 | (57344 & i41118) | (i41118 & 458752), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            str2 = str3;
                            mVar2 = mVar3;
                            lVar5 = lVar7;
                            cVar3 = cVarO;
                        } else {
                            rVarH.O();
                            mVar2 = mVar;
                            str2 = str;
                            lVar5 = lVar3;
                            cVar3 = cVar2;
                        }
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                        }
                    }
                    i17 |= 196608;
                    lVar4 = lVar2;
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX18 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i41119 = i17 & 8176;
                        int i411110 = i17 >> 3;
                        b(k2VarX18, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41119 | (57344 & i411110) | (i411110 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 24576;
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX19 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i411111 = i17 & 8176;
                        int i411112 = i17 >> 3;
                        b(k2VarX19, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411111 | (57344 & i411112) | (i411112 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX110 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i411113 = i17 & 8176;
                    int i411114 = i17 >> 3;
                    b(k2VarX110, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411113 | (57344 & i411114) | (i411114 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 3072;
            cVar2 = cVar;
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
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX111 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i411115 = i17 & 8176;
                        int i411116 = i17 >> 3;
                        b(k2VarX111, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411115 | (57344 & i411116) | (i411116 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX112 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i411117 = i17 & 8176;
                    int i411118 = i17 >> 3;
                    b(k2VarX112, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411117 | (57344 & i411118) | (i411118 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 24576;
            i29 = i16 & 32;
            if (i29 != 0) {
                if ((196608 & i15) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX113 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i411119 = i17 & 8176;
                    int i4111110 = i17 >> 3;
                    b(k2VarX113, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i411119 | (57344 & i4111110) | (i4111110 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 196608;
            lVar4 = lVar2;
            if ((1572864 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                    i36 = i27;
                } else {
                    i36 = i27;
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a.f186231b;
                        rVarH.v(objE2);
                    }
                    lVar7 = (l) objE2;
                } else {
                    lVar7 = lVar3;
                }
                if (i25 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                    i37 = i29;
                } else {
                    i37 = i29;
                    cVarO = cVar2;
                }
                if (i36 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i37 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b.f186232b;
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                k2 k2VarX114 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                int i4111111 = i17 & 8176;
                int i4111112 = i17 >> 3;
                b(k2VarX114, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111111 | (57344 & i4111112) | (i4111112 & 458752), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar2 = mVar3;
                lVar5 = lVar7;
                cVar3 = cVarO;
            } else {
                rVarH.O();
                mVar2 = mVar;
                str2 = str;
                lVar5 = lVar3;
                cVar3 = cVar2;
            }
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        lVar3 = lVar;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                cVar2 = cVar;
                if (rVarH.W(cVar2)) {
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
                i29 = i16 & 32;
                if (i29 != 0) {
                    if ((196608 & i15) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i35 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i35;
                    }
                    if ((1572864 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i38 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i39 != 0) {
                            mVar3 = f3.m.INSTANCE;
                            i36 = i27;
                        } else {
                            i36 = i27;
                            mVar3 = mVar;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a.f186231b;
                                rVarH.v(objE2);
                            }
                            lVar7 = (l) objE2;
                        } else {
                            lVar7 = lVar3;
                        }
                        if (i25 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                            i37 = i29;
                        } else {
                            i37 = i29;
                            cVarO = cVar2;
                        }
                        if (i36 != 0) {
                            str3 = "AnimatedContent";
                        } else {
                            str3 = str;
                        }
                        if (i37 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = b.f186232b;
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                        }
                        k2 k2VarX115 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        int i4111113 = i17 & 8176;
                        int i4111114 = i17 >> 3;
                        b(k2VarX115, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111113 | (57344 & i4111114) | (i4111114 & 458752), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar2 = mVar3;
                        lVar5 = lVar7;
                        cVar3 = cVarO;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        str2 = str;
                        lVar5 = lVar3;
                        cVar3 = cVar2;
                    }
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                    }
                }
                i17 |= 196608;
                lVar4 = lVar2;
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX116 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i4111115 = i17 & 8176;
                    int i4111116 = i17 >> 3;
                    b(k2VarX116, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111115 | (57344 & i4111116) | (i4111116 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 24576;
            i29 = i16 & 32;
            if (i29 != 0) {
                if ((196608 & i15) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX117 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i4111117 = i17 & 8176;
                    int i4111118 = i17 >> 3;
                    b(k2VarX117, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111117 | (57344 & i4111118) | (i4111118 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 196608;
            lVar4 = lVar2;
            if ((1572864 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                    i36 = i27;
                } else {
                    i36 = i27;
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a.f186231b;
                        rVarH.v(objE2);
                    }
                    lVar7 = (l) objE2;
                } else {
                    lVar7 = lVar3;
                }
                if (i25 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                    i37 = i29;
                } else {
                    i37 = i29;
                    cVarO = cVar2;
                }
                if (i36 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i37 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b.f186232b;
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                k2 k2VarX118 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                int i4111119 = i17 & 8176;
                int i41111110 = i17 >> 3;
                b(k2VarX118, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i4111119 | (57344 & i41111110) | (i41111110 & 458752), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar2 = mVar3;
                lVar5 = lVar7;
                cVar3 = cVarO;
            } else {
                rVarH.O();
                mVar2 = mVar;
                str2 = str;
                lVar5 = lVar3;
                cVar3 = cVar2;
            }
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
            }
        }
        i17 |= 3072;
        cVar2 = cVar;
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
            i29 = i16 & 32;
            if (i29 != 0) {
                if ((196608 & i15) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i35 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i35;
                }
                if ((1572864 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i38 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i39 != 0) {
                        mVar3 = f3.m.INSTANCE;
                        i36 = i27;
                    } else {
                        i36 = i27;
                        mVar3 = mVar;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a.f186231b;
                            rVarH.v(objE2);
                        }
                        lVar7 = (l) objE2;
                    } else {
                        lVar7 = lVar3;
                    }
                    if (i25 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                        i37 = i29;
                    } else {
                        i37 = i29;
                        cVarO = cVar2;
                    }
                    if (i36 != 0) {
                        str3 = "AnimatedContent";
                    } else {
                        str3 = str;
                    }
                    if (i37 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = b.f186232b;
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                    }
                    k2 k2VarX119 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    int i41111111 = i17 & 8176;
                    int i41111112 = i17 >> 3;
                    b(k2VarX119, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41111111 | (57344 & i41111112) | (i41111112 & 458752), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar2 = mVar3;
                    lVar5 = lVar7;
                    cVar3 = cVarO;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    str2 = str;
                    lVar5 = lVar3;
                    cVar3 = cVar2;
                }
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
                }
            }
            i17 |= 196608;
            lVar4 = lVar2;
            if ((1572864 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                    i36 = i27;
                } else {
                    i36 = i27;
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a.f186231b;
                        rVarH.v(objE2);
                    }
                    lVar7 = (l) objE2;
                } else {
                    lVar7 = lVar3;
                }
                if (i25 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                    i37 = i29;
                } else {
                    i37 = i29;
                    cVarO = cVar2;
                }
                if (i36 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i37 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b.f186232b;
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                k2 k2VarX1110 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                int i41111113 = i17 & 8176;
                int i41111114 = i17 >> 3;
                b(k2VarX1110, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41111113 | (57344 & i41111114) | (i41111114 & 458752), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar2 = mVar3;
                lVar5 = lVar7;
                cVar3 = cVarO;
            } else {
                rVarH.O();
                mVar2 = mVar;
                str2 = str;
                lVar5 = lVar3;
                cVar3 = cVar2;
            }
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
            }
        }
        i17 |= 24576;
        i29 = i16 & 32;
        if (i29 != 0) {
            if ((196608 & i15) == 0) {
                lVar4 = lVar2;
                if (rVarH.G(lVar4)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i35 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i35;
            }
            if ((1572864 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.badCertTemplate;
                } else {
                    i38 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i39 != 0) {
                    mVar3 = f3.m.INSTANCE;
                    i36 = i27;
                } else {
                    i36 = i27;
                    mVar3 = mVar;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a.f186231b;
                        rVarH.v(objE2);
                    }
                    lVar7 = (l) objE2;
                } else {
                    lVar7 = lVar3;
                }
                if (i25 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                    i37 = i29;
                } else {
                    i37 = i29;
                    cVarO = cVar2;
                }
                if (i36 != 0) {
                    str3 = "AnimatedContent";
                } else {
                    str3 = str;
                }
                if (i37 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = b.f186232b;
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                }
                k2 k2VarX1111 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
                int i41111115 = i17 & 8176;
                int i41111116 = i17 >> 3;
                b(k2VarX1111, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41111115 | (57344 & i41111116) | (i41111116 & 458752), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar2 = mVar3;
                lVar5 = lVar7;
                cVar3 = cVarO;
            } else {
                rVarH.O();
                mVar2 = mVar;
                str2 = str;
                lVar5 = lVar3;
                cVar3 = cVar2;
            }
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
            }
        }
        i17 |= 196608;
        lVar4 = lVar2;
        if ((1572864 & i15) == 0) {
            rVar3 = rVar;
            if (rVarH.G(rVar3)) {
                i38 = PKIFailureInfo.badCertTemplate;
            } else {
                i38 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i38;
        } else {
            rVar3 = rVar;
        }
        if ((i17 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i39 != 0) {
                mVar3 = f3.m.INSTANCE;
                i36 = i27;
            } else {
                i36 = i27;
                mVar3 = mVar;
            }
            if (i18 != 0) {
                objE2 = rVarH.E();
                if (objE2 == r.INSTANCE.a()) {
                    objE2 = a.f186231b;
                    rVarH.v(objE2);
                }
                lVar7 = (l) objE2;
            } else {
                lVar7 = lVar3;
            }
            if (i25 != 0) {
                cVarO = f3.c.INSTANCE.o();
                i37 = i29;
            } else {
                i37 = i29;
                cVarO = cVar2;
            }
            if (i36 != 0) {
                str3 = "AnimatedContent";
            } else {
                str3 = str;
            }
            if (i37 != 0) {
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = b.f186232b;
                    rVarH.v(objE);
                }
                lVar4 = (l) objE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1501828832, i17, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
            }
            k2 k2VarX1112 = v2.x(s15, str3, rVarH, (i17 & 14) | ((i17 >> 9) & 112), 0);
            int i41111117 = i17 & 8176;
            int i41111118 = i17 >> 3;
            b(k2VarX1112, mVar3, lVar7, cVarO, lVar4, rVar3, rVarH, i41111117 | (57344 & i41111118) | (i41111118 & 458752), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            str2 = str3;
            mVar2 = mVar3;
            lVar5 = lVar7;
            cVar3 = cVarO;
        } else {
            rVarH.O();
            mVar2 = mVar;
            str2 = str;
            lVar5 = lVar3;
            cVar3 = cVar2;
        }
        lVar6 = lVar4;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new c(s15, mVar2, lVar5, cVar3, str2, lVar6, rVar, i15, i16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0163  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01be  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x0201 A[LOOP:0: B:135:0x01e4->B:140:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0208  */
    /* JADX WARN: Code duplicated, block: B:144:0x0210  */
    /* JADX WARN: Code duplicated, block: B:147:0x0221  */
    /* JADX WARN: Code duplicated, block: B:151:0x0239  */
    /* JADX WARN: Code duplicated, block: B:153:0x0249 A[LOOP:2: B:152:0x0247->B:153:0x0249, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0294  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02da  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:172:0x0325  */
    /* JADX WARN: Code duplicated, block: B:174:0x033b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0345  */
    /* JADX WARN: Code duplicated, block: B:180:0x0365  */
    /* JADX WARN: Code duplicated, block: B:183:0x036c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0378  */
    /* JADX WARN: Code duplicated, block: B:188:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0206 A[EDGE_INSN: B:189:0x0206->B:142:0x0206 BREAK  A[LOOP:0: B:135:0x01e4->B:140:0x0201], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final <S> void b(k2<S> k2Var, f3.m mVar, l<? super p114t0.h<S>, v> lVar, f3.c cVar, l<? super S, ? extends Object> lVar2, er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar, r rVar2, int i15, int i16) {
        f3.m mVar2;
        int i17;
        l<? super p114t0.h<S>, v> lVar3;
        int i18;
        int i19;
        f3.c cVarO;
        int i25;
        int i26;
        l<? super S, ? extends Object> lVar4;
        int i27;
        er.r<? super p114t0.f, ? super S, ? super r, ? super Integer, i0> rVar3;
        boolean z15;
        f3.m mVar3;
        l<? super p114t0.h<S>, v> lVar5;
        f3.c cVar2;
        l<? super S, ? extends Object> lVar6;
        d5 d5VarM;
        f3.m mVar4;
        c5.t tVar;
        int i28;
        boolean z16;
        Object objE;
        i iVar;
        boolean z17;
        Object objE2;
        SnapshotStateList snapshotStateList;
        boolean z18;
        Object objE3;
        t0 t0Var;
        int size;
        int i29;
        i iVar2;
        SnapshotStateList snapshotStateList2;
        int i35;
        boolean zW;
        v vVarE;
        Object objE4;
        er.a<androidx.compose.ui.node.c> aVarB;
        int size2;
        int i36;
        p pVar;
        Iterator<T> it;
        int i37;
        Object objE5;
        Object objE6;
        int i38;
        k2<S> k2Var2 = k2Var;
        r rVarH = rVar2.h(511725103);
        int i39 = (i15 & 6) == 0 ? (rVarH.W(k2Var2) ? 4 : 2) | i15 : i15;
        int i45 = i16 & 1;
        if (i45 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i39 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i17 = i16 & 2;
            if (i17 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    lVar3 = lVar;
                    if (rVarH.G(lVar3)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i39 |= i18;
                }
                i19 = i16 & 4;
                if (i19 != 0) {
                    if ((i15 & 3072) == 0) {
                        cVarO = cVar;
                        if (rVarH.W(cVarO)) {
                            i25 = 2048;
                        } else {
                            i25 = 1024;
                        }
                        i39 |= i25;
                    }
                    i26 = i16 & 8;
                    if (i26 != 0) {
                        if ((i15 & 24576) == 0) {
                            lVar4 = lVar2;
                            if (rVarH.G(lVar4)) {
                                i27 = 16384;
                            } else {
                                i27 = PKIFailureInfo.certRevoked;
                            }
                            i39 |= i27;
                        }
                        if ((196608 & i15) == 0) {
                            rVar3 = rVar;
                            if (rVarH.G(rVar3)) {
                                i38 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i38 = PKIFailureInfo.notAuthorized;
                            }
                            i39 |= i38;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((74899 & i39) != 74898) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i39 & 1)) {
                            if (i45 != 0) {
                                mVar4 = f3.m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if (i17 != 0) {
                                objE6 = rVarH.E();
                                if (objE6 == r.INSTANCE.a()) {
                                    objE6 = C4815d.f186242b;
                                    rVarH.v(objE6);
                                }
                                lVar5 = (l) objE6;
                            } else {
                                lVar5 = lVar3;
                            }
                            if (i19 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i26 != 0) {
                                objE5 = rVarH.E();
                                if (objE5 == r.INSTANCE.a()) {
                                    objE5 = e.f186243b;
                                    rVarH.v(objE5);
                                }
                                lVar4 = (l) objE5;
                            }
                            if (p076m2.t.k()) {
                                p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            tVar = (c5.t) rVarH.N(g1.l());
                            i28 = i39 & 14;
                            if (i28 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE = rVarH.E();
                            if (z16 || objE == r.INSTANCE.a()) {
                                objE = new i(k2Var2, cVarO, tVar);
                                rVarH.v(objE);
                            }
                            iVar = (i) objE;
                            if (i28 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objE2 = rVarH.E();
                            if (z17 || objE2 == r.INSTANCE.a()) {
                                objE2 = x5.g(k2Var2.p());
                                rVarH.v(objE2);
                            }
                            snapshotStateList = (SnapshotStateList) objE2;
                            if (i28 == 4) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            objE3 = rVarH.E();
                            if (z18 || objE3 == r.INSTANCE.a()) {
                                objE3 = r0.g1.c();
                                rVarH.v(objE3);
                            }
                            t0Var = (t0) objE3;
                            if (!snapshotStateList.contains(k2Var2.p())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            }
                            if (t.c(k2Var2.p(), k2Var2.w())) {
                                if (snapshotStateList.size() == 1 || !t.c(snapshotStateList.get(0), k2Var2.p())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(k2Var2.p());
                                }
                                if (t0Var.get_size() == 1 || t0Var.c(k2Var2.p())) {
                                    t0Var.k();
                                }
                                iVar.j(cVarO);
                                iVar.k(tVar);
                            }
                            if (!t.c(k2Var2.p(), k2Var2.w()) && !snapshotStateList.contains(k2Var2.w())) {
                                it = snapshotStateList.iterator();
                                i37 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        i37 = -1;
                                        break;
                                    } else if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                        break;
                                    } else {
                                        i37++;
                                    }
                                }
                                if (i37 == -1) {
                                    snapshotStateList.add(k2Var2.w());
                                } else {
                                    snapshotStateList.set(i37, k2Var2.w());
                                }
                            }
                            if (t0Var.c(k2Var2.w()) || !t0Var.c(k2Var2.p())) {
                                rVarH.X(1966410449);
                                t0Var.k();
                                size = snapshotStateList.size();
                                i29 = 0;
                                while (i29 < size) {
                                    int i46 = i29;
                                    T t15 = snapshotStateList.get(i46);
                                    SnapshotStateList snapshotStateList3 = snapshotStateList;
                                    i iVar3 = iVar;
                                    t0Var.x(t15, y2.m.d(-23915175, true, new f(k2Var2, t15, lVar5, iVar3, snapshotStateList3, rVar3), rVarH, 54));
                                    i29 = i46 + 1;
                                    k2Var2 = k2Var;
                                    rVar3 = rVar;
                                    iVar = iVar3;
                                    size = size;
                                    snapshotStateList = snapshotStateList3;
                                }
                                iVar2 = iVar;
                                snapshotStateList2 = snapshotStateList;
                                i35 = 0;
                                rVarH.R();
                            } else {
                                rVarH.X(1968995539);
                                rVarH.R();
                                iVar2 = iVar;
                                snapshotStateList2 = snapshotStateList;
                                i35 = 0;
                            }
                            zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                            vVarE = rVarH.E();
                            if (zW || vVarE == r.INSTANCE.a()) {
                                vVarE = lVar5.b(iVar2);
                                rVarH.v(vVarE);
                            }
                            f3.m mVarU = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = new p114t0.e(iVar2);
                                rVarH.v(objE4);
                            }
                            p114t0.e eVar = (p114t0.e) objE4;
                            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, i35));
                            e0 e0VarT = rVarH.t();
                            f3.m mVarE = j.e(rVarH, mVarU);
                            androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
                            aVarB = aVar.b();
                            if (rVarH.l() == null) {
                                p076m2.m.d();
                            }
                            rVarH.K();
                            if (rVarH.getInserting()) {
                                rVarH.H(aVarB);
                            } else {
                                rVarH.u();
                            }
                            r rVarC = n6.c(rVarH);
                            n6.i(rVarC, eVar, aVar.d());
                            n6.i(rVarC, e0VarT, aVar.f());
                            n6.e(rVarC, Integer.valueOf(iHashCode), aVar.c());
                            n6.g(rVarC, aVar.a());
                            n6.i(rVarC, mVarE, aVar.e());
                            rVarH.X(-860173498);
                            size2 = snapshotStateList2.size();
                            for (i36 = i35; i36 < size2; i36++) {
                                p001AuX.j jVar = (Object) snapshotStateList2.get(i36);
                                rVarH.J(-2026002954, lVar4.b(jVar));
                                pVar = (p) t0Var.e(jVar);
                                if (pVar == null) {
                                    rVarH.X(1618454323);
                                } else {
                                    rVarH.X(-2026001778);
                                    pVar.B(rVarH, Integer.valueOf(i35));
                                }
                                rVarH.R();
                                rVarH.U();
                            }
                            rVarH.R();
                            rVarH.x();
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            mVar3 = mVar4;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            lVar5 = lVar3;
                        }
                        cVar2 = cVarO;
                        lVar6 = lVar4;
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                        }
                    }
                    i39 |= 24576;
                    lVar4 = lVar2;
                    if ((196608 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i39 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((74899 & i39) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i39 & 1)) {
                        if (i45 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i17 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == r.INSTANCE.a()) {
                                objE6 = C4815d.f186242b;
                                rVarH.v(objE6);
                            }
                            lVar5 = (l) objE6;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i19 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i26 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == r.INSTANCE.a()) {
                                objE5 = e.f186243b;
                                rVarH.v(objE5);
                            }
                            lVar4 = (l) objE5;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        tVar = (c5.t) rVarH.N(g1.l());
                        i28 = i39 & 14;
                        if (i28 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        } else {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        }
                        iVar = (i) objE;
                        if (i28 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        } else {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        }
                        snapshotStateList = (SnapshotStateList) objE2;
                        if (i28 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        } else {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        }
                        t0Var = (t0) objE3;
                        if (!snapshotStateList.contains(k2Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t.c(k2Var2.p(), k2Var2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            }
                            if (t0Var.get_size() == 1) {
                                t0Var.k();
                            } else {
                                t0Var.k();
                            }
                            iVar.j(cVarO);
                            iVar.k(tVar);
                        }
                        if (!t.c(k2Var2.p(), k2Var2.w())) {
                            it = snapshotStateList.iterator();
                            i37 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i37 = -1;
                                    break;
                                } else {
                                    if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                        break;
                                        break;
                                    }
                                    i37++;
                                }
                            }
                            if (i37 == -1) {
                                snapshotStateList.add(k2Var2.w());
                            } else {
                                snapshotStateList.set(i37, k2Var2.w());
                            }
                        }
                        if (t0Var.c(k2Var2.w())) {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i47 = i29;
                                T t16 = snapshotStateList.get(i47);
                                SnapshotStateList snapshotStateList4 = snapshotStateList;
                                i iVar4 = iVar;
                                t0Var.x(t16, y2.m.d(-23915175, true, new f(k2Var2, t16, lVar5, iVar4, snapshotStateList4, rVar3), rVarH, 54));
                                i29 = i47 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar4;
                                size = size;
                                snapshotStateList = snapshotStateList4;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        } else {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i48 = i29;
                                T t17 = snapshotStateList.get(i48);
                                SnapshotStateList snapshotStateList5 = snapshotStateList;
                                i iVar5 = iVar;
                                t0Var.x(t17, y2.m.d(-23915175, true, new f(k2Var2, t17, lVar5, iVar5, snapshotStateList5, rVar3), rVarH, 54));
                                i29 = i48 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar5;
                                size = size;
                                snapshotStateList = snapshotStateList5;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        }
                        zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                        vVarE = rVarH.E();
                        if (zW) {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        } else {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        }
                        f3.m mVarU2 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new p114t0.e(iVar2);
                            rVarH.v(objE4);
                        }
                        p114t0.e eVar2 = (p114t0.e) objE4;
                        int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i35));
                        e0 e0VarT2 = rVarH.t();
                        f3.m mVarE2 = j.e(rVarH, mVarU2);
                        androidx.compose.ui.node.c.Companion aVar2 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = aVar2.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        r rVarC2 = n6.c(rVarH);
                        n6.i(rVarC2, eVar2, aVar2.d());
                        n6.i(rVarC2, e0VarT2, aVar2.f());
                        n6.e(rVarC2, Integer.valueOf(iHashCode2), aVar2.c());
                        n6.g(rVarC2, aVar2.a());
                        n6.i(rVarC2, mVarE2, aVar2.e());
                        rVarH.X(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i36 < size2) {
                            p001AuX.j jVar2 = (Object) snapshotStateList2.get(i36);
                            rVarH.J(-2026002954, lVar4.b(jVar2));
                            pVar = (p) t0Var.e(jVar2);
                            if (pVar == null) {
                                rVarH.X(1618454323);
                            } else {
                                rVarH.X(-2026001778);
                                pVar.B(rVarH, Integer.valueOf(i35));
                            }
                            rVarH.R();
                            rVarH.U();
                        }
                        rVarH.R();
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        lVar5 = lVar3;
                    }
                    cVar2 = cVarO;
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                    }
                }
                i39 |= 3072;
                cVarO = cVar;
                i26 = i16 & 8;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i39 |= i27;
                    }
                    if ((196608 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i39 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((74899 & i39) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i39 & 1)) {
                        if (i45 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i17 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == r.INSTANCE.a()) {
                                objE6 = C4815d.f186242b;
                                rVarH.v(objE6);
                            }
                            lVar5 = (l) objE6;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i19 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i26 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == r.INSTANCE.a()) {
                                objE5 = e.f186243b;
                                rVarH.v(objE5);
                            }
                            lVar4 = (l) objE5;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        tVar = (c5.t) rVarH.N(g1.l());
                        i28 = i39 & 14;
                        if (i28 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        } else {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        }
                        iVar = (i) objE;
                        if (i28 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        } else {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        }
                        snapshotStateList = (SnapshotStateList) objE2;
                        if (i28 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        } else {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        }
                        t0Var = (t0) objE3;
                        if (!snapshotStateList.contains(k2Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t.c(k2Var2.p(), k2Var2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            }
                            if (t0Var.get_size() == 1) {
                                t0Var.k();
                            } else {
                                t0Var.k();
                            }
                            iVar.j(cVarO);
                            iVar.k(tVar);
                        }
                        if (!t.c(k2Var2.p(), k2Var2.w())) {
                            it = snapshotStateList.iterator();
                            i37 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i37 = -1;
                                    break;
                                } else {
                                    if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                        break;
                                        break;
                                    }
                                    i37++;
                                }
                            }
                            if (i37 == -1) {
                                snapshotStateList.add(k2Var2.w());
                            } else {
                                snapshotStateList.set(i37, k2Var2.w());
                            }
                        }
                        if (t0Var.c(k2Var2.w())) {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i49 = i29;
                                T t18 = snapshotStateList.get(i49);
                                SnapshotStateList snapshotStateList6 = snapshotStateList;
                                i iVar6 = iVar;
                                t0Var.x(t18, y2.m.d(-23915175, true, new f(k2Var2, t18, lVar5, iVar6, snapshotStateList6, rVar3), rVarH, 54));
                                i29 = i49 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar6;
                                size = size;
                                snapshotStateList = snapshotStateList6;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        } else {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i410 = i29;
                                T t19 = snapshotStateList.get(i410);
                                SnapshotStateList snapshotStateList7 = snapshotStateList;
                                i iVar7 = iVar;
                                t0Var.x(t19, y2.m.d(-23915175, true, new f(k2Var2, t19, lVar5, iVar7, snapshotStateList7, rVar3), rVarH, 54));
                                i29 = i410 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar7;
                                size = size;
                                snapshotStateList = snapshotStateList7;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        }
                        zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                        vVarE = rVarH.E();
                        if (zW) {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        } else {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        }
                        f3.m mVarU3 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new p114t0.e(iVar2);
                            rVarH.v(objE4);
                        }
                        p114t0.e eVar3 = (p114t0.e) objE4;
                        int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, i35));
                        e0 e0VarT3 = rVarH.t();
                        f3.m mVarE3 = j.e(rVarH, mVarU3);
                        androidx.compose.ui.node.c.Companion aVar3 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = aVar3.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        r rVarC3 = n6.c(rVarH);
                        n6.i(rVarC3, eVar3, aVar3.d());
                        n6.i(rVarC3, e0VarT3, aVar3.f());
                        n6.e(rVarC3, Integer.valueOf(iHashCode3), aVar3.c());
                        n6.g(rVarC3, aVar3.a());
                        n6.i(rVarC3, mVarE3, aVar3.e());
                        rVarH.X(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i36 < size2) {
                            p001AuX.j jVar3 = (Object) snapshotStateList2.get(i36);
                            rVarH.J(-2026002954, lVar4.b(jVar3));
                            pVar = (p) t0Var.e(jVar3);
                            if (pVar == null) {
                                rVarH.X(1618454323);
                            } else {
                                rVarH.X(-2026001778);
                                pVar.B(rVarH, Integer.valueOf(i35));
                            }
                            rVarH.R();
                            rVarH.U();
                        }
                        rVarH.R();
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        lVar5 = lVar3;
                    }
                    cVar2 = cVarO;
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                    }
                }
                i39 |= 24576;
                lVar4 = lVar2;
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i411 = i29;
                            T t110 = snapshotStateList.get(i411);
                            SnapshotStateList snapshotStateList8 = snapshotStateList;
                            i iVar8 = iVar;
                            t0Var.x(t110, y2.m.d(-23915175, true, new f(k2Var2, t110, lVar5, iVar8, snapshotStateList8, rVar3), rVarH, 54));
                            i29 = i411 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar8;
                            size = size;
                            snapshotStateList = snapshotStateList8;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i412 = i29;
                            T t111 = snapshotStateList.get(i412);
                            SnapshotStateList snapshotStateList9 = snapshotStateList;
                            i iVar9 = iVar;
                            t0Var.x(t111, y2.m.d(-23915175, true, new f(k2Var2, t111, lVar5, iVar9, snapshotStateList9, rVar3), rVarH, 54));
                            i29 = i412 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar9;
                            size = size;
                            snapshotStateList = snapshotStateList9;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU4 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar4 = (p114t0.e) objE4;
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT4 = rVarH.t();
                    f3.m mVarE4 = j.e(rVarH, mVarU4);
                    androidx.compose.ui.node.c.Companion aVar4 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar4.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC4 = n6.c(rVarH);
                    n6.i(rVarC4, eVar4, aVar4.d());
                    n6.i(rVarC4, e0VarT4, aVar4.f());
                    n6.e(rVarC4, Integer.valueOf(iHashCode4), aVar4.c());
                    n6.g(rVarC4, aVar4.a());
                    n6.i(rVarC4, mVarE4, aVar4.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar4 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar4));
                        pVar = (p) t0Var.e(jVar4);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= MLKEMEngine.KyberPolyBytes;
            lVar3 = lVar;
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    cVarO = cVar;
                    if (rVarH.W(cVarO)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i39 |= i25;
                }
                i26 = i16 & 8;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i39 |= i27;
                    }
                    if ((196608 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i39 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((74899 & i39) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i39 & 1)) {
                        if (i45 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i17 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == r.INSTANCE.a()) {
                                objE6 = C4815d.f186242b;
                                rVarH.v(objE6);
                            }
                            lVar5 = (l) objE6;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i19 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i26 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == r.INSTANCE.a()) {
                                objE5 = e.f186243b;
                                rVarH.v(objE5);
                            }
                            lVar4 = (l) objE5;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        tVar = (c5.t) rVarH.N(g1.l());
                        i28 = i39 & 14;
                        if (i28 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        } else {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        }
                        iVar = (i) objE;
                        if (i28 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        } else {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        }
                        snapshotStateList = (SnapshotStateList) objE2;
                        if (i28 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        } else {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        }
                        t0Var = (t0) objE3;
                        if (!snapshotStateList.contains(k2Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t.c(k2Var2.p(), k2Var2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            }
                            if (t0Var.get_size() == 1) {
                                t0Var.k();
                            } else {
                                t0Var.k();
                            }
                            iVar.j(cVarO);
                            iVar.k(tVar);
                        }
                        if (!t.c(k2Var2.p(), k2Var2.w())) {
                            it = snapshotStateList.iterator();
                            i37 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i37 = -1;
                                    break;
                                } else {
                                    if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                        break;
                                        break;
                                    }
                                    i37++;
                                }
                            }
                            if (i37 == -1) {
                                snapshotStateList.add(k2Var2.w());
                            } else {
                                snapshotStateList.set(i37, k2Var2.w());
                            }
                        }
                        if (t0Var.c(k2Var2.w())) {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i413 = i29;
                                T t112 = snapshotStateList.get(i413);
                                SnapshotStateList snapshotStateList10 = snapshotStateList;
                                i iVar10 = iVar;
                                t0Var.x(t112, y2.m.d(-23915175, true, new f(k2Var2, t112, lVar5, iVar10, snapshotStateList10, rVar3), rVarH, 54));
                                i29 = i413 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar10;
                                size = size;
                                snapshotStateList = snapshotStateList10;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        } else {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i414 = i29;
                                T t113 = snapshotStateList.get(i414);
                                SnapshotStateList snapshotStateList11 = snapshotStateList;
                                i iVar11 = iVar;
                                t0Var.x(t113, y2.m.d(-23915175, true, new f(k2Var2, t113, lVar5, iVar11, snapshotStateList11, rVar3), rVarH, 54));
                                i29 = i414 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar11;
                                size = size;
                                snapshotStateList = snapshotStateList11;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        }
                        zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                        vVarE = rVarH.E();
                        if (zW) {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        } else {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        }
                        f3.m mVarU5 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new p114t0.e(iVar2);
                            rVarH.v(objE4);
                        }
                        p114t0.e eVar5 = (p114t0.e) objE4;
                        int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, i35));
                        e0 e0VarT5 = rVarH.t();
                        f3.m mVarE5 = j.e(rVarH, mVarU5);
                        androidx.compose.ui.node.c.Companion aVar5 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = aVar5.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        r rVarC5 = n6.c(rVarH);
                        n6.i(rVarC5, eVar5, aVar5.d());
                        n6.i(rVarC5, e0VarT5, aVar5.f());
                        n6.e(rVarC5, Integer.valueOf(iHashCode5), aVar5.c());
                        n6.g(rVarC5, aVar5.a());
                        n6.i(rVarC5, mVarE5, aVar5.e());
                        rVarH.X(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i36 < size2) {
                            p001AuX.j jVar5 = (Object) snapshotStateList2.get(i36);
                            rVarH.J(-2026002954, lVar4.b(jVar5));
                            pVar = (p) t0Var.e(jVar5);
                            if (pVar == null) {
                                rVarH.X(1618454323);
                            } else {
                                rVarH.X(-2026001778);
                                pVar.B(rVarH, Integer.valueOf(i35));
                            }
                            rVarH.R();
                            rVarH.U();
                        }
                        rVarH.R();
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        lVar5 = lVar3;
                    }
                    cVar2 = cVarO;
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                    }
                }
                i39 |= 24576;
                lVar4 = lVar2;
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i415 = i29;
                            T t114 = snapshotStateList.get(i415);
                            SnapshotStateList snapshotStateList12 = snapshotStateList;
                            i iVar12 = iVar;
                            t0Var.x(t114, y2.m.d(-23915175, true, new f(k2Var2, t114, lVar5, iVar12, snapshotStateList12, rVar3), rVarH, 54));
                            i29 = i415 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar12;
                            size = size;
                            snapshotStateList = snapshotStateList12;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i416 = i29;
                            T t115 = snapshotStateList.get(i416);
                            SnapshotStateList snapshotStateList13 = snapshotStateList;
                            i iVar13 = iVar;
                            t0Var.x(t115, y2.m.d(-23915175, true, new f(k2Var2, t115, lVar5, iVar13, snapshotStateList13, rVar3), rVarH, 54));
                            i29 = i416 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar13;
                            size = size;
                            snapshotStateList = snapshotStateList13;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU6 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar6 = (p114t0.e) objE4;
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT6 = rVarH.t();
                    f3.m mVarE6 = j.e(rVarH, mVarU6);
                    androidx.compose.ui.node.c.Companion aVar6 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar6.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC6 = n6.c(rVarH);
                    n6.i(rVarC6, eVar6, aVar6.d());
                    n6.i(rVarC6, e0VarT6, aVar6.f());
                    n6.e(rVarC6, Integer.valueOf(iHashCode6), aVar6.c());
                    n6.g(rVarC6, aVar6.a());
                    n6.i(rVarC6, mVarE6, aVar6.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar6 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar6));
                        pVar = (p) t0Var.e(jVar6);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= 3072;
            cVarO = cVar;
            i26 = i16 & 8;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i39 |= i27;
                }
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i417 = i29;
                            T t116 = snapshotStateList.get(i417);
                            SnapshotStateList snapshotStateList14 = snapshotStateList;
                            i iVar14 = iVar;
                            t0Var.x(t116, y2.m.d(-23915175, true, new f(k2Var2, t116, lVar5, iVar14, snapshotStateList14, rVar3), rVarH, 54));
                            i29 = i417 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar14;
                            size = size;
                            snapshotStateList = snapshotStateList14;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i418 = i29;
                            T t117 = snapshotStateList.get(i418);
                            SnapshotStateList snapshotStateList15 = snapshotStateList;
                            i iVar15 = iVar;
                            t0Var.x(t117, y2.m.d(-23915175, true, new f(k2Var2, t117, lVar5, iVar15, snapshotStateList15, rVar3), rVarH, 54));
                            i29 = i418 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar15;
                            size = size;
                            snapshotStateList = snapshotStateList15;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU7 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar7 = (p114t0.e) objE4;
                    int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT7 = rVarH.t();
                    f3.m mVarE7 = j.e(rVarH, mVarU7);
                    androidx.compose.ui.node.c.Companion aVar7 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar7.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC7 = n6.c(rVarH);
                    n6.i(rVarC7, eVar7, aVar7.d());
                    n6.i(rVarC7, e0VarT7, aVar7.f());
                    n6.e(rVarC7, Integer.valueOf(iHashCode7), aVar7.c());
                    n6.g(rVarC7, aVar7.a());
                    n6.i(rVarC7, mVarE7, aVar7.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar7 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar7));
                        pVar = (p) t0Var.e(jVar7);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= 24576;
            lVar4 = lVar2;
            if ((196608 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i38 = PKIFailureInfo.notAuthorized;
                }
                i39 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((74899 & i39) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i39 & 1)) {
                if (i45 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i17 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == r.INSTANCE.a()) {
                        objE6 = C4815d.f186242b;
                        rVarH.v(objE6);
                    }
                    lVar5 = (l) objE6;
                } else {
                    lVar5 = lVar3;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i26 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == r.INSTANCE.a()) {
                        objE5 = e.f186243b;
                        rVarH.v(objE5);
                    }
                    lVar4 = (l) objE5;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                tVar = (c5.t) rVarH.N(g1.l());
                i28 = i39 & 14;
                if (i28 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                } else {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                }
                iVar = (i) objE;
                if (i28 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                } else {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                }
                snapshotStateList = (SnapshotStateList) objE2;
                if (i28 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objE3 = rVarH.E();
                if (z18) {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                } else {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                }
                t0Var = (t0) objE3;
                if (!snapshotStateList.contains(k2Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                }
                if (t.c(k2Var2.p(), k2Var2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t0Var.get_size() == 1) {
                        t0Var.k();
                    } else {
                        t0Var.k();
                    }
                    iVar.j(cVarO);
                    iVar.k(tVar);
                }
                if (!t.c(k2Var2.p(), k2Var2.w())) {
                    it = snapshotStateList.iterator();
                    i37 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i37 = -1;
                            break;
                        } else {
                            if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                break;
                                break;
                            }
                            i37++;
                        }
                    }
                    if (i37 == -1) {
                        snapshotStateList.add(k2Var2.w());
                    } else {
                        snapshotStateList.set(i37, k2Var2.w());
                    }
                }
                if (t0Var.c(k2Var2.w())) {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i419 = i29;
                        T t118 = snapshotStateList.get(i419);
                        SnapshotStateList snapshotStateList16 = snapshotStateList;
                        i iVar16 = iVar;
                        t0Var.x(t118, y2.m.d(-23915175, true, new f(k2Var2, t118, lVar5, iVar16, snapshotStateList16, rVar3), rVarH, 54));
                        i29 = i419 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar16;
                        size = size;
                        snapshotStateList = snapshotStateList16;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                } else {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i4110 = i29;
                        T t119 = snapshotStateList.get(i4110);
                        SnapshotStateList snapshotStateList17 = snapshotStateList;
                        i iVar17 = iVar;
                        t0Var.x(t119, y2.m.d(-23915175, true, new f(k2Var2, t119, lVar5, iVar17, snapshotStateList17, rVar3), rVarH, 54));
                        i29 = i4110 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar17;
                        size = size;
                        snapshotStateList = snapshotStateList17;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                }
                zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                vVarE = rVarH.E();
                if (zW) {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                } else {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                }
                f3.m mVarU8 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = new p114t0.e(iVar2);
                    rVarH.v(objE4);
                }
                p114t0.e eVar8 = (p114t0.e) objE4;
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, i35));
                e0 e0VarT8 = rVarH.t();
                f3.m mVarE8 = j.e(rVarH, mVarU8);
                androidx.compose.ui.node.c.Companion aVar8 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar8.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC8 = n6.c(rVarH);
                n6.i(rVarC8, eVar8, aVar8.d());
                n6.i(rVarC8, e0VarT8, aVar8.f());
                n6.e(rVarC8, Integer.valueOf(iHashCode8), aVar8.c());
                n6.g(rVarC8, aVar8.a());
                n6.i(rVarC8, mVarE8, aVar8.e());
                rVarH.X(-860173498);
                size2 = snapshotStateList2.size();
                while (i36 < size2) {
                    p001AuX.j jVar8 = (Object) snapshotStateList2.get(i36);
                    rVarH.J(-2026002954, lVar4.b(jVar8));
                    pVar = (p) t0Var.e(jVar8);
                    if (pVar == null) {
                        rVarH.X(1618454323);
                    } else {
                        rVarH.X(-2026001778);
                        pVar.B(rVarH, Integer.valueOf(i35));
                    }
                    rVarH.R();
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar5 = lVar3;
            }
            cVar2 = cVarO;
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
            }
        }
        i39 |= 48;
        mVar2 = mVar;
        i17 = i16 & 2;
        if (i17 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                lVar3 = lVar;
                if (rVarH.G(lVar3)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i39 |= i18;
            }
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    cVarO = cVar;
                    if (rVarH.W(cVarO)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i39 |= i25;
                }
                i26 = i16 & 8;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        lVar4 = lVar2;
                        if (rVarH.G(lVar4)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i39 |= i27;
                    }
                    if ((196608 & i15) == 0) {
                        rVar3 = rVar;
                        if (rVarH.G(rVar3)) {
                            i38 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i38 = PKIFailureInfo.notAuthorized;
                        }
                        i39 |= i38;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((74899 & i39) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i39 & 1)) {
                        if (i45 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i17 != 0) {
                            objE6 = rVarH.E();
                            if (objE6 == r.INSTANCE.a()) {
                                objE6 = C4815d.f186242b;
                                rVarH.v(objE6);
                            }
                            lVar5 = (l) objE6;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i19 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i26 != 0) {
                            objE5 = rVarH.E();
                            if (objE5 == r.INSTANCE.a()) {
                                objE5 = e.f186243b;
                                rVarH.v(objE5);
                            }
                            lVar4 = (l) objE5;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                        }
                        tVar = (c5.t) rVarH.N(g1.l());
                        i28 = i39 & 14;
                        if (i28 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE = rVarH.E();
                        if (z16) {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        } else {
                            objE = new i(k2Var2, cVarO, tVar);
                            rVarH.v(objE);
                        }
                        iVar = (i) objE;
                        if (i28 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objE2 = rVarH.E();
                        if (z17) {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        } else {
                            objE2 = x5.g(k2Var2.p());
                            rVarH.v(objE2);
                        }
                        snapshotStateList = (SnapshotStateList) objE2;
                        if (i28 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        } else {
                            objE3 = r0.g1.c();
                            rVarH.v(objE3);
                        }
                        t0Var = (t0) objE3;
                        if (!snapshotStateList.contains(k2Var2.p())) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t.c(k2Var2.p(), k2Var2.w())) {
                            if (snapshotStateList.size() == 1) {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            } else {
                                snapshotStateList.clear();
                                snapshotStateList.add(k2Var2.p());
                            }
                            if (t0Var.get_size() == 1) {
                                t0Var.k();
                            } else {
                                t0Var.k();
                            }
                            iVar.j(cVarO);
                            iVar.k(tVar);
                        }
                        if (!t.c(k2Var2.p(), k2Var2.w())) {
                            it = snapshotStateList.iterator();
                            i37 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i37 = -1;
                                    break;
                                } else {
                                    if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                        break;
                                        break;
                                    }
                                    i37++;
                                }
                            }
                            if (i37 == -1) {
                                snapshotStateList.add(k2Var2.w());
                            } else {
                                snapshotStateList.set(i37, k2Var2.w());
                            }
                        }
                        if (t0Var.c(k2Var2.w())) {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i4111 = i29;
                                T t1110 = snapshotStateList.get(i4111);
                                SnapshotStateList snapshotStateList18 = snapshotStateList;
                                i iVar18 = iVar;
                                t0Var.x(t1110, y2.m.d(-23915175, true, new f(k2Var2, t1110, lVar5, iVar18, snapshotStateList18, rVar3), rVarH, 54));
                                i29 = i4111 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar18;
                                size = size;
                                snapshotStateList = snapshotStateList18;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        } else {
                            rVarH.X(1966410449);
                            t0Var.k();
                            size = snapshotStateList.size();
                            i29 = 0;
                            while (i29 < size) {
                                int i4112 = i29;
                                T t1111 = snapshotStateList.get(i4112);
                                SnapshotStateList snapshotStateList19 = snapshotStateList;
                                i iVar19 = iVar;
                                t0Var.x(t1111, y2.m.d(-23915175, true, new f(k2Var2, t1111, lVar5, iVar19, snapshotStateList19, rVar3), rVarH, 54));
                                i29 = i4112 + 1;
                                k2Var2 = k2Var;
                                rVar3 = rVar;
                                iVar = iVar19;
                                size = size;
                                snapshotStateList = snapshotStateList19;
                            }
                            iVar2 = iVar;
                            snapshotStateList2 = snapshotStateList;
                            i35 = 0;
                            rVarH.R();
                        }
                        zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                        vVarE = rVarH.E();
                        if (zW) {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        } else {
                            vVarE = lVar5.b(iVar2);
                            rVarH.v(vVarE);
                        }
                        f3.m mVarU9 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = new p114t0.e(iVar2);
                            rVarH.v(objE4);
                        }
                        p114t0.e eVar9 = (p114t0.e) objE4;
                        int iHashCode9 = Long.hashCode(p076m2.m.b(rVarH, i35));
                        e0 e0VarT9 = rVarH.t();
                        f3.m mVarE9 = j.e(rVarH, mVarU9);
                        androidx.compose.ui.node.c.Companion aVar9 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = aVar9.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB);
                        } else {
                            rVarH.u();
                        }
                        r rVarC9 = n6.c(rVarH);
                        n6.i(rVarC9, eVar9, aVar9.d());
                        n6.i(rVarC9, e0VarT9, aVar9.f());
                        n6.e(rVarC9, Integer.valueOf(iHashCode9), aVar9.c());
                        n6.g(rVarC9, aVar9.a());
                        n6.i(rVarC9, mVarE9, aVar9.e());
                        rVarH.X(-860173498);
                        size2 = snapshotStateList2.size();
                        while (i36 < size2) {
                            p001AuX.j jVar9 = (Object) snapshotStateList2.get(i36);
                            rVarH.J(-2026002954, lVar4.b(jVar9));
                            pVar = (p) t0Var.e(jVar9);
                            if (pVar == null) {
                                rVarH.X(1618454323);
                            } else {
                                rVarH.X(-2026001778);
                                pVar.B(rVarH, Integer.valueOf(i35));
                            }
                            rVarH.R();
                            rVarH.U();
                        }
                        rVarH.R();
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        mVar3 = mVar4;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        lVar5 = lVar3;
                    }
                    cVar2 = cVarO;
                    lVar6 = lVar4;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                    }
                }
                i39 |= 24576;
                lVar4 = lVar2;
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i4113 = i29;
                            T t1112 = snapshotStateList.get(i4113);
                            SnapshotStateList snapshotStateList110 = snapshotStateList;
                            i iVar110 = iVar;
                            t0Var.x(t1112, y2.m.d(-23915175, true, new f(k2Var2, t1112, lVar5, iVar110, snapshotStateList110, rVar3), rVarH, 54));
                            i29 = i4113 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar110;
                            size = size;
                            snapshotStateList = snapshotStateList110;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i4114 = i29;
                            T t1113 = snapshotStateList.get(i4114);
                            SnapshotStateList snapshotStateList111 = snapshotStateList;
                            i iVar111 = iVar;
                            t0Var.x(t1113, y2.m.d(-23915175, true, new f(k2Var2, t1113, lVar5, iVar111, snapshotStateList111, rVar3), rVarH, 54));
                            i29 = i4114 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar111;
                            size = size;
                            snapshotStateList = snapshotStateList111;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU10 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar10 = (p114t0.e) objE4;
                    int iHashCode10 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT10 = rVarH.t();
                    f3.m mVarE10 = j.e(rVarH, mVarU10);
                    androidx.compose.ui.node.c.Companion aVar10 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar10.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC10 = n6.c(rVarH);
                    n6.i(rVarC10, eVar10, aVar10.d());
                    n6.i(rVarC10, e0VarT10, aVar10.f());
                    n6.e(rVarC10, Integer.valueOf(iHashCode10), aVar10.c());
                    n6.g(rVarC10, aVar10.a());
                    n6.i(rVarC10, mVarE10, aVar10.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar10 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar10));
                        pVar = (p) t0Var.e(jVar10);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= 3072;
            cVarO = cVar;
            i26 = i16 & 8;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i39 |= i27;
                }
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i4115 = i29;
                            T t1114 = snapshotStateList.get(i4115);
                            SnapshotStateList snapshotStateList112 = snapshotStateList;
                            i iVar112 = iVar;
                            t0Var.x(t1114, y2.m.d(-23915175, true, new f(k2Var2, t1114, lVar5, iVar112, snapshotStateList112, rVar3), rVarH, 54));
                            i29 = i4115 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar112;
                            size = size;
                            snapshotStateList = snapshotStateList112;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i4116 = i29;
                            T t1115 = snapshotStateList.get(i4116);
                            SnapshotStateList snapshotStateList113 = snapshotStateList;
                            i iVar113 = iVar;
                            t0Var.x(t1115, y2.m.d(-23915175, true, new f(k2Var2, t1115, lVar5, iVar113, snapshotStateList113, rVar3), rVarH, 54));
                            i29 = i4116 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar113;
                            size = size;
                            snapshotStateList = snapshotStateList113;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU11 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar11 = (p114t0.e) objE4;
                    int iHashCode11 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT11 = rVarH.t();
                    f3.m mVarE11 = j.e(rVarH, mVarU11);
                    androidx.compose.ui.node.c.Companion aVar11 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar11.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC11 = n6.c(rVarH);
                    n6.i(rVarC11, eVar11, aVar11.d());
                    n6.i(rVarC11, e0VarT11, aVar11.f());
                    n6.e(rVarC11, Integer.valueOf(iHashCode11), aVar11.c());
                    n6.g(rVarC11, aVar11.a());
                    n6.i(rVarC11, mVarE11, aVar11.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar11 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar11));
                        pVar = (p) t0Var.e(jVar11);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= 24576;
            lVar4 = lVar2;
            if ((196608 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i38 = PKIFailureInfo.notAuthorized;
                }
                i39 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((74899 & i39) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i39 & 1)) {
                if (i45 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i17 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == r.INSTANCE.a()) {
                        objE6 = C4815d.f186242b;
                        rVarH.v(objE6);
                    }
                    lVar5 = (l) objE6;
                } else {
                    lVar5 = lVar3;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i26 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == r.INSTANCE.a()) {
                        objE5 = e.f186243b;
                        rVarH.v(objE5);
                    }
                    lVar4 = (l) objE5;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                tVar = (c5.t) rVarH.N(g1.l());
                i28 = i39 & 14;
                if (i28 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                } else {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                }
                iVar = (i) objE;
                if (i28 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                } else {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                }
                snapshotStateList = (SnapshotStateList) objE2;
                if (i28 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objE3 = rVarH.E();
                if (z18) {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                } else {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                }
                t0Var = (t0) objE3;
                if (!snapshotStateList.contains(k2Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                }
                if (t.c(k2Var2.p(), k2Var2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t0Var.get_size() == 1) {
                        t0Var.k();
                    } else {
                        t0Var.k();
                    }
                    iVar.j(cVarO);
                    iVar.k(tVar);
                }
                if (!t.c(k2Var2.p(), k2Var2.w())) {
                    it = snapshotStateList.iterator();
                    i37 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i37 = -1;
                            break;
                        } else {
                            if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                break;
                                break;
                            }
                            i37++;
                        }
                    }
                    if (i37 == -1) {
                        snapshotStateList.add(k2Var2.w());
                    } else {
                        snapshotStateList.set(i37, k2Var2.w());
                    }
                }
                if (t0Var.c(k2Var2.w())) {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i4117 = i29;
                        T t1116 = snapshotStateList.get(i4117);
                        SnapshotStateList snapshotStateList114 = snapshotStateList;
                        i iVar114 = iVar;
                        t0Var.x(t1116, y2.m.d(-23915175, true, new f(k2Var2, t1116, lVar5, iVar114, snapshotStateList114, rVar3), rVarH, 54));
                        i29 = i4117 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar114;
                        size = size;
                        snapshotStateList = snapshotStateList114;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                } else {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i4118 = i29;
                        T t1117 = snapshotStateList.get(i4118);
                        SnapshotStateList snapshotStateList115 = snapshotStateList;
                        i iVar115 = iVar;
                        t0Var.x(t1117, y2.m.d(-23915175, true, new f(k2Var2, t1117, lVar5, iVar115, snapshotStateList115, rVar3), rVarH, 54));
                        i29 = i4118 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar115;
                        size = size;
                        snapshotStateList = snapshotStateList115;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                }
                zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                vVarE = rVarH.E();
                if (zW) {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                } else {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                }
                f3.m mVarU12 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = new p114t0.e(iVar2);
                    rVarH.v(objE4);
                }
                p114t0.e eVar12 = (p114t0.e) objE4;
                int iHashCode12 = Long.hashCode(p076m2.m.b(rVarH, i35));
                e0 e0VarT12 = rVarH.t();
                f3.m mVarE12 = j.e(rVarH, mVarU12);
                androidx.compose.ui.node.c.Companion aVar12 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar12.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC12 = n6.c(rVarH);
                n6.i(rVarC12, eVar12, aVar12.d());
                n6.i(rVarC12, e0VarT12, aVar12.f());
                n6.e(rVarC12, Integer.valueOf(iHashCode12), aVar12.c());
                n6.g(rVarC12, aVar12.a());
                n6.i(rVarC12, mVarE12, aVar12.e());
                rVarH.X(-860173498);
                size2 = snapshotStateList2.size();
                while (i36 < size2) {
                    p001AuX.j jVar12 = (Object) snapshotStateList2.get(i36);
                    rVarH.J(-2026002954, lVar4.b(jVar12));
                    pVar = (p) t0Var.e(jVar12);
                    if (pVar == null) {
                        rVarH.X(1618454323);
                    } else {
                        rVarH.X(-2026001778);
                        pVar.B(rVarH, Integer.valueOf(i35));
                    }
                    rVarH.R();
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar5 = lVar3;
            }
            cVar2 = cVarO;
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
            }
        }
        i39 |= MLKEMEngine.KyberPolyBytes;
        lVar3 = lVar;
        i19 = i16 & 4;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                cVarO = cVar;
                if (rVarH.W(cVarO)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i39 |= i25;
            }
            i26 = i16 & 8;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    lVar4 = lVar2;
                    if (rVarH.G(lVar4)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i39 |= i27;
                }
                if ((196608 & i15) == 0) {
                    rVar3 = rVar;
                    if (rVarH.G(rVar3)) {
                        i38 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i38 = PKIFailureInfo.notAuthorized;
                    }
                    i39 |= i38;
                } else {
                    rVar3 = rVar;
                }
                if ((74899 & i39) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i39 & 1)) {
                    if (i45 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i17 != 0) {
                        objE6 = rVarH.E();
                        if (objE6 == r.INSTANCE.a()) {
                            objE6 = C4815d.f186242b;
                            rVarH.v(objE6);
                        }
                        lVar5 = (l) objE6;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i26 != 0) {
                        objE5 = rVarH.E();
                        if (objE5 == r.INSTANCE.a()) {
                            objE5 = e.f186243b;
                            rVarH.v(objE5);
                        }
                        lVar4 = (l) objE5;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                    }
                    tVar = (c5.t) rVarH.N(g1.l());
                    i28 = i39 & 14;
                    if (i28 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE = rVarH.E();
                    if (z16) {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    } else {
                        objE = new i(k2Var2, cVarO, tVar);
                        rVarH.v(objE);
                    }
                    iVar = (i) objE;
                    if (i28 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objE2 = rVarH.E();
                    if (z17) {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    } else {
                        objE2 = x5.g(k2Var2.p());
                        rVarH.v(objE2);
                    }
                    snapshotStateList = (SnapshotStateList) objE2;
                    if (i28 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    } else {
                        objE3 = r0.g1.c();
                        rVarH.v(objE3);
                    }
                    t0Var = (t0) objE3;
                    if (!snapshotStateList.contains(k2Var2.p())) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t.c(k2Var2.p(), k2Var2.w())) {
                        if (snapshotStateList.size() == 1) {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        } else {
                            snapshotStateList.clear();
                            snapshotStateList.add(k2Var2.p());
                        }
                        if (t0Var.get_size() == 1) {
                            t0Var.k();
                        } else {
                            t0Var.k();
                        }
                        iVar.j(cVarO);
                        iVar.k(tVar);
                    }
                    if (!t.c(k2Var2.p(), k2Var2.w())) {
                        it = snapshotStateList.iterator();
                        i37 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i37 = -1;
                                break;
                            } else {
                                if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                    break;
                                    break;
                                }
                                i37++;
                            }
                        }
                        if (i37 == -1) {
                            snapshotStateList.add(k2Var2.w());
                        } else {
                            snapshotStateList.set(i37, k2Var2.w());
                        }
                    }
                    if (t0Var.c(k2Var2.w())) {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i4119 = i29;
                            T t1118 = snapshotStateList.get(i4119);
                            SnapshotStateList snapshotStateList116 = snapshotStateList;
                            i iVar116 = iVar;
                            t0Var.x(t1118, y2.m.d(-23915175, true, new f(k2Var2, t1118, lVar5, iVar116, snapshotStateList116, rVar3), rVarH, 54));
                            i29 = i4119 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar116;
                            size = size;
                            snapshotStateList = snapshotStateList116;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    } else {
                        rVarH.X(1966410449);
                        t0Var.k();
                        size = snapshotStateList.size();
                        i29 = 0;
                        while (i29 < size) {
                            int i41110 = i29;
                            T t1119 = snapshotStateList.get(i41110);
                            SnapshotStateList snapshotStateList117 = snapshotStateList;
                            i iVar117 = iVar;
                            t0Var.x(t1119, y2.m.d(-23915175, true, new f(k2Var2, t1119, lVar5, iVar117, snapshotStateList117, rVar3), rVarH, 54));
                            i29 = i41110 + 1;
                            k2Var2 = k2Var;
                            rVar3 = rVar;
                            iVar = iVar117;
                            size = size;
                            snapshotStateList = snapshotStateList117;
                        }
                        iVar2 = iVar;
                        snapshotStateList2 = snapshotStateList;
                        i35 = 0;
                        rVarH.R();
                    }
                    zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                    vVarE = rVarH.E();
                    if (zW) {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    } else {
                        vVarE = lVar5.b(iVar2);
                        rVarH.v(vVarE);
                    }
                    f3.m mVarU13 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = new p114t0.e(iVar2);
                        rVarH.v(objE4);
                    }
                    p114t0.e eVar13 = (p114t0.e) objE4;
                    int iHashCode13 = Long.hashCode(p076m2.m.b(rVarH, i35));
                    e0 e0VarT13 = rVarH.t();
                    f3.m mVarE13 = j.e(rVarH, mVarU13);
                    androidx.compose.ui.node.c.Companion aVar13 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar13.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC13 = n6.c(rVarH);
                    n6.i(rVarC13, eVar13, aVar13.d());
                    n6.i(rVarC13, e0VarT13, aVar13.f());
                    n6.e(rVarC13, Integer.valueOf(iHashCode13), aVar13.c());
                    n6.g(rVarC13, aVar13.a());
                    n6.i(rVarC13, mVarE13, aVar13.e());
                    rVarH.X(-860173498);
                    size2 = snapshotStateList2.size();
                    while (i36 < size2) {
                        p001AuX.j jVar13 = (Object) snapshotStateList2.get(i36);
                        rVarH.J(-2026002954, lVar4.b(jVar13));
                        pVar = (p) t0Var.e(jVar13);
                        if (pVar == null) {
                            rVarH.X(1618454323);
                        } else {
                            rVarH.X(-2026001778);
                            pVar.B(rVarH, Integer.valueOf(i35));
                        }
                        rVarH.R();
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    lVar5 = lVar3;
                }
                cVar2 = cVarO;
                lVar6 = lVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
                }
            }
            i39 |= 24576;
            lVar4 = lVar2;
            if ((196608 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i38 = PKIFailureInfo.notAuthorized;
                }
                i39 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((74899 & i39) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i39 & 1)) {
                if (i45 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i17 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == r.INSTANCE.a()) {
                        objE6 = C4815d.f186242b;
                        rVarH.v(objE6);
                    }
                    lVar5 = (l) objE6;
                } else {
                    lVar5 = lVar3;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i26 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == r.INSTANCE.a()) {
                        objE5 = e.f186243b;
                        rVarH.v(objE5);
                    }
                    lVar4 = (l) objE5;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                tVar = (c5.t) rVarH.N(g1.l());
                i28 = i39 & 14;
                if (i28 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                } else {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                }
                iVar = (i) objE;
                if (i28 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                } else {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                }
                snapshotStateList = (SnapshotStateList) objE2;
                if (i28 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objE3 = rVarH.E();
                if (z18) {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                } else {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                }
                t0Var = (t0) objE3;
                if (!snapshotStateList.contains(k2Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                }
                if (t.c(k2Var2.p(), k2Var2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t0Var.get_size() == 1) {
                        t0Var.k();
                    } else {
                        t0Var.k();
                    }
                    iVar.j(cVarO);
                    iVar.k(tVar);
                }
                if (!t.c(k2Var2.p(), k2Var2.w())) {
                    it = snapshotStateList.iterator();
                    i37 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i37 = -1;
                            break;
                        } else {
                            if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                break;
                                break;
                            }
                            i37++;
                        }
                    }
                    if (i37 == -1) {
                        snapshotStateList.add(k2Var2.w());
                    } else {
                        snapshotStateList.set(i37, k2Var2.w());
                    }
                }
                if (t0Var.c(k2Var2.w())) {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i41111 = i29;
                        T t11110 = snapshotStateList.get(i41111);
                        SnapshotStateList snapshotStateList118 = snapshotStateList;
                        i iVar118 = iVar;
                        t0Var.x(t11110, y2.m.d(-23915175, true, new f(k2Var2, t11110, lVar5, iVar118, snapshotStateList118, rVar3), rVarH, 54));
                        i29 = i41111 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar118;
                        size = size;
                        snapshotStateList = snapshotStateList118;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                } else {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i41112 = i29;
                        T t11111 = snapshotStateList.get(i41112);
                        SnapshotStateList snapshotStateList119 = snapshotStateList;
                        i iVar119 = iVar;
                        t0Var.x(t11111, y2.m.d(-23915175, true, new f(k2Var2, t11111, lVar5, iVar119, snapshotStateList119, rVar3), rVarH, 54));
                        i29 = i41112 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar119;
                        size = size;
                        snapshotStateList = snapshotStateList119;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                }
                zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                vVarE = rVarH.E();
                if (zW) {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                } else {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                }
                f3.m mVarU14 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = new p114t0.e(iVar2);
                    rVarH.v(objE4);
                }
                p114t0.e eVar14 = (p114t0.e) objE4;
                int iHashCode14 = Long.hashCode(p076m2.m.b(rVarH, i35));
                e0 e0VarT14 = rVarH.t();
                f3.m mVarE14 = j.e(rVarH, mVarU14);
                androidx.compose.ui.node.c.Companion aVar14 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar14.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC14 = n6.c(rVarH);
                n6.i(rVarC14, eVar14, aVar14.d());
                n6.i(rVarC14, e0VarT14, aVar14.f());
                n6.e(rVarC14, Integer.valueOf(iHashCode14), aVar14.c());
                n6.g(rVarC14, aVar14.a());
                n6.i(rVarC14, mVarE14, aVar14.e());
                rVarH.X(-860173498);
                size2 = snapshotStateList2.size();
                while (i36 < size2) {
                    p001AuX.j jVar14 = (Object) snapshotStateList2.get(i36);
                    rVarH.J(-2026002954, lVar4.b(jVar14));
                    pVar = (p) t0Var.e(jVar14);
                    if (pVar == null) {
                        rVarH.X(1618454323);
                    } else {
                        rVarH.X(-2026001778);
                        pVar.B(rVarH, Integer.valueOf(i35));
                    }
                    rVarH.R();
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar5 = lVar3;
            }
            cVar2 = cVarO;
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
            }
        }
        i39 |= 3072;
        cVarO = cVar;
        i26 = i16 & 8;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                lVar4 = lVar2;
                if (rVarH.G(lVar4)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i39 |= i27;
            }
            if ((196608 & i15) == 0) {
                rVar3 = rVar;
                if (rVarH.G(rVar3)) {
                    i38 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i38 = PKIFailureInfo.notAuthorized;
                }
                i39 |= i38;
            } else {
                rVar3 = rVar;
            }
            if ((74899 & i39) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i39 & 1)) {
                if (i45 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i17 != 0) {
                    objE6 = rVarH.E();
                    if (objE6 == r.INSTANCE.a()) {
                        objE6 = C4815d.f186242b;
                        rVarH.v(objE6);
                    }
                    lVar5 = (l) objE6;
                } else {
                    lVar5 = lVar3;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i26 != 0) {
                    objE5 = rVarH.E();
                    if (objE5 == r.INSTANCE.a()) {
                        objE5 = e.f186243b;
                        rVarH.v(objE5);
                    }
                    lVar4 = (l) objE5;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                }
                tVar = (c5.t) rVarH.N(g1.l());
                i28 = i39 & 14;
                if (i28 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16) {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                } else {
                    objE = new i(k2Var2, cVarO, tVar);
                    rVarH.v(objE);
                }
                iVar = (i) objE;
                if (i28 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE2 = rVarH.E();
                if (z17) {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                } else {
                    objE2 = x5.g(k2Var2.p());
                    rVarH.v(objE2);
                }
                snapshotStateList = (SnapshotStateList) objE2;
                if (i28 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objE3 = rVarH.E();
                if (z18) {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                } else {
                    objE3 = r0.g1.c();
                    rVarH.v(objE3);
                }
                t0Var = (t0) objE3;
                if (!snapshotStateList.contains(k2Var2.p())) {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                }
                if (t.c(k2Var2.p(), k2Var2.w())) {
                    if (snapshotStateList.size() == 1) {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    } else {
                        snapshotStateList.clear();
                        snapshotStateList.add(k2Var2.p());
                    }
                    if (t0Var.get_size() == 1) {
                        t0Var.k();
                    } else {
                        t0Var.k();
                    }
                    iVar.j(cVarO);
                    iVar.k(tVar);
                }
                if (!t.c(k2Var2.p(), k2Var2.w())) {
                    it = snapshotStateList.iterator();
                    i37 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i37 = -1;
                            break;
                        } else {
                            if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                                break;
                                break;
                            }
                            i37++;
                        }
                    }
                    if (i37 == -1) {
                        snapshotStateList.add(k2Var2.w());
                    } else {
                        snapshotStateList.set(i37, k2Var2.w());
                    }
                }
                if (t0Var.c(k2Var2.w())) {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i41113 = i29;
                        T t11112 = snapshotStateList.get(i41113);
                        SnapshotStateList snapshotStateList1110 = snapshotStateList;
                        i iVar1110 = iVar;
                        t0Var.x(t11112, y2.m.d(-23915175, true, new f(k2Var2, t11112, lVar5, iVar1110, snapshotStateList1110, rVar3), rVarH, 54));
                        i29 = i41113 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar1110;
                        size = size;
                        snapshotStateList = snapshotStateList1110;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                } else {
                    rVarH.X(1966410449);
                    t0Var.k();
                    size = snapshotStateList.size();
                    i29 = 0;
                    while (i29 < size) {
                        int i41114 = i29;
                        T t11113 = snapshotStateList.get(i41114);
                        SnapshotStateList snapshotStateList1111 = snapshotStateList;
                        i iVar1111 = iVar;
                        t0Var.x(t11113, y2.m.d(-23915175, true, new f(k2Var2, t11113, lVar5, iVar1111, snapshotStateList1111, rVar3), rVarH, 54));
                        i29 = i41114 + 1;
                        k2Var2 = k2Var;
                        rVar3 = rVar;
                        iVar = iVar1111;
                        size = size;
                        snapshotStateList = snapshotStateList1111;
                    }
                    iVar2 = iVar;
                    snapshotStateList2 = snapshotStateList;
                    i35 = 0;
                    rVarH.R();
                }
                zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
                vVarE = rVarH.E();
                if (zW) {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                } else {
                    vVarE = lVar5.b(iVar2);
                    rVarH.v(vVarE);
                }
                f3.m mVarU15 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = new p114t0.e(iVar2);
                    rVarH.v(objE4);
                }
                p114t0.e eVar15 = (p114t0.e) objE4;
                int iHashCode15 = Long.hashCode(p076m2.m.b(rVarH, i35));
                e0 e0VarT15 = rVarH.t();
                f3.m mVarE15 = j.e(rVarH, mVarU15);
                androidx.compose.ui.node.c.Companion aVar15 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar15.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC15 = n6.c(rVarH);
                n6.i(rVarC15, eVar15, aVar15.d());
                n6.i(rVarC15, e0VarT15, aVar15.f());
                n6.e(rVarC15, Integer.valueOf(iHashCode15), aVar15.c());
                n6.g(rVarC15, aVar15.a());
                n6.i(rVarC15, mVarE15, aVar15.e());
                rVarH.X(-860173498);
                size2 = snapshotStateList2.size();
                while (i36 < size2) {
                    p001AuX.j jVar15 = (Object) snapshotStateList2.get(i36);
                    rVarH.J(-2026002954, lVar4.b(jVar15));
                    pVar = (p) t0Var.e(jVar15);
                    if (pVar == null) {
                        rVarH.X(1618454323);
                    } else {
                        rVarH.X(-2026001778);
                        pVar.B(rVarH, Integer.valueOf(i35));
                    }
                    rVarH.R();
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                lVar5 = lVar3;
            }
            cVar2 = cVarO;
            lVar6 = lVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
            }
        }
        i39 |= 24576;
        lVar4 = lVar2;
        if ((196608 & i15) == 0) {
            rVar3 = rVar;
            if (rVarH.G(rVar3)) {
                i38 = PKIFailureInfo.unsupportedVersion;
            } else {
                i38 = PKIFailureInfo.notAuthorized;
            }
            i39 |= i38;
        } else {
            rVar3 = rVar;
        }
        if ((74899 & i39) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i39 & 1)) {
            if (i45 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i17 != 0) {
                objE6 = rVarH.E();
                if (objE6 == r.INSTANCE.a()) {
                    objE6 = C4815d.f186242b;
                    rVarH.v(objE6);
                }
                lVar5 = (l) objE6;
            } else {
                lVar5 = lVar3;
            }
            if (i19 != 0) {
                cVarO = f3.c.INSTANCE.o();
            }
            if (i26 != 0) {
                objE5 = rVarH.E();
                if (objE5 == r.INSTANCE.a()) {
                    objE5 = e.f186243b;
                    rVarH.v(objE5);
                }
                lVar4 = (l) objE5;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(511725103, i39, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
            }
            tVar = (c5.t) rVarH.N(g1.l());
            i28 = i39 & 14;
            if (i28 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            objE = rVarH.E();
            if (z16) {
                objE = new i(k2Var2, cVarO, tVar);
                rVarH.v(objE);
            } else {
                objE = new i(k2Var2, cVarO, tVar);
                rVarH.v(objE);
            }
            iVar = (i) objE;
            if (i28 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            objE2 = rVarH.E();
            if (z17) {
                objE2 = x5.g(k2Var2.p());
                rVarH.v(objE2);
            } else {
                objE2 = x5.g(k2Var2.p());
                rVarH.v(objE2);
            }
            snapshotStateList = (SnapshotStateList) objE2;
            if (i28 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            objE3 = rVarH.E();
            if (z18) {
                objE3 = r0.g1.c();
                rVarH.v(objE3);
            } else {
                objE3 = r0.g1.c();
                rVarH.v(objE3);
            }
            t0Var = (t0) objE3;
            if (!snapshotStateList.contains(k2Var2.p())) {
                snapshotStateList.clear();
                snapshotStateList.add(k2Var2.p());
            }
            if (t.c(k2Var2.p(), k2Var2.w())) {
                if (snapshotStateList.size() == 1) {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                } else {
                    snapshotStateList.clear();
                    snapshotStateList.add(k2Var2.p());
                }
                if (t0Var.get_size() == 1) {
                    t0Var.k();
                } else {
                    t0Var.k();
                }
                iVar.j(cVarO);
                iVar.k(tVar);
            }
            if (!t.c(k2Var2.p(), k2Var2.w())) {
                it = snapshotStateList.iterator();
                i37 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i37 = -1;
                        break;
                    } else {
                        if (t.c(lVar4.b((Object) it.next()), lVar4.b(k2Var2.w()))) {
                            break;
                            break;
                        }
                        i37++;
                    }
                }
                if (i37 == -1) {
                    snapshotStateList.add(k2Var2.w());
                } else {
                    snapshotStateList.set(i37, k2Var2.w());
                }
            }
            if (t0Var.c(k2Var2.w())) {
                rVarH.X(1966410449);
                t0Var.k();
                size = snapshotStateList.size();
                i29 = 0;
                while (i29 < size) {
                    int i41115 = i29;
                    T t11114 = snapshotStateList.get(i41115);
                    SnapshotStateList snapshotStateList1112 = snapshotStateList;
                    i iVar1112 = iVar;
                    t0Var.x(t11114, y2.m.d(-23915175, true, new f(k2Var2, t11114, lVar5, iVar1112, snapshotStateList1112, rVar3), rVarH, 54));
                    i29 = i41115 + 1;
                    k2Var2 = k2Var;
                    rVar3 = rVar;
                    iVar = iVar1112;
                    size = size;
                    snapshotStateList = snapshotStateList1112;
                }
                iVar2 = iVar;
                snapshotStateList2 = snapshotStateList;
                i35 = 0;
                rVarH.R();
            } else {
                rVarH.X(1966410449);
                t0Var.k();
                size = snapshotStateList.size();
                i29 = 0;
                while (i29 < size) {
                    int i41116 = i29;
                    T t11115 = snapshotStateList.get(i41116);
                    SnapshotStateList snapshotStateList1113 = snapshotStateList;
                    i iVar1113 = iVar;
                    t0Var.x(t11115, y2.m.d(-23915175, true, new f(k2Var2, t11115, lVar5, iVar1113, snapshotStateList1113, rVar3), rVarH, 54));
                    i29 = i41116 + 1;
                    k2Var2 = k2Var;
                    rVar3 = rVar;
                    iVar = iVar1113;
                    size = size;
                    snapshotStateList = snapshotStateList1113;
                }
                iVar2 = iVar;
                snapshotStateList2 = snapshotStateList;
                i35 = 0;
                rVarH.R();
            }
            zW = rVarH.W(k2Var.u()) | rVarH.W(iVar2);
            vVarE = rVarH.E();
            if (zW) {
                vVarE = lVar5.b(iVar2);
                rVarH.v(vVarE);
            } else {
                vVarE = lVar5.b(iVar2);
                rVarH.v(vVarE);
            }
            f3.m mVarU16 = mVar4.u(iVar2.d((v) vVarE, rVarH, i35));
            objE4 = rVarH.E();
            if (objE4 == r.INSTANCE.a()) {
                objE4 = new p114t0.e(iVar2);
                rVarH.v(objE4);
            }
            p114t0.e eVar16 = (p114t0.e) objE4;
            int iHashCode16 = Long.hashCode(p076m2.m.b(rVarH, i35));
            e0 e0VarT16 = rVarH.t();
            f3.m mVarE16 = j.e(rVarH, mVarU16);
            androidx.compose.ui.node.c.Companion aVar16 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = aVar16.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC16 = n6.c(rVarH);
            n6.i(rVarC16, eVar16, aVar16.d());
            n6.i(rVarC16, e0VarT16, aVar16.f());
            n6.e(rVarC16, Integer.valueOf(iHashCode16), aVar16.c());
            n6.g(rVarC16, aVar16.a());
            n6.i(rVarC16, mVarE16, aVar16.e());
            rVarH.X(-860173498);
            size2 = snapshotStateList2.size();
            while (i36 < size2) {
                p001AuX.j jVar16 = (Object) snapshotStateList2.get(i36);
                rVarH.J(-2026002954, lVar4.b(jVar16));
                pVar = (p) t0Var.e(jVar16);
                if (pVar == null) {
                    rVarH.X(1618454323);
                } else {
                    rVarH.X(-2026001778);
                    pVar.B(rVarH, Integer.valueOf(i35));
                }
                rVarH.R();
                rVarH.U();
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar4;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            lVar5 = lVar3;
        }
        cVar2 = cVarO;
        lVar6 = lVar4;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new g(k2Var, mVar3, lVar5, cVar2, lVar6, rVar, i15, i16));
        }
    }

    public static final y0 c(boolean z15, p<? super c5.r, ? super c5.r, ? extends j0<c5.r>> pVar) {
        return new z0(z15, pVar);
    }

    public static /* synthetic */ y0 d(boolean z15, p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            pVar = h.f186273b;
        }
        return c(z15, pVar);
    }

    public static final v f(c0 c0Var, e0 e0Var) {
        return new v(c0Var, e0Var, 0.0f, null, 12, null);
    }
}
