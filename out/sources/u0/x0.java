package u0;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.f6;
import u0.s0.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", AnnotatedPrivateKey.LABEL, "Lu0/s0;", "g", "(Ljava/lang/String;Lm2/r;II)Lu0/s0;", "T", "Lu0/t;", "V", "initialValue", "targetValue", "Lu0/y2;", "typeConverter", "Lu0/q0;", "animationSpec", "Lm2/f6;", "d", "(Lu0/s0;Ljava/lang/Object;Ljava/lang/Object;Lu0/y2;Lu0/q0;Ljava/lang/String;Lm2/r;II)Lm2/f6;", "", "c", "(Lu0/s0;FFLu0/q0;Ljava/lang/String;Lm2/r;II)Lm2/f6;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/x0$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s0 f193940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s0.a f193941b;

        public a(s0 s0Var, s0.a aVar) {
            this.f193940a = s0Var;
            this.f193941b = aVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193940a.k(this.f193941b);
        }
    }

    public static final f6<Float> c(s0 s0Var, float f15, float f16, q0<Float> q0Var, String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (p076m2.t.k()) {
            p076m2.t.o(-644770905, i15, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i17 = i15 << 3;
        f6<Float> f6VarD = d(s0Var, Float.valueOf(f15), Float.valueOf(f16), s3.P(fr.m.f66405a), q0Var, str2, rVar, (i15 & 1022) | (57344 & i17) | (i17 & 458752), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarD;
    }

    public static final <T, V extends t> f6<T> d(s0 s0Var, T t15, T t16, y2<T, V> y2Var, q0<T> q0Var, String str, p076m2.r rVar, int i15, int i16) {
        final s0 s0Var2;
        final Object obj;
        final Object obj2;
        final q0<T> q0Var2;
        if ((i16 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (p076m2.t.k()) {
            p076m2.t.o(-1062847727, i15, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            s0Var2 = s0Var;
            obj = t15;
            obj2 = t16;
            q0Var2 = q0Var;
            s0.a aVar = s0Var2.new a(obj, obj2, y2Var, q0Var2, str2);
            rVar.v(aVar);
            objE = aVar;
        } else {
            s0Var2 = s0Var;
            obj = t15;
            obj2 = t16;
            q0Var2 = q0Var;
        }
        final s0.a aVar2 = (s0.a) objE;
        boolean z15 = true;
        boolean z16 = ((((i15 & 112) ^ 48) > 32 && rVar.G(obj)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.G(obj2)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        if ((((57344 & i15) ^ 24576) <= 16384 || !rVar.G(q0Var2)) && (i15 & 24576) != 16384) {
            z15 = false;
        }
        boolean z17 = z16 | z15;
        Object objE2 = rVar.E();
        if (z17 || objE2 == companion.a()) {
            objE2 = new er.a() { // from class: u0.v0
                @Override // er.a
                public final Object a() {
                    return x0.e(obj, aVar2, obj2, q0Var2);
                }
            };
            rVar.v(objE2);
        }
        Function0.g((er.a) objE2, rVar, 0);
        boolean zG = rVar.G(s0Var2);
        Object objE3 = rVar.E();
        if (zG || objE3 == companion.a()) {
            objE3 = new er.l() { // from class: u0.w0
                @Override // er.l
                public final Object b(Object obj3) {
                    return x0.f(s0Var2, aVar2, (p076m2.s0) obj3);
                }
            };
            rVar.v(objE3);
        }
        Function0.a(aVar2, (er.l) objE3, rVar, 6);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(Object obj, s0.a aVar, Object obj2, q0 q0Var) {
        if (!fr.t.c(obj, aVar.k()) || !fr.t.c(obj2, aVar.l())) {
            aVar.C(obj, obj2, q0Var);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 f(s0 s0Var, s0.a aVar, p076m2.s0 s0Var2) {
        s0Var.g(aVar);
        return new a(s0Var, aVar);
    }

    public static final s0 g(String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1013651573, i15, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new s0(str);
            rVar.v(objE);
        }
        s0 s0Var = (s0) objE;
        s0Var.l(rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return s0Var;
    }
}
