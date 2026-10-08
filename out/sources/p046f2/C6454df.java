package p046f2;

import c5.h;
import d1.c4;
import d1.g4;
import d1.h0;
import d1.t4;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.m;
import h2.a2;
import h2.b2;
import ju.p0;
import l2.k0;
import n3.y2;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import tq.e;
import tq.j;
import u0.f;
import vq.k;

/* JADX INFO: renamed from: f2.df, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a·\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\t2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u0017H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010!\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lf3/m;", "modifier", "Lf2/hj;", "sheetState", "Lc5/h;", "sheetMaxWidth", "", "sheetGesturesEnabled", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Ld1/c4;", "contentWindowInsets", "Lf2/ef;", "properties", "Lkotlin/Function1;", "Ld1/h0;", "content", "l", "(Ler/a;Lf3/m;Lf2/hj;FZLn3/y2;JJFJLer/p;Ler/p;Lf2/ef;Ler/q;Lm2/r;III)V", "skipPartiallyExpanded", "Lf2/ij;", "confirmValueChange", "y", "(ZLer/l;Lm2/r;II)Lf2/hj;", "isScrimVisible", "", "scrimAlpha", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6454df {

    /* JADX INFO: renamed from: f2.df$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f55595f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hj hjVar, e<? super a> eVar) {
            super(2, eVar);
            this.f55595f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55594e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f55595f;
                this.f55594e = 1;
                if (hjVar.s(this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f55595f, eVar);
        }
    }

    /* JADX INFO: renamed from: f2.df$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f55597f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hj hjVar, e<? super b> eVar) {
            super(2, eVar);
            this.f55597f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55596e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f55597f;
                this.f55596e = 1;
                if (hjVar.l(this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f55597f, eVar);
        }
    }

    /* JADX INFO: renamed from: f2.df$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f55599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hj hjVar, e<? super c> eVar) {
            super(2, eVar);
            this.f55599f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55598e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f55599f;
                this.f55598e = 1;
                if (hjVar.n(this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new c(this.f55599f, eVar);
        }
    }

    /* JADX INFO: renamed from: f2.df$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f55601f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(hj hjVar, e<? super d> eVar) {
            super(2, eVar);
            this.f55601f = hjVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f55600e;
            if (i15 == 0) {
                u.b(obj);
                hj hjVar = this.f55601f;
                this.f55600e = 1;
                if (hjVar.l(this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new d(this.f55601f, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x015b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x017d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0183  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0196  */
    /* JADX WARN: Code duplicated, block: B:143:0x019e  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01be  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0226  */
    /* JADX WARN: Code duplicated, block: B:185:0x022d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0238  */
    /* JADX WARN: Code duplicated, block: B:188:0x023f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0243  */
    /* JADX WARN: Code duplicated, block: B:193:0x0248  */
    /* JADX WARN: Code duplicated, block: B:196:0x0257  */
    /* JADX WARN: Code duplicated, block: B:199:0x0266  */
    /* JADX WARN: Code duplicated, block: B:200:0x0273  */
    /* JADX WARN: Code duplicated, block: B:202:0x0277  */
    /* JADX WARN: Code duplicated, block: B:203:0x027d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0283  */
    /* JADX WARN: Code duplicated, block: B:207:0x028e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0292  */
    /* JADX WARN: Code duplicated, block: B:210:0x0299  */
    /* JADX WARN: Code duplicated, block: B:213:0x029f  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:228:0x0302  */
    /* JADX WARN: Code duplicated, block: B:232:0x030c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0312 A[PHI: r39
      0x0312: PHI (r39v7 er.p<? super m2.r, ? super java.lang.Integer, ? extends d1.c4>) = 
      (r39v4 er.p<? super m2.r, ? super java.lang.Integer, ? extends d1.c4>)
      (r39v8 er.p<? super m2.r, ? super java.lang.Integer, ? extends d1.c4>)
     binds: [B:233:0x0310, B:231:0x0309] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:235:0x0315  */
    /* JADX WARN: Code duplicated, block: B:238:0x0322  */
    /* JADX WARN: Code duplicated, block: B:239:0x0325  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:242:0x0330  */
    /* JADX WARN: Code duplicated, block: B:245:0x0339  */
    /* JADX WARN: Code duplicated, block: B:249:0x0349  */
    /* JADX WARN: Code duplicated, block: B:253:0x0353  */
    /* JADX WARN: Code duplicated, block: B:255:0x0359 A[PHI: r42
      0x0359: PHI (r42v4 er.a) = (r42v1 er.a), (r42v5 er.a) binds: [B:254:0x0357, B:252:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:256:0x035c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0366  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:260:0x0369  */
    /* JADX WARN: Code duplicated, block: B:263:0x0371  */
    /* JADX WARN: Code duplicated, block: B:265:0x0377  */
    /* JADX WARN: Code duplicated, block: B:268:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:270:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:272:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:279:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0413  */
    /* JADX WARN: Code duplicated, block: B:284:0x0422  */
    /* JADX WARN: Code duplicated, block: B:286:0x0436  */
    /* JADX WARN: Code duplicated, block: B:289:0x0452  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    public static final void l(final er.a<i0> aVar, m mVar, hj hjVar, float f15, boolean z15, y2 y2Var, long j15, long j16, float f16, long j17, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, ? extends c4> pVar2, ef efVar, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        m mVar2;
        final hj hjVarY;
        int i19;
        int i25;
        int i26;
        boolean z16;
        int i27;
        y2 y2VarK;
        long jI;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        boolean z17;
        r rVar2;
        final float f17;
        long j18;
        final p<? super r, ? super Integer, i0> pVar3;
        final p<? super r, ? super Integer, ? extends c4> pVar4;
        final ef efVar2;
        final long j19;
        final boolean z18;
        final y2 y2Var2;
        final hj hjVar2;
        final long j25;
        final float f18;
        d5 d5VarM;
        float fO;
        long jE;
        float fN;
        long jN;
        p<? super r, ? super Integer, i0> pVarB;
        p<? super r, ? super Integer, ? extends c4> pVar5;
        ef efVar3;
        final float f19;
        m mVar3;
        int i49;
        int i55;
        final y2 y2Var3;
        p<? super r, ? super Integer, i0> pVar6;
        final long j26;
        boolean z19;
        long j27;
        final float f25;
        Object objE;
        r.Companion companion;
        final p0 p0Var;
        int i56;
        p<? super r, ? super Integer, ? extends c4> pVar7;
        boolean z25;
        int i57;
        boolean z26;
        boolean z27;
        Object objE2;
        m mVar4;
        er.a aVar2;
        er.a aVar3;
        boolean z28;
        boolean z29;
        boolean z35;
        Object objE3;
        int i58;
        final hj hjVar3;
        boolean z36;
        Object objE4;
        int i59;
        int i65;
        int i66;
        int i67;
        r rVarH = rVar.h(1904798512);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i68 = i17 & 2;
        if (i68 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i17 & 4) == 0) {
                    hjVarY = hjVar;
                    int i69 = rVarH.W(hjVarY) ? 256 : 128;
                    i18 |= i69;
                } else {
                    hjVarY = hjVar;
                }
                i18 |= i69;
            } else {
                hjVarY = hjVar;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i15 & 3072) == 0) {
                    if (rVarH.b(f15)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 16;
                if (i26 != 0) {
                    if ((i15 & 24576) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i27 = 16384;
                        } else {
                            i27 = PKIFailureInfo.certRevoked;
                        }
                        i18 |= i27;
                    }
                    if ((i15 & 196608) == 0) {
                        y2VarK = y2Var;
                        if ((i17 & 32) == 0 || !rVarH.W(y2VarK)) {
                            i67 = PKIFailureInfo.notAuthorized;
                        } else {
                            i67 = PKIFailureInfo.unsupportedVersion;
                        }
                        i18 |= i67;
                    } else {
                        y2VarK = y2Var;
                    }
                    if ((i15 & 1572864) == 0) {
                        jI = j15;
                        if ((i17 & 64) == 0 || !rVarH.d(jI)) {
                            i66 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i66 = PKIFailureInfo.badCertTemplate;
                        }
                        i18 |= i66;
                    } else {
                        jI = j15;
                    }
                    if ((i15 & 12582912) == 0) {
                        if ((i17 & 128) == 0) {
                            i65 = i18;
                            int i75 = rVarH.d(j16) ? 8388608 : 4194304;
                            i28 = i65 | i75;
                        } else {
                            i65 = i18;
                        }
                        i28 = i65 | i75;
                    } else {
                        i28 = i18;
                    }
                    i29 = i17 & 256;
                    if (i29 != 0) {
                        i28 |= 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (rVarH.b(f16)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i28 |= i35;
                    }
                    if ((i15 & 805306368) != 0) {
                        if ((i17 & 512) == 0 || !rVarH.d(j17)) {
                            i59 = 268435456;
                        } else {
                            i59 = PKIFailureInfo.duplicateCertReq;
                        }
                        i28 |= i59;
                    }
                    i36 = i17 & 1024;
                    if (i36 != 0) {
                        i37 = i16 | 6;
                    } else if ((i16 & 6) == 0) {
                        if (rVarH.G(pVar)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i16 | i38;
                    } else {
                        i37 = i16;
                    }
                    if ((i16 & 48) != 0) {
                        i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
                    }
                    i39 = i37;
                    i45 = i17 & PKIFailureInfo.certConfirmed;
                    if (i45 != 0) {
                        i46 = i39;
                        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.W(efVar)) {
                                i47 = 256;
                            } else {
                                i47 = 128;
                            }
                            i46 |= i47;
                        }
                        if ((i16 & 3072) != 0) {
                            i46 |= rVarH.G(qVar) ? 2048 : 1024;
                        }
                        i48 = i46;
                        if ((i28 & 306783379) == 306783378 || (i48 & 1171) != 1170) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i28 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i68 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if ((i17 & 4) != 0) {
                                    i28 &= -897;
                                    hjVarY = y(false, null, rVarH, 0, 3);
                                }
                                if (i19 != 0) {
                                    fO = n0.f56958a.o();
                                } else {
                                    fO = f15;
                                }
                                if (i26 != 0) {
                                    z16 = true;
                                }
                                if ((i17 & 32) != 0) {
                                    y2VarK = n0.f56958a.k(rVarH, 6);
                                    i28 &= -458753;
                                }
                                if ((i17 & 64) != 0) {
                                    jI = n0.f56958a.i(rVarH, 6);
                                    i28 &= -3670017;
                                }
                                if ((i17 & 128) != 0) {
                                    jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                    i28 &= -29360129;
                                } else {
                                    jE = j16;
                                }
                                if (i29 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f16;
                                }
                                if ((i17 & 512) != 0) {
                                    jN = n0.f56958a.n(rVarH, 6);
                                    i28 &= -1879048193;
                                } else {
                                    jN = j17;
                                }
                                if (i36 != 0) {
                                    pVarB = m3.f56824a.b();
                                } else {
                                    pVarB = pVar;
                                }
                                if ((i17 & 2048) != 0) {
                                    pVar5 = new p() { // from class: f2.ue
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                        }
                                    };
                                    i48 &= -113;
                                } else {
                                    pVar5 = pVar2;
                                }
                                int i76 = i48;
                                if (i45 != 0) {
                                    efVar3 = new ef(false, false, 3, null);
                                } else {
                                    efVar3 = efVar;
                                }
                                f19 = fN;
                                mVar3 = mVar2;
                                i49 = i28;
                                i55 = i76;
                                y2Var3 = y2VarK;
                                pVar6 = pVarB;
                                j26 = jE;
                                z19 = true;
                                j27 = jI;
                                f25 = fO;
                            } else {
                                rVarH.O();
                                if ((i17 & 4) != 0) {
                                    i28 &= -897;
                                }
                                if ((i17 & 32) != 0) {
                                    i28 &= -458753;
                                }
                                if ((i17 & 64) != 0) {
                                    i28 &= -3670017;
                                }
                                if ((i17 & 128) != 0) {
                                    i28 &= -29360129;
                                }
                                if ((i17 & 512) != 0) {
                                    i28 &= -1879048193;
                                }
                                if ((i17 & 2048) != 0) {
                                    i48 &= -113;
                                }
                                int i77 = i28;
                                i55 = i48;
                                i49 = i77;
                                j26 = j16;
                                f19 = f16;
                                jN = j17;
                                pVar6 = pVar;
                                pVar5 = pVar2;
                                efVar3 = efVar;
                                mVar3 = mVar2;
                                z19 = true;
                                y2Var3 = y2VarK;
                                j27 = jI;
                                f25 = f15;
                            }
                            final boolean z37 = z16;
                            final long j28 = j27;
                            rVarH.y();
                            if (t.k()) {
                                t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                            }
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = Function0.i(j.f191408a, rVarH);
                                rVarH.v(objE);
                            }
                            p0Var = (p0) objE;
                            i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                            final ef efVar4 = efVar3;
                            if (i56 > 256 || !rVarH.W(hjVarY)) {
                                pVar7 = pVar5;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z25 = false;
                                }
                                boolean zG = z25 | rVarH.G(p0Var);
                                i57 = i49 & 14;
                                if (i57 == 4) {
                                    z26 = z19;
                                } else {
                                    z26 = false;
                                }
                                z27 = zG | z26;
                                objE2 = rVarH.E();
                                if (z27) {
                                    mVar4 = mVar3;
                                } else {
                                    mVar4 = mVar3;
                                    if (objE2 == companion.a()) {
                                    }
                                    aVar2 = (er.a) objE2;
                                    if (i56 > 256 || !rVarH.W(hjVarY)) {
                                        aVar3 = aVar2;
                                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                            z28 = false;
                                        }
                                        boolean zG2 = z28 | rVarH.G(p0Var);
                                        if (i57 == 4) {
                                            z29 = z19;
                                        } else {
                                            z29 = false;
                                        }
                                        z35 = zG2 | z29;
                                        objE3 = rVarH.E();
                                        if (z35 || objE3 == companion.a()) {
                                            objE3 = new er.a() { // from class: f2.we
                                                @Override // er.a
                                                public final Object a() {
                                                    return C6454df.p(hjVarY, p0Var, aVar);
                                                }
                                            };
                                            rVarH.v(objE3);
                                        }
                                        er.a aVar4 = (er.a) objE3;
                                        i58 = i49;
                                        final m mVar5 = mVar4;
                                        final er.a aVar5 = aVar3;
                                        final long j29 = jN;
                                        hjVar3 = hjVarY;
                                        final p<? super r, ? super Integer, i0> pVar8 = pVar6;
                                        final p<? super r, ? super Integer, ? extends c4> pVar9 = pVar7;
                                        rVar2 = rVarH;
                                        C6458nf.h(aVar4, j26, efVar4, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                            @Override // er.p
                                            public final Object B(Object obj, Object obj2) {
                                                return C6454df.r(hjVar3, efVar4, aVar5, j29, mVar5, aVar, f25, z37, pVar8, pVar9, y2Var3, j28, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                            }
                                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                                        if (hjVar3.g()) {
                                            rVar2.X(748177042);
                                            z36 = (i56 <= 256 && rVar2.W(hjVar3)) || (i58 & MLKEMEngine.KyberPolyBytes) == 256;
                                            objE4 = rVar2.E();
                                            if (z36 || objE4 == companion.a()) {
                                                objE4 = new a(hjVar3, null);
                                                rVar2.v(objE4);
                                            }
                                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                            rVar2.R();
                                        } else {
                                            rVar2.X(748238546);
                                            rVar2.R();
                                        }
                                        if (t.k()) {
                                            t.n();
                                        }
                                        y2 y2Var4 = y2Var3;
                                        mVar2 = mVar5;
                                        y2Var2 = y2Var4;
                                        hjVar2 = hjVar3;
                                        f17 = f25;
                                        z18 = z37;
                                        j19 = j28;
                                        pVar3 = pVar8;
                                        j25 = j26;
                                        efVar2 = efVar4;
                                        pVar4 = pVar9;
                                        f18 = f19;
                                        j18 = j29;
                                    } else {
                                        aVar3 = aVar2;
                                    }
                                    z28 = z19;
                                    boolean zG3 = z28 | rVarH.G(p0Var);
                                    if (i57 == 4) {
                                        z29 = z19;
                                    } else {
                                        z29 = false;
                                    }
                                    z35 = zG3 | z29;
                                    objE3 = rVarH.E();
                                    if (z35) {
                                        objE3 = new er.a() { // from class: f2.we
                                            @Override // er.a
                                            public final Object a() {
                                                return C6454df.p(hjVarY, p0Var, aVar);
                                            }
                                        };
                                        rVarH.v(objE3);
                                    } else {
                                        objE3 = new er.a() { // from class: f2.we
                                            @Override // er.a
                                            public final Object a() {
                                                return C6454df.p(hjVarY, p0Var, aVar);
                                            }
                                        };
                                        rVarH.v(objE3);
                                    }
                                    er.a aVar6 = (er.a) objE3;
                                    i58 = i49;
                                    final m mVar6 = mVar4;
                                    final er.a aVar7 = aVar3;
                                    final long j210 = jN;
                                    hjVar3 = hjVarY;
                                    final p pVar10 = pVar6;
                                    final p pVar11 = pVar7;
                                    rVar2 = rVarH;
                                    C6458nf.h(aVar6, j26, efVar4, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return C6454df.r(hjVar3, efVar4, aVar7, j210, mVar6, aVar, f25, z37, pVar10, pVar11, y2Var3, j28, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                                    if (hjVar3.g()) {
                                        rVar2.X(748177042);
                                        if (i56 <= 256) {
                                        }
                                        objE4 = rVar2.E();
                                        if (z36) {
                                            objE4 = new a(hjVar3, null);
                                            rVar2.v(objE4);
                                        } else {
                                            objE4 = new a(hjVar3, null);
                                            rVar2.v(objE4);
                                        }
                                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                        rVar2.R();
                                    } else {
                                        rVar2.X(748238546);
                                        rVar2.R();
                                    }
                                    if (t.k()) {
                                        t.n();
                                    }
                                    y2 y2Var5 = y2Var3;
                                    mVar2 = mVar6;
                                    y2Var2 = y2Var5;
                                    hjVar2 = hjVar3;
                                    f17 = f25;
                                    z18 = z37;
                                    j19 = j28;
                                    pVar3 = pVar10;
                                    j25 = j26;
                                    efVar2 = efVar4;
                                    pVar4 = pVar11;
                                    f18 = f19;
                                    j18 = j210;
                                }
                                objE2 = new er.a() { // from class: f2.ve
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.n(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE2);
                                aVar2 = (er.a) objE2;
                                if (i56 > 256) {
                                    aVar3 = aVar2;
                                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                        z28 = z19;
                                    } else {
                                        z28 = false;
                                    }
                                } else {
                                    aVar3 = aVar2;
                                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                        z28 = z19;
                                    } else {
                                        z28 = false;
                                    }
                                }
                                boolean zG4 = z28 | rVarH.G(p0Var);
                                if (i57 == 4) {
                                    z29 = z19;
                                } else {
                                    z29 = false;
                                }
                                z35 = zG4 | z29;
                                objE3 = rVarH.E();
                                if (z35) {
                                    objE3 = new er.a() { // from class: f2.we
                                        @Override // er.a
                                        public final Object a() {
                                            return C6454df.p(hjVarY, p0Var, aVar);
                                        }
                                    };
                                    rVarH.v(objE3);
                                } else {
                                    objE3 = new er.a() { // from class: f2.we
                                        @Override // er.a
                                        public final Object a() {
                                            return C6454df.p(hjVarY, p0Var, aVar);
                                        }
                                    };
                                    rVarH.v(objE3);
                                }
                                er.a aVar8 = (er.a) objE3;
                                i58 = i49;
                                final m mVar7 = mVar4;
                                final er.a aVar9 = aVar3;
                                final long j211 = jN;
                                hjVar3 = hjVarY;
                                final p pVar12 = pVar6;
                                final p pVar13 = pVar7;
                                rVar2 = rVarH;
                                C6458nf.h(aVar8, j26, efVar4, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.r(hjVar3, efVar4, aVar9, j211, mVar7, aVar, f25, z37, pVar12, pVar13, y2Var3, j28, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                                if (hjVar3.g()) {
                                    rVar2.X(748177042);
                                    if (i56 <= 256) {
                                    }
                                    objE4 = rVar2.E();
                                    if (z36) {
                                        objE4 = new a(hjVar3, null);
                                        rVar2.v(objE4);
                                    } else {
                                        objE4 = new a(hjVar3, null);
                                        rVar2.v(objE4);
                                    }
                                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                    rVar2.R();
                                } else {
                                    rVar2.X(748238546);
                                    rVar2.R();
                                }
                                if (t.k()) {
                                    t.n();
                                }
                                y2 y2Var6 = y2Var3;
                                mVar2 = mVar7;
                                y2Var2 = y2Var6;
                                hjVar2 = hjVar3;
                                f17 = f25;
                                z18 = z37;
                                j19 = j28;
                                pVar3 = pVar12;
                                j25 = j26;
                                efVar2 = efVar4;
                                pVar4 = pVar13;
                                f18 = f19;
                                j18 = j211;
                            } else {
                                pVar7 = pVar5;
                            }
                            z25 = z19;
                            boolean zG5 = z25 | rVarH.G(p0Var);
                            i57 = i49 & 14;
                            if (i57 == 4) {
                                z26 = z19;
                            } else {
                                z26 = false;
                            }
                            z27 = zG5 | z26;
                            objE2 = rVarH.E();
                            if (z27) {
                                mVar4 = mVar3;
                                if (objE2 == companion.a()) {
                                }
                                aVar2 = (er.a) objE2;
                                if (i56 > 256) {
                                    aVar3 = aVar2;
                                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                        z28 = z19;
                                    } else {
                                        z28 = false;
                                    }
                                } else {
                                    aVar3 = aVar2;
                                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                        z28 = z19;
                                    } else {
                                        z28 = false;
                                    }
                                }
                                boolean zG6 = z28 | rVarH.G(p0Var);
                                if (i57 == 4) {
                                    z29 = z19;
                                } else {
                                    z29 = false;
                                }
                                z35 = zG6 | z29;
                                objE3 = rVarH.E();
                                if (z35) {
                                    objE3 = new er.a() { // from class: f2.we
                                        @Override // er.a
                                        public final Object a() {
                                            return C6454df.p(hjVarY, p0Var, aVar);
                                        }
                                    };
                                    rVarH.v(objE3);
                                } else {
                                    objE3 = new er.a() { // from class: f2.we
                                        @Override // er.a
                                        public final Object a() {
                                            return C6454df.p(hjVarY, p0Var, aVar);
                                        }
                                    };
                                    rVarH.v(objE3);
                                }
                                er.a aVar10 = (er.a) objE3;
                                i58 = i49;
                                final m mVar8 = mVar4;
                                final er.a aVar11 = aVar3;
                                final long j212 = jN;
                                hjVar3 = hjVarY;
                                final p pVar14 = pVar6;
                                final p pVar15 = pVar7;
                                rVar2 = rVarH;
                                C6458nf.h(aVar10, j26, efVar4, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.r(hjVar3, efVar4, aVar11, j212, mVar8, aVar, f25, z37, pVar14, pVar15, y2Var3, j28, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                                if (hjVar3.g()) {
                                    rVar2.X(748177042);
                                    if (i56 <= 256) {
                                    }
                                    objE4 = rVar2.E();
                                    if (z36) {
                                        objE4 = new a(hjVar3, null);
                                        rVar2.v(objE4);
                                    } else {
                                        objE4 = new a(hjVar3, null);
                                        rVar2.v(objE4);
                                    }
                                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                    rVar2.R();
                                } else {
                                    rVar2.X(748238546);
                                    rVar2.R();
                                }
                                if (t.k()) {
                                    t.n();
                                }
                                y2 y2Var7 = y2Var3;
                                mVar2 = mVar8;
                                y2Var2 = y2Var7;
                                hjVar2 = hjVar3;
                                f17 = f25;
                                z18 = z37;
                                j19 = j28;
                                pVar3 = pVar14;
                                j25 = j26;
                                efVar2 = efVar4;
                                pVar4 = pVar15;
                                f18 = f19;
                                j18 = j212;
                            } else {
                                mVar4 = mVar3;
                            }
                            objE2 = new er.a() { // from class: f2.ve
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.n(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE2);
                            aVar2 = (er.a) objE2;
                            if (i56 > 256) {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            } else {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            }
                            boolean zG7 = z28 | rVarH.G(p0Var);
                            if (i57 == 4) {
                                z29 = z19;
                            } else {
                                z29 = false;
                            }
                            z35 = zG7 | z29;
                            objE3 = rVarH.E();
                            if (z35) {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            er.a aVar12 = (er.a) objE3;
                            i58 = i49;
                            final m mVar9 = mVar4;
                            final er.a aVar13 = aVar3;
                            final long j213 = jN;
                            hjVar3 = hjVarY;
                            final p pVar16 = pVar6;
                            final p pVar17 = pVar7;
                            rVar2 = rVarH;
                            C6458nf.h(aVar12, j26, efVar4, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.r(hjVar3, efVar4, aVar13, j213, mVar9, aVar, f25, z37, pVar16, pVar17, y2Var3, j28, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                            if (hjVar3.g()) {
                                rVar2.X(748177042);
                                if (i56 <= 256) {
                                }
                                objE4 = rVar2.E();
                                if (z36) {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                } else {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                }
                                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                rVar2.R();
                            } else {
                                rVar2.X(748238546);
                                rVar2.R();
                            }
                            if (t.k()) {
                                t.n();
                            }
                            y2 y2Var8 = y2Var3;
                            mVar2 = mVar9;
                            y2Var2 = y2Var8;
                            hjVar2 = hjVar3;
                            f17 = f25;
                            z18 = z37;
                            j19 = j28;
                            pVar3 = pVar16;
                            j25 = j26;
                            efVar2 = efVar4;
                            pVar4 = pVar17;
                            f18 = f19;
                            j18 = j213;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            f17 = f15;
                            j18 = j17;
                            pVar3 = pVar;
                            pVar4 = pVar2;
                            efVar2 = efVar;
                            j19 = jI;
                            z18 = z16;
                            y2Var2 = y2VarK;
                            hjVar2 = hjVarY;
                            j25 = j16;
                            f18 = f16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            final long j35 = j18;
                            final m mVar10 = mVar2;
                            d5VarM.a(new p() { // from class: f2.ye
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.x(aVar, mVar10, hjVar2, f17, z18, y2Var2, j19, j25, f18, j35, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i46 = i39 | MLKEMEngine.KyberPolyBytes;
                    if ((i16 & 3072) != 0) {
                        i46 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i46;
                    if ((i28 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i28 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i78 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i78;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        } else {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i79 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i79;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        }
                        final boolean z38 = z16;
                        final long j214 = j27;
                        rVarH.y();
                        if (t.k()) {
                            t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = Function0.i(j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        p0Var = (p0) objE;
                        i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        final ef efVar5 = efVar3;
                        if (i56 > 256) {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        } else {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        }
                        boolean zG8 = z25 | rVarH.G(p0Var);
                        i57 = i49 & 14;
                        if (i57 == 4) {
                            z26 = z19;
                        } else {
                            z26 = false;
                        }
                        z27 = zG8 | z26;
                        objE2 = rVarH.E();
                        if (z27) {
                            mVar4 = mVar3;
                            if (objE2 == companion.a()) {
                            }
                            aVar2 = (er.a) objE2;
                            if (i56 > 256) {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            } else {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            }
                            boolean zG9 = z28 | rVarH.G(p0Var);
                            if (i57 == 4) {
                                z29 = z19;
                            } else {
                                z29 = false;
                            }
                            z35 = zG9 | z29;
                            objE3 = rVarH.E();
                            if (z35) {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            er.a aVar14 = (er.a) objE3;
                            i58 = i49;
                            final m mVar11 = mVar4;
                            final er.a aVar15 = aVar3;
                            final long j215 = jN;
                            hjVar3 = hjVarY;
                            final p pVar18 = pVar6;
                            final p pVar19 = pVar7;
                            rVar2 = rVarH;
                            C6458nf.h(aVar14, j26, efVar5, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.r(hjVar3, efVar5, aVar15, j215, mVar11, aVar, f25, z38, pVar18, pVar19, y2Var3, j214, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                            if (hjVar3.g()) {
                                rVar2.X(748177042);
                                if (i56 <= 256) {
                                }
                                objE4 = rVar2.E();
                                if (z36) {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                } else {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                }
                                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                rVar2.R();
                            } else {
                                rVar2.X(748238546);
                                rVar2.R();
                            }
                            if (t.k()) {
                                t.n();
                            }
                            y2 y2Var9 = y2Var3;
                            mVar2 = mVar11;
                            y2Var2 = y2Var9;
                            hjVar2 = hjVar3;
                            f17 = f25;
                            z18 = z38;
                            j19 = j214;
                            pVar3 = pVar18;
                            j25 = j26;
                            efVar2 = efVar5;
                            pVar4 = pVar19;
                            f18 = f19;
                            j18 = j215;
                        } else {
                            mVar4 = mVar3;
                        }
                        objE2 = new er.a() { // from class: f2.ve
                            @Override // er.a
                            public final Object a() {
                                return C6454df.n(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE2);
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG10 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG10 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar16 = (er.a) objE3;
                        i58 = i49;
                        final m mVar12 = mVar4;
                        final er.a aVar17 = aVar3;
                        final long j216 = jN;
                        hjVar3 = hjVarY;
                        final p pVar110 = pVar6;
                        final p pVar111 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar16, j26, efVar5, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar5, aVar17, j216, mVar12, aVar, f25, z38, pVar110, pVar111, y2Var3, j214, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var10 = y2Var3;
                        mVar2 = mVar12;
                        y2Var2 = y2Var10;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z38;
                        j19 = j214;
                        pVar3 = pVar110;
                        j25 = j26;
                        efVar2 = efVar5;
                        pVar4 = pVar111;
                        f18 = f19;
                        j18 = j216;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f17 = f15;
                        j18 = j17;
                        pVar3 = pVar;
                        pVar4 = pVar2;
                        efVar2 = efVar;
                        j19 = jI;
                        z18 = z16;
                        y2Var2 = y2VarK;
                        hjVar2 = hjVarY;
                        j25 = j16;
                        f18 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final long j36 = j18;
                        final m mVar13 = mVar2;
                        d5VarM.a(new p() { // from class: f2.ye
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.x(aVar, mVar13, hjVar2, f17, z18, y2Var2, j19, j25, f18, j36, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i18 |= 24576;
                z16 = z15;
                if ((i15 & 196608) == 0) {
                    y2VarK = y2Var;
                    if ((i17 & 32) == 0) {
                        i67 = PKIFailureInfo.notAuthorized;
                    } else {
                        i67 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i67;
                } else {
                    y2VarK = y2Var;
                }
                if ((i15 & 1572864) == 0) {
                    jI = j15;
                    if ((i17 & 64) == 0) {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i66;
                } else {
                    jI = j15;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i65 = i18;
                        if (rVarH.d(j16)) {
                        }
                        i28 = i65 | i75;
                    } else {
                        i65 = i18;
                    }
                    i28 = i65 | i75;
                } else {
                    i28 = i18;
                }
                i29 = i17 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f16)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i28 |= i35;
                }
                if ((i15 & 805306368) != 0) {
                    if ((i17 & 512) == 0) {
                        i59 = 268435456;
                    } else {
                        i59 = 268435456;
                    }
                    i28 |= i59;
                }
                i36 = i17 & 1024;
                if (i36 != 0) {
                    i37 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.G(pVar)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i16 | i38;
                } else {
                    i37 = i16;
                }
                if ((i16 & 48) != 0) {
                    i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
                }
                i39 = i37;
                i45 = i17 & PKIFailureInfo.certConfirmed;
                if (i45 != 0) {
                    i46 = i39;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(efVar)) {
                            i47 = 256;
                        } else {
                            i47 = 128;
                        }
                        i46 |= i47;
                    }
                    if ((i16 & 3072) != 0) {
                        i46 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i46;
                    if ((i28 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i28 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i710 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i710;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        } else {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i711 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i711;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        }
                        final boolean z39 = z16;
                        final long j217 = j27;
                        rVarH.y();
                        if (t.k()) {
                            t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = Function0.i(j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        p0Var = (p0) objE;
                        i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        final ef efVar6 = efVar3;
                        if (i56 > 256) {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        } else {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        }
                        boolean zG11 = z25 | rVarH.G(p0Var);
                        i57 = i49 & 14;
                        if (i57 == 4) {
                            z26 = z19;
                        } else {
                            z26 = false;
                        }
                        z27 = zG11 | z26;
                        objE2 = rVarH.E();
                        if (z27) {
                            mVar4 = mVar3;
                            if (objE2 == companion.a()) {
                            }
                            aVar2 = (er.a) objE2;
                            if (i56 > 256) {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            } else {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            }
                            boolean zG12 = z28 | rVarH.G(p0Var);
                            if (i57 == 4) {
                                z29 = z19;
                            } else {
                                z29 = false;
                            }
                            z35 = zG12 | z29;
                            objE3 = rVarH.E();
                            if (z35) {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            er.a aVar18 = (er.a) objE3;
                            i58 = i49;
                            final m mVar14 = mVar4;
                            final er.a aVar19 = aVar3;
                            final long j218 = jN;
                            hjVar3 = hjVarY;
                            final p pVar112 = pVar6;
                            final p pVar113 = pVar7;
                            rVar2 = rVarH;
                            C6458nf.h(aVar18, j26, efVar6, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.r(hjVar3, efVar6, aVar19, j218, mVar14, aVar, f25, z39, pVar112, pVar113, y2Var3, j217, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                            if (hjVar3.g()) {
                                rVar2.X(748177042);
                                if (i56 <= 256) {
                                }
                                objE4 = rVar2.E();
                                if (z36) {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                } else {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                }
                                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                rVar2.R();
                            } else {
                                rVar2.X(748238546);
                                rVar2.R();
                            }
                            if (t.k()) {
                                t.n();
                            }
                            y2 y2Var11 = y2Var3;
                            mVar2 = mVar14;
                            y2Var2 = y2Var11;
                            hjVar2 = hjVar3;
                            f17 = f25;
                            z18 = z39;
                            j19 = j217;
                            pVar3 = pVar112;
                            j25 = j26;
                            efVar2 = efVar6;
                            pVar4 = pVar113;
                            f18 = f19;
                            j18 = j218;
                        } else {
                            mVar4 = mVar3;
                        }
                        objE2 = new er.a() { // from class: f2.ve
                            @Override // er.a
                            public final Object a() {
                                return C6454df.n(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE2);
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG13 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG13 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar110 = (er.a) objE3;
                        i58 = i49;
                        final m mVar15 = mVar4;
                        final er.a aVar111 = aVar3;
                        final long j219 = jN;
                        hjVar3 = hjVarY;
                        final p pVar114 = pVar6;
                        final p pVar115 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar110, j26, efVar6, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar6, aVar111, j219, mVar15, aVar, f25, z39, pVar114, pVar115, y2Var3, j217, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var12 = y2Var3;
                        mVar2 = mVar15;
                        y2Var2 = y2Var12;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z39;
                        j19 = j217;
                        pVar3 = pVar114;
                        j25 = j26;
                        efVar2 = efVar6;
                        pVar4 = pVar115;
                        f18 = f19;
                        j18 = j219;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f17 = f15;
                        j18 = j17;
                        pVar3 = pVar;
                        pVar4 = pVar2;
                        efVar2 = efVar;
                        j19 = jI;
                        z18 = z16;
                        y2Var2 = y2VarK;
                        hjVar2 = hjVarY;
                        j25 = j16;
                        f18 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final long j37 = j18;
                        final m mVar16 = mVar2;
                        d5VarM.a(new p() { // from class: f2.ye
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.x(aVar, mVar16, hjVar2, f17, z18, y2Var2, j19, j25, f18, j37, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i46 = i39 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i712 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i712;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i713 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i713;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z310 = z16;
                    final long j2110 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar7 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG14 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG14 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG15 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG15 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar112 = (er.a) objE3;
                        i58 = i49;
                        final m mVar17 = mVar4;
                        final er.a aVar113 = aVar3;
                        final long j2111 = jN;
                        hjVar3 = hjVarY;
                        final p pVar116 = pVar6;
                        final p pVar117 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar112, j26, efVar7, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar7, aVar113, j2111, mVar17, aVar, f25, z310, pVar116, pVar117, y2Var3, j2110, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var13 = y2Var3;
                        mVar2 = mVar17;
                        y2Var2 = y2Var13;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z310;
                        j19 = j2110;
                        pVar3 = pVar116;
                        j25 = j26;
                        efVar2 = efVar7;
                        pVar4 = pVar117;
                        f18 = f19;
                        j18 = j2111;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG16 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG16 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar114 = (er.a) objE3;
                    i58 = i49;
                    final m mVar18 = mVar4;
                    final er.a aVar115 = aVar3;
                    final long j2112 = jN;
                    hjVar3 = hjVarY;
                    final p pVar118 = pVar6;
                    final p pVar119 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar114, j26, efVar7, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar7, aVar115, j2112, mVar18, aVar, f25, z310, pVar118, pVar119, y2Var3, j2110, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var14 = y2Var3;
                    mVar2 = mVar18;
                    y2Var2 = y2Var14;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z310;
                    j19 = j2110;
                    pVar3 = pVar118;
                    j25 = j26;
                    efVar2 = efVar7;
                    pVar4 = pVar119;
                    f18 = f19;
                    j18 = j2112;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j38 = j18;
                    final m mVar19 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar19, hjVar2, f17, z18, y2Var2, j19, j25, f18, j38, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 3072;
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                if ((i15 & 196608) == 0) {
                    y2VarK = y2Var;
                    if ((i17 & 32) == 0) {
                        i67 = PKIFailureInfo.notAuthorized;
                    } else {
                        i67 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i67;
                } else {
                    y2VarK = y2Var;
                }
                if ((i15 & 1572864) == 0) {
                    jI = j15;
                    if ((i17 & 64) == 0) {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i66;
                } else {
                    jI = j15;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i65 = i18;
                        if (rVarH.d(j16)) {
                        }
                        i28 = i65 | i75;
                    } else {
                        i65 = i18;
                    }
                    i28 = i65 | i75;
                } else {
                    i28 = i18;
                }
                i29 = i17 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f16)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i28 |= i35;
                }
                if ((i15 & 805306368) != 0) {
                    if ((i17 & 512) == 0) {
                        i59 = 268435456;
                    } else {
                        i59 = 268435456;
                    }
                    i28 |= i59;
                }
                i36 = i17 & 1024;
                if (i36 != 0) {
                    i37 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.G(pVar)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i16 | i38;
                } else {
                    i37 = i16;
                }
                if ((i16 & 48) != 0) {
                    i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
                }
                i39 = i37;
                i45 = i17 & PKIFailureInfo.certConfirmed;
                if (i45 != 0) {
                    i46 = i39;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(efVar)) {
                            i47 = 256;
                        } else {
                            i47 = 128;
                        }
                        i46 |= i47;
                    }
                    if ((i16 & 3072) != 0) {
                        i46 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i46;
                    if ((i28 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i28 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i714 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i714;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        } else {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i715 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i715;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        }
                        final boolean z311 = z16;
                        final long j2113 = j27;
                        rVarH.y();
                        if (t.k()) {
                            t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = Function0.i(j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        p0Var = (p0) objE;
                        i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        final ef efVar8 = efVar3;
                        if (i56 > 256) {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        } else {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        }
                        boolean zG17 = z25 | rVarH.G(p0Var);
                        i57 = i49 & 14;
                        if (i57 == 4) {
                            z26 = z19;
                        } else {
                            z26 = false;
                        }
                        z27 = zG17 | z26;
                        objE2 = rVarH.E();
                        if (z27) {
                            mVar4 = mVar3;
                            if (objE2 == companion.a()) {
                            }
                            aVar2 = (er.a) objE2;
                            if (i56 > 256) {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            } else {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            }
                            boolean zG18 = z28 | rVarH.G(p0Var);
                            if (i57 == 4) {
                                z29 = z19;
                            } else {
                                z29 = false;
                            }
                            z35 = zG18 | z29;
                            objE3 = rVarH.E();
                            if (z35) {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            er.a aVar116 = (er.a) objE3;
                            i58 = i49;
                            final m mVar110 = mVar4;
                            final er.a aVar117 = aVar3;
                            final long j2114 = jN;
                            hjVar3 = hjVarY;
                            final p pVar1110 = pVar6;
                            final p pVar1111 = pVar7;
                            rVar2 = rVarH;
                            C6458nf.h(aVar116, j26, efVar8, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.r(hjVar3, efVar8, aVar117, j2114, mVar110, aVar, f25, z311, pVar1110, pVar1111, y2Var3, j2113, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                            if (hjVar3.g()) {
                                rVar2.X(748177042);
                                if (i56 <= 256) {
                                }
                                objE4 = rVar2.E();
                                if (z36) {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                } else {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                }
                                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                rVar2.R();
                            } else {
                                rVar2.X(748238546);
                                rVar2.R();
                            }
                            if (t.k()) {
                                t.n();
                            }
                            y2 y2Var15 = y2Var3;
                            mVar2 = mVar110;
                            y2Var2 = y2Var15;
                            hjVar2 = hjVar3;
                            f17 = f25;
                            z18 = z311;
                            j19 = j2113;
                            pVar3 = pVar1110;
                            j25 = j26;
                            efVar2 = efVar8;
                            pVar4 = pVar1111;
                            f18 = f19;
                            j18 = j2114;
                        } else {
                            mVar4 = mVar3;
                        }
                        objE2 = new er.a() { // from class: f2.ve
                            @Override // er.a
                            public final Object a() {
                                return C6454df.n(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE2);
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG19 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG19 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar118 = (er.a) objE3;
                        i58 = i49;
                        final m mVar111 = mVar4;
                        final er.a aVar119 = aVar3;
                        final long j2115 = jN;
                        hjVar3 = hjVarY;
                        final p pVar1112 = pVar6;
                        final p pVar1113 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar118, j26, efVar8, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar8, aVar119, j2115, mVar111, aVar, f25, z311, pVar1112, pVar1113, y2Var3, j2113, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var16 = y2Var3;
                        mVar2 = mVar111;
                        y2Var2 = y2Var16;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z311;
                        j19 = j2113;
                        pVar3 = pVar1112;
                        j25 = j26;
                        efVar2 = efVar8;
                        pVar4 = pVar1113;
                        f18 = f19;
                        j18 = j2115;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f17 = f15;
                        j18 = j17;
                        pVar3 = pVar;
                        pVar4 = pVar2;
                        efVar2 = efVar;
                        j19 = jI;
                        z18 = z16;
                        y2Var2 = y2VarK;
                        hjVar2 = hjVarY;
                        j25 = j16;
                        f18 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final long j39 = j18;
                        final m mVar112 = mVar2;
                        d5VarM.a(new p() { // from class: f2.ye
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.x(aVar, mVar112, hjVar2, f17, z18, y2Var2, j19, j25, f18, j39, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i46 = i39 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i716 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i716;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i717 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i717;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z312 = z16;
                    final long j2116 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar9 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG110 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG110 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG111 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG111 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar1110 = (er.a) objE3;
                        i58 = i49;
                        final m mVar113 = mVar4;
                        final er.a aVar1111 = aVar3;
                        final long j2117 = jN;
                        hjVar3 = hjVarY;
                        final p pVar1114 = pVar6;
                        final p pVar1115 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar1110, j26, efVar9, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar9, aVar1111, j2117, mVar113, aVar, f25, z312, pVar1114, pVar1115, y2Var3, j2116, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var17 = y2Var3;
                        mVar2 = mVar113;
                        y2Var2 = y2Var17;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z312;
                        j19 = j2116;
                        pVar3 = pVar1114;
                        j25 = j26;
                        efVar2 = efVar9;
                        pVar4 = pVar1115;
                        f18 = f19;
                        j18 = j2117;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG112 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG112 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1112 = (er.a) objE3;
                    i58 = i49;
                    final m mVar114 = mVar4;
                    final er.a aVar1113 = aVar3;
                    final long j2118 = jN;
                    hjVar3 = hjVarY;
                    final p pVar1116 = pVar6;
                    final p pVar1117 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1112, j26, efVar9, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar9, aVar1113, j2118, mVar114, aVar, f25, z312, pVar1116, pVar1117, y2Var3, j2116, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var18 = y2Var3;
                    mVar2 = mVar114;
                    y2Var2 = y2Var18;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z312;
                    j19 = j2116;
                    pVar3 = pVar1116;
                    j25 = j26;
                    efVar2 = efVar9;
                    pVar4 = pVar1117;
                    f18 = f19;
                    j18 = j2118;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j310 = j18;
                    final m mVar115 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar115, hjVar2, f17, z18, y2Var2, j19, j25, f18, j310, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z16 = z15;
            if ((i15 & 196608) == 0) {
                y2VarK = y2Var;
                if ((i17 & 32) == 0) {
                    i67 = PKIFailureInfo.notAuthorized;
                } else {
                    i67 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i67;
            } else {
                y2VarK = y2Var;
            }
            if ((i15 & 1572864) == 0) {
                jI = j15;
                if ((i17 & 64) == 0) {
                    i66 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i66 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i66;
            } else {
                jI = j15;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i65 = i18;
                    if (rVarH.d(j16)) {
                    }
                    i28 = i65 | i75;
                } else {
                    i65 = i18;
                }
                i28 = i65 | i75;
            } else {
                i28 = i18;
            }
            i29 = i17 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.b(f16)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i28 |= i35;
            }
            if ((i15 & 805306368) != 0) {
                if ((i17 & 512) == 0) {
                    i59 = 268435456;
                } else {
                    i59 = 268435456;
                }
                i28 |= i59;
            }
            i36 = i17 & 1024;
            if (i36 != 0) {
                i37 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i16 | i38;
            } else {
                i37 = i16;
            }
            if ((i16 & 48) != 0) {
                i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
            }
            i39 = i37;
            i45 = i17 & PKIFailureInfo.certConfirmed;
            if (i45 != 0) {
                i46 = i39;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(efVar)) {
                        i47 = 256;
                    } else {
                        i47 = 128;
                    }
                    i46 |= i47;
                }
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i718 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i718;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i719 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i719;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z313 = z16;
                    final long j2119 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar10 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG113 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG113 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG114 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG114 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar1114 = (er.a) objE3;
                        i58 = i49;
                        final m mVar116 = mVar4;
                        final er.a aVar1115 = aVar3;
                        final long j21110 = jN;
                        hjVar3 = hjVarY;
                        final p pVar1118 = pVar6;
                        final p pVar1119 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar1114, j26, efVar10, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar10, aVar1115, j21110, mVar116, aVar, f25, z313, pVar1118, pVar1119, y2Var3, j2119, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var19 = y2Var3;
                        mVar2 = mVar116;
                        y2Var2 = y2Var19;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z313;
                        j19 = j2119;
                        pVar3 = pVar1118;
                        j25 = j26;
                        efVar2 = efVar10;
                        pVar4 = pVar1119;
                        f18 = f19;
                        j18 = j21110;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG115 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG115 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1116 = (er.a) objE3;
                    i58 = i49;
                    final m mVar117 = mVar4;
                    final er.a aVar1117 = aVar3;
                    final long j21111 = jN;
                    hjVar3 = hjVarY;
                    final p pVar11110 = pVar6;
                    final p pVar11111 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1116, j26, efVar10, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar10, aVar1117, j21111, mVar117, aVar, f25, z313, pVar11110, pVar11111, y2Var3, j2119, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var110 = y2Var3;
                    mVar2 = mVar117;
                    y2Var2 = y2Var110;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z313;
                    j19 = j2119;
                    pVar3 = pVar11110;
                    j25 = j26;
                    efVar2 = efVar10;
                    pVar4 = pVar11111;
                    f18 = f19;
                    j18 = j21111;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j311 = j18;
                    final m mVar118 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar118, hjVar2, f17, z18, y2Var2, j19, j25, f18, j311, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i46 = i39 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i46 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i46;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i28 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i7110 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i7110;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                } else {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i7111 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i7111;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                }
                final boolean z314 = z16;
                final long j21112 = j27;
                rVarH.y();
                if (t.k()) {
                    t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                final ef efVar11 = efVar3;
                if (i56 > 256) {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                } else {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                }
                boolean zG116 = z25 | rVarH.G(p0Var);
                i57 = i49 & 14;
                if (i57 == 4) {
                    z26 = z19;
                } else {
                    z26 = false;
                }
                z27 = zG116 | z26;
                objE2 = rVarH.E();
                if (z27) {
                    mVar4 = mVar3;
                    if (objE2 == companion.a()) {
                    }
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG117 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG117 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1118 = (er.a) objE3;
                    i58 = i49;
                    final m mVar119 = mVar4;
                    final er.a aVar1119 = aVar3;
                    final long j21113 = jN;
                    hjVar3 = hjVarY;
                    final p pVar11112 = pVar6;
                    final p pVar11113 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1118, j26, efVar11, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar11, aVar1119, j21113, mVar119, aVar, f25, z314, pVar11112, pVar11113, y2Var3, j21112, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var111 = y2Var3;
                    mVar2 = mVar119;
                    y2Var2 = y2Var111;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z314;
                    j19 = j21112;
                    pVar3 = pVar11112;
                    j25 = j26;
                    efVar2 = efVar11;
                    pVar4 = pVar11113;
                    f18 = f19;
                    j18 = j21113;
                } else {
                    mVar4 = mVar3;
                }
                objE2 = new er.a() { // from class: f2.ve
                    @Override // er.a
                    public final Object a() {
                        return C6454df.n(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE2);
                aVar2 = (er.a) objE2;
                if (i56 > 256) {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                } else {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                }
                boolean zG118 = z28 | rVarH.G(p0Var);
                if (i57 == 4) {
                    z29 = z19;
                } else {
                    z29 = false;
                }
                z35 = zG118 | z29;
                objE3 = rVarH.E();
                if (z35) {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.a aVar11110 = (er.a) objE3;
                i58 = i49;
                final m mVar1110 = mVar4;
                final er.a aVar11111 = aVar3;
                final long j21114 = jN;
                hjVar3 = hjVarY;
                final p pVar11114 = pVar6;
                final p pVar11115 = pVar7;
                rVar2 = rVarH;
                C6458nf.h(aVar11110, j26, efVar11, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.r(hjVar3, efVar11, aVar11111, j21114, mVar1110, aVar, f25, z314, pVar11114, pVar11115, y2Var3, j21112, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                if (hjVar3.g()) {
                    rVar2.X(748177042);
                    if (i56 <= 256) {
                    }
                    objE4 = rVar2.E();
                    if (z36) {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    } else {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    }
                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                    rVar2.R();
                } else {
                    rVar2.X(748238546);
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                y2 y2Var112 = y2Var3;
                mVar2 = mVar1110;
                y2Var2 = y2Var112;
                hjVar2 = hjVar3;
                f17 = f25;
                z18 = z314;
                j19 = j21112;
                pVar3 = pVar11114;
                j25 = j26;
                efVar2 = efVar11;
                pVar4 = pVar11115;
                f18 = f19;
                j18 = j21114;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f17 = f15;
                j18 = j17;
                pVar3 = pVar;
                pVar4 = pVar2;
                efVar2 = efVar;
                j19 = jI;
                z18 = z16;
                y2Var2 = y2VarK;
                hjVar2 = hjVarY;
                j25 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final long j312 = j18;
                final m mVar1111 = mVar2;
                d5VarM.a(new p() { // from class: f2.ye
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.x(aVar, mVar1111, hjVar2, f17, z18, y2Var2, j19, j25, f18, j312, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                hjVarY = hjVar;
                if (rVarH.W(hjVarY)) {
                }
                i18 |= i69;
            } else {
                hjVarY = hjVar;
            }
            i18 |= i69;
        } else {
            hjVarY = hjVar;
        }
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i15 & 3072) == 0) {
                if (rVarH.b(f15)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i18 |= i25;
            }
            i26 = i17 & 16;
            if (i26 != 0) {
                if ((i15 & 24576) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i27 = 16384;
                    } else {
                        i27 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i27;
                }
                if ((i15 & 196608) == 0) {
                    y2VarK = y2Var;
                    if ((i17 & 32) == 0) {
                        i67 = PKIFailureInfo.notAuthorized;
                    } else {
                        i67 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i67;
                } else {
                    y2VarK = y2Var;
                }
                if ((i15 & 1572864) == 0) {
                    jI = j15;
                    if ((i17 & 64) == 0) {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i66 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i66;
                } else {
                    jI = j15;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i17 & 128) == 0) {
                        i65 = i18;
                        if (rVarH.d(j16)) {
                        }
                        i28 = i65 | i75;
                    } else {
                        i65 = i18;
                    }
                    i28 = i65 | i75;
                } else {
                    i28 = i18;
                }
                i29 = i17 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f16)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i28 |= i35;
                }
                if ((i15 & 805306368) != 0) {
                    if ((i17 & 512) == 0) {
                        i59 = 268435456;
                    } else {
                        i59 = 268435456;
                    }
                    i28 |= i59;
                }
                i36 = i17 & 1024;
                if (i36 != 0) {
                    i37 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.G(pVar)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i16 | i38;
                } else {
                    i37 = i16;
                }
                if ((i16 & 48) != 0) {
                    i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
                }
                i39 = i37;
                i45 = i17 & PKIFailureInfo.certConfirmed;
                if (i45 != 0) {
                    i46 = i39;
                    if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(efVar)) {
                            i47 = 256;
                        } else {
                            i47 = 128;
                        }
                        i46 |= i47;
                    }
                    if ((i16 & 3072) != 0) {
                        i46 |= rVarH.G(qVar) ? 2048 : 1024;
                    }
                    i48 = i46;
                    if ((i28 & 306783379) == 306783378) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (rVarH.r(z17, i28 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i7112 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i7112;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        } else {
                            if (i68 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i17 & 4) != 0) {
                                i28 &= -897;
                                hjVarY = y(false, null, rVarH, 0, 3);
                            }
                            if (i19 != 0) {
                                fO = n0.f56958a.o();
                            } else {
                                fO = f15;
                            }
                            if (i26 != 0) {
                                z16 = true;
                            }
                            if ((i17 & 32) != 0) {
                                y2VarK = n0.f56958a.k(rVarH, 6);
                                i28 &= -458753;
                            }
                            if ((i17 & 64) != 0) {
                                jI = n0.f56958a.i(rVarH, 6);
                                i28 &= -3670017;
                            }
                            if ((i17 & 128) != 0) {
                                jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                                i28 &= -29360129;
                            } else {
                                jE = j16;
                            }
                            if (i29 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if ((i17 & 512) != 0) {
                                jN = n0.f56958a.n(rVarH, 6);
                                i28 &= -1879048193;
                            } else {
                                jN = j17;
                            }
                            if (i36 != 0) {
                                pVarB = m3.f56824a.b();
                            } else {
                                pVarB = pVar;
                            }
                            if ((i17 & 2048) != 0) {
                                pVar5 = new p() { // from class: f2.ue
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                    }
                                };
                                i48 &= -113;
                            } else {
                                pVar5 = pVar2;
                            }
                            int i7113 = i48;
                            if (i45 != 0) {
                                efVar3 = new ef(false, false, 3, null);
                            } else {
                                efVar3 = efVar;
                            }
                            f19 = fN;
                            mVar3 = mVar2;
                            i49 = i28;
                            i55 = i7113;
                            y2Var3 = y2VarK;
                            pVar6 = pVarB;
                            j26 = jE;
                            z19 = true;
                            j27 = jI;
                            f25 = fO;
                        }
                        final boolean z315 = z16;
                        final long j21115 = j27;
                        rVarH.y();
                        if (t.k()) {
                            t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                        }
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = Function0.i(j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        p0Var = (p0) objE;
                        i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                        final ef efVar12 = efVar3;
                        if (i56 > 256) {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        } else {
                            pVar7 = pVar5;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z25 = z19;
                            } else {
                                z25 = false;
                            }
                        }
                        boolean zG119 = z25 | rVarH.G(p0Var);
                        i57 = i49 & 14;
                        if (i57 == 4) {
                            z26 = z19;
                        } else {
                            z26 = false;
                        }
                        z27 = zG119 | z26;
                        objE2 = rVarH.E();
                        if (z27) {
                            mVar4 = mVar3;
                            if (objE2 == companion.a()) {
                            }
                            aVar2 = (er.a) objE2;
                            if (i56 > 256) {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            } else {
                                aVar3 = aVar2;
                                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                    z28 = z19;
                                } else {
                                    z28 = false;
                                }
                            }
                            boolean zG1110 = z28 | rVarH.G(p0Var);
                            if (i57 == 4) {
                                z29 = z19;
                            } else {
                                z29 = false;
                            }
                            z35 = zG1110 | z29;
                            objE3 = rVarH.E();
                            if (z35) {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            } else {
                                objE3 = new er.a() { // from class: f2.we
                                    @Override // er.a
                                    public final Object a() {
                                        return C6454df.p(hjVarY, p0Var, aVar);
                                    }
                                };
                                rVarH.v(objE3);
                            }
                            er.a aVar11112 = (er.a) objE3;
                            i58 = i49;
                            final m mVar1112 = mVar4;
                            final er.a aVar11113 = aVar3;
                            final long j21116 = jN;
                            hjVar3 = hjVarY;
                            final p pVar11116 = pVar6;
                            final p pVar11117 = pVar7;
                            rVar2 = rVarH;
                            C6458nf.h(aVar11112, j26, efVar12, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.r(hjVar3, efVar12, aVar11113, j21116, mVar1112, aVar, f25, z315, pVar11116, pVar11117, y2Var3, j21115, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                            if (hjVar3.g()) {
                                rVar2.X(748177042);
                                if (i56 <= 256) {
                                }
                                objE4 = rVar2.E();
                                if (z36) {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                } else {
                                    objE4 = new a(hjVar3, null);
                                    rVar2.v(objE4);
                                }
                                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                                rVar2.R();
                            } else {
                                rVar2.X(748238546);
                                rVar2.R();
                            }
                            if (t.k()) {
                                t.n();
                            }
                            y2 y2Var113 = y2Var3;
                            mVar2 = mVar1112;
                            y2Var2 = y2Var113;
                            hjVar2 = hjVar3;
                            f17 = f25;
                            z18 = z315;
                            j19 = j21115;
                            pVar3 = pVar11116;
                            j25 = j26;
                            efVar2 = efVar12;
                            pVar4 = pVar11117;
                            f18 = f19;
                            j18 = j21116;
                        } else {
                            mVar4 = mVar3;
                        }
                        objE2 = new er.a() { // from class: f2.ve
                            @Override // er.a
                            public final Object a() {
                                return C6454df.n(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE2);
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG1111 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG1111 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar11114 = (er.a) objE3;
                        i58 = i49;
                        final m mVar1113 = mVar4;
                        final er.a aVar11115 = aVar3;
                        final long j21117 = jN;
                        hjVar3 = hjVarY;
                        final p pVar11118 = pVar6;
                        final p pVar11119 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar11114, j26, efVar12, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar12, aVar11115, j21117, mVar1113, aVar, f25, z315, pVar11118, pVar11119, y2Var3, j21115, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var114 = y2Var3;
                        mVar2 = mVar1113;
                        y2Var2 = y2Var114;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z315;
                        j19 = j21115;
                        pVar3 = pVar11118;
                        j25 = j26;
                        efVar2 = efVar12;
                        pVar4 = pVar11119;
                        f18 = f19;
                        j18 = j21117;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f17 = f15;
                        j18 = j17;
                        pVar3 = pVar;
                        pVar4 = pVar2;
                        efVar2 = efVar;
                        j19 = jI;
                        z18 = z16;
                        y2Var2 = y2VarK;
                        hjVar2 = hjVarY;
                        j25 = j16;
                        f18 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final long j313 = j18;
                        final m mVar1114 = mVar2;
                        d5VarM.a(new p() { // from class: f2.ye
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.x(aVar, mVar1114, hjVar2, f17, z18, y2Var2, j19, j25, f18, j313, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i46 = i39 | MLKEMEngine.KyberPolyBytes;
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i7114 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i7114;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i7115 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i7115;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z316 = z16;
                    final long j21118 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar13 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG1112 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG1112 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG1113 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG1113 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar11116 = (er.a) objE3;
                        i58 = i49;
                        final m mVar1115 = mVar4;
                        final er.a aVar11117 = aVar3;
                        final long j21119 = jN;
                        hjVar3 = hjVarY;
                        final p pVar111110 = pVar6;
                        final p pVar111111 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar11116, j26, efVar13, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar13, aVar11117, j21119, mVar1115, aVar, f25, z316, pVar111110, pVar111111, y2Var3, j21118, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var115 = y2Var3;
                        mVar2 = mVar1115;
                        y2Var2 = y2Var115;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z316;
                        j19 = j21118;
                        pVar3 = pVar111110;
                        j25 = j26;
                        efVar2 = efVar13;
                        pVar4 = pVar111111;
                        f18 = f19;
                        j18 = j21119;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG1114 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG1114 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar11118 = (er.a) objE3;
                    i58 = i49;
                    final m mVar1116 = mVar4;
                    final er.a aVar11119 = aVar3;
                    final long j211110 = jN;
                    hjVar3 = hjVarY;
                    final p pVar111112 = pVar6;
                    final p pVar111113 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar11118, j26, efVar13, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar13, aVar11119, j211110, mVar1116, aVar, f25, z316, pVar111112, pVar111113, y2Var3, j21118, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var116 = y2Var3;
                    mVar2 = mVar1116;
                    y2Var2 = y2Var116;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z316;
                    j19 = j21118;
                    pVar3 = pVar111112;
                    j25 = j26;
                    efVar2 = efVar13;
                    pVar4 = pVar111113;
                    f18 = f19;
                    j18 = j211110;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j314 = j18;
                    final m mVar1117 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar1117, hjVar2, f17, z18, y2Var2, j19, j25, f18, j314, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z16 = z15;
            if ((i15 & 196608) == 0) {
                y2VarK = y2Var;
                if ((i17 & 32) == 0) {
                    i67 = PKIFailureInfo.notAuthorized;
                } else {
                    i67 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i67;
            } else {
                y2VarK = y2Var;
            }
            if ((i15 & 1572864) == 0) {
                jI = j15;
                if ((i17 & 64) == 0) {
                    i66 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i66 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i66;
            } else {
                jI = j15;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i65 = i18;
                    if (rVarH.d(j16)) {
                    }
                    i28 = i65 | i75;
                } else {
                    i65 = i18;
                }
                i28 = i65 | i75;
            } else {
                i28 = i18;
            }
            i29 = i17 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.b(f16)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i28 |= i35;
            }
            if ((i15 & 805306368) != 0) {
                if ((i17 & 512) == 0) {
                    i59 = 268435456;
                } else {
                    i59 = 268435456;
                }
                i28 |= i59;
            }
            i36 = i17 & 1024;
            if (i36 != 0) {
                i37 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i16 | i38;
            } else {
                i37 = i16;
            }
            if ((i16 & 48) != 0) {
                i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
            }
            i39 = i37;
            i45 = i17 & PKIFailureInfo.certConfirmed;
            if (i45 != 0) {
                i46 = i39;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(efVar)) {
                        i47 = 256;
                    } else {
                        i47 = 128;
                    }
                    i46 |= i47;
                }
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i7116 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i7116;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i7117 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i7117;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z317 = z16;
                    final long j211111 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar14 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG1115 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG1115 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG1116 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG1116 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar111110 = (er.a) objE3;
                        i58 = i49;
                        final m mVar1118 = mVar4;
                        final er.a aVar111111 = aVar3;
                        final long j211112 = jN;
                        hjVar3 = hjVarY;
                        final p pVar111114 = pVar6;
                        final p pVar111115 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar111110, j26, efVar14, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar14, aVar111111, j211112, mVar1118, aVar, f25, z317, pVar111114, pVar111115, y2Var3, j211111, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var117 = y2Var3;
                        mVar2 = mVar1118;
                        y2Var2 = y2Var117;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z317;
                        j19 = j211111;
                        pVar3 = pVar111114;
                        j25 = j26;
                        efVar2 = efVar14;
                        pVar4 = pVar111115;
                        f18 = f19;
                        j18 = j211112;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG1117 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG1117 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar111112 = (er.a) objE3;
                    i58 = i49;
                    final m mVar1119 = mVar4;
                    final er.a aVar111113 = aVar3;
                    final long j211113 = jN;
                    hjVar3 = hjVarY;
                    final p pVar111116 = pVar6;
                    final p pVar111117 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar111112, j26, efVar14, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar14, aVar111113, j211113, mVar1119, aVar, f25, z317, pVar111116, pVar111117, y2Var3, j211111, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var118 = y2Var3;
                    mVar2 = mVar1119;
                    y2Var2 = y2Var118;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z317;
                    j19 = j211111;
                    pVar3 = pVar111116;
                    j25 = j26;
                    efVar2 = efVar14;
                    pVar4 = pVar111117;
                    f18 = f19;
                    j18 = j211113;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j315 = j18;
                    final m mVar11110 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar11110, hjVar2, f17, z18, y2Var2, j19, j25, f18, j315, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i46 = i39 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i46 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i46;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i28 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i7118 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i7118;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                } else {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i7119 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i7119;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                }
                final boolean z318 = z16;
                final long j211114 = j27;
                rVarH.y();
                if (t.k()) {
                    t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                final ef efVar15 = efVar3;
                if (i56 > 256) {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                } else {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                }
                boolean zG1118 = z25 | rVarH.G(p0Var);
                i57 = i49 & 14;
                if (i57 == 4) {
                    z26 = z19;
                } else {
                    z26 = false;
                }
                z27 = zG1118 | z26;
                objE2 = rVarH.E();
                if (z27) {
                    mVar4 = mVar3;
                    if (objE2 == companion.a()) {
                    }
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG1119 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG1119 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar111114 = (er.a) objE3;
                    i58 = i49;
                    final m mVar11111 = mVar4;
                    final er.a aVar111115 = aVar3;
                    final long j211115 = jN;
                    hjVar3 = hjVarY;
                    final p pVar111118 = pVar6;
                    final p pVar111119 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar111114, j26, efVar15, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar15, aVar111115, j211115, mVar11111, aVar, f25, z318, pVar111118, pVar111119, y2Var3, j211114, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var119 = y2Var3;
                    mVar2 = mVar11111;
                    y2Var2 = y2Var119;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z318;
                    j19 = j211114;
                    pVar3 = pVar111118;
                    j25 = j26;
                    efVar2 = efVar15;
                    pVar4 = pVar111119;
                    f18 = f19;
                    j18 = j211115;
                } else {
                    mVar4 = mVar3;
                }
                objE2 = new er.a() { // from class: f2.ve
                    @Override // er.a
                    public final Object a() {
                        return C6454df.n(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE2);
                aVar2 = (er.a) objE2;
                if (i56 > 256) {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                } else {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                }
                boolean zG11110 = z28 | rVarH.G(p0Var);
                if (i57 == 4) {
                    z29 = z19;
                } else {
                    z29 = false;
                }
                z35 = zG11110 | z29;
                objE3 = rVarH.E();
                if (z35) {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.a aVar111116 = (er.a) objE3;
                i58 = i49;
                final m mVar11112 = mVar4;
                final er.a aVar111117 = aVar3;
                final long j211116 = jN;
                hjVar3 = hjVarY;
                final p pVar1111110 = pVar6;
                final p pVar1111111 = pVar7;
                rVar2 = rVarH;
                C6458nf.h(aVar111116, j26, efVar15, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.r(hjVar3, efVar15, aVar111117, j211116, mVar11112, aVar, f25, z318, pVar1111110, pVar1111111, y2Var3, j211114, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                if (hjVar3.g()) {
                    rVar2.X(748177042);
                    if (i56 <= 256) {
                    }
                    objE4 = rVar2.E();
                    if (z36) {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    } else {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    }
                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                    rVar2.R();
                } else {
                    rVar2.X(748238546);
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                y2 y2Var1110 = y2Var3;
                mVar2 = mVar11112;
                y2Var2 = y2Var1110;
                hjVar2 = hjVar3;
                f17 = f25;
                z18 = z318;
                j19 = j211114;
                pVar3 = pVar1111110;
                j25 = j26;
                efVar2 = efVar15;
                pVar4 = pVar1111111;
                f18 = f19;
                j18 = j211116;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f17 = f15;
                j18 = j17;
                pVar3 = pVar;
                pVar4 = pVar2;
                efVar2 = efVar;
                j19 = jI;
                z18 = z16;
                y2Var2 = y2VarK;
                hjVar2 = hjVarY;
                j25 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final long j316 = j18;
                final m mVar11113 = mVar2;
                d5VarM.a(new p() { // from class: f2.ye
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.x(aVar, mVar11113, hjVar2, f17, z18, y2Var2, j19, j25, f18, j316, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        i26 = i17 & 16;
        if (i26 != 0) {
            if ((i15 & 24576) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i27 = 16384;
                } else {
                    i27 = PKIFailureInfo.certRevoked;
                }
                i18 |= i27;
            }
            if ((i15 & 196608) == 0) {
                y2VarK = y2Var;
                if ((i17 & 32) == 0) {
                    i67 = PKIFailureInfo.notAuthorized;
                } else {
                    i67 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i67;
            } else {
                y2VarK = y2Var;
            }
            if ((i15 & 1572864) == 0) {
                jI = j15;
                if ((i17 & 64) == 0) {
                    i66 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i66 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i66;
            } else {
                jI = j15;
            }
            if ((i15 & 12582912) == 0) {
                if ((i17 & 128) == 0) {
                    i65 = i18;
                    if (rVarH.d(j16)) {
                    }
                    i28 = i65 | i75;
                } else {
                    i65 = i18;
                }
                i28 = i65 | i75;
            } else {
                i28 = i18;
            }
            i29 = i17 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (rVarH.b(f16)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i28 |= i35;
            }
            if ((i15 & 805306368) != 0) {
                if ((i17 & 512) == 0) {
                    i59 = 268435456;
                } else {
                    i59 = 268435456;
                }
                i28 |= i59;
            }
            i36 = i17 & 1024;
            if (i36 != 0) {
                i37 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i16 | i38;
            } else {
                i37 = i16;
            }
            if ((i16 & 48) != 0) {
                i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
            }
            i39 = i37;
            i45 = i17 & PKIFailureInfo.certConfirmed;
            if (i45 != 0) {
                i46 = i39;
                if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(efVar)) {
                        i47 = 256;
                    } else {
                        i47 = 128;
                    }
                    i46 |= i47;
                }
                if ((i16 & 3072) != 0) {
                    i46 |= rVarH.G(qVar) ? 2048 : 1024;
                }
                i48 = i46;
                if ((i28 & 306783379) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i28 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i71110 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i71110;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    } else {
                        if (i68 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i17 & 4) != 0) {
                            i28 &= -897;
                            hjVarY = y(false, null, rVarH, 0, 3);
                        }
                        if (i19 != 0) {
                            fO = n0.f56958a.o();
                        } else {
                            fO = f15;
                        }
                        if (i26 != 0) {
                            z16 = true;
                        }
                        if ((i17 & 32) != 0) {
                            y2VarK = n0.f56958a.k(rVarH, 6);
                            i28 &= -458753;
                        }
                        if ((i17 & 64) != 0) {
                            jI = n0.f56958a.i(rVarH, 6);
                            i28 &= -3670017;
                        }
                        if ((i17 & 128) != 0) {
                            jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                            i28 &= -29360129;
                        } else {
                            jE = j16;
                        }
                        if (i29 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if ((i17 & 512) != 0) {
                            jN = n0.f56958a.n(rVarH, 6);
                            i28 &= -1879048193;
                        } else {
                            jN = j17;
                        }
                        if (i36 != 0) {
                            pVarB = m3.f56824a.b();
                        } else {
                            pVarB = pVar;
                        }
                        if ((i17 & 2048) != 0) {
                            pVar5 = new p() { // from class: f2.ue
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return C6454df.m((r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            i48 &= -113;
                        } else {
                            pVar5 = pVar2;
                        }
                        int i71111 = i48;
                        if (i45 != 0) {
                            efVar3 = new ef(false, false, 3, null);
                        } else {
                            efVar3 = efVar;
                        }
                        f19 = fN;
                        mVar3 = mVar2;
                        i49 = i28;
                        i55 = i71111;
                        y2Var3 = y2VarK;
                        pVar6 = pVarB;
                        j26 = jE;
                        z19 = true;
                        j27 = jI;
                        f25 = fO;
                    }
                    final boolean z319 = z16;
                    final long j211117 = j27;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                    }
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = Function0.i(j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    p0Var = (p0) objE;
                    i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                    final ef efVar16 = efVar3;
                    if (i56 > 256) {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    } else {
                        pVar7 = pVar5;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z25 = z19;
                        } else {
                            z25 = false;
                        }
                    }
                    boolean zG11111 = z25 | rVarH.G(p0Var);
                    i57 = i49 & 14;
                    if (i57 == 4) {
                        z26 = z19;
                    } else {
                        z26 = false;
                    }
                    z27 = zG11111 | z26;
                    objE2 = rVarH.E();
                    if (z27) {
                        mVar4 = mVar3;
                        if (objE2 == companion.a()) {
                        }
                        aVar2 = (er.a) objE2;
                        if (i56 > 256) {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        } else {
                            aVar3 = aVar2;
                            if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                                z28 = z19;
                            } else {
                                z28 = false;
                            }
                        }
                        boolean zG11112 = z28 | rVarH.G(p0Var);
                        if (i57 == 4) {
                            z29 = z19;
                        } else {
                            z29 = false;
                        }
                        z35 = zG11112 | z29;
                        objE3 = rVarH.E();
                        if (z35) {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        } else {
                            objE3 = new er.a() { // from class: f2.we
                                @Override // er.a
                                public final Object a() {
                                    return C6454df.p(hjVarY, p0Var, aVar);
                                }
                            };
                            rVarH.v(objE3);
                        }
                        er.a aVar111118 = (er.a) objE3;
                        i58 = i49;
                        final m mVar11114 = mVar4;
                        final er.a aVar111119 = aVar3;
                        final long j211118 = jN;
                        hjVar3 = hjVarY;
                        final p pVar1111112 = pVar6;
                        final p pVar1111113 = pVar7;
                        rVar2 = rVarH;
                        C6458nf.h(aVar111118, j26, efVar16, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.r(hjVar3, efVar16, aVar111119, j211118, mVar11114, aVar, f25, z319, pVar1111112, pVar1111113, y2Var3, j211117, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                        if (hjVar3.g()) {
                            rVar2.X(748177042);
                            if (i56 <= 256) {
                            }
                            objE4 = rVar2.E();
                            if (z36) {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            } else {
                                objE4 = new a(hjVar3, null);
                                rVar2.v(objE4);
                            }
                            Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                            rVar2.R();
                        } else {
                            rVar2.X(748238546);
                            rVar2.R();
                        }
                        if (t.k()) {
                            t.n();
                        }
                        y2 y2Var1111 = y2Var3;
                        mVar2 = mVar11114;
                        y2Var2 = y2Var1111;
                        hjVar2 = hjVar3;
                        f17 = f25;
                        z18 = z319;
                        j19 = j211117;
                        pVar3 = pVar1111112;
                        j25 = j26;
                        efVar2 = efVar16;
                        pVar4 = pVar1111113;
                        f18 = f19;
                        j18 = j211118;
                    } else {
                        mVar4 = mVar3;
                    }
                    objE2 = new er.a() { // from class: f2.ve
                        @Override // er.a
                        public final Object a() {
                            return C6454df.n(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE2);
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG11113 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG11113 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1111110 = (er.a) objE3;
                    i58 = i49;
                    final m mVar11115 = mVar4;
                    final er.a aVar1111111 = aVar3;
                    final long j211119 = jN;
                    hjVar3 = hjVarY;
                    final p pVar1111114 = pVar6;
                    final p pVar1111115 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1111110, j26, efVar16, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar16, aVar1111111, j211119, mVar11115, aVar, f25, z319, pVar1111114, pVar1111115, y2Var3, j211117, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var1112 = y2Var3;
                    mVar2 = mVar11115;
                    y2Var2 = y2Var1112;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z319;
                    j19 = j211117;
                    pVar3 = pVar1111114;
                    j25 = j26;
                    efVar2 = efVar16;
                    pVar4 = pVar1111115;
                    f18 = f19;
                    j18 = j211119;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f17 = f15;
                    j18 = j17;
                    pVar3 = pVar;
                    pVar4 = pVar2;
                    efVar2 = efVar;
                    j19 = jI;
                    z18 = z16;
                    y2Var2 = y2VarK;
                    hjVar2 = hjVarY;
                    j25 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final long j317 = j18;
                    final m mVar11116 = mVar2;
                    d5VarM.a(new p() { // from class: f2.ye
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.x(aVar, mVar11116, hjVar2, f17, z18, y2Var2, j19, j25, f18, j317, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i46 = i39 | MLKEMEngine.KyberPolyBytes;
            if ((i16 & 3072) != 0) {
                i46 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i46;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i28 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i71112 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i71112;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                } else {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i71113 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i71113;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                }
                final boolean z3110 = z16;
                final long j2111110 = j27;
                rVarH.y();
                if (t.k()) {
                    t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                final ef efVar17 = efVar3;
                if (i56 > 256) {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                } else {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                }
                boolean zG11114 = z25 | rVarH.G(p0Var);
                i57 = i49 & 14;
                if (i57 == 4) {
                    z26 = z19;
                } else {
                    z26 = false;
                }
                z27 = zG11114 | z26;
                objE2 = rVarH.E();
                if (z27) {
                    mVar4 = mVar3;
                    if (objE2 == companion.a()) {
                    }
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG11115 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG11115 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1111112 = (er.a) objE3;
                    i58 = i49;
                    final m mVar11117 = mVar4;
                    final er.a aVar1111113 = aVar3;
                    final long j2111111 = jN;
                    hjVar3 = hjVarY;
                    final p pVar1111116 = pVar6;
                    final p pVar1111117 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1111112, j26, efVar17, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar17, aVar1111113, j2111111, mVar11117, aVar, f25, z3110, pVar1111116, pVar1111117, y2Var3, j2111110, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var1113 = y2Var3;
                    mVar2 = mVar11117;
                    y2Var2 = y2Var1113;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z3110;
                    j19 = j2111110;
                    pVar3 = pVar1111116;
                    j25 = j26;
                    efVar2 = efVar17;
                    pVar4 = pVar1111117;
                    f18 = f19;
                    j18 = j2111111;
                } else {
                    mVar4 = mVar3;
                }
                objE2 = new er.a() { // from class: f2.ve
                    @Override // er.a
                    public final Object a() {
                        return C6454df.n(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE2);
                aVar2 = (er.a) objE2;
                if (i56 > 256) {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                } else {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                }
                boolean zG11116 = z28 | rVarH.G(p0Var);
                if (i57 == 4) {
                    z29 = z19;
                } else {
                    z29 = false;
                }
                z35 = zG11116 | z29;
                objE3 = rVarH.E();
                if (z35) {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.a aVar1111114 = (er.a) objE3;
                i58 = i49;
                final m mVar11118 = mVar4;
                final er.a aVar1111115 = aVar3;
                final long j2111112 = jN;
                hjVar3 = hjVarY;
                final p pVar1111118 = pVar6;
                final p pVar1111119 = pVar7;
                rVar2 = rVarH;
                C6458nf.h(aVar1111114, j26, efVar17, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.r(hjVar3, efVar17, aVar1111115, j2111112, mVar11118, aVar, f25, z3110, pVar1111118, pVar1111119, y2Var3, j2111110, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                if (hjVar3.g()) {
                    rVar2.X(748177042);
                    if (i56 <= 256) {
                    }
                    objE4 = rVar2.E();
                    if (z36) {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    } else {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    }
                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                    rVar2.R();
                } else {
                    rVar2.X(748238546);
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                y2 y2Var1114 = y2Var3;
                mVar2 = mVar11118;
                y2Var2 = y2Var1114;
                hjVar2 = hjVar3;
                f17 = f25;
                z18 = z3110;
                j19 = j2111110;
                pVar3 = pVar1111118;
                j25 = j26;
                efVar2 = efVar17;
                pVar4 = pVar1111119;
                f18 = f19;
                j18 = j2111112;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f17 = f15;
                j18 = j17;
                pVar3 = pVar;
                pVar4 = pVar2;
                efVar2 = efVar;
                j19 = jI;
                z18 = z16;
                y2Var2 = y2VarK;
                hjVar2 = hjVarY;
                j25 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final long j318 = j18;
                final m mVar11119 = mVar2;
                d5VarM.a(new p() { // from class: f2.ye
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.x(aVar, mVar11119, hjVar2, f17, z18, y2Var2, j19, j25, f18, j318, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        z16 = z15;
        if ((i15 & 196608) == 0) {
            y2VarK = y2Var;
            if ((i17 & 32) == 0) {
                i67 = PKIFailureInfo.notAuthorized;
            } else {
                i67 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i67;
        } else {
            y2VarK = y2Var;
        }
        if ((i15 & 1572864) == 0) {
            jI = j15;
            if ((i17 & 64) == 0) {
                i66 = PKIFailureInfo.signerNotTrusted;
            } else {
                i66 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i66;
        } else {
            jI = j15;
        }
        if ((i15 & 12582912) == 0) {
            if ((i17 & 128) == 0) {
                i65 = i18;
                if (rVarH.d(j16)) {
                }
                i28 = i65 | i75;
            } else {
                i65 = i18;
            }
            i28 = i65 | i75;
        } else {
            i28 = i18;
        }
        i29 = i17 & 256;
        if (i29 != 0) {
            i28 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (rVarH.b(f16)) {
                i35 = 67108864;
            } else {
                i35 = 33554432;
            }
            i28 |= i35;
        }
        if ((i15 & 805306368) != 0) {
            if ((i17 & 512) == 0) {
                i59 = 268435456;
            } else {
                i59 = 268435456;
            }
            i28 |= i59;
        }
        i36 = i17 & 1024;
        if (i36 != 0) {
            i37 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.G(pVar)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i37 = i16 | i38;
        } else {
            i37 = i16;
        }
        if ((i16 & 48) != 0) {
            i37 |= ((i17 & 2048) == 0 || !rVarH.G(pVar2)) ? 16 : 32;
        }
        i39 = i37;
        i45 = i17 & PKIFailureInfo.certConfirmed;
        if (i45 != 0) {
            i46 = i39;
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(efVar)) {
                    i47 = 256;
                } else {
                    i47 = 128;
                }
                i46 |= i47;
            }
            if ((i16 & 3072) != 0) {
                i46 |= rVarH.G(qVar) ? 2048 : 1024;
            }
            i48 = i46;
            if ((i28 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i28 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i71114 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i71114;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                } else {
                    if (i68 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i17 & 4) != 0) {
                        i28 &= -897;
                        hjVarY = y(false, null, rVarH, 0, 3);
                    }
                    if (i19 != 0) {
                        fO = n0.f56958a.o();
                    } else {
                        fO = f15;
                    }
                    if (i26 != 0) {
                        z16 = true;
                    }
                    if ((i17 & 32) != 0) {
                        y2VarK = n0.f56958a.k(rVarH, 6);
                        i28 &= -458753;
                    }
                    if ((i17 & 64) != 0) {
                        jI = n0.f56958a.i(rVarH, 6);
                        i28 &= -3670017;
                    }
                    if ((i17 & 128) != 0) {
                        jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                        i28 &= -29360129;
                    } else {
                        jE = j16;
                    }
                    if (i29 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if ((i17 & 512) != 0) {
                        jN = n0.f56958a.n(rVarH, 6);
                        i28 &= -1879048193;
                    } else {
                        jN = j17;
                    }
                    if (i36 != 0) {
                        pVarB = m3.f56824a.b();
                    } else {
                        pVarB = pVar;
                    }
                    if ((i17 & 2048) != 0) {
                        pVar5 = new p() { // from class: f2.ue
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return C6454df.m((r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        i48 &= -113;
                    } else {
                        pVar5 = pVar2;
                    }
                    int i71115 = i48;
                    if (i45 != 0) {
                        efVar3 = new ef(false, false, 3, null);
                    } else {
                        efVar3 = efVar;
                    }
                    f19 = fN;
                    mVar3 = mVar2;
                    i49 = i28;
                    i55 = i71115;
                    y2Var3 = y2VarK;
                    pVar6 = pVarB;
                    j26 = jE;
                    z19 = true;
                    j27 = jI;
                    f25 = fO;
                }
                final boolean z3111 = z16;
                final long j2111113 = j27;
                rVarH.y();
                if (t.k()) {
                    t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
                }
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                p0Var = (p0) objE;
                i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
                final ef efVar18 = efVar3;
                if (i56 > 256) {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                } else {
                    pVar7 = pVar5;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z25 = z19;
                    } else {
                        z25 = false;
                    }
                }
                boolean zG11117 = z25 | rVarH.G(p0Var);
                i57 = i49 & 14;
                if (i57 == 4) {
                    z26 = z19;
                } else {
                    z26 = false;
                }
                z27 = zG11117 | z26;
                objE2 = rVarH.E();
                if (z27) {
                    mVar4 = mVar3;
                    if (objE2 == companion.a()) {
                    }
                    aVar2 = (er.a) objE2;
                    if (i56 > 256) {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    } else {
                        aVar3 = aVar2;
                        if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z28 = z19;
                        } else {
                            z28 = false;
                        }
                    }
                    boolean zG11118 = z28 | rVarH.G(p0Var);
                    if (i57 == 4) {
                        z29 = z19;
                    } else {
                        z29 = false;
                    }
                    z35 = zG11118 | z29;
                    objE3 = rVarH.E();
                    if (z35) {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.a() { // from class: f2.we
                            @Override // er.a
                            public final Object a() {
                                return C6454df.p(hjVarY, p0Var, aVar);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    er.a aVar1111116 = (er.a) objE3;
                    i58 = i49;
                    final m mVar111110 = mVar4;
                    final er.a aVar1111117 = aVar3;
                    final long j2111114 = jN;
                    hjVar3 = hjVarY;
                    final p pVar11111110 = pVar6;
                    final p pVar11111111 = pVar7;
                    rVar2 = rVarH;
                    C6458nf.h(aVar1111116, j26, efVar18, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.r(hjVar3, efVar18, aVar1111117, j2111114, mVar111110, aVar, f25, z3111, pVar11111110, pVar11111111, y2Var3, j2111113, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                    if (hjVar3.g()) {
                        rVar2.X(748177042);
                        if (i56 <= 256) {
                        }
                        objE4 = rVar2.E();
                        if (z36) {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        } else {
                            objE4 = new a(hjVar3, null);
                            rVar2.v(objE4);
                        }
                        Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                        rVar2.R();
                    } else {
                        rVar2.X(748238546);
                        rVar2.R();
                    }
                    if (t.k()) {
                        t.n();
                    }
                    y2 y2Var1115 = y2Var3;
                    mVar2 = mVar111110;
                    y2Var2 = y2Var1115;
                    hjVar2 = hjVar3;
                    f17 = f25;
                    z18 = z3111;
                    j19 = j2111113;
                    pVar3 = pVar11111110;
                    j25 = j26;
                    efVar2 = efVar18;
                    pVar4 = pVar11111111;
                    f18 = f19;
                    j18 = j2111114;
                } else {
                    mVar4 = mVar3;
                }
                objE2 = new er.a() { // from class: f2.ve
                    @Override // er.a
                    public final Object a() {
                        return C6454df.n(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE2);
                aVar2 = (er.a) objE2;
                if (i56 > 256) {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                } else {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                }
                boolean zG11119 = z28 | rVarH.G(p0Var);
                if (i57 == 4) {
                    z29 = z19;
                } else {
                    z29 = false;
                }
                z35 = zG11119 | z29;
                objE3 = rVarH.E();
                if (z35) {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.a aVar1111118 = (er.a) objE3;
                i58 = i49;
                final m mVar111111 = mVar4;
                final er.a aVar1111119 = aVar3;
                final long j2111115 = jN;
                hjVar3 = hjVarY;
                final p pVar11111112 = pVar6;
                final p pVar11111113 = pVar7;
                rVar2 = rVarH;
                C6458nf.h(aVar1111118, j26, efVar18, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.r(hjVar3, efVar18, aVar1111119, j2111115, mVar111111, aVar, f25, z3111, pVar11111112, pVar11111113, y2Var3, j2111113, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                if (hjVar3.g()) {
                    rVar2.X(748177042);
                    if (i56 <= 256) {
                    }
                    objE4 = rVar2.E();
                    if (z36) {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    } else {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    }
                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                    rVar2.R();
                } else {
                    rVar2.X(748238546);
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                y2 y2Var1116 = y2Var3;
                mVar2 = mVar111111;
                y2Var2 = y2Var1116;
                hjVar2 = hjVar3;
                f17 = f25;
                z18 = z3111;
                j19 = j2111113;
                pVar3 = pVar11111112;
                j25 = j26;
                efVar2 = efVar18;
                pVar4 = pVar11111113;
                f18 = f19;
                j18 = j2111115;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f17 = f15;
                j18 = j17;
                pVar3 = pVar;
                pVar4 = pVar2;
                efVar2 = efVar;
                j19 = jI;
                z18 = z16;
                y2Var2 = y2VarK;
                hjVar2 = hjVarY;
                j25 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final long j319 = j18;
                final m mVar111112 = mVar2;
                d5VarM.a(new p() { // from class: f2.ye
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.x(aVar, mVar111112, hjVar2, f17, z18, y2Var2, j19, j25, f18, j319, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i46 = i39 | MLKEMEngine.KyberPolyBytes;
        if ((i16 & 3072) != 0) {
            i46 |= rVarH.G(qVar) ? 2048 : 1024;
        }
        i48 = i46;
        if ((i28 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i28 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i68 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i17 & 4) != 0) {
                    i28 &= -897;
                    hjVarY = y(false, null, rVarH, 0, 3);
                }
                if (i19 != 0) {
                    fO = n0.f56958a.o();
                } else {
                    fO = f15;
                }
                if (i26 != 0) {
                    z16 = true;
                }
                if ((i17 & 32) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i28 &= -458753;
                }
                if ((i17 & 64) != 0) {
                    jI = n0.f56958a.i(rVarH, 6);
                    i28 &= -3670017;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                    i28 &= -29360129;
                } else {
                    jE = j16;
                }
                if (i29 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f16;
                }
                if ((i17 & 512) != 0) {
                    jN = n0.f56958a.n(rVarH, 6);
                    i28 &= -1879048193;
                } else {
                    jN = j17;
                }
                if (i36 != 0) {
                    pVarB = m3.f56824a.b();
                } else {
                    pVarB = pVar;
                }
                if ((i17 & 2048) != 0) {
                    pVar5 = new p() { // from class: f2.ue
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.m((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i48 &= -113;
                } else {
                    pVar5 = pVar2;
                }
                int i71116 = i48;
                if (i45 != 0) {
                    efVar3 = new ef(false, false, 3, null);
                } else {
                    efVar3 = efVar;
                }
                f19 = fN;
                mVar3 = mVar2;
                i49 = i28;
                i55 = i71116;
                y2Var3 = y2VarK;
                pVar6 = pVarB;
                j26 = jE;
                z19 = true;
                j27 = jI;
                f25 = fO;
            } else {
                if (i68 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i17 & 4) != 0) {
                    i28 &= -897;
                    hjVarY = y(false, null, rVarH, 0, 3);
                }
                if (i19 != 0) {
                    fO = n0.f56958a.o();
                } else {
                    fO = f15;
                }
                if (i26 != 0) {
                    z16 = true;
                }
                if ((i17 & 32) != 0) {
                    y2VarK = n0.f56958a.k(rVarH, 6);
                    i28 &= -458753;
                }
                if ((i17 & 64) != 0) {
                    jI = n0.f56958a.i(rVarH, 6);
                    i28 &= -3670017;
                }
                if ((i17 & 128) != 0) {
                    jE = g2.e(jI, rVarH, (i28 >> 18) & 14);
                    i28 &= -29360129;
                } else {
                    jE = j16;
                }
                if (i29 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f16;
                }
                if ((i17 & 512) != 0) {
                    jN = n0.f56958a.n(rVarH, 6);
                    i28 &= -1879048193;
                } else {
                    jN = j17;
                }
                if (i36 != 0) {
                    pVarB = m3.f56824a.b();
                } else {
                    pVarB = pVar;
                }
                if ((i17 & 2048) != 0) {
                    pVar5 = new p() { // from class: f2.ue
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6454df.m((r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    i48 &= -113;
                } else {
                    pVar5 = pVar2;
                }
                int i71117 = i48;
                if (i45 != 0) {
                    efVar3 = new ef(false, false, 3, null);
                } else {
                    efVar3 = efVar;
                }
                f19 = fN;
                mVar3 = mVar2;
                i49 = i28;
                i55 = i71117;
                y2Var3 = y2VarK;
                pVar6 = pVarB;
                j26 = jE;
                z19 = true;
                j27 = jI;
                f25 = fO;
            }
            final boolean z3112 = z16;
            final long j2111116 = j27;
            rVarH.y();
            if (t.k()) {
                t.o(1904798512, i49, i55, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:107)");
            }
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(j.f191408a, rVarH);
                rVarH.v(objE);
            }
            p0Var = (p0) objE;
            i56 = (i49 & 896) ^ MLKEMEngine.KyberPolyBytes;
            final ef efVar19 = efVar3;
            if (i56 > 256) {
                pVar7 = pVar5;
                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z25 = z19;
                } else {
                    z25 = false;
                }
            } else {
                pVar7 = pVar5;
                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z25 = z19;
                } else {
                    z25 = false;
                }
            }
            boolean zG111110 = z25 | rVarH.G(p0Var);
            i57 = i49 & 14;
            if (i57 == 4) {
                z26 = z19;
            } else {
                z26 = false;
            }
            z27 = zG111110 | z26;
            objE2 = rVarH.E();
            if (z27) {
                mVar4 = mVar3;
                if (objE2 == companion.a()) {
                }
                aVar2 = (er.a) objE2;
                if (i56 > 256) {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                } else {
                    aVar3 = aVar2;
                    if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                        z28 = z19;
                    } else {
                        z28 = false;
                    }
                }
                boolean zG111111 = z28 | rVarH.G(p0Var);
                if (i57 == 4) {
                    z29 = z19;
                } else {
                    z29 = false;
                }
                z35 = zG111111 | z29;
                objE3 = rVarH.E();
                if (z35) {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.a() { // from class: f2.we
                        @Override // er.a
                        public final Object a() {
                            return C6454df.p(hjVarY, p0Var, aVar);
                        }
                    };
                    rVarH.v(objE3);
                }
                er.a aVar11111110 = (er.a) objE3;
                i58 = i49;
                final m mVar111113 = mVar4;
                final er.a aVar11111111 = aVar3;
                final long j2111117 = jN;
                hjVar3 = hjVarY;
                final p pVar11111114 = pVar6;
                final p pVar11111115 = pVar7;
                rVar2 = rVarH;
                C6458nf.h(aVar11111110, j26, efVar19, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6454df.r(hjVar3, efVar19, aVar11111111, j2111117, mVar111113, aVar, f25, z3112, pVar11111114, pVar11111115, y2Var3, j2111116, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
                if (hjVar3.g()) {
                    rVar2.X(748177042);
                    if (i56 <= 256) {
                    }
                    objE4 = rVar2.E();
                    if (z36) {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    } else {
                        objE4 = new a(hjVar3, null);
                        rVar2.v(objE4);
                    }
                    Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                    rVar2.R();
                } else {
                    rVar2.X(748238546);
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
                y2 y2Var1117 = y2Var3;
                mVar2 = mVar111113;
                y2Var2 = y2Var1117;
                hjVar2 = hjVar3;
                f17 = f25;
                z18 = z3112;
                j19 = j2111116;
                pVar3 = pVar11111114;
                j25 = j26;
                efVar2 = efVar19;
                pVar4 = pVar11111115;
                f18 = f19;
                j18 = j2111117;
            } else {
                mVar4 = mVar3;
            }
            objE2 = new er.a() { // from class: f2.ve
                @Override // er.a
                public final Object a() {
                    return C6454df.n(hjVarY, p0Var, aVar);
                }
            };
            rVarH.v(objE2);
            aVar2 = (er.a) objE2;
            if (i56 > 256) {
                aVar3 = aVar2;
                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z28 = z19;
                } else {
                    z28 = false;
                }
            } else {
                aVar3 = aVar2;
                if ((i49 & MLKEMEngine.KyberPolyBytes) != 256) {
                    z28 = z19;
                } else {
                    z28 = false;
                }
            }
            boolean zG111112 = z28 | rVarH.G(p0Var);
            if (i57 == 4) {
                z29 = z19;
            } else {
                z29 = false;
            }
            z35 = zG111112 | z29;
            objE3 = rVarH.E();
            if (z35) {
                objE3 = new er.a() { // from class: f2.we
                    @Override // er.a
                    public final Object a() {
                        return C6454df.p(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: f2.we
                    @Override // er.a
                    public final Object a() {
                        return C6454df.p(hjVarY, p0Var, aVar);
                    }
                };
                rVarH.v(objE3);
            }
            er.a aVar11111112 = (er.a) objE3;
            i58 = i49;
            final m mVar111114 = mVar4;
            final er.a aVar11111113 = aVar3;
            final long j2111118 = jN;
            hjVar3 = hjVarY;
            final p pVar11111116 = pVar6;
            final p pVar11111117 = pVar7;
            rVar2 = rVarH;
            C6458nf.h(aVar11111112, j26, efVar19, y2.m.d(-1328793519, true, new p() { // from class: f2.xe
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6454df.r(hjVar3, efVar19, aVar11111113, j2111118, mVar111114, aVar, f25, z3112, pVar11111116, pVar11111117, y2Var3, j2111116, j26, f19, qVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, ((i58 >> 18) & 112) | 3072 | (i55 & 896), 0);
            if (hjVar3.g()) {
                rVar2.X(748177042);
                if (i56 <= 256) {
                }
                objE4 = rVar2.E();
                if (z36) {
                    objE4 = new a(hjVar3, null);
                    rVar2.v(objE4);
                } else {
                    objE4 = new a(hjVar3, null);
                    rVar2.v(objE4);
                }
                Function0.d(hjVar3, (p) objE4, rVar2, (i58 >> 6) & 14);
                rVar2.R();
            } else {
                rVar2.X(748238546);
                rVar2.R();
            }
            if (t.k()) {
                t.n();
            }
            y2 y2Var1118 = y2Var3;
            mVar2 = mVar111114;
            y2Var2 = y2Var1118;
            hjVar2 = hjVar3;
            f17 = f25;
            z18 = z3112;
            j19 = j2111116;
            pVar3 = pVar11111116;
            j25 = j26;
            efVar2 = efVar19;
            pVar4 = pVar11111117;
            f18 = f19;
            j18 = j2111118;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            f17 = f15;
            j18 = j17;
            pVar3 = pVar;
            pVar4 = pVar2;
            efVar2 = efVar;
            j19 = jI;
            z18 = z16;
            y2Var2 = y2VarK;
            hjVar2 = hjVarY;
            j25 = j16;
            f18 = f16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            final long j3110 = j18;
            final m mVar111115 = mVar2;
            d5VarM.a(new p() { // from class: f2.ye
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6454df.x(aVar, mVar111115, hjVar2, f17, z18, y2Var2, j19, j25, f18, j3110, pVar3, pVar4, efVar2, qVar, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c4 m(r rVar, int i15) {
        rVar.X(-511854661);
        if (t.k()) {
            t.o(-511854661, i15, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:104)");
        }
        c4 c4VarL = n0.f56958a.l(rVar, 6);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return c4VarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final hj hjVar, p0 p0Var, final er.a aVar) {
        if (hjVar.e().b(ij.Hidden).booleanValue()) {
            ju.k.d(p0Var, null, null, new b(hjVar, null), 3, null).C0(new l() { // from class: f2.ze
                @Override // er.l
                public final Object b(Object obj) {
                    return C6454df.o(hjVar, aVar, (Throwable) obj);
                }
            });
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(hj hjVar, er.a aVar, Throwable th4) {
        if (!hjVar.m()) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(hj hjVar, p0 p0Var, final er.a aVar) {
        if (hjVar.f() == ij.Expanded && hjVar.h()) {
            ju.k.d(p0Var, null, null, new c(hjVar, null), 3, null);
        } else {
            ju.k.d(p0Var, null, null, new d(hjVar, null), 3, null).C0(new l() { // from class: f2.af
                @Override // er.l
                public final Object b(Object obj) {
                    return C6454df.q(aVar, (Throwable) obj);
                }
            });
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(er.a aVar, Throwable th4) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final hj hjVar, ef efVar, er.a aVar, long j15, m mVar, er.a aVar2, float f15, boolean z15, p pVar, p pVar2, y2 y2Var, long j16, long j17, float f16, q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1328793519, i15, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:137)");
            }
            m mVarP = t4.p(androidx.compose.foundation.layout.d.f(m.INSTANCE, 0.0f, 1, null));
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l() { // from class: f2.bf
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6454df.s((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarD = v.d(mVarP, false, (l) objE, 1, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarD);
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
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            boolean zW = rVar.W(hjVar);
            Object objE2 = rVar.E();
            if (zW || objE2 == companion.a()) {
                objE2 = new jj(hjVar);
                rVar.v(objE2);
            }
            jj jjVar = (jj) objE2;
            Object objE3 = rVar.E();
            if (objE3 == companion.a()) {
                objE3 = x5.d(new er.a() { // from class: f2.cf
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(C6454df.t(hjVar));
                    }
                });
                rVar.v(objE3);
            }
            final f6<Float> f6VarE = f.e(u((f6) objE3) ? 1.0f : 0.0f, of.b(k0.DefaultEffects, rVar, 6), 0.0f, "ScrimAlphaAnimation", null, rVar, 3072, 20);
            a2.Companion companion4 = a2.INSTANCE;
            String strB = b2.b(a2.a(f3.q.f58792c), rVar, 0);
            er.a aVar3 = efVar.getShouldDismissOnClickOutside() ? aVar : null;
            boolean zW2 = rVar.W(f6VarE);
            Object objE4 = rVar.E();
            if (zW2 || objE4 == companion.a()) {
                objE4 = new er.a() { // from class: f2.te
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(C6454df.w(f6VarE));
                    }
                };
                rVar.v(objE4);
            }
            ni.g(strB, null, aVar3, (er.a) objE4, j15, rVar, 0, 2);
            l1.x(g4.a(xVar.d(mVar, companion2.m()), jjVar), hjVar, aVar2, f15, z15, efVar.getShouldDismissOnBackPress(), pVar, pVar2, y2Var, j16, j17, f16, 0.0f, qVar, rVar, 0, 0, PKIFailureInfo.certConfirmed);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(hj hjVar) {
        return hjVar.k() != ij.Hidden;
    }

    private static final boolean u(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    private static final float v(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w(f6 f6Var) {
        return v(f6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(er.a aVar, m mVar, hj hjVar, float f15, boolean z15, y2 y2Var, long j15, long j16, float f16, long j17, p pVar, p pVar2, ef efVar, q qVar, int i15, int i16, int i17, r rVar, int i18) {
        l(aVar, mVar, hjVar, f15, z15, y2Var, j15, j16, f16, j17, pVar, pVar2, efVar, qVar, rVar, p076m2.g4.a(i15 | 1), p076m2.g4.a(i16), i17);
        return i0.f148189a;
    }

    public static final hj y(boolean z15, l<? super ij, Boolean> lVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            z15 = false;
        }
        boolean z16 = z15;
        if ((i16 & 2) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.se
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(C6454df.z((ij) obj));
                    }
                };
                rVar.v(objE);
            }
            lVar = (l) objE;
        }
        l<? super ij, Boolean> lVar2 = lVar;
        if (t.k()) {
            t.o(-778250030, i15, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:217)");
        }
        hj hjVarQ = ej.q(z16, lVar2, ij.Hidden, false, 0.0f, 0.0f, rVar, (i15 & 14) | MLKEMEngine.KyberPolyBytes | (i15 & 112), 56);
        if (t.k()) {
            t.n();
        }
        return hjVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(ij ijVar) {
        return true;
    }
}
