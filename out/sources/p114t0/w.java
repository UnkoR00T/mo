package p114t0;

import c3.SnapshotStateList;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import fr.t;
import java.util.Iterator;
import n3.a2;
import n3.z1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.x5;
import pq.v;
import r0.g1;
import r0.t0;
import u0.j0;
import u0.k2;
import u0.s3;
import u0.v2;
import u0.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Lf3/m;", "modifier", "Lu0/j0;", "", "animationSpec", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function1;", "Loq/i0;", "content", "a", "(Ljava/lang/Object;Lf3/m;Lu0/j0;Ljava/lang/String;Ler/q;Lm2/r;II)V", "Lu0/k2;", "", "contentKey", "b", "(Lu0/k2;Lf3/m;Lu0/j0;Ler/l;Ler/q;Lm2/r;II)V", "alpha", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends fr.w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f186479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f186480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0<Float> f186481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f186482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T, r, Integer, i0> f186483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f186484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f186485h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t15, m mVar, j0<Float> j0Var, String str, q<? super T, ? super r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186479b = t15;
            this.f186480c = mVar;
            this.f186481d = j0Var;
            this.f186482e = str;
            this.f186483f = qVar;
            this.f186484g = i15;
            this.f186485h = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            w.a(this.f186479b, this.f186480c, this.f186481d, this.f186482e, this.f186483f, rVar, g4.a(this.f186484g | 1), this.f186485h);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "it", "b", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    static final class b<T> extends fr.w implements l<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f186486b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public final T b(T t15) {
            return t15;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "c", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends fr.w implements l<T, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<T> f186487b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k2<T> k2Var) {
            super(1);
            this.f186487b = k2Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(T t15) {
            return Boolean.valueOf(!t.c(t15, this.f186487b.w()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "e", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<T> f186488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0<Float> f186489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f186490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q<T, r, Integer, i0> f186491e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln3/a2;", "Loq/i0;", "c", "(Ln3/a2;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements l<a2, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f6<Float> f186492b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f6<Float> f6Var) {
                super(1);
                this.f186492b = f6Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
                c(a2Var);
                return i0.f148189a;
            }

            public final void c(a2 a2Var) {
                a2Var.g(d.f(this.f186492b));
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu0/k2$b;", "Lu0/j0;", "", "c", "(Lu0/k2$b;Lm2/r;I)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
        static final class b<T> extends fr.w implements q<k2.b<T>, r, Integer, j0<Float>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j0<Float> f186493b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j0<Float> j0Var) {
                super(3);
                this.f186493b = j0Var;
            }

            public final j0<Float> c(k2.b<T> bVar, r rVar, int i15) {
                rVar.X(955869654);
                if (p076m2.t.k()) {
                    p076m2.t.o(955869654, i15, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                j0<Float> j0Var = this.f186493b;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return j0Var;
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ j0<Float> w(Object obj, r rVar, Integer num) {
                return c((k2.b) obj, rVar, num.intValue());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class c<T> implements er.a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k2 f186494a;

            public c(k2 k2Var) {
                this.f186494a = k2Var;
            }

            @Override // er.a
            public final T a() {
                return (T) this.f186494a.w();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: t0.w$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C4826d<T> implements er.a<k2.b<T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k2 f186495a;

            public C4826d(k2 k2Var) {
                this.f186495a = k2Var;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final k2.b<T> a() {
                return this.f186495a.u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(k2<T> k2Var, j0<Float> j0Var, T t15, q<? super T, ? super r, ? super Integer, i0> qVar) {
            super(2);
            this.f186488b = k2Var;
            this.f186489c = j0Var;
            this.f186490d = t15;
            this.f186491e = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float f(f6<Float> f6Var) {
            return f6Var.getValue().floatValue();
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) throws Throwable {
            e(rVar, num.intValue());
            return i0.f148189a;
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
        public final void e(r rVar, int i15) throws Throwable {
            Object objP;
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-934471669, i15, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
            }
            k2<T> k2Var = this.f186488b;
            b bVar = new b(this.f186489c);
            T t15 = this.f186490d;
            y2<Float, u0.p> y2VarP = s3.P(fr.m.f66405a);
            if (k2Var.B()) {
                rVar.X(1666827533);
                rVar.R();
                objP = k2Var.p();
            } else {
                rVar.X(1666573488);
                boolean zW = rVar.W(k2Var);
                objP = rVar.E();
                if (zW || objP == r.INSTANCE.a()) {
                    c3.l.Companion companion = c3.l.INSTANCE;
                    c3.l lVarD = companion.d();
                    l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
                    c3.l lVarE = companion.e(lVarD);
                    try {
                        Object objP2 = k2Var.p();
                        companion.l(lVarD, lVarE, lVarG);
                        rVar.v(objP2);
                        objP = objP2;
                    } catch (Throwable th4) {
                        companion.l(lVarD, lVarE, lVarG);
                        throw th4;
                    }
                }
                rVar.R();
            }
            rVar.X(1378811975);
            if (p076m2.t.k()) {
                p076m2.t.o(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f15 = t.c(objP, t15) ? 1.0f : 0.0f;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            Float fValueOf = Float.valueOf(f15);
            boolean zW2 = rVar.W(k2Var);
            Object objE = rVar.E();
            if (zW2 || objE == r.INSTANCE.a()) {
                objE = x5.d(new c(k2Var));
                rVar.v(objE);
            }
            Object value = ((f6) objE).getValue();
            rVar.X(1378811975);
            if (p076m2.t.k()) {
                p076m2.t.o(1378811975, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f16 = t.c(value, t15) ? 1.0f : 0.0f;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            Float fValueOf2 = Float.valueOf(f16);
            boolean zW3 = rVar.W(k2Var);
            Object objE2 = rVar.E();
            if (zW3 || objE2 == r.INSTANCE.a()) {
                objE2 = x5.d(new C4826d(k2Var));
                rVar.v(objE2);
            }
            f6 f6VarR = v2.r(k2Var, fValueOf, fValueOf2, bVar.w(((f6) objE2).getValue(), rVar, 0), y2VarP, "FloatAnimation", rVar, 0);
            m.Companion companion2 = m.INSTANCE;
            boolean zW4 = rVar.W(f6VarR);
            Object objE3 = rVar.E();
            if (zW4 || objE3 == r.INSTANCE.a()) {
                objE3 = new a(f6VarR);
                rVar.v(objE3);
            }
            m mVarC = z1.c(companion2, (l) objE3);
            q<T, r, Integer, i0> qVar = this.f186491e;
            T t16 = this.f186490d;
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.e(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            qVar.w(t16, rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e extends fr.w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<T> f186496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f186497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0<Float> f186498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<T, Object> f186499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q<T, r, Integer, i0> f186500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f186501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f186502h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(k2<T> k2Var, m mVar, j0<Float> j0Var, l<? super T, ? extends Object> lVar, q<? super T, ? super r, ? super Integer, i0> qVar, int i15, int i16) {
            super(2);
            this.f186496b = k2Var;
            this.f186497c = mVar;
            this.f186498d = j0Var;
            this.f186499e = lVar;
            this.f186500f = qVar;
            this.f186501g = i15;
            this.f186502h = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            w.b(this.f186496b, this.f186497c, this.f186498d, this.f186499e, this.f186500f, rVar, g4.a(this.f186501g | 1), this.f186502h);
        }
    }

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
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final <T> void a(T t15, m mVar, j0<Float> j0Var, String str, q<? super T, ? super r, ? super Integer, i0> qVar, r rVar, int i15, int i16) {
        int i17;
        m mVar2;
        int i18;
        j0<Float> j0Var2;
        int i19;
        int i25;
        int i26;
        boolean z15;
        m mVar3;
        j0<Float> j0Var3;
        String str2;
        d5 d5VarM;
        int i27;
        m mVar4;
        j0<Float> j0VarL;
        String str3;
        int i28;
        r rVarH = rVar.h(-513216493);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(t15) : rVarH.G(t15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    j0Var2 = j0Var;
                    if (rVarH.G(j0Var2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        if (rVarH.W(str)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 24576) == 0) {
                        if (rVarH.G(qVar)) {
                            i28 = 16384;
                        } else {
                            i28 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i28;
                    }
                    if ((i17 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        if (i29 != 0) {
                            mVar4 = m.INSTANCE;
                            i27 = i25;
                        } else {
                            i27 = i25;
                            mVar4 = mVar2;
                        }
                        if (i18 != 0) {
                            j0VarL = u0.m.l(0, 0, null, 7, null);
                        } else {
                            j0VarL = j0Var2;
                        }
                        if (i27 != 0) {
                            str3 = "Crossfade";
                        } else {
                            str3 = str;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        str2 = str3;
                        mVar3 = mVar4;
                        j0Var3 = j0VarL;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        j0Var3 = j0Var2;
                        str2 = str;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
                    }
                }
                i17 |= 3072;
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                        i27 = i25;
                    } else {
                        i27 = i25;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    } else {
                        j0VarL = j0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    j0Var3 = j0VarL;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    j0Var3 = j0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            j0Var2 = j0Var;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.W(str)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                        i27 = i25;
                    } else {
                        i27 = i25;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    } else {
                        j0VarL = j0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    j0Var3 = j0VarL;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    j0Var3 = j0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                    i27 = i25;
                } else {
                    i27 = i25;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                } else {
                    j0VarL = j0Var2;
                }
                if (i27 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                j0Var3 = j0VarL;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j0Var3 = j0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                j0Var2 = j0Var;
                if (rVarH.G(j0Var2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.W(str)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i28 = 16384;
                    } else {
                        i28 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i28;
                }
                if ((i17 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i29 != 0) {
                        mVar4 = m.INSTANCE;
                        i27 = i25;
                    } else {
                        i27 = i25;
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    } else {
                        j0VarL = j0Var2;
                    }
                    if (i27 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                    }
                    b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    str2 = str3;
                    mVar3 = mVar4;
                    j0Var3 = j0VarL;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    j0Var3 = j0Var2;
                    str2 = str;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
                }
            }
            i17 |= 3072;
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                    i27 = i25;
                } else {
                    i27 = i25;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                } else {
                    j0VarL = j0Var2;
                }
                if (i27 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                j0Var3 = j0VarL;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j0Var3 = j0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        j0Var2 = j0Var;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                if (rVarH.W(str)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i28 = 16384;
                } else {
                    i28 = PKIFailureInfo.certRevoked;
                }
                i17 |= i28;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                    i27 = i25;
                } else {
                    i27 = i25;
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                } else {
                    j0VarL = j0Var2;
                }
                if (i27 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                }
                b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                str2 = str3;
                mVar3 = mVar4;
                j0Var3 = j0VarL;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                j0Var3 = j0Var2;
                str2 = str;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
            }
        }
        i17 |= 3072;
        if ((i15 & 24576) == 0) {
            if (rVarH.G(qVar)) {
                i28 = 16384;
            } else {
                i28 = PKIFailureInfo.certRevoked;
            }
            i17 |= i28;
        }
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i29 != 0) {
                mVar4 = m.INSTANCE;
                i27 = i25;
            } else {
                i27 = i25;
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                j0VarL = u0.m.l(0, 0, null, 7, null);
            } else {
                j0VarL = j0Var2;
            }
            if (i27 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-513216493, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
            }
            b(v2.x(t15, str3, rVarH, (i17 & 14) | ((i17 >> 6) & 112), 0), mVar4, j0VarL, null, qVar, rVarH, i17 & 58352, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            str2 = str3;
            mVar3 = mVar4;
            j0Var3 = j0VarL;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            j0Var3 = j0Var2;
            str2 = str;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new a(t15, mVar3, j0Var3, str2, qVar, i15, i16));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191 A[LOOP:0: B:97:0x0174->B:102:0x0191, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x019f  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0 A[LOOP:1: B:108:0x01ae->B:109:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0209  */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x024a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0260  */
    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x028e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0294  */
    /* JADX WARN: Code duplicated, block: B:133:0x029e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0195 A[EDGE_INSN: B:136:0x0195->B:104:0x0195 BREAK  A[LOOP:0: B:97:0x0174->B:102:0x0191], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0125  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x017a  */
    public static final <T> void b(k2<T> k2Var, m mVar, j0<Float> j0Var, l<? super T, ? extends Object> lVar, q<? super T, ? super r, ? super Integer, i0> qVar, r rVar, int i15, int i16) {
        m mVar2;
        int i17;
        j0<Float> j0VarL;
        int i18;
        int i19;
        l<? super T, ? extends Object> lVar2;
        int i25;
        boolean z15;
        j0<Float> j0Var2;
        l<? super T, ? extends Object> lVar3;
        d5 d5VarM;
        Object objE;
        r.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objE2;
        t0 t0Var;
        er.a<androidx.compose.ui.node.c> aVarB;
        int size;
        int i26;
        p pVar;
        Iterator<T> it;
        int i27;
        int size2;
        int i28;
        boolean z16;
        Object objE3;
        Object objE4;
        int i29;
        r rVarH = rVar.h(-1877370462);
        int i35 = (i15 & 6) == 0 ? (rVarH.W(k2Var) ? 4 : 2) | i15 : i15;
        int i36 = i16 & 1;
        if (i36 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i35 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i17 = i16 & 2;
            if (i17 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    j0VarL = j0Var;
                    if (rVarH.G(j0VarL)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i35 |= i18;
                }
                i19 = i16 & 4;
                if (i19 != 0) {
                    if ((i15 & 3072) == 0) {
                        lVar2 = lVar;
                        if (rVarH.G(lVar2)) {
                            i25 = 2048;
                        } else {
                            i25 = 1024;
                        }
                        i35 |= i25;
                    }
                    if ((i15 & 24576) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = 16384;
                        } else {
                            i29 = PKIFailureInfo.certRevoked;
                        }
                        i35 |= i29;
                    }
                    if ((i35 & 9363) != 9362) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i35 & 1)) {
                        if (i36 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i17 != 0) {
                            j0VarL = u0.m.l(0, 0, null, 7, null);
                        }
                        if (i19 != 0) {
                            objE4 = rVarH.E();
                            if (objE4 == r.INSTANCE.a()) {
                                objE4 = b.f186486b;
                                rVarH.v(objE4);
                            }
                            lVar2 = (l) objE4;
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        obj = objE;
                        if (objE == companion.a()) {
                            SnapshotStateList snapshotStateListF = x5.f();
                            snapshotStateListF.add(k2Var.p());
                            rVarH.v(snapshotStateListF);
                            obj = snapshotStateListF;
                        }
                        snapshotStateList = (SnapshotStateList) obj;
                        objE2 = rVarH.E();
                        if (objE2 == companion.a()) {
                            objE2 = g1.c();
                            rVarH.v(objE2);
                        }
                        t0Var = (t0) objE2;
                        if (t.c(k2Var.p(), k2Var.w())) {
                            rVarH.X(321145192);
                            if (snapshotStateList.size() == 1 || !t.c(snapshotStateList.get(0), k2Var.w())) {
                                rVarH.X(321279546);
                                if ((i35 & 14) == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objE3 = rVarH.E();
                                if (z16 || objE3 == companion.a()) {
                                    objE3 = new c(k2Var);
                                    rVarH.v(objE3);
                                }
                                v.J(snapshotStateList, (l) objE3);
                                t0Var.k();
                                rVarH.R();
                            } else {
                                rVarH.X(321469824);
                                rVarH.R();
                            }
                            rVarH.R();
                        } else {
                            rVarH.X(321475776);
                            rVarH.R();
                        }
                        if (t0Var.b(k2Var.w())) {
                            rVarH.X(322279296);
                            rVarH.R();
                        } else {
                            rVarH.X(321536443);
                            it = snapshotStateList.iterator();
                            i27 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i27 = -1;
                                    break;
                                } else if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                    break;
                                } else {
                                    i27++;
                                }
                            }
                            if (i27 == -1) {
                                snapshotStateList.add(k2Var.w());
                            } else {
                                snapshotStateList.set(i27, k2Var.w());
                            }
                            t0Var.k();
                            size2 = snapshotStateList.size();
                            for (i28 = 0; i28 < size2; i28++) {
                                T t15 = snapshotStateList.get(i28);
                                t0Var.x(t15, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t15, qVar), rVarH, 54));
                            }
                            rVarH.R();
                        }
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                        int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                        e0 e0VarT = rVarH.t();
                        m mVarE = j.e(rVarH, mVar2);
                        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                        aVarB = companion2.b();
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
                        n6.i(rVarC, w0VarI, companion2.d());
                        n6.i(rVarC, e0VarT, companion2.f());
                        n6.e(rVarC, Integer.valueOf(iHashCode), companion2.c());
                        n6.g(rVarC, companion2.a());
                        n6.i(rVarC, mVarE, companion2.e());
                        x xVar = x.f39368a;
                        rVarH.X(-1312707512);
                        size = snapshotStateList.size();
                        for (i26 = 0; i26 < size; i26++) {
                            T t16 = snapshotStateList.get(i26);
                            rVarH.J(1171574969, lVar2.b(t16));
                            pVar = (p) t0Var.e(t16);
                            if (pVar == null) {
                                rVarH.X(1959122128);
                                rVarH.R();
                            } else {
                                rVarH.X(1171576145);
                                pVar.B(rVarH, 0);
                                rVarH.R();
                            }
                            rVarH.U();
                        }
                        rVarH.R();
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVarH.O();
                    }
                    j0Var2 = j0VarL;
                    lVar3 = lVar2;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
                    }
                }
                i35 |= 3072;
                lVar2 = lVar;
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i35 |= i29;
                }
                if ((i35 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i35 & 1)) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i17 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    }
                    if (i19 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = b.f186486b;
                            rVarH.v(objE4);
                        }
                        lVar2 = (l) objE4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    obj = objE;
                    if (objE == companion.a()) {
                        SnapshotStateList snapshotStateListF2 = x5.f();
                        snapshotStateListF2.add(k2Var.p());
                        rVarH.v(snapshotStateListF2);
                        obj = snapshotStateListF2;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = g1.c();
                        rVarH.v(objE2);
                    }
                    t0Var = (t0) objE2;
                    if (t.c(k2Var.p(), k2Var.w())) {
                        rVarH.X(321145192);
                        if (snapshotStateList.size() == 1) {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        } else {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(321475776);
                        rVarH.R();
                    }
                    if (t0Var.b(k2Var.w())) {
                        rVarH.X(321536443);
                        it = snapshotStateList.iterator();
                        i27 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i27 = -1;
                                break;
                            } else {
                                if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                    break;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (i27 == -1) {
                            snapshotStateList.add(k2Var.w());
                        } else {
                            snapshotStateList.set(i27, k2Var.w());
                        }
                        t0Var.k();
                        size2 = snapshotStateList.size();
                        while (i28 < size2) {
                            T t17 = snapshotStateList.get(i28);
                            t0Var.x(t17, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t17, qVar), rVarH, 54));
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(322279296);
                        rVarH.R();
                    }
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE2 = j.e(rVarH, mVar2);
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
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.e(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    x xVar2 = x.f39368a;
                    rVarH.X(-1312707512);
                    size = snapshotStateList.size();
                    while (i26 < size) {
                        T t18 = snapshotStateList.get(i26);
                        rVarH.J(1171574969, lVar2.b(t18));
                        pVar = (p) t0Var.e(t18);
                        if (pVar == null) {
                            rVarH.X(1959122128);
                            rVarH.R();
                        } else {
                            rVarH.X(1171576145);
                            pVar.B(rVarH, 0);
                            rVarH.R();
                        }
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                j0Var2 = j0VarL;
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
                }
            }
            i35 |= MLKEMEngine.KyberPolyBytes;
            j0VarL = j0Var;
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar2 = lVar;
                    if (rVarH.G(lVar2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i35 |= i25;
                }
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i35 |= i29;
                }
                if ((i35 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i35 & 1)) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i17 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    }
                    if (i19 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = b.f186486b;
                            rVarH.v(objE4);
                        }
                        lVar2 = (l) objE4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    obj = objE;
                    if (objE == companion.a()) {
                        SnapshotStateList snapshotStateListF3 = x5.f();
                        snapshotStateListF3.add(k2Var.p());
                        rVarH.v(snapshotStateListF3);
                        obj = snapshotStateListF3;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = g1.c();
                        rVarH.v(objE2);
                    }
                    t0Var = (t0) objE2;
                    if (t.c(k2Var.p(), k2Var.w())) {
                        rVarH.X(321145192);
                        if (snapshotStateList.size() == 1) {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        } else {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(321475776);
                        rVarH.R();
                    }
                    if (t0Var.b(k2Var.w())) {
                        rVarH.X(321536443);
                        it = snapshotStateList.iterator();
                        i27 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i27 = -1;
                                break;
                            } else {
                                if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                    break;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (i27 == -1) {
                            snapshotStateList.add(k2Var.w());
                        } else {
                            snapshotStateList.set(i27, k2Var.w());
                        }
                        t0Var.k();
                        size2 = snapshotStateList.size();
                        while (i28 < size2) {
                            T t19 = snapshotStateList.get(i28);
                            t0Var.x(t19, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t19, qVar), rVarH, 54));
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(322279296);
                        rVarH.R();
                    }
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT3 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVar2);
                    androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion4.b();
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
                    n6.i(rVarC3, w0VarI3, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.e(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    x xVar3 = x.f39368a;
                    rVarH.X(-1312707512);
                    size = snapshotStateList.size();
                    while (i26 < size) {
                        T t110 = snapshotStateList.get(i26);
                        rVarH.J(1171574969, lVar2.b(t110));
                        pVar = (p) t0Var.e(t110);
                        if (pVar == null) {
                            rVarH.X(1959122128);
                            rVarH.R();
                        } else {
                            rVarH.X(1171576145);
                            pVar.B(rVarH, 0);
                            rVarH.R();
                        }
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                j0Var2 = j0VarL;
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
                }
            }
            i35 |= 3072;
            lVar2 = lVar;
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 16384;
                } else {
                    i29 = PKIFailureInfo.certRevoked;
                }
                i35 |= i29;
            }
            if ((i35 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i35 & 1)) {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i17 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                }
                if (i19 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = b.f186486b;
                        rVarH.v(objE4);
                    }
                    lVar2 = (l) objE4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                obj = objE;
                if (objE == companion.a()) {
                    SnapshotStateList snapshotStateListF4 = x5.f();
                    snapshotStateListF4.add(k2Var.p());
                    rVarH.v(snapshotStateListF4);
                    obj = snapshotStateListF4;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = g1.c();
                    rVarH.v(objE2);
                }
                t0Var = (t0) objE2;
                if (t.c(k2Var.p(), k2Var.w())) {
                    rVarH.X(321145192);
                    if (snapshotStateList.size() == 1) {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    } else {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    }
                    rVarH.R();
                } else {
                    rVarH.X(321475776);
                    rVarH.R();
                }
                if (t0Var.b(k2Var.w())) {
                    rVarH.X(321536443);
                    it = snapshotStateList.iterator();
                    i27 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i27 = -1;
                            break;
                        } else {
                            if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                break;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (i27 == -1) {
                        snapshotStateList.add(k2Var.w());
                    } else {
                        snapshotStateList.set(i27, k2Var.w());
                    }
                    t0Var.k();
                    size2 = snapshotStateList.size();
                    while (i28 < size2) {
                        T t111 = snapshotStateList.get(i28);
                        t0Var.x(t111, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t111, qVar), rVarH, 54));
                    }
                    rVarH.R();
                } else {
                    rVarH.X(322279296);
                    rVarH.R();
                }
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE4 = j.e(rVarH, mVar2);
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
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion5.d());
                n6.i(rVarC4, e0VarT4, companion5.f());
                n6.e(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                n6.g(rVarC4, companion5.a());
                n6.i(rVarC4, mVarE4, companion5.e());
                x xVar4 = x.f39368a;
                rVarH.X(-1312707512);
                size = snapshotStateList.size();
                while (i26 < size) {
                    T t112 = snapshotStateList.get(i26);
                    rVarH.J(1171574969, lVar2.b(t112));
                    pVar = (p) t0Var.e(t112);
                    if (pVar == null) {
                        rVarH.X(1959122128);
                        rVarH.R();
                    } else {
                        rVarH.X(1171576145);
                        pVar.B(rVarH, 0);
                        rVarH.R();
                    }
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            j0Var2 = j0VarL;
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
            }
        }
        i35 |= 48;
        mVar2 = mVar;
        i17 = i16 & 2;
        if (i17 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                j0VarL = j0Var;
                if (rVarH.G(j0VarL)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i35 |= i18;
            }
            i19 = i16 & 4;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    lVar2 = lVar;
                    if (rVarH.G(lVar2)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i35 |= i25;
                }
                if ((i15 & 24576) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 16384;
                    } else {
                        i29 = PKIFailureInfo.certRevoked;
                    }
                    i35 |= i29;
                }
                if ((i35 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i35 & 1)) {
                    if (i36 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i17 != 0) {
                        j0VarL = u0.m.l(0, 0, null, 7, null);
                    }
                    if (i19 != 0) {
                        objE4 = rVarH.E();
                        if (objE4 == r.INSTANCE.a()) {
                            objE4 = b.f186486b;
                            rVarH.v(objE4);
                        }
                        lVar2 = (l) objE4;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    obj = objE;
                    if (objE == companion.a()) {
                        SnapshotStateList snapshotStateListF5 = x5.f();
                        snapshotStateListF5.add(k2Var.p());
                        rVarH.v(snapshotStateListF5);
                        obj = snapshotStateListF5;
                    }
                    snapshotStateList = (SnapshotStateList) obj;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = g1.c();
                        rVarH.v(objE2);
                    }
                    t0Var = (t0) objE2;
                    if (t.c(k2Var.p(), k2Var.w())) {
                        rVarH.X(321145192);
                        if (snapshotStateList.size() == 1) {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        } else {
                            rVarH.X(321279546);
                            if ((i35 & 14) == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objE3 = rVarH.E();
                            if (z16) {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new c(k2Var);
                                rVarH.v(objE3);
                            }
                            v.J(snapshotStateList, (l) objE3);
                            t0Var.k();
                            rVarH.R();
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(321475776);
                        rVarH.R();
                    }
                    if (t0Var.b(k2Var.w())) {
                        rVarH.X(321536443);
                        it = snapshotStateList.iterator();
                        i27 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i27 = -1;
                                break;
                            } else {
                                if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                    break;
                                    break;
                                }
                                i27++;
                            }
                        }
                        if (i27 == -1) {
                            snapshotStateList.add(k2Var.w());
                        } else {
                            snapshotStateList.set(i27, k2Var.w());
                        }
                        t0Var.k();
                        size2 = snapshotStateList.size();
                        while (i28 < size2) {
                            T t113 = snapshotStateList.get(i28);
                            t0Var.x(t113, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t113, qVar), rVarH, 54));
                        }
                        rVarH.R();
                    } else {
                        rVarH.X(322279296);
                        rVarH.R();
                    }
                    w0 w0VarI5 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT5 = rVarH.t();
                    m mVarE5 = j.e(rVarH, mVar2);
                    androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion6.b();
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
                    n6.i(rVarC5, w0VarI5, companion6.d());
                    n6.i(rVarC5, e0VarT5, companion6.f());
                    n6.e(rVarC5, Integer.valueOf(iHashCode5), companion6.c());
                    n6.g(rVarC5, companion6.a());
                    n6.i(rVarC5, mVarE5, companion6.e());
                    x xVar5 = x.f39368a;
                    rVarH.X(-1312707512);
                    size = snapshotStateList.size();
                    while (i26 < size) {
                        T t114 = snapshotStateList.get(i26);
                        rVarH.J(1171574969, lVar2.b(t114));
                        pVar = (p) t0Var.e(t114);
                        if (pVar == null) {
                            rVarH.X(1959122128);
                            rVarH.R();
                        } else {
                            rVarH.X(1171576145);
                            pVar.B(rVarH, 0);
                            rVarH.R();
                        }
                        rVarH.U();
                    }
                    rVarH.R();
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                }
                j0Var2 = j0VarL;
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
                }
            }
            i35 |= 3072;
            lVar2 = lVar;
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 16384;
                } else {
                    i29 = PKIFailureInfo.certRevoked;
                }
                i35 |= i29;
            }
            if ((i35 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i35 & 1)) {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i17 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                }
                if (i19 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = b.f186486b;
                        rVarH.v(objE4);
                    }
                    lVar2 = (l) objE4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                obj = objE;
                if (objE == companion.a()) {
                    SnapshotStateList snapshotStateListF6 = x5.f();
                    snapshotStateListF6.add(k2Var.p());
                    rVarH.v(snapshotStateListF6);
                    obj = snapshotStateListF6;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = g1.c();
                    rVarH.v(objE2);
                }
                t0Var = (t0) objE2;
                if (t.c(k2Var.p(), k2Var.w())) {
                    rVarH.X(321145192);
                    if (snapshotStateList.size() == 1) {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    } else {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    }
                    rVarH.R();
                } else {
                    rVarH.X(321475776);
                    rVarH.R();
                }
                if (t0Var.b(k2Var.w())) {
                    rVarH.X(321536443);
                    it = snapshotStateList.iterator();
                    i27 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i27 = -1;
                            break;
                        } else {
                            if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                break;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (i27 == -1) {
                        snapshotStateList.add(k2Var.w());
                    } else {
                        snapshotStateList.set(i27, k2Var.w());
                    }
                    t0Var.k();
                    size2 = snapshotStateList.size();
                    while (i28 < size2) {
                        T t115 = snapshotStateList.get(i28);
                        t0Var.x(t115, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t115, qVar), rVarH, 54));
                    }
                    rVarH.R();
                } else {
                    rVarH.X(322279296);
                    rVarH.R();
                }
                w0 w0VarI6 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT6 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVar2);
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
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarI6, companion7.d());
                n6.i(rVarC6, e0VarT6, companion7.f());
                n6.e(rVarC6, Integer.valueOf(iHashCode6), companion7.c());
                n6.g(rVarC6, companion7.a());
                n6.i(rVarC6, mVarE6, companion7.e());
                x xVar6 = x.f39368a;
                rVarH.X(-1312707512);
                size = snapshotStateList.size();
                while (i26 < size) {
                    T t116 = snapshotStateList.get(i26);
                    rVarH.J(1171574969, lVar2.b(t116));
                    pVar = (p) t0Var.e(t116);
                    if (pVar == null) {
                        rVarH.X(1959122128);
                        rVarH.R();
                    } else {
                        rVarH.X(1171576145);
                        pVar.B(rVarH, 0);
                        rVarH.R();
                    }
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            j0Var2 = j0VarL;
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
            }
        }
        i35 |= MLKEMEngine.KyberPolyBytes;
        j0VarL = j0Var;
        i19 = i16 & 4;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                lVar2 = lVar;
                if (rVarH.G(lVar2)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i35 |= i25;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 16384;
                } else {
                    i29 = PKIFailureInfo.certRevoked;
                }
                i35 |= i29;
            }
            if ((i35 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i35 & 1)) {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i17 != 0) {
                    j0VarL = u0.m.l(0, 0, null, 7, null);
                }
                if (i19 != 0) {
                    objE4 = rVarH.E();
                    if (objE4 == r.INSTANCE.a()) {
                        objE4 = b.f186486b;
                        rVarH.v(objE4);
                    }
                    lVar2 = (l) objE4;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                obj = objE;
                if (objE == companion.a()) {
                    SnapshotStateList snapshotStateListF7 = x5.f();
                    snapshotStateListF7.add(k2Var.p());
                    rVarH.v(snapshotStateListF7);
                    obj = snapshotStateListF7;
                }
                snapshotStateList = (SnapshotStateList) obj;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = g1.c();
                    rVarH.v(objE2);
                }
                t0Var = (t0) objE2;
                if (t.c(k2Var.p(), k2Var.w())) {
                    rVarH.X(321145192);
                    if (snapshotStateList.size() == 1) {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    } else {
                        rVarH.X(321279546);
                        if ((i35 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objE3 = rVarH.E();
                        if (z16) {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new c(k2Var);
                            rVarH.v(objE3);
                        }
                        v.J(snapshotStateList, (l) objE3);
                        t0Var.k();
                        rVarH.R();
                    }
                    rVarH.R();
                } else {
                    rVarH.X(321475776);
                    rVarH.R();
                }
                if (t0Var.b(k2Var.w())) {
                    rVarH.X(321536443);
                    it = snapshotStateList.iterator();
                    i27 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i27 = -1;
                            break;
                        } else {
                            if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                                break;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (i27 == -1) {
                        snapshotStateList.add(k2Var.w());
                    } else {
                        snapshotStateList.set(i27, k2Var.w());
                    }
                    t0Var.k();
                    size2 = snapshotStateList.size();
                    while (i28 < size2) {
                        T t117 = snapshotStateList.get(i28);
                        t0Var.x(t117, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t117, qVar), rVarH, 54));
                    }
                    rVarH.R();
                } else {
                    rVarH.X(322279296);
                    rVarH.R();
                }
                w0 w0VarI7 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT7 = rVarH.t();
                m mVarE7 = j.e(rVarH, mVar2);
                androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion8.b();
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
                n6.i(rVarC7, w0VarI7, companion8.d());
                n6.i(rVarC7, e0VarT7, companion8.f());
                n6.e(rVarC7, Integer.valueOf(iHashCode7), companion8.c());
                n6.g(rVarC7, companion8.a());
                n6.i(rVarC7, mVarE7, companion8.e());
                x xVar7 = x.f39368a;
                rVarH.X(-1312707512);
                size = snapshotStateList.size();
                while (i26 < size) {
                    T t118 = snapshotStateList.get(i26);
                    rVarH.J(1171574969, lVar2.b(t118));
                    pVar = (p) t0Var.e(t118);
                    if (pVar == null) {
                        rVarH.X(1959122128);
                        rVarH.R();
                    } else {
                        rVarH.X(1171576145);
                        pVar.B(rVarH, 0);
                        rVarH.R();
                    }
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            j0Var2 = j0VarL;
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
            }
        }
        i35 |= 3072;
        lVar2 = lVar;
        if ((i15 & 24576) == 0) {
            if (rVarH.G(qVar)) {
                i29 = 16384;
            } else {
                i29 = PKIFailureInfo.certRevoked;
            }
            i35 |= i29;
        }
        if ((i35 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i35 & 1)) {
            if (i36 != 0) {
                mVar2 = m.INSTANCE;
            }
            if (i17 != 0) {
                j0VarL = u0.m.l(0, 0, null, 7, null);
            }
            if (i19 != 0) {
                objE4 = rVarH.E();
                if (objE4 == r.INSTANCE.a()) {
                    objE4 = b.f186486b;
                    rVarH.v(objE4);
                }
                lVar2 = (l) objE4;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1877370462, i35, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:102)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            obj = objE;
            if (objE == companion.a()) {
                SnapshotStateList snapshotStateListF8 = x5.f();
                snapshotStateListF8.add(k2Var.p());
                rVarH.v(snapshotStateListF8);
                obj = snapshotStateListF8;
            }
            snapshotStateList = (SnapshotStateList) obj;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = g1.c();
                rVarH.v(objE2);
            }
            t0Var = (t0) objE2;
            if (t.c(k2Var.p(), k2Var.w())) {
                rVarH.X(321145192);
                if (snapshotStateList.size() == 1) {
                    rVarH.X(321279546);
                    if ((i35 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE3 = rVarH.E();
                    if (z16) {
                        objE3 = new c(k2Var);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new c(k2Var);
                        rVarH.v(objE3);
                    }
                    v.J(snapshotStateList, (l) objE3);
                    t0Var.k();
                    rVarH.R();
                } else {
                    rVarH.X(321279546);
                    if ((i35 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objE3 = rVarH.E();
                    if (z16) {
                        objE3 = new c(k2Var);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new c(k2Var);
                        rVarH.v(objE3);
                    }
                    v.J(snapshotStateList, (l) objE3);
                    t0Var.k();
                    rVarH.R();
                }
                rVarH.R();
            } else {
                rVarH.X(321475776);
                rVarH.R();
            }
            if (t0Var.b(k2Var.w())) {
                rVarH.X(321536443);
                it = snapshotStateList.iterator();
                i27 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i27 = -1;
                        break;
                    } else {
                        if (t.c(lVar2.b(it.next()), lVar2.b(k2Var.w()))) {
                            break;
                            break;
                        }
                        i27++;
                    }
                }
                if (i27 == -1) {
                    snapshotStateList.add(k2Var.w());
                } else {
                    snapshotStateList.set(i27, k2Var.w());
                }
                t0Var.k();
                size2 = snapshotStateList.size();
                while (i28 < size2) {
                    T t119 = snapshotStateList.get(i28);
                    t0Var.x(t119, y2.m.d(-934471669, true, new d(k2Var, j0VarL, t119, qVar), rVarH, 54));
                }
                rVarH.R();
            } else {
                rVarH.X(322279296);
                rVarH.R();
            }
            w0 w0VarI8 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT8 = rVarH.t();
            m mVarE8 = j.e(rVarH, mVar2);
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
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarI8, companion9.d());
            n6.i(rVarC8, e0VarT8, companion9.f());
            n6.e(rVarC8, Integer.valueOf(iHashCode8), companion9.c());
            n6.g(rVarC8, companion9.a());
            n6.i(rVarC8, mVarE8, companion9.e());
            x xVar8 = x.f39368a;
            rVarH.X(-1312707512);
            size = snapshotStateList.size();
            while (i26 < size) {
                T t1110 = snapshotStateList.get(i26);
                rVarH.J(1171574969, lVar2.b(t1110));
                pVar = (p) t0Var.e(t1110);
                if (pVar == null) {
                    rVarH.X(1959122128);
                    rVarH.R();
                } else {
                    rVarH.X(1171576145);
                    pVar.B(rVarH, 0);
                    rVarH.R();
                }
                rVarH.U();
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        j0Var2 = j0VarL;
        lVar3 = lVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new e(k2Var, mVar2, j0Var2, lVar3, qVar, i15, i16));
        }
    }
}
