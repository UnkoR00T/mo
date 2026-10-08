package p060i1;

import a1.o;
import a4.c;
import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c5.h;
import c5.t;
import d1.d3;
import er.l;
import er.p;
import er.r;
import f3.m;
import fr.f0;
import ju.p0;
import ju.q0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p056h1.q2;
import p056h1.t1;
import p056h1.u1;
import p056h1.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.x5;
import p143z0.a0;
import p143z0.a2;
import p143z0.g1;
import p143z0.y;
import tq.e;
import tq.j;
import vq.i;
import w0.g0;
import w0.g2;
import w0.h3;
import z3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a½\u0001\u0010$\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 H\u0001¢\u0006\u0004\b$\u0010%\u001a[\u0010)\u001a\b\u0012\u0004\u0012\u00020(0&2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0 2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0&H\u0003¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lf3/m;", "modifier", "Li1/i1;", "state", "Ld1/d3;", "contentPadding", "", "reverseLayout", "Lz0/a2;", "orientation", "Lz0/d3;", "flingBehavior", "userScrollEnabled", "Lw0/g2;", "overscrollEffect", "", "beyondViewportPageCount", "Lc5/h;", "pageSpacing", "Li1/p;", "pageSize", "Lz3/a;", "pageNestedScrollConnection", "Lkotlin/Function1;", "", "key", "Lf3/c$b;", "horizontalAlignment", "Lf3/c$c;", "verticalAlignment", "La1/o;", "snapPosition", "Lkotlin/Function2;", "Li1/v0;", "Loq/i0;", "pageContent", "f", "(Lf3/m;Li1/i1;Ld1/d3;ZLz0/a2;Lz0/d3;ZLw0/g2;IFLi1/p;Lz3/a;Ler/l;Lf3/c$b;Lf3/c$c;La1/o;Ler/r;Lm2/r;III)V", "Lkotlin/Function0;", "pageCount", "Li1/l0;", "k", "(Li1/i1;Ler/r;Ler/l;Ler/a;Lm2/r;I)Ler/a;", "j", "(Lf3/m;Li1/i1;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f87934a;

        /* JADX INFO: renamed from: i1.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C2066a extends vq.k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f87935e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f87936f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ i1 f87937g;

            /* JADX INFO: renamed from: i1.k$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La4/c;", "Loq/i0;", "<anonymous>", "(La4/c;)V"}, k = 3, mv = {2, 1, 0})
            static final class C2067a extends i implements p<c, e<? super i0>, Object> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f87938c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f87939d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f87940e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private /* synthetic */ Object f87941f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ i1 f87942g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2067a(i1 i1Var, e<? super C2067a> eVar) {
                    super(2, eVar);
                    this.f87942g = i1Var;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0078  */
                /* JADX WARN: Code duplicated, block: B:23:0x0085 A[LOOP:0: B:19:0x0076->B:23:0x0085, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:27:0x0088 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:28:0x0055 A[EDGE_INSN: B:28:0x0055->B:14:0x0055 BREAK  A[LOOP:0: B:19:0x0076->B:23:0x0085], SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // vq.a
                public final java.lang.Object J(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r10.f87940e
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r4) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r10.f87939d
                        a4.b0 r1 = (a4.PointerInputChange) r1
                        java.lang.Object r4 = r10.f87938c
                        a4.b0 r4 = (a4.PointerInputChange) r4
                        java.lang.Object r5 = r10.f87941f
                        a4.c r5 = (a4.c) r5
                        oq.u.b(r11)
                        goto L68
                    L1f:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L27:
                        java.lang.Object r1 = r10.f87941f
                        a4.c r1 = (a4.c) r1
                        oq.u.b(r11)
                        goto L44
                    L2f:
                        oq.u.b(r11)
                        java.lang.Object r11 = r10.f87941f
                        r1 = r11
                        a4.c r1 = (a4.c) r1
                        a4.q r11 = a4.q.Initial
                        r10.f87941f = r1
                        r10.f87940e = r4
                        java.lang.Object r11 = p143z0.b3.c(r1, r3, r11, r10)
                        if (r11 != r0) goto L44
                        goto L67
                    L44:
                        a4.b0 r11 = (a4.PointerInputChange) r11
                        i1.i1 r4 = r10.f87942g
                        m3.e$a r5 = m3.e.INSTANCE
                        long r5 = r5.c()
                        r4.u0(r5)
                        r4 = 0
                        r5 = r1
                        r1 = r4
                        r4 = r11
                    L55:
                        if (r1 != 0) goto L94
                        a4.q r11 = a4.q.Initial
                        r10.f87941f = r5
                        r10.f87938c = r4
                        r10.f87939d = r1
                        r10.f87940e = r2
                        java.lang.Object r11 = r5.k2(r11, r10)
                        if (r11 != r0) goto L68
                    L67:
                        return r0
                    L68:
                        a4.o r11 = (a4.o) r11
                        java.util.List r6 = r11.c()
                        r7 = r6
                        java.util.Collection r7 = (java.util.Collection) r7
                        int r7 = r7.size()
                        r8 = r3
                    L76:
                        if (r8 >= r7) goto L88
                        java.lang.Object r9 = r6.get(r8)
                        a4.b0 r9 = (a4.PointerInputChange) r9
                        boolean r9 = a4.p.c(r9)
                        if (r9 != 0) goto L85
                        goto L55
                    L85:
                        int r8 = r8 + 1
                        goto L76
                    L88:
                        java.util.List r11 = r11.c()
                        java.lang.Object r11 = r11.get(r3)
                        r1 = r11
                        a4.b0 r1 = (a4.PointerInputChange) r1
                        goto L55
                    L94:
                        i1.i1 r11 = r10.f87942g
                        long r0 = r1.getPosition()
                        long r2 = r4.getPosition()
                        long r0 = m3.e.p(r0, r2)
                        r11.u0(r0)
                        oq.i0 r11 = oq.i0.f148189a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: i1.k.a.C2066a.C2067a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
                public final Object B(c cVar, e<? super i0> eVar) {
                    return ((C2067a) v(cVar, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final e<i0> v(Object obj, e<?> eVar) {
                    C2067a c2067a = new C2067a(this.f87942g, eVar);
                    c2067a.f87941f = obj;
                    return c2067a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2066a(k0 k0Var, i1 i1Var, e<? super C2066a> eVar) {
                super(2, eVar);
                this.f87936f = k0Var;
                this.f87937g = i1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f87935e;
                if (i15 == 0) {
                    u.b(obj);
                    k0 k0Var = this.f87936f;
                    C2067a c2067a = new C2067a(this.f87937g, null);
                    this.f87935e = 1;
                    if (g1.d(k0Var, c2067a, this) == objE) {
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
                return ((C2066a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C2066a(this.f87936f, this.f87937g, eVar);
            }
        }

        a(i1 i1Var) {
            this.f87934a = i1Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            Object objE = q0.e(new C2066a(k0Var, this.f87934a, null), eVar);
            return objE == uq.b.e() ? objE : i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x0238  */
    /* JADX WARN: Code duplicated, block: B:168:0x0245  */
    /* JADX WARN: Code duplicated, block: B:169:0x0248  */
    /* JADX WARN: Code duplicated, block: B:174:0x0255  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:193:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:196:0x0302  */
    /* JADX WARN: Code duplicated, block: B:198:0x030c  */
    /* JADX WARN: Code duplicated, block: B:199:0x030f  */
    /* JADX WARN: Code duplicated, block: B:204:0x032a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0339  */
    /* JADX WARN: Code duplicated, block: B:209:0x0343  */
    /* JADX WARN: Code duplicated, block: B:210:0x0346  */
    /* JADX WARN: Code duplicated, block: B:215:0x0358  */
    /* JADX WARN: Code duplicated, block: B:218:0x0368  */
    /* JADX WARN: Code duplicated, block: B:219:0x0385  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:226:0x0405  */
    /* JADX WARN: Code duplicated, block: B:228:0x040b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0419  */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110  */
    /* JADX WARN: Code duplicated, block: B:91:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x01d1, please report this as an issue */
    public static final void f(final m mVar, i1 i1Var, final d3 d3Var, final boolean z15, final a2 a2Var, final p143z0.d3 d3Var2, final boolean z16, final g2 g2Var, int i15, float f15, final p pVar, z3.a aVar, final l<? super Integer, ? extends Object> lVar, final f3.c.b bVar, final f3.c.InterfaceC1317c interfaceC1317c, final o oVar, final r<? super v0, ? super Integer, ? super p076m2.r, ? super Integer, i0> rVar, p076m2.r rVar2, final int i16, final int i17, final int i18) {
        int i19;
        int i25;
        float f16;
        int i26;
        int i27;
        int i28;
        boolean z17;
        final z3.a aVar2;
        p076m2.r rVar3;
        final int i29;
        final float f17;
        d5 d5VarM;
        int i35;
        float fN;
        boolean z18;
        int i36;
        boolean z19;
        Object objE;
        int i37;
        int i38;
        int i39;
        Object objE2;
        p076m2.r.Companion companion;
        boolean z25;
        Object objE3;
        a2 a2Var2;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objE4;
        y yVar;
        t tVar;
        boolean z35;
        boolean zW;
        Object objE5;
        y yVar2;
        m mVarB;
        boolean z36;
        boolean z37;
        boolean zW2;
        Object objE6;
        int i45;
        int i46;
        int i47;
        int i48;
        final i1 i1Var2 = i1Var;
        p076m2.r rVarH = rVar2.h(-572816025);
        if ((i16 & 6) == 0) {
            i19 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.W(i1Var2) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= rVarH.W(d3Var) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= rVarH.a(z15) ? 2048 : 1024;
        }
        int i49 = i16 & 24576;
        int i55 = PKIFailureInfo.certRevoked;
        if (i49 == 0) {
            i19 |= rVarH.c(a2Var.ordinal()) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            i19 |= rVarH.W(d3Var2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= rVarH.a(z16) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= rVarH.W(g2Var) ? 8388608 : 4194304;
        }
        int i56 = i18 & 256;
        if (i56 == 0) {
            if ((i16 & 100663296) == 0) {
                i19 |= rVarH.c(i15) ? 67108864 : 33554432;
            }
            i25 = i18 & 512;
            if (i25 != 0) {
                i19 |= 805306368;
                f16 = f15;
            } else {
                f16 = f15;
                if ((i16 & 805306368) == 0) {
                    if (rVarH.b(f16)) {
                        i26 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i26 = 268435456;
                    }
                    i19 |= i26;
                }
            }
            if ((i17 & 6) == 0) {
                if (rVarH.W(pVar)) {
                    i48 = 4;
                } else {
                    i48 = 2;
                }
                i27 = i17 | i48;
            } else {
                i27 = i17;
            }
            if ((i17 & 48) == 0) {
                if (rVarH.G(aVar)) {
                    i47 = 32;
                } else {
                    i47 = 16;
                }
                i27 |= i47;
            }
            if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
                i27 |= rVarH.G(lVar) ? 256 : 128;
            }
            if ((i17 & 3072) != 0) {
                i27 |= rVarH.W(bVar) ? 2048 : 1024;
            }
            if ((i17 & 24576) != 0) {
                if (rVarH.W(interfaceC1317c)) {
                    i55 = 16384;
                }
                i27 |= i55;
            }
            if ((i17 & 196608) == 0) {
                if (rVarH.W(oVar)) {
                    i46 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i46 = PKIFailureInfo.notAuthorized;
                }
                i27 |= i46;
            }
            if ((i17 & 1572864) == 0) {
                if (rVarH.G(rVar)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i27 |= i45;
            }
            i28 = i27;
            if ((i19 & 306783379) == 306783378 || (599187 & i28) != 599186) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i19 & 1)) {
                if (i56 != 0) {
                    i35 = 0;
                } else {
                    i35 = i15;
                }
                if (i25 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f16;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-572816025, i19, i28, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:106)");
                }
                if (i35 >= 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    c1.e.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
                }
                i36 = i19 & 112;
                if (i36 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objE = rVarH.E();
                if (z19 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: i1.f
                        @Override // er.a
                        public final Object a() {
                            return Integer.valueOf(k.g(i1Var2));
                        }
                    };
                    rVarH.v(objE);
                }
                er.a aVar3 = (er.a) objE;
                int i57 = i19 >> 3;
                i37 = i57 & 14;
                int i58 = i28 >> 15;
                i38 = i19;
                i39 = i35;
                er.a<l0> aVarK = k(i1Var2, rVar, lVar, aVar3, rVarH, i37 | (i58 & 112) | (i28 & 896));
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = Function0.i(j.f191408a, rVarH);
                    rVarH.v(objE2);
                }
                p0 p0Var = (p0) objE2;
                if (i36 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objE3 = rVarH.E();
                if (z25 || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: i1.g
                        @Override // er.a
                        public final Object a() {
                            return Integer.valueOf(k.h(i1Var2));
                        }
                    };
                    rVarH.v(objE3);
                }
                int i59 = i38 >> 9;
                int i65 = i28 << 15;
                y0 y0VarC = Function0.c(aVarK, i1Var2, d3Var, z15, a2Var, i39, fN, pVar, bVar, interfaceC1317c, oVar, p0Var, (er.a) objE3, rVarH, (i38 & 65520) | (i59 & 458752) | (i59 & 3670016) | ((i28 << 21) & 29360128) | (i65 & 234881024) | (i65 & 1879048192), i58 & 14);
                float f18 = fN;
                a2Var2 = a2.Vertical;
                if (a2Var == a2Var2) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                t1 t1VarA = a1.a(i1Var2, z26, rVarH, i37);
                if (i36 == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((i38 & 458752) == 131072) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z27;
                objE4 = rVarH.E();
                if (z29 || objE4 == companion.a()) {
                    objE4 = new o1(d3Var2, i1Var2);
                    rVarH.v(objE4);
                }
                o1 o1Var = (o1) objE4;
                yVar = (y) rVarH.N(a0.c());
                tVar = (t) rVarH.N(androidx.compose.ui.platform.g1.l());
                if (g0.isBringIntoViewRltBouncyBehaviorInPagerFixEnabled) {
                    rVarH.X(-853904960);
                    if (i36 == 32) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    zW2 = z37 | rVarH.W(yVar) | rVarH.c(tVar.ordinal());
                    objE6 = rVarH.E();
                    if (zW2 || objE6 == companion.a()) {
                        objE6 = new s(i1Var2, yVar, tVar);
                        rVarH.v(objE6);
                    }
                    yVar2 = (s) objE6;
                    rVarH.R();
                } else {
                    rVarH.X(-853714372);
                    if (i36 == 32) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zW = z35 | rVarH.W(yVar);
                    objE5 = rVarH.E();
                    if (zW || objE5 == companion.a()) {
                        objE5 = new m(i1Var2, yVar);
                        rVarH.v(objE5);
                    }
                    yVar2 = (m) objE5;
                    rVarH.R();
                }
                y yVar3 = yVar2;
                if (z16) {
                    rVarH.X(-853484445);
                    mVarB = p056h1.t.b(m.INSTANCE, q.a(i1Var2, i39, rVarH, i37 | ((i38 >> 21) & 112)), i1Var2.getBeyondBoundsInfo(), z15, a2Var);
                    rVarH.R();
                } else {
                    rVarH.X(-853054661);
                    rVarH.R();
                    mVarB = m.INSTANCE;
                }
                m mVarC = u1.c(mVar.u(i1Var2.getRemeasurementModifier()).u(i1Var2.getAwaitLayoutModifier()), aVarK, t1VarA, a2Var, z16, z15, rVarH, (i57 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
                if (a2Var == a2Var2) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                m mVarA = h3.a(f0.j(mVarC, i1Var2, z36, p0Var, z16).u(mVarB), i1Var2, a2Var, g2Var, z16, z15, o1Var, i1Var2.getInternalInteractionSource(), yVar3);
                i1Var2 = i1Var2;
                aVar2 = aVar;
                p056h1.Function0.f(aVarK, d.b(j(mVarA, i1Var2), aVar2, null, 2, null), i1Var2.getPrefetchState(), y0VarC, rVarH, 0, 0);
                rVar3 = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f17 = f18;
                i29 = i39;
            } else {
                aVar2 = aVar;
                rVar3 = rVarH;
                rVar3.O();
                i29 = i15;
                f17 = f16;
            }
            d5VarM = rVar3.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: i1.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.i(mVar, i1Var2, d3Var, z15, a2Var, d3Var2, z16, g2Var, i29, f17, pVar, aVar2, lVar, bVar, interfaceC1317c, oVar, rVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 100663296;
        i25 = i18 & 512;
        if (i25 != 0) {
            i19 |= 805306368;
            f16 = f15;
        } else {
            f16 = f15;
            if ((i16 & 805306368) == 0) {
                if (rVarH.b(f16)) {
                    i26 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i26 = 268435456;
                }
                i19 |= i26;
            }
        }
        if ((i17 & 6) == 0) {
            if (rVarH.W(pVar)) {
                i48 = 4;
            } else {
                i48 = 2;
            }
            i27 = i17 | i48;
        } else {
            i27 = i17;
        }
        if ((i17 & 48) == 0) {
            if (rVarH.G(aVar)) {
                i47 = 32;
            } else {
                i47 = 16;
            }
            i27 |= i47;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) != 0) {
            i27 |= rVarH.G(lVar) ? 256 : 128;
        }
        if ((i17 & 3072) != 0) {
            i27 |= rVarH.W(bVar) ? 2048 : 1024;
        }
        if ((i17 & 24576) != 0) {
            if (rVarH.W(interfaceC1317c)) {
                i55 = 16384;
            }
            i27 |= i55;
        }
        if ((i17 & 196608) == 0) {
            if (rVarH.W(oVar)) {
                i46 = PKIFailureInfo.unsupportedVersion;
            } else {
                i46 = PKIFailureInfo.notAuthorized;
            }
            i27 |= i46;
        }
        if ((i17 & 1572864) == 0) {
            if (rVarH.G(rVar)) {
                i45 = PKIFailureInfo.badCertTemplate;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i27 |= i45;
        }
        i28 = i27;
        if ((i19 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i19 & 1)) {
            if (i56 != 0) {
                i35 = 0;
            } else {
                i35 = i15;
            }
            if (i25 != 0) {
                fN = h.n(0);
            } else {
                fN = f16;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-572816025, i19, i28, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:106)");
            }
            if (i35 >= 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                c1.e.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i35);
            }
            i36 = i19 & 112;
            if (i36 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            objE = rVarH.E();
            if (z19) {
                objE = new er.a() { // from class: i1.f
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(k.g(i1Var2));
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: i1.f
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(k.g(i1Var2));
                    }
                };
                rVarH.v(objE);
            }
            er.a aVar4 = (er.a) objE;
            int i510 = i19 >> 3;
            i37 = i510 & 14;
            int i511 = i28 >> 15;
            i38 = i19;
            i39 = i35;
            er.a<l0> aVarK2 = k(i1Var2, rVar, lVar, aVar4, rVarH, i37 | (i511 & 112) | (i28 & 896));
            objE2 = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = Function0.i(j.f191408a, rVarH);
                rVarH.v(objE2);
            }
            p0 p0Var2 = (p0) objE2;
            if (i36 == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            objE3 = rVarH.E();
            if (z25) {
                objE3 = new er.a() { // from class: i1.g
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(k.h(i1Var2));
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: i1.g
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(k.h(i1Var2));
                    }
                };
                rVarH.v(objE3);
            }
            int i512 = i38 >> 9;
            int i66 = i28 << 15;
            y0 y0VarC2 = Function0.c(aVarK2, i1Var2, d3Var, z15, a2Var, i39, fN, pVar, bVar, interfaceC1317c, oVar, p0Var2, (er.a) objE3, rVarH, (i38 & 65520) | (i512 & 458752) | (i512 & 3670016) | ((i28 << 21) & 29360128) | (i66 & 234881024) | (i66 & 1879048192), i511 & 14);
            float f19 = fN;
            a2Var2 = a2.Vertical;
            if (a2Var == a2Var2) {
                z26 = true;
            } else {
                z26 = false;
            }
            t1 t1VarA2 = a1.a(i1Var2, z26, rVarH, i37);
            if (i36 == 32) {
                z27 = true;
            } else {
                z27 = false;
            }
            if ((i38 & 458752) == 131072) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z28 | z27;
            objE4 = rVarH.E();
            if (z29) {
                objE4 = new o1(d3Var2, i1Var2);
                rVarH.v(objE4);
            } else {
                objE4 = new o1(d3Var2, i1Var2);
                rVarH.v(objE4);
            }
            o1 o1Var2 = (o1) objE4;
            yVar = (y) rVarH.N(a0.c());
            tVar = (t) rVarH.N(androidx.compose.ui.platform.g1.l());
            if (g0.isBringIntoViewRltBouncyBehaviorInPagerFixEnabled) {
                rVarH.X(-853904960);
                if (i36 == 32) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                zW2 = z37 | rVarH.W(yVar) | rVarH.c(tVar.ordinal());
                objE6 = rVarH.E();
                if (zW2) {
                    objE6 = new s(i1Var2, yVar, tVar);
                    rVarH.v(objE6);
                } else {
                    objE6 = new s(i1Var2, yVar, tVar);
                    rVarH.v(objE6);
                }
                yVar2 = (s) objE6;
                rVarH.R();
            } else {
                rVarH.X(-853714372);
                if (i36 == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zW = z35 | rVarH.W(yVar);
                objE5 = rVarH.E();
                if (zW) {
                    objE5 = new m(i1Var2, yVar);
                    rVarH.v(objE5);
                } else {
                    objE5 = new m(i1Var2, yVar);
                    rVarH.v(objE5);
                }
                yVar2 = (m) objE5;
                rVarH.R();
            }
            y yVar4 = yVar2;
            if (z16) {
                rVarH.X(-853484445);
                mVarB = p056h1.t.b(m.INSTANCE, q.a(i1Var2, i39, rVarH, i37 | ((i38 >> 21) & 112)), i1Var2.getBeyondBoundsInfo(), z15, a2Var);
                rVarH.R();
            } else {
                rVarH.X(-853054661);
                rVarH.R();
                mVarB = m.INSTANCE;
            }
            m mVarC2 = u1.c(mVar.u(i1Var2.getRemeasurementModifier()).u(i1Var2.getAwaitLayoutModifier()), aVarK2, t1VarA2, a2Var, z16, z15, rVarH, (i510 & 7168) | ((i38 >> 6) & 57344) | ((i38 << 6) & 458752));
            if (a2Var == a2Var2) {
                z36 = true;
            } else {
                z36 = false;
            }
            m mVarA2 = h3.a(f0.j(mVarC2, i1Var2, z36, p0Var2, z16).u(mVarB), i1Var2, a2Var, g2Var, z16, z15, o1Var2, i1Var2.getInternalInteractionSource(), yVar4);
            i1Var2 = i1Var2;
            aVar2 = aVar;
            p056h1.Function0.f(aVarK2, d.b(j(mVarA2, i1Var2), aVar2, null, 2, null), i1Var2.getPrefetchState(), y0VarC2, rVarH, 0, 0);
            rVar3 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            f17 = f19;
            i29 = i39;
        } else {
            aVar2 = aVar;
            rVar3 = rVarH;
            rVar3.O();
            i29 = i15;
            f17 = f16;
        }
        d5VarM = rVar3.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: i1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(mVar, i1Var2, d3Var, z15, a2Var, d3Var2, z16, g2Var, i29, f17, pVar, aVar2, lVar, bVar, interfaceC1317c, oVar, rVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(i1 i1Var) {
        return i1Var.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(i1 i1Var) {
        return i1Var.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(m mVar, i1 i1Var, d3 d3Var, boolean z15, a2 a2Var, p143z0.d3 d3Var2, boolean z16, g2 g2Var, int i15, float f15, p pVar, z3.a aVar, l lVar, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c, o oVar, r rVar, int i16, int i17, int i18, p076m2.r rVar2, int i19) {
        f(mVar, i1Var, d3Var, z15, a2Var, d3Var2, z16, g2Var, i15, f15, pVar, aVar, lVar, bVar, interfaceC1317c, oVar, rVar, rVar2, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    private static final m j(m mVar, i1 i1Var) {
        return mVar.u(w0.c(m.INSTANCE, i1Var, new a(i1Var)));
    }

    private static final er.a<l0> k(final i1 i1Var, r<? super v0, ? super Integer, ? super p076m2.r, ? super Integer, i0> rVar, l<? super Integer, ? extends Object> lVar, final er.a<Integer> aVar, p076m2.r rVar2, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1052364153, i15, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:268)");
        }
        final f6 f6VarP = x5.p(rVar, rVar2, (i15 >> 3) & 14);
        final f6 f6VarP2 = x5.p(lVar, rVar2, (i15 >> 6) & 14);
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar2.W(i1Var)) || (i15 & 6) == 4) | rVar2.W(f6VarP) | rVar2.W(f6VarP2) | ((((i15 & 7168) ^ 3072) > 2048 && rVar2.W(aVar)) || (i15 & 3072) == 2048);
        Object objE = rVar2.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            final f6 f6VarE = x5.e(x5.o(), new er.a() { // from class: i1.i
                @Override // er.a
                public final Object a() {
                    return k.l(f6VarP, f6VarP2, aVar);
                }
            });
            objE = new f0(x5.e(x5.o(), new er.a() { // from class: i1.j
                @Override // er.a
                public final Object a() {
                    return k.m(f6VarE, i1Var);
                }
            })) { // from class: i1.k.b
                @Override // mr.m
                public Object get() {
                    return ((f6) this.f66391b).getValue();
                }
            };
            rVar2.v(objE);
        }
        mr.m mVar = (mr.m) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f6 f6Var, f6 f6Var2, er.a aVar) {
        return new i0((r) f6Var.getValue(), (l) f6Var2.getValue(), ((Number) aVar.a()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 m(f6 f6Var, i1 i1Var) {
        i0 i0Var = (i0) f6Var.getValue();
        return new l0(i1Var, i0Var, new q2(i1Var.M(), i0Var));
    }
}
