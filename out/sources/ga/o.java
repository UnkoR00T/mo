package ga;

import c3.SnapshotStateMap;
import ea.NavEntry;
import fa.SceneInfo;
import fa.SceneState;
import fa.a0;
import fr.q0;
import fr.w0;
import ia.x;
import ia.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.p0;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.x5;
import p114t0.t0;
import p114t0.y0;
import pq.v;
import pq.v0;
import r0.o0;
import r0.x0;
import u0.k2;
import u0.m1;
import u0.v2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u008f\u0002\u0010\u001e\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132&\b\u0002\u0010\u001b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00192\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0013H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aã\u0001\u0010!\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132&\b\u0002\u0010\u001b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b!\u0010\"\u001aÇ\u0001\u0010(\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132 \b\u0002\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u00132&\b\u0002\u0010\u001b\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019H\u0007¢\u0006\u0004\b(\u0010)\u001a5\u0010-\u001a\u00020,\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b-\u0010.\u001aE\u00101\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102\u001aC\u00103\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0019\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"", "T", "", "backStack", "Lf3/m;", "modifier", "Lf3/c;", "contentAlignment", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lea/o;", "entryDecorators", "Lfa/s;", "sceneStrategy", "Lt0/t0;", "sharedTransitionScope", "Lt0/y0;", "sizeTransform", "Lkotlin/Function1;", "Lt0/h;", "Lfa/h;", "Lt0/v;", "transitionSpec", "popTransitionSpec", "Lkotlin/Function2;", "", "predictivePopTransitionSpec", "Lea/m;", "entryProvider", "m", "(Ljava/util/List;Lf3/m;Lf3/c;Ler/a;Ljava/util/List;Lfa/s;Lt0/t0;Lt0/y0;Ler/l;Ler/l;Ler/p;Ler/l;Lm2/r;III)V", "entries", "n", "(Ljava/util/List;Lf3/m;Lf3/c;Lfa/s;Lt0/t0;Lt0/y0;Ler/l;Ler/l;Ler/p;Ler/a;Lm2/r;II)V", "Lfa/p;", "sceneState", "Lia/x;", "Lfa/i;", "navigationEventState", "l", "(Lfa/p;Lia/x;Lf3/m;Lf3/c;Lt0/y0;Ler/l;Ler/l;Ler/p;Lm2/r;II)V", "oldBackStack", "newBackStack", "", "A", "(Ljava/util/List;Ljava/util/List;)Z", "", "key", "z", "(Lfa/h;Ljava/lang/String;)Ler/l;", "B", "(Lfa/h;)Ler/p;", "navigation3-ui"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/navigation3/ui/NavDisplayKt")
final /* synthetic */ class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m1<fa.h<T>> f71484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f71485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fa.h<T> f71486h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m1<fa.h<T>> m1Var, float f15, fa.h<T> hVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f71484f = m1Var;
            this.f71485g = f15;
            this.f71486h = hVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71483e;
            if (i15 == 0) {
                oq.u.b(obj);
                m1<fa.h<T>> m1Var = this.f71484f;
                float f15 = this.f71485g;
                Object obj2 = this.f71486h;
                this.f71483e = 1;
                if (m1Var.R(f15, obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f71484f, this.f71485g, this.f71486h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f71488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m1<fa.h<T>> f71489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fa.h<T> f71490h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k2<fa.h<T>> f71491j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f71492e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f71493f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f71494g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ m1<fa.h<T>> f71495h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ fa.h<T> f71496j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(float f15, float f16, m1<fa.h<T>> m1Var, fa.h<T> hVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f71493f = f15;
                this.f71494g = f16;
                this.f71495h = m1Var;
                this.f71496j = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0044  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            
                if (r10.Z(r1, r9) == r0) goto L20;
             */
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
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    r9 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r9.f71492e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    oq.u.b(r10)
                    r6 = r9
                    goto L51
                L13:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1b:
                    oq.u.b(r10)
                    goto L2a
                L1f:
                    oq.u.b(r10)
                    float r4 = r9.f71493f
                    float r10 = r9.f71494g
                    int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                    if (r10 != 0) goto L2c
                L2a:
                    r6 = r9
                    goto L3c
                L2c:
                    r10 = r3
                    u0.m1<fa.h<T>> r3 = r9.f71495h
                    r9.f71492e = r10
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    r6 = r9
                    java.lang.Object r10 = u0.m1.S(r3, r4, r5, r6, r7, r8)
                    if (r10 != r0) goto L3c
                    goto L50
                L3c:
                    float r10 = r6.f71493f
                    float r1 = r6.f71494g
                    int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                    if (r10 != 0) goto L51
                    u0.m1<fa.h<T>> r10 = r6.f71495h
                    fa.h<T> r1 = r6.f71496j
                    r6.f71492e = r2
                    java.lang.Object r10 = r10.Z(r1, r9)
                    if (r10 != r0) goto L51
                L50:
                    return r0
                L51:
                    oq.i0 r10 = oq.i0.f148189a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ga.o.b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f71493f, this.f71494g, this.f71495h, this.f71496j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m1<fa.h<T>> m1Var, fa.h<T> hVar, k2<fa.h<T>> k2Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f71489g = m1Var;
            this.f71490h = hVar;
            this.f71491j = k2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p0 p0Var, float f15, m1 m1Var, fa.h hVar, float f16, float f17) {
            ju.k.d(p0Var, null, null, new a(f16, f15, m1Var, hVar, null), 3, null);
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (u0.m1.C(r4, r5, null, r11, 2, null) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
        
            if (u0.e2.m(r4, r3, 0.0f, r1, r5, r11, 4, null) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.o.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f71489g, this.f71490h, this.f71491j, eVar);
            bVar.f71488f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f71497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k2<fa.h<T>> f71498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SnapshotStateMap<oq.r<mr.c<?>, Object>, fa.h<T>> f71499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o0<oq.r<mr.c<?>, Object>> f71500h;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k2<fa.h<T>> f71501a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ SnapshotStateMap<oq.r<mr.c<?>, Object>, fa.h<T>> f71502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ o0<oq.r<mr.c<?>, Object>> f71503c;

            a(k2<fa.h<T>> k2Var, SnapshotStateMap<oq.r<mr.c<?>, Object>, fa.h<T>> snapshotStateMap, o0<oq.r<mr.c<?>, Object>> o0Var) {
                this.f71501a = k2Var;
                this.f71502b = snapshotStateMap;
                this.f71503c = o0Var;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0094 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:23:0x0096 A[LOOP:1: B:11:0x0053->B:23:0x0096, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:32:0x0099 A[EDGE_INSN: B:32:0x0099->B:24:0x0099 BREAK  A[LOOP:1: B:11:0x0053->B:23:0x0096], SYNTHETIC] */
            public final Object a(boolean z15, tq.e<? super i0> eVar) {
                oq.r rVarA = y.a(q0.c(this.f71501a.w().getClass()), this.f71501a.w().getKey());
                List<oq.r> listF1 = v.f1(this.f71502b.keySet());
                SnapshotStateMap<oq.r<mr.c<?>, Object>, fa.h<T>> snapshotStateMap = this.f71502b;
                for (oq.r rVar : listF1) {
                    if (!fr.t.c(rVar, rVarA)) {
                        snapshotStateMap.remove(rVar);
                    }
                }
                o0<oq.r<mr.c<?>, Object>> o0Var = this.f71503c;
                long[] jArr = o0Var.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j15 = jArr[i15];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i15 != length) {
                                break;
                                break;
                            }
                            i15++;
                        } else {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((255 & j15) < 128) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj = o0Var.keys[i18];
                                    float f15 = o0Var.values[i18];
                                    if (!fr.t.c((oq.r) obj, rVarA)) {
                                        o0Var.m(i18);
                                    }
                                }
                                j15 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                            if (i15 != length) {
                                break;
                            }
                            i15++;
                        }
                    }
                }
                return i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements mu.g<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f71504a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f71505a;

                /* JADX INFO: renamed from: ga.o$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class C1629a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f71506d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f71507e;

                    public C1629a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f71506d = obj;
                        this.f71507e |= PKIFailureInfo.systemUnavail;
                        return a.this.F(null, this);
                    }
                }

                public a(mu.h hVar) {
                    this.f71505a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C1629a c1629a;
                    if (eVar instanceof C1629a) {
                        c1629a = (C1629a) eVar;
                        int i15 = c1629a.f71507e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c1629a.f71507e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c1629a = new C1629a(eVar);
                        }
                    } else {
                        c1629a = new C1629a(eVar);
                    }
                    Object obj2 = c1629a.f71506d;
                    Object objE = uq.b.e();
                    int i16 = c1629a.f71507e;
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        mu.h hVar = this.f71505a;
                        if (!((Boolean) obj).booleanValue()) {
                            c1629a.f71507e = 1;
                            if (hVar.F(obj, c1629a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return i0.f148189a;
                }
            }

            public b(mu.g gVar) {
                this.f71504a = gVar;
            }

            @Override // mu.g
            public Object a(mu.h<? super Boolean> hVar, tq.e eVar) {
                Object objA = this.f71504a.a(new a(hVar), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k2<fa.h<T>> k2Var, SnapshotStateMap<oq.r<mr.c<?>, Object>, fa.h<T>> snapshotStateMap, o0<oq.r<mr.c<?>, Object>> o0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f71498f = k2Var;
            this.f71499g = snapshotStateMap;
            this.f71500h = o0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(k2 k2Var) {
            return k2Var.A();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f71497e;
            if (i15 == 0) {
                oq.u.b(obj);
                final k2<fa.h<T>> k2Var = this.f71498f;
                b bVar = new b(x5.q(new er.a() { // from class: ga.q
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(o.c.O(k2Var));
                    }
                }));
                a aVar = new a(this.f71498f, this.f71499g, this.f71500h);
                this.f71497e = 1;
                if (bVar.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f71498f, this.f71499g, this.f71500h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f71509a;

        public d(o0 o0Var) {
            this.f71509a = o0Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Float.valueOf(this.f71509a.b(((Map.Entry) t16).getKey())), Float.valueOf(this.f71509a.b(((Map.Entry) t15).getKey())));
        }
    }

    private static final <T> boolean A(List<? extends T> list, List<? extends T> list2) {
        Integer next;
        int iIntValue;
        if (!fr.t.c(v.l0(list), v.l0(list2)) || list2.size() > list.size()) {
            return false;
        }
        Iterator<Integer> it = v.o(list2).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            iIntValue = next.intValue();
        } while (fr.t.c(list2.get(iIntValue), list.get(iIntValue)));
        return next == null && list2.size() != list.size();
    }

    private static final <T> er.p<p114t0.h<fa.h<T>>, Integer, p114t0.v> B(fa.h<T> hVar) {
        Object obj = hVar.e().get("predictivePopTransitionSpec");
        if (w0.o(obj, 2)) {
            return (er.p) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x013c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:146:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x0229 A[LOOP:0: B:149:0x0223->B:151:0x0229, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0252 A[LOOP:1: B:153:0x024c->B:155:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0270  */
    /* JADX WARN: Code duplicated, block: B:161:0x0283  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x032c  */
    /* JADX WARN: Code duplicated, block: B:181:0x033b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0370 A[LOOP:3: B:182:0x036a->B:184:0x0370, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x038a  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:196:0x03dc A[LOOP:6: B:194:0x03d6->B:196:0x03dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:207:0x043c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0443  */
    /* JADX WARN: Code duplicated, block: B:210:0x044b  */
    /* JADX WARN: Code duplicated, block: B:212:0x045b  */
    /* JADX WARN: Code duplicated, block: B:214:0x047b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0483  */
    /* JADX WARN: Code duplicated, block: B:219:0x0496  */
    /* JADX WARN: Code duplicated, block: B:221:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:223:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:225:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:237:0x050a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0510  */
    /* JADX WARN: Code duplicated, block: B:245:0x0524  */
    /* JADX WARN: Code duplicated, block: B:247:0x052a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0538  */
    /* JADX WARN: Code duplicated, block: B:257:0x0548  */
    /* JADX WARN: Code duplicated, block: B:260:0x057a  */
    /* JADX WARN: Code duplicated, block: B:262:0x0582  */
    /* JADX WARN: Code duplicated, block: B:265:0x0599  */
    /* JADX WARN: Code duplicated, block: B:268:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:270:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:273:0x0602 A[LOOP:2: B:273:0x0602->B:276:0x0641, LOOP_START, PHI: r0 r31
      0x0602: PHI (r0v47 int) = (r0v45 int), (r0v52 int) binds: [B:272:0x0600, B:276:0x0641] A[DONT_GENERATE, DONT_INLINE]
      0x0602: PHI (r31v1 java.util.List<fa.g<T>>) = (r31v0 java.util.List<fa.g<T>>), (r31v2 java.util.List<fa.g<T>>) binds: [B:272:0x0600, B:276:0x0641] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x0641 A[LOOP:2: B:273:0x0602->B:276:0x0641, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x064b  */
    /* JADX WARN: Code duplicated, block: B:281:0x065a  */
    /* JADX WARN: Code duplicated, block: B:283:0x0660  */
    /* JADX WARN: Code duplicated, block: B:285:0x0666  */
    /* JADX WARN: Code duplicated, block: B:288:0x0679  */
    /* JADX WARN: Code duplicated, block: B:292:0x0645 A[EDGE_INSN: B:292:0x0645->B:277:0x0645 BREAK  A[LOOP:2: B:273:0x0602->B:276:0x0641], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void l(final SceneState<T> sceneState, final x<SceneInfo<T>> xVar, f3.m mVar, f3.c cVar, y0 y0Var, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar2, er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar, p076m2.r rVar, final int i15, final int i16) {
        x<SceneInfo<T>> xVar2;
        f3.m mVar2;
        int i17;
        f3.c cVarO;
        int i18;
        int i19;
        y0 y0Var2;
        int i25;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarF;
        er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar2;
        boolean z15;
        p076m2.r rVar2;
        final f3.m mVar3;
        final f3.c cVar2;
        final y0 y0Var3;
        final er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar3;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar3;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar4;
        d5 d5VarM;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarD;
        er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVarE;
        int i26;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar5;
        y0 y0Var4;
        fa.h<T> hVarA;
        Object objE;
        p076m2.r.Companion companion;
        m1 m1Var;
        final k2 k2VarT;
        boolean zW;
        Object objE2;
        fa.h hVar;
        ha.j jVarE;
        boolean z16;
        boolean z17;
        boolean z18;
        float progress;
        float f15;
        int swipeEdge;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        Iterator<T> it4;
        final boolean zA;
        Object objE3;
        p076m2.r.Companion companion2;
        SnapshotStateMap snapshotStateMap;
        Object objE4;
        o0 o0Var;
        oq.r rVarA;
        final y0 y0Var5;
        oq.r rVarA2;
        int iA;
        float f16;
        float f17;
        float f18;
        List<fa.g<T>> list;
        boolean zW2;
        Object objE5;
        Map mapC;
        ArrayList arrayList3;
        ArrayList<fa.h> arrayList4;
        Iterator<T> it5;
        List listL0;
        LinkedHashSet linkedHashSet;
        int size;
        int i27;
        ArrayList arrayList5;
        Iterator<T> it6;
        ArrayList arrayList6;
        final Map map;
        fa.h hVar2;
        boolean zG;
        Object objE6;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar6;
        boolean zA2;
        Object objE7;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar7;
        final er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar4;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar8;
        final er.l lVar9;
        final float f19;
        boolean zW3;
        Object objE8;
        Object objE9;
        p076m2.r.Companion companion3;
        boolean zW4;
        Object objE10;
        int size2;
        int i28;
        List<fa.g<T>> list2;
        boolean zG2;
        Object objE11;
        int i29;
        int i35;
        p076m2.r rVarH = rVar.h(-303833701);
        int i36 = (i15 & 6) == 0 ? (rVarH.W(sceneState) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            xVar2 = xVar;
            i36 |= rVarH.W(xVar2) ? 32 : 16;
        } else {
            xVar2 = xVar;
        }
        int i37 = i16 & 4;
        if (i37 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i36 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i17 = i16 & 8;
            if (i17 != 0) {
                if ((i15 & 3072) == 0) {
                    cVarO = cVar;
                    if (rVarH.W(cVarO)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i36 |= i18;
                }
                i19 = i16 & 16;
                if (i19 != 0) {
                    if ((i15 & 24576) == 0) {
                        y0Var2 = y0Var;
                        if (rVarH.G(y0Var2)) {
                            i25 = 16384;
                        } else {
                            i25 = PKIFailureInfo.certRevoked;
                        }
                        i36 |= i25;
                    }
                    if ((i15 & 196608) == 0) {
                        if ((i16 & 32) == 0) {
                            lVarF = lVar;
                            if (rVarH.G(lVarF)) {
                                i35 = PKIFailureInfo.unsupportedVersion;
                            }
                            i36 |= i35;
                        } else {
                            lVarF = lVar;
                        }
                        i35 = PKIFailureInfo.notAuthorized;
                        i36 |= i35;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 64) == 0 || !rVarH.G(lVar2)) {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i29 = PKIFailureInfo.badCertTemplate;
                        }
                        i36 |= i29;
                    }
                    if ((i15 & 12582912) == 0) {
                        if ((i16 & 128) == 0) {
                            pVar2 = pVar;
                            int i38 = rVarH.G(pVar2) ? 8388608 : 4194304;
                            i36 |= i38;
                        } else {
                            pVar2 = pVar;
                        }
                        i36 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    if ((i36 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i36 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i17 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if (i19 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 32) != 0) {
                                i36 &= -458753;
                                lVarF = ga.c.f();
                            }
                            if ((i16 & 64) != 0) {
                                lVarD = ga.c.d();
                                i36 &= -3670017;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 128) != 0) {
                                pVarE = ga.c.e();
                                i26 = i36 & (-29360129);
                            } else {
                                pVarE = pVar2;
                                i26 = i36;
                            }
                            lVar5 = lVarD;
                            y0Var4 = y0Var2;
                        } else {
                            rVarH.O();
                            if ((i16 & 32) != 0) {
                                i36 &= -458753;
                            }
                            if ((i16 & 64) != 0) {
                                i36 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                i36 &= -29360129;
                            }
                            mVar2 = mVar2;
                            y0Var4 = y0Var2;
                            pVarE = pVar2;
                            i26 = i36;
                            cVarO = cVarO;
                            lVar5 = lVar2;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                        }
                        hVarA = sceneState.a();
                        objE = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = new m1(hVarA);
                            rVarH.v(objE);
                        }
                        m1Var = (m1) objE;
                        k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                        zW = rVarH.W((fa.h) k2VarT.p());
                        objE2 = rVarH.E();
                        if (zW || objE2 == companion.a()) {
                            objE2 = v.f1(sceneState.b());
                            rVarH.v(objE2);
                        }
                        List list3 = (List) objE2;
                        hVar = (fa.h) v.z0(sceneState.d());
                        jVarE = xVar2.e();
                        z16 = jVarE instanceof ha.j.InProgress;
                        if (z16 || hVar == null) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        z18 = jVarE instanceof ha.j.b;
                        if (z18) {
                            progress = 0.0f;
                        } else {
                            if (z16 != 0) {
                                throw new oq.p();
                            }
                            progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                        }
                        f15 = progress;
                        if (z18) {
                            swipeEdge = 2;
                        } else {
                            if (z16) {
                                throw new oq.p();
                            }
                            swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                        }
                        List list4 = list3;
                        f3.m mVar4 = mVar2;
                        f3.c cVar3 = cVarO;
                        arrayList = new ArrayList(v.y(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((NavEntry) it.next()).getContentKey());
                        }
                        List<NavEntry<T>> listB = sceneState.b();
                        int i39 = i26;
                        arrayList2 = new ArrayList(v.y(listB, 10));
                        it4 = listB.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((NavEntry) it4.next()).getContentKey());
                        }
                        zA = A(arrayList, arrayList2);
                        objE3 = rVarH.E();
                        companion2 = p076m2.r.INSTANCE;
                        if (objE3 == companion2.a()) {
                            objE3 = x5.h();
                            rVarH.v(objE3);
                        }
                        snapshotStateMap = (SnapshotStateMap) objE3;
                        objE4 = rVarH.E();
                        if (objE4 == companion2.a()) {
                            objE4 = x0.a();
                            rVarH.v(objE4);
                        }
                        o0Var = (o0) objE4;
                        rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                        y0Var5 = y0Var4;
                        rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                        iA = o0Var.a(rVarA);
                        if (iA >= 0) {
                            f16 = o0Var.values[iA];
                        } else {
                            f16 = 0.0f;
                            o0Var.o(rVarA, 0.0f);
                        }
                        if (fr.t.c(rVarA, rVarA2)) {
                            f17 = f16;
                            f18 = f17;
                        } else {
                            if (!zA || z17) {
                                f17 = f16 - 1.0f;
                            } else {
                                f17 = 1.0f + f16;
                            }
                            f18 = f16;
                        }
                        snapshotStateMap.put(rVarA2, k2VarT.w());
                        o0Var.o(rVarA2, f17);
                        List<fa.g<T>> listC = sceneState.c();
                        list = listC;
                        zW2 = rVarH.W(v.f1(listC)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                        objE5 = rVarH.E();
                        if (zW2 || objE5 == companion2.a()) {
                            mapC = v0.c();
                            arrayList3 = new ArrayList();
                            List listU0 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                            arrayList4 = new ArrayList(v.y(listU0, 10));
                            it5 = listU0.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                            }
                            for (fa.h hVar3 : arrayList4) {
                                if (!arrayList3.contains(hVar3)) {
                                    arrayList3.add(hVar3);
                                }
                            }
                            listL0 = v.L0(list, arrayList3);
                            linkedHashSet = new LinkedHashSet();
                            size = listL0.size();
                            i27 = 0;
                            while (i27 < size) {
                                fa.h hVar4 = (fa.h) listL0.get(i27);
                                List list5 = listL0;
                                List<NavEntry<T>> entries = hVar4.getEntries();
                                int i45 = size;
                                int i46 = i27;
                                arrayList5 = new ArrayList(v.y(entries, 10));
                                it6 = entries.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(((NavEntry) it6.next()).getContentKey());
                                }
                                arrayList6 = new ArrayList();
                                for (T t15 : arrayList5) {
                                    if (!linkedHashSet.contains(t15)) {
                                        arrayList6.add(t15);
                                    }
                                }
                                Set setK1 = v.k1(arrayList6);
                                mapC.put(y.a(q0.c(hVar4.getClass()), hVar4.getKey()), v.j1(linkedHashSet));
                                linkedHashSet.addAll(setK1);
                                i27 = i46 + 1;
                                size = i45;
                                listL0 = list5;
                            }
                            objE5 = v0.b(mapC);
                            rVarH.v(objE5);
                        }
                        map = (Map) objE5;
                        if (f18 >= f17) {
                            hVar2 = (fa.h) k2VarT.p();
                        } else {
                            hVar2 = (fa.h) k2VarT.w();
                        }
                        if (z17) {
                            rVarH.X(-2007902955);
                            if (fr.t.c(k2VarT.p(), hVar)) {
                                rVarH.X(-2038896569);
                            } else {
                                rVarH.X(-2007849325);
                                Float fValueOf = Float.valueOf(f15);
                                zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                                objE11 = rVarH.E();
                                if (zG2 || objE11 == p076m2.r.INSTANCE.a()) {
                                    objE11 = new a(m1Var, f15, hVar, null);
                                    rVarH.v(objE11);
                                }
                                Function0.e(hVar, fValueOf, (er.p) objE11, rVarH, 0);
                            }
                            rVarH.R();
                            rVarH.R();
                        } else {
                            rVarH.X(-2007567752);
                            zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                            objE6 = rVarH.E();
                            if (zG || objE6 == p076m2.r.INSTANCE.a()) {
                                objE6 = new b(m1Var, hVarA, k2VarT, null);
                                rVarH.v(objE6);
                            }
                            Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                            rVarH.R();
                        }
                        lVar6 = lVarF;
                        zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i39 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i39 & 12582912) == 8388608) | rVarH.a(zA) | ((((i39 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i39 & 1572864) == 1048576) | ((((i39 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i39 & 196608) == 131072);
                        objE7 = rVarH.E();
                        if (!zA2 || objE7 == p076m2.r.INSTANCE.a()) {
                            final fa.h hVar5 = hVar2;
                            final int i47 = swipeEdge;
                            lVar7 = lVar5;
                            final boolean z19 = z17;
                            pVar4 = pVarE;
                            lVar8 = lVar6;
                            objE7 = new er.l() { // from class: ga.i
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return o.p(z19, hVar5, i47, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                                }
                            };
                            rVarH.v(objE7);
                        } else {
                            lVar7 = lVar5;
                            pVar4 = pVarE;
                            lVar8 = lVar6;
                        }
                        lVar9 = (er.l) objE7;
                        f19 = f17;
                        zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                        objE8 = rVarH.E();
                        if (zW3 || objE8 == p076m2.r.INSTANCE.a()) {
                            objE8 = new er.l() { // from class: ga.j
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                                }
                            };
                            rVarH.v(objE8);
                        }
                        er.l lVar10 = (er.l) objE8;
                        objE9 = rVarH.E();
                        companion3 = p076m2.r.INSTANCE;
                        if (objE9 == companion3.a()) {
                            objE9 = new er.l() { // from class: ga.k
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return o.r((fa.h) obj);
                                }
                            };
                            rVarH.v(objE9);
                        }
                        p114t0.d.b(k2VarT, mVar4, lVar10, cVar3, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                            @Override // er.r
                            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                                return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                            }
                        }, rVarH, 54), rVarH, ((i39 >> 3) & 112) | 221184 | (i39 & 7168), 0);
                        zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                        objE10 = rVarH.E();
                        if (zW4 || objE10 == companion3.a()) {
                            objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                            rVarH.v(objE10);
                        }
                        Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                        size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                i28 = size2 - 1;
                                list2 = list;
                                final fa.g<T> gVar = list2.get(size2);
                                d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar.getClass()), gVar.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return o.u(gVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, c4.f122821i | 48);
                                if (i28 < 0) {
                                    break;
                                }
                                size2 = i28;
                                list = list2;
                            }
                        }
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        y0Var3 = y0Var5;
                        rVar2 = rVarH;
                        mVar3 = mVar4;
                        cVar2 = cVar3;
                        pVar3 = pVar4;
                        lVar4 = lVar7;
                        lVar3 = lVar8;
                    } else {
                        rVarH.O();
                        rVar2 = rVarH;
                        mVar3 = mVar2;
                        cVar2 = cVarO;
                        y0Var3 = y0Var2;
                        pVar3 = pVar2;
                        lVar3 = lVarF;
                        lVar4 = lVar2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: ga.n
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i36 |= 24576;
                y0Var2 = y0Var;
                if ((i15 & 196608) == 0) {
                    if ((i16 & 32) == 0) {
                        lVarF = lVar;
                        if (rVarH.G(lVarF)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        }
                        i36 |= i35;
                    } else {
                        lVarF = lVar;
                    }
                    i35 = PKIFailureInfo.notAuthorized;
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i36 |= i29;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i16 & 128) == 0) {
                        pVar2 = pVar;
                        if (rVarH.G(pVar2)) {
                        }
                        i36 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                if ((i36 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                    }
                    hVarA = sceneState.a();
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new m1(hVarA);
                        rVarH.v(objE);
                    }
                    m1Var = (m1) objE;
                    k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                    zW = rVarH.W((fa.h) k2VarT.p());
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    } else {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    }
                    List list6 = (List) objE2;
                    hVar = (fa.h) v.z0(sceneState.d());
                    jVarE = xVar2.e();
                    z16 = jVarE instanceof ha.j.InProgress;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    z18 = jVarE instanceof ha.j.b;
                    if (z18) {
                        progress = 0.0f;
                    } else {
                        if (z16 != 0) {
                            throw new oq.p();
                        }
                        progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                    }
                    f15 = progress;
                    if (z18) {
                        swipeEdge = 2;
                    } else {
                        if (z16) {
                            throw new oq.p();
                        }
                        swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                    }
                    List list7 = list6;
                    f3.m mVar5 = mVar2;
                    f3.c cVar4 = cVarO;
                    arrayList = new ArrayList(v.y(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NavEntry) it.next()).getContentKey());
                    }
                    List<NavEntry<T>> listB2 = sceneState.b();
                    int i310 = i26;
                    arrayList2 = new ArrayList(v.y(listB2, 10));
                    it4 = listB2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((NavEntry) it4.next()).getContentKey());
                    }
                    zA = A(arrayList, arrayList2);
                    objE3 = rVarH.E();
                    companion2 = p076m2.r.INSTANCE;
                    if (objE3 == companion2.a()) {
                        objE3 = x5.h();
                        rVarH.v(objE3);
                    }
                    snapshotStateMap = (SnapshotStateMap) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion2.a()) {
                        objE4 = x0.a();
                        rVarH.v(objE4);
                    }
                    o0Var = (o0) objE4;
                    rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                    y0Var5 = y0Var4;
                    rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                    iA = o0Var.a(rVarA);
                    if (iA >= 0) {
                        f16 = o0Var.values[iA];
                    } else {
                        f16 = 0.0f;
                        o0Var.o(rVarA, 0.0f);
                    }
                    if (fr.t.c(rVarA, rVarA2)) {
                        f17 = f16;
                        f18 = f17;
                    } else {
                        if (zA) {
                            f17 = f16 - 1.0f;
                        } else {
                            f17 = f16 - 1.0f;
                        }
                        f18 = f16;
                    }
                    snapshotStateMap.put(rVarA2, k2VarT.w());
                    o0Var.o(rVarA2, f17);
                    List<fa.g<T>> listC2 = sceneState.c();
                    list = listC2;
                    zW2 = rVarH.W(v.f1(listC2)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                    objE5 = rVarH.E();
                    if (zW2) {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU1 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU1, 10));
                        it5 = listU1.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar6 = (fa.h) listL0.get(i27);
                            List list8 = listL0;
                            List<NavEntry<T>> entries2 = hVar6.getEntries();
                            int i48 = size;
                            int i49 = i27;
                            arrayList5 = new ArrayList(v.y(entries2, 10));
                            it6 = entries2.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK2 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar6.getClass()), hVar6.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK2);
                            i27 = i49 + 1;
                            size = i48;
                            listL0 = list8;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    } else {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU2 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU2, 10));
                        it5 = listU2.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar7 = (fa.h) listL0.get(i27);
                            List list9 = listL0;
                            List<NavEntry<T>> entries3 = hVar7.getEntries();
                            int i410 = size;
                            int i411 = i27;
                            arrayList5 = new ArrayList(v.y(entries3, 10));
                            it6 = entries3.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK3 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar7.getClass()), hVar7.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK3);
                            i27 = i411 + 1;
                            size = i410;
                            listL0 = list9;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    }
                    map = (Map) objE5;
                    if (f18 >= f17) {
                        hVar2 = (fa.h) k2VarT.p();
                    } else {
                        hVar2 = (fa.h) k2VarT.w();
                    }
                    if (z17) {
                        rVarH.X(-2007902955);
                        if (fr.t.c(k2VarT.p(), hVar)) {
                            rVarH.X(-2007849325);
                            Float fValueOf2 = Float.valueOf(f15);
                            zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                            objE11 = rVarH.E();
                            if (zG2) {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            } else {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            }
                            Function0.e(hVar, fValueOf2, (er.p) objE11, rVarH, 0);
                        } else {
                            rVarH.X(-2038896569);
                        }
                        rVarH.R();
                        rVarH.R();
                    } else {
                        rVarH.X(-2007567752);
                        zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                        objE6 = rVarH.E();
                        if (zG) {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        }
                        Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                        rVarH.R();
                    }
                    lVar6 = lVarF;
                    zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i310 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i310 & 12582912) == 8388608) | rVarH.a(zA) | ((((i310 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i310 & 1572864) == 1048576) | ((((i310 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i310 & 196608) == 131072);
                    objE7 = rVarH.E();
                    if (zA2) {
                        final fa.h hVar8 = hVar2;
                        final int i412 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z110 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z110, hVar8, i412, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        final fa.h hVar9 = hVar2;
                        final int i413 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z111 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z111, hVar9, i413, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    lVar9 = (er.l) objE7;
                    f19 = f17;
                    zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                    objE8 = rVarH.E();
                    if (zW3) {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    } else {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    }
                    er.l lVar11 = (er.l) objE8;
                    objE9 = rVarH.E();
                    companion3 = p076m2.r.INSTANCE;
                    if (objE9 == companion3.a()) {
                        objE9 = new er.l() { // from class: ga.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.r((fa.h) obj);
                            }
                        };
                        rVarH.v(objE9);
                    }
                    p114t0.d.b(k2VarT, mVar5, lVar11, cVar4, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                        @Override // er.r
                        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                            return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                        }
                    }, rVarH, 54), rVarH, ((i310 >> 3) & 112) | 221184 | (i310 & 7168), 0);
                    zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                    objE10 = rVarH.E();
                    if (zW4) {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    } else {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    }
                    Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                    size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            i28 = size2 - 1;
                            list2 = list;
                            final fa.g gVar2 = list2.get(size2);
                            d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar2.getClass()), gVar2.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return o.u(gVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (i28 < 0) {
                                break;
                                break;
                            } else {
                                size2 = i28;
                                list = list2;
                            }
                        }
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    y0Var3 = y0Var5;
                    rVar2 = rVarH;
                    mVar3 = mVar5;
                    cVar2 = cVar4;
                    pVar3 = pVar4;
                    lVar4 = lVar7;
                    lVar3 = lVar8;
                } else {
                    rVarH.O();
                    rVar2 = rVarH;
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    y0Var3 = y0Var2;
                    pVar3 = pVar2;
                    lVar3 = lVarF;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ga.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i36 |= 3072;
            cVarO = cVar;
            i19 = i16 & 16;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    y0Var2 = y0Var;
                    if (rVarH.G(y0Var2)) {
                        i25 = 16384;
                    } else {
                        i25 = PKIFailureInfo.certRevoked;
                    }
                    i36 |= i25;
                }
                if ((i15 & 196608) == 0) {
                    if ((i16 & 32) == 0) {
                        lVarF = lVar;
                        if (rVarH.G(lVarF)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        }
                        i36 |= i35;
                    } else {
                        lVarF = lVar;
                    }
                    i35 = PKIFailureInfo.notAuthorized;
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i36 |= i29;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i16 & 128) == 0) {
                        pVar2 = pVar;
                        if (rVarH.G(pVar2)) {
                        }
                        i36 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                if ((i36 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                    }
                    hVarA = sceneState.a();
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new m1(hVarA);
                        rVarH.v(objE);
                    }
                    m1Var = (m1) objE;
                    k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                    zW = rVarH.W((fa.h) k2VarT.p());
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    } else {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    }
                    List list10 = (List) objE2;
                    hVar = (fa.h) v.z0(sceneState.d());
                    jVarE = xVar2.e();
                    z16 = jVarE instanceof ha.j.InProgress;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    z18 = jVarE instanceof ha.j.b;
                    if (z18) {
                        progress = 0.0f;
                    } else {
                        if (z16 != 0) {
                            throw new oq.p();
                        }
                        progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                    }
                    f15 = progress;
                    if (z18) {
                        swipeEdge = 2;
                    } else {
                        if (z16) {
                            throw new oq.p();
                        }
                        swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                    }
                    List list11 = list10;
                    f3.m mVar6 = mVar2;
                    f3.c cVar5 = cVarO;
                    arrayList = new ArrayList(v.y(list11, 10));
                    it = list11.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NavEntry) it.next()).getContentKey());
                    }
                    List<NavEntry<T>> listB3 = sceneState.b();
                    int i311 = i26;
                    arrayList2 = new ArrayList(v.y(listB3, 10));
                    it4 = listB3.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((NavEntry) it4.next()).getContentKey());
                    }
                    zA = A(arrayList, arrayList2);
                    objE3 = rVarH.E();
                    companion2 = p076m2.r.INSTANCE;
                    if (objE3 == companion2.a()) {
                        objE3 = x5.h();
                        rVarH.v(objE3);
                    }
                    snapshotStateMap = (SnapshotStateMap) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion2.a()) {
                        objE4 = x0.a();
                        rVarH.v(objE4);
                    }
                    o0Var = (o0) objE4;
                    rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                    y0Var5 = y0Var4;
                    rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                    iA = o0Var.a(rVarA);
                    if (iA >= 0) {
                        f16 = o0Var.values[iA];
                    } else {
                        f16 = 0.0f;
                        o0Var.o(rVarA, 0.0f);
                    }
                    if (fr.t.c(rVarA, rVarA2)) {
                        f17 = f16;
                        f18 = f17;
                    } else {
                        if (zA) {
                            f17 = f16 - 1.0f;
                        } else {
                            f17 = f16 - 1.0f;
                        }
                        f18 = f16;
                    }
                    snapshotStateMap.put(rVarA2, k2VarT.w());
                    o0Var.o(rVarA2, f17);
                    List<fa.g<T>> listC3 = sceneState.c();
                    list = listC3;
                    zW2 = rVarH.W(v.f1(listC3)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                    objE5 = rVarH.E();
                    if (zW2) {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU3 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU3, 10));
                        it5 = listU3.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar10 = (fa.h) listL0.get(i27);
                            List list12 = listL0;
                            List<NavEntry<T>> entries4 = hVar10.getEntries();
                            int i414 = size;
                            int i415 = i27;
                            arrayList5 = new ArrayList(v.y(entries4, 10));
                            it6 = entries4.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK4 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar10.getClass()), hVar10.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK4);
                            i27 = i415 + 1;
                            size = i414;
                            listL0 = list12;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    } else {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU4 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU4, 10));
                        it5 = listU4.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar11 = (fa.h) listL0.get(i27);
                            List list13 = listL0;
                            List<NavEntry<T>> entries5 = hVar11.getEntries();
                            int i416 = size;
                            int i417 = i27;
                            arrayList5 = new ArrayList(v.y(entries5, 10));
                            it6 = entries5.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK5 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar11.getClass()), hVar11.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK5);
                            i27 = i417 + 1;
                            size = i416;
                            listL0 = list13;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    }
                    map = (Map) objE5;
                    if (f18 >= f17) {
                        hVar2 = (fa.h) k2VarT.p();
                    } else {
                        hVar2 = (fa.h) k2VarT.w();
                    }
                    if (z17) {
                        rVarH.X(-2007902955);
                        if (fr.t.c(k2VarT.p(), hVar)) {
                            rVarH.X(-2007849325);
                            Float fValueOf3 = Float.valueOf(f15);
                            zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                            objE11 = rVarH.E();
                            if (zG2) {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            } else {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            }
                            Function0.e(hVar, fValueOf3, (er.p) objE11, rVarH, 0);
                        } else {
                            rVarH.X(-2038896569);
                        }
                        rVarH.R();
                        rVarH.R();
                    } else {
                        rVarH.X(-2007567752);
                        zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                        objE6 = rVarH.E();
                        if (zG) {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        }
                        Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                        rVarH.R();
                    }
                    lVar6 = lVarF;
                    zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i311 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i311 & 12582912) == 8388608) | rVarH.a(zA) | ((((i311 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i311 & 1572864) == 1048576) | ((((i311 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i311 & 196608) == 131072);
                    objE7 = rVarH.E();
                    if (zA2) {
                        final fa.h hVar12 = hVar2;
                        final int i418 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z112 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z112, hVar12, i418, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        final fa.h hVar13 = hVar2;
                        final int i419 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z113 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z113, hVar13, i419, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    lVar9 = (er.l) objE7;
                    f19 = f17;
                    zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                    objE8 = rVarH.E();
                    if (zW3) {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    } else {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    }
                    er.l lVar12 = (er.l) objE8;
                    objE9 = rVarH.E();
                    companion3 = p076m2.r.INSTANCE;
                    if (objE9 == companion3.a()) {
                        objE9 = new er.l() { // from class: ga.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.r((fa.h) obj);
                            }
                        };
                        rVarH.v(objE9);
                    }
                    p114t0.d.b(k2VarT, mVar6, lVar12, cVar5, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                        @Override // er.r
                        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                            return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                        }
                    }, rVarH, 54), rVarH, ((i311 >> 3) & 112) | 221184 | (i311 & 7168), 0);
                    zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                    objE10 = rVarH.E();
                    if (zW4) {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    } else {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    }
                    Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                    size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            i28 = size2 - 1;
                            list2 = list;
                            final fa.g gVar3 = list2.get(size2);
                            d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar3.getClass()), gVar3.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return o.u(gVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (i28 < 0) {
                                break;
                                break;
                            } else {
                                size2 = i28;
                                list = list2;
                            }
                        }
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    y0Var3 = y0Var5;
                    rVar2 = rVarH;
                    mVar3 = mVar6;
                    cVar2 = cVar5;
                    pVar3 = pVar4;
                    lVar4 = lVar7;
                    lVar3 = lVar8;
                } else {
                    rVarH.O();
                    rVar2 = rVarH;
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    y0Var3 = y0Var2;
                    pVar3 = pVar2;
                    lVar3 = lVarF;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ga.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i36 |= 24576;
            y0Var2 = y0Var;
            if ((i15 & 196608) == 0) {
                if ((i16 & 32) == 0) {
                    lVarF = lVar;
                    if (rVarH.G(lVarF)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    }
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                i35 = PKIFailureInfo.notAuthorized;
                i36 |= i35;
            } else {
                lVarF = lVar;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i29 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i36 |= i29;
            }
            if ((i15 & 12582912) == 0) {
                if ((i16 & 128) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i36 |= i38;
            } else {
                pVar2 = pVar;
            }
            if ((i36 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                }
                hVarA = sceneState.a();
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new m1(hVarA);
                    rVarH.v(objE);
                }
                m1Var = (m1) objE;
                k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                zW = rVarH.W((fa.h) k2VarT.p());
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                } else {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                }
                List list14 = (List) objE2;
                hVar = (fa.h) v.z0(sceneState.d());
                jVarE = xVar2.e();
                z16 = jVarE instanceof ha.j.InProgress;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                z18 = jVarE instanceof ha.j.b;
                if (z18) {
                    progress = 0.0f;
                } else {
                    if (z16 != 0) {
                        throw new oq.p();
                    }
                    progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                }
                f15 = progress;
                if (z18) {
                    swipeEdge = 2;
                } else {
                    if (z16) {
                        throw new oq.p();
                    }
                    swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                }
                List list15 = list14;
                f3.m mVar7 = mVar2;
                f3.c cVar6 = cVarO;
                arrayList = new ArrayList(v.y(list15, 10));
                it = list15.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NavEntry) it.next()).getContentKey());
                }
                List<NavEntry<T>> listB4 = sceneState.b();
                int i312 = i26;
                arrayList2 = new ArrayList(v.y(listB4, 10));
                it4 = listB4.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((NavEntry) it4.next()).getContentKey());
                }
                zA = A(arrayList, arrayList2);
                objE3 = rVarH.E();
                companion2 = p076m2.r.INSTANCE;
                if (objE3 == companion2.a()) {
                    objE3 = x5.h();
                    rVarH.v(objE3);
                }
                snapshotStateMap = (SnapshotStateMap) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion2.a()) {
                    objE4 = x0.a();
                    rVarH.v(objE4);
                }
                o0Var = (o0) objE4;
                rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                y0Var5 = y0Var4;
                rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                iA = o0Var.a(rVarA);
                if (iA >= 0) {
                    f16 = o0Var.values[iA];
                } else {
                    f16 = 0.0f;
                    o0Var.o(rVarA, 0.0f);
                }
                if (fr.t.c(rVarA, rVarA2)) {
                    f17 = f16;
                    f18 = f17;
                } else {
                    if (zA) {
                        f17 = f16 - 1.0f;
                    } else {
                        f17 = f16 - 1.0f;
                    }
                    f18 = f16;
                }
                snapshotStateMap.put(rVarA2, k2VarT.w());
                o0Var.o(rVarA2, f17);
                List<fa.g<T>> listC4 = sceneState.c();
                list = listC4;
                zW2 = rVarH.W(v.f1(listC4)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                objE5 = rVarH.E();
                if (zW2) {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU5 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU5, 10));
                    it5 = listU5.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar14 = (fa.h) listL0.get(i27);
                        List list16 = listL0;
                        List<NavEntry<T>> entries6 = hVar14.getEntries();
                        int i4110 = size;
                        int i4111 = i27;
                        arrayList5 = new ArrayList(v.y(entries6, 10));
                        it6 = entries6.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK6 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar14.getClass()), hVar14.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK6);
                        i27 = i4111 + 1;
                        size = i4110;
                        listL0 = list16;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                } else {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU6 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU6, 10));
                    it5 = listU6.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar15 = (fa.h) listL0.get(i27);
                        List list17 = listL0;
                        List<NavEntry<T>> entries7 = hVar15.getEntries();
                        int i4112 = size;
                        int i4113 = i27;
                        arrayList5 = new ArrayList(v.y(entries7, 10));
                        it6 = entries7.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK7 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar15.getClass()), hVar15.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK7);
                        i27 = i4113 + 1;
                        size = i4112;
                        listL0 = list17;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                }
                map = (Map) objE5;
                if (f18 >= f17) {
                    hVar2 = (fa.h) k2VarT.p();
                } else {
                    hVar2 = (fa.h) k2VarT.w();
                }
                if (z17) {
                    rVarH.X(-2007902955);
                    if (fr.t.c(k2VarT.p(), hVar)) {
                        rVarH.X(-2007849325);
                        Float fValueOf4 = Float.valueOf(f15);
                        zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                        objE11 = rVarH.E();
                        if (zG2) {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        } else {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        }
                        Function0.e(hVar, fValueOf4, (er.p) objE11, rVarH, 0);
                    } else {
                        rVarH.X(-2038896569);
                    }
                    rVarH.R();
                    rVarH.R();
                } else {
                    rVarH.X(-2007567752);
                    zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                    objE6 = rVarH.E();
                    if (zG) {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    }
                    Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                    rVarH.R();
                }
                lVar6 = lVarF;
                zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i312 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i312 & 12582912) == 8388608) | rVarH.a(zA) | ((((i312 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i312 & 1572864) == 1048576) | ((((i312 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i312 & 196608) == 131072);
                objE7 = rVarH.E();
                if (zA2) {
                    final fa.h hVar16 = hVar2;
                    final int i4114 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z114 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z114, hVar16, i4114, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    final fa.h hVar17 = hVar2;
                    final int i4115 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z115 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z115, hVar17, i4115, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                lVar9 = (er.l) objE7;
                f19 = f17;
                zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                objE8 = rVarH.E();
                if (zW3) {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                } else {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                }
                er.l lVar13 = (er.l) objE8;
                objE9 = rVarH.E();
                companion3 = p076m2.r.INSTANCE;
                if (objE9 == companion3.a()) {
                    objE9 = new er.l() { // from class: ga.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.r((fa.h) obj);
                        }
                    };
                    rVarH.v(objE9);
                }
                p114t0.d.b(k2VarT, mVar7, lVar13, cVar6, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                    @Override // er.r
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                    }
                }, rVarH, 54), rVarH, ((i312 >> 3) & 112) | 221184 | (i312 & 7168), 0);
                zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                objE10 = rVarH.E();
                if (zW4) {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                } else {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                }
                Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        i28 = size2 - 1;
                        list2 = list;
                        final fa.g gVar4 = list2.get(size2);
                        d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar4.getClass()), gVar4.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.u(gVar4, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (i28 < 0) {
                            break;
                            break;
                        } else {
                            size2 = i28;
                            list = list2;
                        }
                    }
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                y0Var3 = y0Var5;
                rVar2 = rVarH;
                mVar3 = mVar7;
                cVar2 = cVar6;
                pVar3 = pVar4;
                lVar4 = lVar7;
                lVar3 = lVar8;
            } else {
                rVarH.O();
                rVar2 = rVarH;
                mVar3 = mVar2;
                cVar2 = cVarO;
                y0Var3 = y0Var2;
                pVar3 = pVar2;
                lVar3 = lVarF;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ga.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i36 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i17 = i16 & 8;
        if (i17 != 0) {
            if ((i15 & 3072) == 0) {
                cVarO = cVar;
                if (rVarH.W(cVarO)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i36 |= i18;
            }
            i19 = i16 & 16;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    y0Var2 = y0Var;
                    if (rVarH.G(y0Var2)) {
                        i25 = 16384;
                    } else {
                        i25 = PKIFailureInfo.certRevoked;
                    }
                    i36 |= i25;
                }
                if ((i15 & 196608) == 0) {
                    if ((i16 & 32) == 0) {
                        lVarF = lVar;
                        if (rVarH.G(lVarF)) {
                            i35 = PKIFailureInfo.unsupportedVersion;
                        }
                        i36 |= i35;
                    } else {
                        lVarF = lVar;
                    }
                    i35 = PKIFailureInfo.notAuthorized;
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i36 |= i29;
                }
                if ((i15 & 12582912) == 0) {
                    if ((i16 & 128) == 0) {
                        pVar2 = pVar;
                        if (rVarH.G(pVar2)) {
                        }
                        i36 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                if ((i36 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i36 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i17 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if (i19 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 32) != 0) {
                            i36 &= -458753;
                            lVarF = ga.c.f();
                        }
                        if ((i16 & 64) != 0) {
                            lVarD = ga.c.d();
                            i36 &= -3670017;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 128) != 0) {
                            pVarE = ga.c.e();
                            i26 = i36 & (-29360129);
                        } else {
                            pVarE = pVar2;
                            i26 = i36;
                        }
                        lVar5 = lVarD;
                        y0Var4 = y0Var2;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                    }
                    hVarA = sceneState.a();
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = new m1(hVarA);
                        rVarH.v(objE);
                    }
                    m1Var = (m1) objE;
                    k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                    zW = rVarH.W((fa.h) k2VarT.p());
                    objE2 = rVarH.E();
                    if (zW) {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    } else {
                        objE2 = v.f1(sceneState.b());
                        rVarH.v(objE2);
                    }
                    List list18 = (List) objE2;
                    hVar = (fa.h) v.z0(sceneState.d());
                    jVarE = xVar2.e();
                    z16 = jVarE instanceof ha.j.InProgress;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    z18 = jVarE instanceof ha.j.b;
                    if (z18) {
                        progress = 0.0f;
                    } else {
                        if (z16 != 0) {
                            throw new oq.p();
                        }
                        progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                    }
                    f15 = progress;
                    if (z18) {
                        swipeEdge = 2;
                    } else {
                        if (z16) {
                            throw new oq.p();
                        }
                        swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                    }
                    List list19 = list18;
                    f3.m mVar8 = mVar2;
                    f3.c cVar7 = cVarO;
                    arrayList = new ArrayList(v.y(list19, 10));
                    it = list19.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((NavEntry) it.next()).getContentKey());
                    }
                    List<NavEntry<T>> listB5 = sceneState.b();
                    int i313 = i26;
                    arrayList2 = new ArrayList(v.y(listB5, 10));
                    it4 = listB5.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((NavEntry) it4.next()).getContentKey());
                    }
                    zA = A(arrayList, arrayList2);
                    objE3 = rVarH.E();
                    companion2 = p076m2.r.INSTANCE;
                    if (objE3 == companion2.a()) {
                        objE3 = x5.h();
                        rVarH.v(objE3);
                    }
                    snapshotStateMap = (SnapshotStateMap) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion2.a()) {
                        objE4 = x0.a();
                        rVarH.v(objE4);
                    }
                    o0Var = (o0) objE4;
                    rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                    y0Var5 = y0Var4;
                    rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                    iA = o0Var.a(rVarA);
                    if (iA >= 0) {
                        f16 = o0Var.values[iA];
                    } else {
                        f16 = 0.0f;
                        o0Var.o(rVarA, 0.0f);
                    }
                    if (fr.t.c(rVarA, rVarA2)) {
                        f17 = f16;
                        f18 = f17;
                    } else {
                        if (zA) {
                            f17 = f16 - 1.0f;
                        } else {
                            f17 = f16 - 1.0f;
                        }
                        f18 = f16;
                    }
                    snapshotStateMap.put(rVarA2, k2VarT.w());
                    o0Var.o(rVarA2, f17);
                    List<fa.g<T>> listC5 = sceneState.c();
                    list = listC5;
                    zW2 = rVarH.W(v.f1(listC5)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                    objE5 = rVarH.E();
                    if (zW2) {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU7 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU7, 10));
                        it5 = listU7.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar18 = (fa.h) listL0.get(i27);
                            List list110 = listL0;
                            List<NavEntry<T>> entries8 = hVar18.getEntries();
                            int i4116 = size;
                            int i4117 = i27;
                            arrayList5 = new ArrayList(v.y(entries8, 10));
                            it6 = entries8.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK8 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar18.getClass()), hVar18.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK8);
                            i27 = i4117 + 1;
                            size = i4116;
                            listL0 = list110;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    } else {
                        mapC = v0.c();
                        arrayList3 = new ArrayList();
                        List listU8 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                        arrayList4 = new ArrayList(v.y(listU8, 10));
                        it5 = listU8.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                        }
                        while (r10.hasNext()) {
                            if (!arrayList3.contains(hVar3)) {
                                arrayList3.add(hVar3);
                            }
                        }
                        listL0 = v.L0(list, arrayList3);
                        linkedHashSet = new LinkedHashSet();
                        size = listL0.size();
                        i27 = 0;
                        while (i27 < size) {
                            fa.h hVar19 = (fa.h) listL0.get(i27);
                            List list111 = listL0;
                            List<NavEntry<T>> entries9 = hVar19.getEntries();
                            int i4118 = size;
                            int i4119 = i27;
                            arrayList5 = new ArrayList(v.y(entries9, 10));
                            it6 = entries9.iterator();
                            while (it6.hasNext()) {
                                arrayList5.add(((NavEntry) it6.next()).getContentKey());
                            }
                            arrayList6 = new ArrayList();
                            while (r12.hasNext()) {
                                if (!linkedHashSet.contains(t15)) {
                                    arrayList6.add(t15);
                                }
                            }
                            Set setK9 = v.k1(arrayList6);
                            mapC.put(y.a(q0.c(hVar19.getClass()), hVar19.getKey()), v.j1(linkedHashSet));
                            linkedHashSet.addAll(setK9);
                            i27 = i4119 + 1;
                            size = i4118;
                            listL0 = list111;
                        }
                        objE5 = v0.b(mapC);
                        rVarH.v(objE5);
                    }
                    map = (Map) objE5;
                    if (f18 >= f17) {
                        hVar2 = (fa.h) k2VarT.p();
                    } else {
                        hVar2 = (fa.h) k2VarT.w();
                    }
                    if (z17) {
                        rVarH.X(-2007902955);
                        if (fr.t.c(k2VarT.p(), hVar)) {
                            rVarH.X(-2007849325);
                            Float fValueOf5 = Float.valueOf(f15);
                            zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                            objE11 = rVarH.E();
                            if (zG2) {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            } else {
                                objE11 = new a(m1Var, f15, hVar, null);
                                rVarH.v(objE11);
                            }
                            Function0.e(hVar, fValueOf5, (er.p) objE11, rVarH, 0);
                        } else {
                            rVarH.X(-2038896569);
                        }
                        rVarH.R();
                        rVarH.R();
                    } else {
                        rVarH.X(-2007567752);
                        zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                        objE6 = rVarH.E();
                        if (zG) {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new b(m1Var, hVarA, k2VarT, null);
                            rVarH.v(objE6);
                        }
                        Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                        rVarH.R();
                    }
                    lVar6 = lVarF;
                    zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i313 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i313 & 12582912) == 8388608) | rVarH.a(zA) | ((((i313 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i313 & 1572864) == 1048576) | ((((i313 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i313 & 196608) == 131072);
                    objE7 = rVarH.E();
                    if (zA2) {
                        final fa.h hVar110 = hVar2;
                        final int i41110 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z116 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z116, hVar110, i41110, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    } else {
                        final fa.h hVar111 = hVar2;
                        final int i41111 = swipeEdge;
                        lVar7 = lVar5;
                        final boolean z117 = z17;
                        pVar4 = pVarE;
                        lVar8 = lVar6;
                        objE7 = new er.l() { // from class: ga.i
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.p(z117, hVar111, i41111, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE7);
                    }
                    lVar9 = (er.l) objE7;
                    f19 = f17;
                    zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                    objE8 = rVarH.E();
                    if (zW3) {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    } else {
                        objE8 = new er.l() { // from class: ga.j
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                            }
                        };
                        rVarH.v(objE8);
                    }
                    er.l lVar14 = (er.l) objE8;
                    objE9 = rVarH.E();
                    companion3 = p076m2.r.INSTANCE;
                    if (objE9 == companion3.a()) {
                        objE9 = new er.l() { // from class: ga.k
                            @Override // er.l
                            public final Object b(Object obj) {
                                return o.r((fa.h) obj);
                            }
                        };
                        rVarH.v(objE9);
                    }
                    p114t0.d.b(k2VarT, mVar8, lVar14, cVar7, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                        @Override // er.r
                        public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                            return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                        }
                    }, rVarH, 54), rVarH, ((i313 >> 3) & 112) | 221184 | (i313 & 7168), 0);
                    zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                    objE10 = rVarH.E();
                    if (zW4) {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    } else {
                        objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                        rVarH.v(objE10);
                    }
                    Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                    size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            i28 = size2 - 1;
                            list2 = list;
                            final fa.g gVar5 = list2.get(size2);
                            d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar5.getClass()), gVar5.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return o.u(gVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (i28 < 0) {
                                break;
                                break;
                            } else {
                                size2 = i28;
                                list = list2;
                            }
                        }
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    y0Var3 = y0Var5;
                    rVar2 = rVarH;
                    mVar3 = mVar8;
                    cVar2 = cVar7;
                    pVar3 = pVar4;
                    lVar4 = lVar7;
                    lVar3 = lVar8;
                } else {
                    rVarH.O();
                    rVar2 = rVarH;
                    mVar3 = mVar2;
                    cVar2 = cVarO;
                    y0Var3 = y0Var2;
                    pVar3 = pVar2;
                    lVar3 = lVarF;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: ga.n
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i36 |= 24576;
            y0Var2 = y0Var;
            if ((i15 & 196608) == 0) {
                if ((i16 & 32) == 0) {
                    lVarF = lVar;
                    if (rVarH.G(lVarF)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    }
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                i35 = PKIFailureInfo.notAuthorized;
                i36 |= i35;
            } else {
                lVarF = lVar;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i29 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i36 |= i29;
            }
            if ((i15 & 12582912) == 0) {
                if ((i16 & 128) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i36 |= i38;
            } else {
                pVar2 = pVar;
            }
            if ((i36 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                }
                hVarA = sceneState.a();
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new m1(hVarA);
                    rVarH.v(objE);
                }
                m1Var = (m1) objE;
                k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                zW = rVarH.W((fa.h) k2VarT.p());
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                } else {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                }
                List list112 = (List) objE2;
                hVar = (fa.h) v.z0(sceneState.d());
                jVarE = xVar2.e();
                z16 = jVarE instanceof ha.j.InProgress;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                z18 = jVarE instanceof ha.j.b;
                if (z18) {
                    progress = 0.0f;
                } else {
                    if (z16 != 0) {
                        throw new oq.p();
                    }
                    progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                }
                f15 = progress;
                if (z18) {
                    swipeEdge = 2;
                } else {
                    if (z16) {
                        throw new oq.p();
                    }
                    swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                }
                List list113 = list112;
                f3.m mVar9 = mVar2;
                f3.c cVar8 = cVarO;
                arrayList = new ArrayList(v.y(list113, 10));
                it = list113.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NavEntry) it.next()).getContentKey());
                }
                List<NavEntry<T>> listB6 = sceneState.b();
                int i314 = i26;
                arrayList2 = new ArrayList(v.y(listB6, 10));
                it4 = listB6.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((NavEntry) it4.next()).getContentKey());
                }
                zA = A(arrayList, arrayList2);
                objE3 = rVarH.E();
                companion2 = p076m2.r.INSTANCE;
                if (objE3 == companion2.a()) {
                    objE3 = x5.h();
                    rVarH.v(objE3);
                }
                snapshotStateMap = (SnapshotStateMap) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion2.a()) {
                    objE4 = x0.a();
                    rVarH.v(objE4);
                }
                o0Var = (o0) objE4;
                rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                y0Var5 = y0Var4;
                rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                iA = o0Var.a(rVarA);
                if (iA >= 0) {
                    f16 = o0Var.values[iA];
                } else {
                    f16 = 0.0f;
                    o0Var.o(rVarA, 0.0f);
                }
                if (fr.t.c(rVarA, rVarA2)) {
                    f17 = f16;
                    f18 = f17;
                } else {
                    if (zA) {
                        f17 = f16 - 1.0f;
                    } else {
                        f17 = f16 - 1.0f;
                    }
                    f18 = f16;
                }
                snapshotStateMap.put(rVarA2, k2VarT.w());
                o0Var.o(rVarA2, f17);
                List<fa.g<T>> listC6 = sceneState.c();
                list = listC6;
                zW2 = rVarH.W(v.f1(listC6)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                objE5 = rVarH.E();
                if (zW2) {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU9 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU9, 10));
                    it5 = listU9.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar112 = (fa.h) listL0.get(i27);
                        List list114 = listL0;
                        List<NavEntry<T>> entries10 = hVar112.getEntries();
                        int i41112 = size;
                        int i41113 = i27;
                        arrayList5 = new ArrayList(v.y(entries10, 10));
                        it6 = entries10.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK10 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar112.getClass()), hVar112.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK10);
                        i27 = i41113 + 1;
                        size = i41112;
                        listL0 = list114;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                } else {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU10 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU10, 10));
                    it5 = listU10.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar113 = (fa.h) listL0.get(i27);
                        List list115 = listL0;
                        List<NavEntry<T>> entries11 = hVar113.getEntries();
                        int i41114 = size;
                        int i41115 = i27;
                        arrayList5 = new ArrayList(v.y(entries11, 10));
                        it6 = entries11.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK11 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar113.getClass()), hVar113.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK11);
                        i27 = i41115 + 1;
                        size = i41114;
                        listL0 = list115;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                }
                map = (Map) objE5;
                if (f18 >= f17) {
                    hVar2 = (fa.h) k2VarT.p();
                } else {
                    hVar2 = (fa.h) k2VarT.w();
                }
                if (z17) {
                    rVarH.X(-2007902955);
                    if (fr.t.c(k2VarT.p(), hVar)) {
                        rVarH.X(-2007849325);
                        Float fValueOf6 = Float.valueOf(f15);
                        zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                        objE11 = rVarH.E();
                        if (zG2) {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        } else {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        }
                        Function0.e(hVar, fValueOf6, (er.p) objE11, rVarH, 0);
                    } else {
                        rVarH.X(-2038896569);
                    }
                    rVarH.R();
                    rVarH.R();
                } else {
                    rVarH.X(-2007567752);
                    zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                    objE6 = rVarH.E();
                    if (zG) {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    }
                    Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                    rVarH.R();
                }
                lVar6 = lVarF;
                zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i314 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i314 & 12582912) == 8388608) | rVarH.a(zA) | ((((i314 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i314 & 1572864) == 1048576) | ((((i314 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i314 & 196608) == 131072);
                objE7 = rVarH.E();
                if (zA2) {
                    final fa.h hVar114 = hVar2;
                    final int i41116 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z118 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z118, hVar114, i41116, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    final fa.h hVar115 = hVar2;
                    final int i41117 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z119 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z119, hVar115, i41117, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                lVar9 = (er.l) objE7;
                f19 = f17;
                zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                objE8 = rVarH.E();
                if (zW3) {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                } else {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                }
                er.l lVar15 = (er.l) objE8;
                objE9 = rVarH.E();
                companion3 = p076m2.r.INSTANCE;
                if (objE9 == companion3.a()) {
                    objE9 = new er.l() { // from class: ga.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.r((fa.h) obj);
                        }
                    };
                    rVarH.v(objE9);
                }
                p114t0.d.b(k2VarT, mVar9, lVar15, cVar8, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                    @Override // er.r
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                    }
                }, rVarH, 54), rVarH, ((i314 >> 3) & 112) | 221184 | (i314 & 7168), 0);
                zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                objE10 = rVarH.E();
                if (zW4) {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                } else {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                }
                Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        i28 = size2 - 1;
                        list2 = list;
                        final fa.g gVar6 = list2.get(size2);
                        d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar6.getClass()), gVar6.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.u(gVar6, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (i28 < 0) {
                            break;
                            break;
                        } else {
                            size2 = i28;
                            list = list2;
                        }
                    }
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                y0Var3 = y0Var5;
                rVar2 = rVarH;
                mVar3 = mVar9;
                cVar2 = cVar8;
                pVar3 = pVar4;
                lVar4 = lVar7;
                lVar3 = lVar8;
            } else {
                rVarH.O();
                rVar2 = rVarH;
                mVar3 = mVar2;
                cVar2 = cVarO;
                y0Var3 = y0Var2;
                pVar3 = pVar2;
                lVar3 = lVarF;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ga.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i36 |= 3072;
        cVarO = cVar;
        i19 = i16 & 16;
        if (i19 != 0) {
            if ((i15 & 24576) == 0) {
                y0Var2 = y0Var;
                if (rVarH.G(y0Var2)) {
                    i25 = 16384;
                } else {
                    i25 = PKIFailureInfo.certRevoked;
                }
                i36 |= i25;
            }
            if ((i15 & 196608) == 0) {
                if ((i16 & 32) == 0) {
                    lVarF = lVar;
                    if (rVarH.G(lVarF)) {
                        i35 = PKIFailureInfo.unsupportedVersion;
                    }
                    i36 |= i35;
                } else {
                    lVarF = lVar;
                }
                i35 = PKIFailureInfo.notAuthorized;
                i36 |= i35;
            } else {
                lVarF = lVar;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i29 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i36 |= i29;
            }
            if ((i15 & 12582912) == 0) {
                if ((i16 & 128) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                    }
                    i36 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i36 |= i38;
            } else {
                pVar2 = pVar;
            }
            if ((i36 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i36 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i17 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if (i19 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 32) != 0) {
                        i36 &= -458753;
                        lVarF = ga.c.f();
                    }
                    if ((i16 & 64) != 0) {
                        lVarD = ga.c.d();
                        i36 &= -3670017;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 128) != 0) {
                        pVarE = ga.c.e();
                        i26 = i36 & (-29360129);
                    } else {
                        pVarE = pVar2;
                        i26 = i36;
                    }
                    lVar5 = lVarD;
                    y0Var4 = y0Var2;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
                }
                hVarA = sceneState.a();
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new m1(hVarA);
                    rVarH.v(objE);
                }
                m1Var = (m1) objE;
                k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
                zW = rVarH.W((fa.h) k2VarT.p());
                objE2 = rVarH.E();
                if (zW) {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                } else {
                    objE2 = v.f1(sceneState.b());
                    rVarH.v(objE2);
                }
                List list116 = (List) objE2;
                hVar = (fa.h) v.z0(sceneState.d());
                jVarE = xVar2.e();
                z16 = jVarE instanceof ha.j.InProgress;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                z18 = jVarE instanceof ha.j.b;
                if (z18) {
                    progress = 0.0f;
                } else {
                    if (z16 != 0) {
                        throw new oq.p();
                    }
                    progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
                }
                f15 = progress;
                if (z18) {
                    swipeEdge = 2;
                } else {
                    if (z16) {
                        throw new oq.p();
                    }
                    swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
                }
                List list117 = list116;
                f3.m mVar10 = mVar2;
                f3.c cVar9 = cVarO;
                arrayList = new ArrayList(v.y(list117, 10));
                it = list117.iterator();
                while (it.hasNext()) {
                    arrayList.add(((NavEntry) it.next()).getContentKey());
                }
                List<NavEntry<T>> listB7 = sceneState.b();
                int i315 = i26;
                arrayList2 = new ArrayList(v.y(listB7, 10));
                it4 = listB7.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((NavEntry) it4.next()).getContentKey());
                }
                zA = A(arrayList, arrayList2);
                objE3 = rVarH.E();
                companion2 = p076m2.r.INSTANCE;
                if (objE3 == companion2.a()) {
                    objE3 = x5.h();
                    rVarH.v(objE3);
                }
                snapshotStateMap = (SnapshotStateMap) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion2.a()) {
                    objE4 = x0.a();
                    rVarH.v(objE4);
                }
                o0Var = (o0) objE4;
                rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
                y0Var5 = y0Var4;
                rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
                iA = o0Var.a(rVarA);
                if (iA >= 0) {
                    f16 = o0Var.values[iA];
                } else {
                    f16 = 0.0f;
                    o0Var.o(rVarA, 0.0f);
                }
                if (fr.t.c(rVarA, rVarA2)) {
                    f17 = f16;
                    f18 = f17;
                } else {
                    if (zA) {
                        f17 = f16 - 1.0f;
                    } else {
                        f17 = f16 - 1.0f;
                    }
                    f18 = f16;
                }
                snapshotStateMap.put(rVarA2, k2VarT.w());
                o0Var.o(rVarA2, f17);
                List<fa.g<T>> listC7 = sceneState.c();
                list = listC7;
                zW2 = rVarH.W(v.f1(listC7)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
                objE5 = rVarH.E();
                if (zW2) {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU11 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU11, 10));
                    it5 = listU11.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar116 = (fa.h) listL0.get(i27);
                        List list118 = listL0;
                        List<NavEntry<T>> entries12 = hVar116.getEntries();
                        int i41118 = size;
                        int i41119 = i27;
                        arrayList5 = new ArrayList(v.y(entries12, 10));
                        it6 = entries12.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK12 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar116.getClass()), hVar116.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK12);
                        i27 = i41119 + 1;
                        size = i41118;
                        listL0 = list118;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                } else {
                    mapC = v0.c();
                    arrayList3 = new ArrayList();
                    List listU12 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                    arrayList4 = new ArrayList(v.y(listU12, 10));
                    it5 = listU12.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                    }
                    while (r10.hasNext()) {
                        if (!arrayList3.contains(hVar3)) {
                            arrayList3.add(hVar3);
                        }
                    }
                    listL0 = v.L0(list, arrayList3);
                    linkedHashSet = new LinkedHashSet();
                    size = listL0.size();
                    i27 = 0;
                    while (i27 < size) {
                        fa.h hVar117 = (fa.h) listL0.get(i27);
                        List list119 = listL0;
                        List<NavEntry<T>> entries13 = hVar117.getEntries();
                        int i411110 = size;
                        int i411111 = i27;
                        arrayList5 = new ArrayList(v.y(entries13, 10));
                        it6 = entries13.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((NavEntry) it6.next()).getContentKey());
                        }
                        arrayList6 = new ArrayList();
                        while (r12.hasNext()) {
                            if (!linkedHashSet.contains(t15)) {
                                arrayList6.add(t15);
                            }
                        }
                        Set setK13 = v.k1(arrayList6);
                        mapC.put(y.a(q0.c(hVar117.getClass()), hVar117.getKey()), v.j1(linkedHashSet));
                        linkedHashSet.addAll(setK13);
                        i27 = i411111 + 1;
                        size = i411110;
                        listL0 = list119;
                    }
                    objE5 = v0.b(mapC);
                    rVarH.v(objE5);
                }
                map = (Map) objE5;
                if (f18 >= f17) {
                    hVar2 = (fa.h) k2VarT.p();
                } else {
                    hVar2 = (fa.h) k2VarT.w();
                }
                if (z17) {
                    rVarH.X(-2007902955);
                    if (fr.t.c(k2VarT.p(), hVar)) {
                        rVarH.X(-2007849325);
                        Float fValueOf7 = Float.valueOf(f15);
                        zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                        objE11 = rVarH.E();
                        if (zG2) {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        } else {
                            objE11 = new a(m1Var, f15, hVar, null);
                            rVarH.v(objE11);
                        }
                        Function0.e(hVar, fValueOf7, (er.p) objE11, rVarH, 0);
                    } else {
                        rVarH.X(-2038896569);
                    }
                    rVarH.R();
                    rVarH.R();
                } else {
                    rVarH.X(-2007567752);
                    zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                    objE6 = rVarH.E();
                    if (zG) {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new b(m1Var, hVarA, k2VarT, null);
                        rVarH.v(objE6);
                    }
                    Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                    rVarH.R();
                }
                lVar6 = lVarF;
                zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i315 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i315 & 12582912) == 8388608) | rVarH.a(zA) | ((((i315 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i315 & 1572864) == 1048576) | ((((i315 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i315 & 196608) == 131072);
                objE7 = rVarH.E();
                if (zA2) {
                    final fa.h hVar118 = hVar2;
                    final int i411112 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z1110 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z1110, hVar118, i411112, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                } else {
                    final fa.h hVar119 = hVar2;
                    final int i411113 = swipeEdge;
                    lVar7 = lVar5;
                    final boolean z1111 = z17;
                    pVar4 = pVarE;
                    lVar8 = lVar6;
                    objE7 = new er.l() { // from class: ga.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.p(z1111, hVar119, i411113, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE7);
                }
                lVar9 = (er.l) objE7;
                f19 = f17;
                zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
                objE8 = rVarH.E();
                if (zW3) {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                } else {
                    objE8 = new er.l() { // from class: ga.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                        }
                    };
                    rVarH.v(objE8);
                }
                er.l lVar16 = (er.l) objE8;
                objE9 = rVarH.E();
                companion3 = p076m2.r.INSTANCE;
                if (objE9 == companion3.a()) {
                    objE9 = new er.l() { // from class: ga.k
                        @Override // er.l
                        public final Object b(Object obj) {
                            return o.r((fa.h) obj);
                        }
                    };
                    rVarH.v(objE9);
                }
                p114t0.d.b(k2VarT, mVar10, lVar16, cVar9, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                    @Override // er.r
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                    }
                }, rVarH, 54), rVarH, ((i315 >> 3) & 112) | 221184 | (i315 & 7168), 0);
                zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
                objE10 = rVarH.E();
                if (zW4) {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                } else {
                    objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                    rVarH.v(objE10);
                }
                Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
                size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        i28 = size2 - 1;
                        list2 = list;
                        final fa.g gVar7 = list2.get(size2);
                        d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar7.getClass()), gVar7.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.u(gVar7, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (i28 < 0) {
                            break;
                            break;
                        } else {
                            size2 = i28;
                            list = list2;
                        }
                    }
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                y0Var3 = y0Var5;
                rVar2 = rVarH;
                mVar3 = mVar10;
                cVar2 = cVar9;
                pVar3 = pVar4;
                lVar4 = lVar7;
                lVar3 = lVar8;
            } else {
                rVarH.O();
                rVar2 = rVarH;
                mVar3 = mVar2;
                cVar2 = cVarO;
                y0Var3 = y0Var2;
                pVar3 = pVar2;
                lVar3 = lVarF;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ga.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i36 |= 24576;
        y0Var2 = y0Var;
        if ((i15 & 196608) == 0) {
            if ((i16 & 32) == 0) {
                lVarF = lVar;
                if (rVarH.G(lVarF)) {
                    i35 = PKIFailureInfo.unsupportedVersion;
                }
                i36 |= i35;
            } else {
                lVarF = lVar;
            }
            i35 = PKIFailureInfo.notAuthorized;
            i36 |= i35;
        } else {
            lVarF = lVar;
        }
        if ((i15 & 1572864) != 0) {
            if ((i16 & 64) == 0) {
                i29 = PKIFailureInfo.signerNotTrusted;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i36 |= i29;
        }
        if ((i15 & 12582912) == 0) {
            if ((i16 & 128) == 0) {
                pVar2 = pVar;
                if (rVarH.G(pVar2)) {
                }
                i36 |= i38;
            } else {
                pVar2 = pVar;
            }
            i36 |= i38;
        } else {
            pVar2 = pVar;
        }
        if ((i36 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i36 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i17 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i19 != 0) {
                    y0Var2 = null;
                }
                if ((i16 & 32) != 0) {
                    i36 &= -458753;
                    lVarF = ga.c.f();
                }
                if ((i16 & 64) != 0) {
                    lVarD = ga.c.d();
                    i36 &= -3670017;
                } else {
                    lVarD = lVar2;
                }
                if ((i16 & 128) != 0) {
                    pVarE = ga.c.e();
                    i26 = i36 & (-29360129);
                } else {
                    pVarE = pVar2;
                    i26 = i36;
                }
                lVar5 = lVarD;
                y0Var4 = y0Var2;
            } else {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i17 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if (i19 != 0) {
                    y0Var2 = null;
                }
                if ((i16 & 32) != 0) {
                    i36 &= -458753;
                    lVarF = ga.c.f();
                }
                if ((i16 & 64) != 0) {
                    lVarD = ga.c.d();
                    i36 &= -3670017;
                } else {
                    lVarD = lVar2;
                }
                if ((i16 & 128) != 0) {
                    pVarE = ga.c.e();
                    i26 = i36 & (-29360129);
                } else {
                    pVarE = pVar2;
                    i26 = i36;
                }
                lVar5 = lVarD;
                y0Var4 = y0Var2;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-303833701, i26, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:533)");
            }
            hVarA = sceneState.a();
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new m1(hVarA);
                rVarH.v(objE);
            }
            m1Var = (m1) objE;
            k2VarT = v2.t(m1Var, "scene", rVarH, m1.f193725t | 48, 0);
            zW = rVarH.W((fa.h) k2VarT.p());
            objE2 = rVarH.E();
            if (zW) {
                objE2 = v.f1(sceneState.b());
                rVarH.v(objE2);
            } else {
                objE2 = v.f1(sceneState.b());
                rVarH.v(objE2);
            }
            List list1110 = (List) objE2;
            hVar = (fa.h) v.z0(sceneState.d());
            jVarE = xVar2.e();
            z16 = jVarE instanceof ha.j.InProgress;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            z18 = jVarE instanceof ha.j.b;
            if (z18) {
                progress = 0.0f;
            } else {
                if (z16 != 0) {
                    throw new oq.p();
                }
                progress = ((ha.j.InProgress) jVarE).getLatestEvent().getProgress();
            }
            f15 = progress;
            if (z18) {
                swipeEdge = 2;
            } else {
                if (z16) {
                    throw new oq.p();
                }
                swipeEdge = ((ha.j.InProgress) jVarE).getLatestEvent().getSwipeEdge();
            }
            List list1111 = list1110;
            f3.m mVar11 = mVar2;
            f3.c cVar10 = cVarO;
            arrayList = new ArrayList(v.y(list1111, 10));
            it = list1111.iterator();
            while (it.hasNext()) {
                arrayList.add(((NavEntry) it.next()).getContentKey());
            }
            List<NavEntry<T>> listB8 = sceneState.b();
            int i316 = i26;
            arrayList2 = new ArrayList(v.y(listB8, 10));
            it4 = listB8.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((NavEntry) it4.next()).getContentKey());
            }
            zA = A(arrayList, arrayList2);
            objE3 = rVarH.E();
            companion2 = p076m2.r.INSTANCE;
            if (objE3 == companion2.a()) {
                objE3 = x5.h();
                rVarH.v(objE3);
            }
            snapshotStateMap = (SnapshotStateMap) objE3;
            objE4 = rVarH.E();
            if (objE4 == companion2.a()) {
                objE4 = x0.a();
                rVarH.v(objE4);
            }
            o0Var = (o0) objE4;
            rVarA = y.a(q0.c(k2VarT.p().getClass()), ((fa.h) k2VarT.p()).getKey());
            y0Var5 = y0Var4;
            rVarA2 = y.a(q0.c(k2VarT.w().getClass()), ((fa.h) k2VarT.w()).getKey());
            iA = o0Var.a(rVarA);
            if (iA >= 0) {
                f16 = o0Var.values[iA];
            } else {
                f16 = 0.0f;
                o0Var.o(rVarA, 0.0f);
            }
            if (fr.t.c(rVarA, rVarA2)) {
                f17 = f16;
                f18 = f17;
            } else {
                if (zA) {
                    f17 = f16 - 1.0f;
                } else {
                    f17 = f16 - 1.0f;
                }
                f18 = f16;
            }
            snapshotStateMap.put(rVarA2, k2VarT.w());
            o0Var.o(rVarA2, f17);
            List<fa.g<T>> listC8 = sceneState.c();
            list = listC8;
            zW2 = rVarH.W(v.f1(listC8)) | rVarH.W(v.f1(snapshotStateMap.entrySet())) | rVarH.W(o0Var.toString());
            objE5 = rVarH.E();
            if (zW2) {
                mapC = v0.c();
                arrayList3 = new ArrayList();
                List listU13 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                arrayList4 = new ArrayList(v.y(listU13, 10));
                it5 = listU13.iterator();
                while (it5.hasNext()) {
                    arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                }
                while (r10.hasNext()) {
                    if (!arrayList3.contains(hVar3)) {
                        arrayList3.add(hVar3);
                    }
                }
                listL0 = v.L0(list, arrayList3);
                linkedHashSet = new LinkedHashSet();
                size = listL0.size();
                i27 = 0;
                while (i27 < size) {
                    fa.h hVar1110 = (fa.h) listL0.get(i27);
                    List list1112 = listL0;
                    List<NavEntry<T>> entries14 = hVar1110.getEntries();
                    int i411114 = size;
                    int i411115 = i27;
                    arrayList5 = new ArrayList(v.y(entries14, 10));
                    it6 = entries14.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(((NavEntry) it6.next()).getContentKey());
                    }
                    arrayList6 = new ArrayList();
                    while (r12.hasNext()) {
                        if (!linkedHashSet.contains(t15)) {
                            arrayList6.add(t15);
                        }
                    }
                    Set setK14 = v.k1(arrayList6);
                    mapC.put(y.a(q0.c(hVar1110.getClass()), hVar1110.getKey()), v.j1(linkedHashSet));
                    linkedHashSet.addAll(setK14);
                    i27 = i411115 + 1;
                    size = i411114;
                    listL0 = list1112;
                }
                objE5 = v0.b(mapC);
                rVarH.v(objE5);
            } else {
                mapC = v0.c();
                arrayList3 = new ArrayList();
                List listU14 = v.U0(snapshotStateMap.entrySet(), new d(o0Var));
                arrayList4 = new ArrayList(v.y(listU14, 10));
                it5 = listU14.iterator();
                while (it5.hasNext()) {
                    arrayList4.add((fa.h) ((Map.Entry) it5.next()).getValue());
                }
                while (r10.hasNext()) {
                    if (!arrayList3.contains(hVar3)) {
                        arrayList3.add(hVar3);
                    }
                }
                listL0 = v.L0(list, arrayList3);
                linkedHashSet = new LinkedHashSet();
                size = listL0.size();
                i27 = 0;
                while (i27 < size) {
                    fa.h hVar1111 = (fa.h) listL0.get(i27);
                    List list1113 = listL0;
                    List<NavEntry<T>> entries15 = hVar1111.getEntries();
                    int i411116 = size;
                    int i411117 = i27;
                    arrayList5 = new ArrayList(v.y(entries15, 10));
                    it6 = entries15.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(((NavEntry) it6.next()).getContentKey());
                    }
                    arrayList6 = new ArrayList();
                    while (r12.hasNext()) {
                        if (!linkedHashSet.contains(t15)) {
                            arrayList6.add(t15);
                        }
                    }
                    Set setK15 = v.k1(arrayList6);
                    mapC.put(y.a(q0.c(hVar1111.getClass()), hVar1111.getKey()), v.j1(linkedHashSet));
                    linkedHashSet.addAll(setK15);
                    i27 = i411117 + 1;
                    size = i411116;
                    listL0 = list1113;
                }
                objE5 = v0.b(mapC);
                rVarH.v(objE5);
            }
            map = (Map) objE5;
            if (f18 >= f17) {
                hVar2 = (fa.h) k2VarT.p();
            } else {
                hVar2 = (fa.h) k2VarT.w();
            }
            if (z17) {
                rVarH.X(-2007902955);
                if (fr.t.c(k2VarT.p(), hVar)) {
                    rVarH.X(-2007849325);
                    Float fValueOf8 = Float.valueOf(f15);
                    zG2 = rVarH.G(m1Var) | rVarH.b(f15) | rVarH.W(hVar);
                    objE11 = rVarH.E();
                    if (zG2) {
                        objE11 = new a(m1Var, f15, hVar, null);
                        rVarH.v(objE11);
                    } else {
                        objE11 = new a(m1Var, f15, hVar, null);
                        rVarH.v(objE11);
                    }
                    Function0.e(hVar, fValueOf8, (er.p) objE11, rVarH, 0);
                } else {
                    rVarH.X(-2038896569);
                }
                rVarH.R();
                rVarH.R();
            } else {
                rVarH.X(-2007567752);
                zG = rVarH.G(m1Var) | rVarH.W(hVarA) | rVarH.W(k2VarT);
                objE6 = rVarH.E();
                if (zG) {
                    objE6 = new b(m1Var, hVarA, k2VarT, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new b(m1Var, hVarA, k2VarT, null);
                    rVarH.v(objE6);
                }
                Function0.d(hVarA, (er.p) objE6, rVarH, 0);
                rVarH.R();
            }
            lVar6 = lVarF;
            zA2 = rVarH.a(z17) | rVarH.W(hVar2) | rVarH.c(swipeEdge) | ((((i316 & 29360128) ^ 12582912) <= 8388608 && rVarH.W(pVarE)) || (i316 & 12582912) == 8388608) | rVarH.a(zA) | ((((i316 & 3670016) ^ 1572864) <= 1048576 && rVarH.W(lVar5)) || (i316 & 1572864) == 1048576) | ((((i316 & 458752) ^ 196608) <= 131072 && rVarH.W(lVar6)) || (i316 & 196608) == 131072);
            objE7 = rVarH.E();
            if (zA2) {
                final fa.h hVar1112 = hVar2;
                final int i411118 = swipeEdge;
                lVar7 = lVar5;
                final boolean z1112 = z17;
                pVar4 = pVarE;
                lVar8 = lVar6;
                objE7 = new er.l() { // from class: ga.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.p(z1112, hVar1112, i411118, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                    }
                };
                rVarH.v(objE7);
            } else {
                final fa.h hVar1113 = hVar2;
                final int i411119 = swipeEdge;
                lVar7 = lVar5;
                final boolean z1113 = z17;
                pVar4 = pVarE;
                lVar8 = lVar6;
                objE7 = new er.l() { // from class: ga.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.p(z1113, hVar1113, i411119, pVar4, zA, lVar7, lVar8, (p114t0.h) obj);
                    }
                };
                rVarH.v(objE7);
            }
            lVar9 = (er.l) objE7;
            f19 = f17;
            zW3 = rVarH.W(lVar9) | rVarH.b(f19) | rVarH.G(y0Var5);
            objE8 = rVarH.E();
            if (zW3) {
                objE8 = new er.l() { // from class: ga.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                    }
                };
                rVarH.v(objE8);
            } else {
                objE8 = new er.l() { // from class: ga.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.q(lVar9, f19, y0Var5, (p114t0.h) obj);
                    }
                };
                rVarH.v(objE8);
            }
            er.l lVar17 = (er.l) objE8;
            objE9 = rVarH.E();
            companion3 = p076m2.r.INSTANCE;
            if (objE9 == companion3.a()) {
                objE9 = new er.l() { // from class: ga.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.r((fa.h) obj);
                    }
                };
                rVarH.v(objE9);
            }
            p114t0.d.b(k2VarT, mVar11, lVar17, cVar10, (er.l) objE9, y2.m.d(-1167420988, true, new er.r() { // from class: ga.l
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return o.t(k2VarT, map, (p114t0.f) obj, (fa.h) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, ((i316 >> 3) & 112) | 221184 | (i316 & 7168), 0);
            zW4 = rVarH.W(k2VarT) | rVarH.G(o0Var);
            objE10 = rVarH.E();
            if (zW4) {
                objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                rVarH.v(objE10);
            } else {
                objE10 = new c(k2VarT, snapshotStateMap, o0Var, null);
                rVarH.v(objE10);
            }
            Function0.d(k2VarT, (er.p) objE10, rVarH, 0);
            size2 = list.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    i28 = size2 - 1;
                    list2 = list;
                    final fa.g gVar8 = list2.get(size2);
                    d0.c(fa.o.c().d(v0.j(map, y.a(q0.c(gVar8.getClass()), gVar8.getKey()))), y2.m.d(485036444, true, new er.p() { // from class: ga.m
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.u(gVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (i28 < 0) {
                        break;
                        break;
                    } else {
                        size2 = i28;
                        list = list2;
                    }
                }
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            y0Var3 = y0Var5;
            rVar2 = rVarH;
            mVar3 = mVar11;
            cVar2 = cVar10;
            pVar3 = pVar4;
            lVar4 = lVar7;
            lVar3 = lVar8;
        } else {
            rVarH.O();
            rVar2 = rVarH;
            mVar3 = mVar2;
            cVar2 = cVarO;
            y0Var3 = y0Var2;
            pVar3 = pVar2;
            lVar3 = lVarF;
            lVar4 = lVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ga.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.v(sceneState, xVar, mVar3, cVar2, y0Var3, lVar3, lVar4, pVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0124  */
    /* JADX WARN: Code duplicated, block: B:110:0x0128  */
    /* JADX WARN: Code duplicated, block: B:113:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x013a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0144  */
    /* JADX WARN: Code duplicated, block: B:121:0x014a  */
    /* JADX WARN: Code duplicated, block: B:122:0x014d  */
    /* JADX WARN: Code duplicated, block: B:126:0x015b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0164  */
    /* JADX WARN: Code duplicated, block: B:133:0x016d  */
    /* JADX WARN: Code duplicated, block: B:135:0x017a  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:165:0x01db  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:169:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:171:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0201  */
    /* JADX WARN: Code duplicated, block: B:175:0x020e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0213  */
    /* JADX WARN: Code duplicated, block: B:179:0x021a  */
    /* JADX WARN: Code duplicated, block: B:181:0x021e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0221  */
    /* JADX WARN: Code duplicated, block: B:186:0x0226  */
    /* JADX WARN: Code duplicated, block: B:187:0x022f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0235  */
    /* JADX WARN: Code duplicated, block: B:191:0x023e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0244  */
    /* JADX WARN: Code duplicated, block: B:196:0x0266  */
    /* JADX WARN: Code duplicated, block: B:199:0x0284  */
    /* JADX WARN: Code duplicated, block: B:202:0x0292  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:208:0x0300  */
    /* JADX WARN: Code duplicated, block: B:211:0x0318  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    public static final <T> void m(final List<? extends T> list, f3.m mVar, f3.c cVar, er.a<i0> aVar, List<? extends ea.o<T>> list2, fa.s<T> sVar, t0 t0Var, y0 y0Var, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar2, er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar, final er.l<? super T, NavEntry<T>> lVar3, p076m2.r rVar, final int i15, final int i16, final int i17) {
        int i18;
        f3.m mVar2;
        int i19;
        f3.c cVar2;
        int i25;
        er.a<i0> aVar2;
        List<? extends ea.o<T>> list3;
        int i26;
        t0 t0Var2;
        int i27;
        int i28;
        final y0 y0Var2;
        int i29;
        int i35;
        boolean z15;
        p076m2.r rVar2;
        final fa.s<T> sVar2;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar4;
        final t0 t0Var3;
        final f3.m mVar3;
        final f3.c cVar3;
        final er.a<i0> aVar3;
        final List<? extends ea.o<T>> list4;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar5;
        final er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar2;
        d5 d5VarM;
        f3.m mVar4;
        f3.c cVarO;
        er.a<i0> aVar4;
        List<? extends ea.o<T>> listE;
        fa.s<T> a0Var;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarF;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarD;
        int i36;
        er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVarE;
        fa.s<T> sVar3;
        int i37;
        boolean zG;
        Object objE;
        int i38;
        int i39;
        int i45;
        p076m2.r rVarH = rVar.h(-30905885);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        int i46 = i17 & 2;
        if (i46 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i18 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i19 = i17 & 4;
            if (i19 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    cVar2 = cVar;
                    if (rVarH.W(cVar2)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i18 |= i25;
                }
                if ((i15 & 3072) == 0) {
                    if ((i17 & 8) == 0) {
                        aVar2 = aVar;
                        int i47 = rVarH.G(aVar2) ? 2048 : 1024;
                        i18 |= i47;
                    } else {
                        aVar2 = aVar;
                    }
                    i18 |= i47;
                } else {
                    aVar2 = aVar;
                }
                if ((i15 & 24576) == 0) {
                    if ((i17 & 16) == 0) {
                        list3 = list2;
                        if (rVarH.G(list3)) {
                            i45 = 16384;
                        }
                        i18 |= i45;
                    } else {
                        list3 = list2;
                    }
                    i45 = PKIFailureInfo.certRevoked;
                    i18 |= i45;
                } else {
                    list3 = list2;
                }
                if ((i15 & 196608) != 0) {
                    if ((i17 & 32) == 0 || !rVarH.W(sVar)) {
                        i39 = PKIFailureInfo.notAuthorized;
                    } else {
                        i39 = PKIFailureInfo.unsupportedVersion;
                    }
                    i18 |= i39;
                }
                i26 = i17 & 64;
                if (i26 != 0) {
                    i18 |= 1572864;
                    t0Var2 = t0Var;
                } else {
                    t0Var2 = t0Var;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.W(t0Var2)) {
                            i27 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i18 |= i27;
                    }
                }
                i28 = i17 & 128;
                if (i28 != 0) {
                    i18 |= 12582912;
                    y0Var2 = y0Var;
                } else {
                    y0Var2 = y0Var;
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(y0Var2)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i18 |= i29;
                    }
                }
                if ((i15 & 100663296) != 0) {
                    i18 |= ((i17 & 256) == 0 || !rVarH.G(lVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) != 0) {
                    i18 |= ((i17 & 512) == 0 || !rVarH.G(lVar2)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i16 & 6) == 0) {
                    i35 = i16 | (((i17 & 1024) == 0 || !rVarH.G(pVar)) ? 2 : 4);
                } else {
                    i35 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(lVar3)) {
                        i38 = 32;
                    } else {
                        i38 = 16;
                    }
                    i35 |= i38;
                }
                if ((i18 & 306783379) == 306783378 || (i35 & 19) != 18) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i46 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i19 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if ((i17 & 8) != 0) {
                            zG = rVarH.G(list);
                            objE = rVarH.E();
                            if (zG || objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.a() { // from class: ga.d
                                    @Override // er.a
                                    public final Object a() {
                                        return o.o(list);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            aVar4 = (er.a) objE;
                            i18 &= -7169;
                        } else {
                            aVar4 = aVar2;
                        }
                        if ((i17 & 16) != 0) {
                            listE = v.e(ea.v.a(null, rVarH, 0, 1));
                            i18 &= -57345;
                        } else {
                            listE = list3;
                        }
                        if ((i17 & 32) != 0) {
                            a0Var = new a0<>();
                            i18 &= -458753;
                        } else {
                            a0Var = sVar;
                        }
                        if (i26 != 0) {
                            t0Var2 = null;
                        }
                        if (i28 != 0) {
                            y0Var2 = null;
                        }
                        if ((i17 & 256) != 0) {
                            lVarF = ga.c.f();
                            i18 &= -234881025;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i17 & 512) != 0) {
                            lVarD = ga.c.d();
                            i18 &= -1879048193;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i17 & 1024) != 0) {
                            i36 = i35 & (-15);
                            pVarE = ga.c.e();
                        } else {
                            i36 = i35;
                            pVarE = pVar;
                        }
                        sVar3 = a0Var;
                        i37 = -30905885;
                    } else {
                        rVarH.O();
                        if ((i17 & 8) != 0) {
                            i18 &= -7169;
                        }
                        if ((i17 & 16) != 0) {
                            i18 &= -57345;
                        }
                        if ((i17 & 32) != 0) {
                            i18 &= -458753;
                        }
                        if ((i17 & 256) != 0) {
                            i18 &= -234881025;
                        }
                        if ((i17 & 512) != 0) {
                            i18 &= -1879048193;
                        }
                        if ((i17 & 1024) != 0) {
                            i35 &= -15;
                        }
                        sVar3 = sVar;
                        lVarF = lVar;
                        lVarD = lVar2;
                        pVarE = pVar;
                        t0Var2 = t0Var2;
                        y0Var2 = y0Var2;
                        cVarO = cVar2;
                        aVar4 = aVar2;
                        listE = list3;
                        i36 = i35;
                        i37 = -30905885;
                        mVar4 = mVar2;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i37, i18, i36, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:285)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
                    }
                    List listS = ea.f.s(list, listE, lVar3, rVarH, (i18 & 14) | ((i18 >> 9) & 112) | ((i36 << 3) & 896), 0);
                    rVar2 = rVarH;
                    int i48 = i18 >> 6;
                    ga.c.c(listS, mVar4, cVarO, sVar3, t0Var2, y0Var2, lVarF, lVarD, pVarE, aVar4, rVar2, ((i36 << 24) & 234881024) | (i18 & 1008) | (i48 & 7168) | (57344 & i48) | (458752 & i48) | (3670016 & i48) | (i48 & 29360128) | (1879048192 & (i18 << 18)), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    list4 = listE;
                    mVar3 = mVar4;
                    cVar3 = cVarO;
                    sVar2 = sVar3;
                    t0Var3 = t0Var2;
                    y0Var2 = y0Var2;
                    lVar5 = lVarF;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                    aVar3 = aVar4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    sVar2 = sVar;
                    lVar4 = lVar2;
                    t0Var3 = t0Var2;
                    mVar3 = mVar2;
                    cVar3 = cVar2;
                    aVar3 = aVar2;
                    list4 = list3;
                    lVar5 = lVar;
                    pVar2 = pVar;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p(list, mVar3, cVar3, aVar3, list4, sVar2, t0Var3, y0Var2, lVar5, lVar4, pVar2, lVar3, i15, i16, i17) { // from class: ga.f

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71432a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71433b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71434c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ er.a f71435d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ List f71436e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71437f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ y0 f71438g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.l f71439h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.l f71440j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ er.p f71441k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ er.l f71442l;

                        /* JADX INFO: renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ int f71443m;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ int f71444n;

                        /* JADX INFO: renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ int f71445p;

                        {
                            this.f71438g = y0Var2;
                            this.f71439h = lVar5;
                            this.f71440j = lVar4;
                            this.f71441k = pVar2;
                            this.f71442l = lVar3;
                            this.f71443m = i15;
                            this.f71444n = i16;
                            this.f71445p = i17;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.w(this.f71432a, this.f71433b, this.f71434c, this.f71435d, this.f71436e, this.f71437f, null, this.f71438g, this.f71439h, this.f71440j, this.f71441k, this.f71442l, this.f71443m, this.f71444n, this.f71445p, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= MLKEMEngine.KyberPolyBytes;
            cVar2 = cVar;
            if ((i15 & 3072) == 0) {
                if ((i17 & 8) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                    }
                    i18 |= i47;
                } else {
                    aVar2 = aVar;
                }
                i18 |= i47;
            } else {
                aVar2 = aVar;
            }
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    list3 = list2;
                    if (rVarH.G(list3)) {
                        i45 = 16384;
                    }
                    i18 |= i45;
                } else {
                    list3 = list2;
                }
                i45 = PKIFailureInfo.certRevoked;
                i18 |= i45;
            } else {
                list3 = list2;
            }
            if ((i15 & 196608) != 0) {
                if ((i17 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i39;
            }
            i26 = i17 & 64;
            if (i26 != 0) {
                i18 |= 1572864;
                t0Var2 = t0Var;
            } else {
                t0Var2 = t0Var;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.W(t0Var2)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i27;
                }
            }
            i28 = i17 & 128;
            if (i28 != 0) {
                i18 |= 12582912;
                y0Var2 = y0Var;
            } else {
                y0Var2 = y0Var;
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(y0Var2)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i18 |= i29;
                }
            }
            if ((i15 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.G(lVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.G(lVar2)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                i35 = i16 | (((i17 & 1024) == 0 || !rVarH.G(pVar)) ? 2 : 4);
            } else {
                i35 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(lVar3)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if ((i17 & 8) != 0) {
                        zG = rVarH.G(list);
                        objE = rVarH.E();
                        if (zG) {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                        i18 &= -7169;
                    } else {
                        aVar4 = aVar2;
                    }
                    if ((i17 & 16) != 0) {
                        listE = v.e(ea.v.a(null, rVarH, 0, 1));
                        i18 &= -57345;
                    } else {
                        listE = list3;
                    }
                    if ((i17 & 32) != 0) {
                        a0Var = new a0<>();
                        i18 &= -458753;
                    } else {
                        a0Var = sVar;
                    }
                    if (i26 != 0) {
                        t0Var2 = null;
                    }
                    if (i28 != 0) {
                        y0Var2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        lVarF = ga.c.f();
                        i18 &= -234881025;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i17 & 512) != 0) {
                        lVarD = ga.c.d();
                        i18 &= -1879048193;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i17 & 1024) != 0) {
                        i36 = i35 & (-15);
                        pVarE = ga.c.e();
                    } else {
                        i36 = i35;
                        pVarE = pVar;
                    }
                    sVar3 = a0Var;
                    i37 = -30905885;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if ((i17 & 8) != 0) {
                        zG = rVarH.G(list);
                        objE = rVarH.E();
                        if (zG) {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                        i18 &= -7169;
                    } else {
                        aVar4 = aVar2;
                    }
                    if ((i17 & 16) != 0) {
                        listE = v.e(ea.v.a(null, rVarH, 0, 1));
                        i18 &= -57345;
                    } else {
                        listE = list3;
                    }
                    if ((i17 & 32) != 0) {
                        a0Var = new a0<>();
                        i18 &= -458753;
                    } else {
                        a0Var = sVar;
                    }
                    if (i26 != 0) {
                        t0Var2 = null;
                    }
                    if (i28 != 0) {
                        y0Var2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        lVarF = ga.c.f();
                        i18 &= -234881025;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i17 & 512) != 0) {
                        lVarD = ga.c.d();
                        i18 &= -1879048193;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i17 & 1024) != 0) {
                        i36 = i35 & (-15);
                        pVarE = ga.c.e();
                    } else {
                        i36 = i35;
                        pVarE = pVar;
                    }
                    sVar3 = a0Var;
                    i37 = -30905885;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i37, i18, i36, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:285)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
                }
                List listS2 = ea.f.s(list, listE, lVar3, rVarH, (i18 & 14) | ((i18 >> 9) & 112) | ((i36 << 3) & 896), 0);
                rVar2 = rVarH;
                int i49 = i18 >> 6;
                ga.c.c(listS2, mVar4, cVarO, sVar3, t0Var2, y0Var2, lVarF, lVarD, pVarE, aVar4, rVar2, ((i36 << 24) & 234881024) | (i18 & 1008) | (i49 & 7168) | (57344 & i49) | (458752 & i49) | (3670016 & i49) | (i49 & 29360128) | (1879048192 & (i18 << 18)), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                list4 = listE;
                mVar3 = mVar4;
                cVar3 = cVarO;
                sVar2 = sVar3;
                t0Var3 = t0Var2;
                y0Var2 = y0Var2;
                lVar5 = lVarF;
                lVar4 = lVarD;
                pVar2 = pVarE;
                aVar3 = aVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                sVar2 = sVar;
                lVar4 = lVar2;
                t0Var3 = t0Var2;
                mVar3 = mVar2;
                cVar3 = cVar2;
                aVar3 = aVar2;
                list4 = list3;
                lVar5 = lVar;
                pVar2 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p(list, mVar3, cVar3, aVar3, list4, sVar2, t0Var3, y0Var2, lVar5, lVar4, pVar2, lVar3, i15, i16, i17) { // from class: ga.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71432a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71433b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71434c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ er.a f71435d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ List f71436e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71437f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ y0 f71438g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.l f71439h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.l f71440j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ er.p f71441k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ er.l f71442l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ int f71443m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ int f71444n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f71445p;

                    {
                        this.f71438g = y0Var2;
                        this.f71439h = lVar5;
                        this.f71440j = lVar4;
                        this.f71441k = pVar2;
                        this.f71442l = lVar3;
                        this.f71443m = i15;
                        this.f71444n = i16;
                        this.f71445p = i17;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.w(this.f71432a, this.f71433b, this.f71434c, this.f71435d, this.f71436e, this.f71437f, null, this.f71438g, this.f71439h, this.f71440j, this.f71441k, this.f71442l, this.f71443m, this.f71444n, this.f71445p, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        mVar2 = mVar;
        i19 = i17 & 4;
        if (i19 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                cVar2 = cVar;
                if (rVarH.W(cVar2)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i18 |= i25;
            }
            if ((i15 & 3072) == 0) {
                if ((i17 & 8) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                    }
                    i18 |= i47;
                } else {
                    aVar2 = aVar;
                }
                i18 |= i47;
            } else {
                aVar2 = aVar;
            }
            if ((i15 & 24576) == 0) {
                if ((i17 & 16) == 0) {
                    list3 = list2;
                    if (rVarH.G(list3)) {
                        i45 = 16384;
                    }
                    i18 |= i45;
                } else {
                    list3 = list2;
                }
                i45 = PKIFailureInfo.certRevoked;
                i18 |= i45;
            } else {
                list3 = list2;
            }
            if ((i15 & 196608) != 0) {
                if ((i17 & 32) == 0) {
                    i39 = PKIFailureInfo.notAuthorized;
                } else {
                    i39 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i39;
            }
            i26 = i17 & 64;
            if (i26 != 0) {
                i18 |= 1572864;
                t0Var2 = t0Var;
            } else {
                t0Var2 = t0Var;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.W(t0Var2)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i18 |= i27;
                }
            }
            i28 = i17 & 128;
            if (i28 != 0) {
                i18 |= 12582912;
                y0Var2 = y0Var;
            } else {
                y0Var2 = y0Var;
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(y0Var2)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i18 |= i29;
                }
            }
            if ((i15 & 100663296) != 0) {
                i18 |= ((i17 & 256) == 0 || !rVarH.G(lVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) != 0) {
                i18 |= ((i17 & 512) == 0 || !rVarH.G(lVar2)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i16 & 6) == 0) {
                i35 = i16 | (((i17 & 1024) == 0 || !rVarH.G(pVar)) ? 2 : 4);
            } else {
                i35 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(lVar3)) {
                    i38 = 32;
                } else {
                    i38 = 16;
                }
                i35 |= i38;
            }
            if ((i18 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (rVarH.r(z15, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if ((i17 & 8) != 0) {
                        zG = rVarH.G(list);
                        objE = rVarH.E();
                        if (zG) {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                        i18 &= -7169;
                    } else {
                        aVar4 = aVar2;
                    }
                    if ((i17 & 16) != 0) {
                        listE = v.e(ea.v.a(null, rVarH, 0, 1));
                        i18 &= -57345;
                    } else {
                        listE = list3;
                    }
                    if ((i17 & 32) != 0) {
                        a0Var = new a0<>();
                        i18 &= -458753;
                    } else {
                        a0Var = sVar;
                    }
                    if (i26 != 0) {
                        t0Var2 = null;
                    }
                    if (i28 != 0) {
                        y0Var2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        lVarF = ga.c.f();
                        i18 &= -234881025;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i17 & 512) != 0) {
                        lVarD = ga.c.d();
                        i18 &= -1879048193;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i17 & 1024) != 0) {
                        i36 = i35 & (-15);
                        pVarE = ga.c.e();
                    } else {
                        i36 = i35;
                        pVarE = pVar;
                    }
                    sVar3 = a0Var;
                    i37 = -30905885;
                } else {
                    if (i46 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i19 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if ((i17 & 8) != 0) {
                        zG = rVarH.G(list);
                        objE = rVarH.E();
                        if (zG) {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.d
                                @Override // er.a
                                public final Object a() {
                                    return o.o(list);
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                        i18 &= -7169;
                    } else {
                        aVar4 = aVar2;
                    }
                    if ((i17 & 16) != 0) {
                        listE = v.e(ea.v.a(null, rVarH, 0, 1));
                        i18 &= -57345;
                    } else {
                        listE = list3;
                    }
                    if ((i17 & 32) != 0) {
                        a0Var = new a0<>();
                        i18 &= -458753;
                    } else {
                        a0Var = sVar;
                    }
                    if (i26 != 0) {
                        t0Var2 = null;
                    }
                    if (i28 != 0) {
                        y0Var2 = null;
                    }
                    if ((i17 & 256) != 0) {
                        lVarF = ga.c.f();
                        i18 &= -234881025;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i17 & 512) != 0) {
                        lVarD = ga.c.d();
                        i18 &= -1879048193;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i17 & 1024) != 0) {
                        i36 = i35 & (-15);
                        pVarE = ga.c.e();
                    } else {
                        i36 = i35;
                        pVarE = pVar;
                    }
                    sVar3 = a0Var;
                    i37 = -30905885;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i37, i18, i36, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:285)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
                }
                List listS3 = ea.f.s(list, listE, lVar3, rVarH, (i18 & 14) | ((i18 >> 9) & 112) | ((i36 << 3) & 896), 0);
                rVar2 = rVarH;
                int i410 = i18 >> 6;
                ga.c.c(listS3, mVar4, cVarO, sVar3, t0Var2, y0Var2, lVarF, lVarD, pVarE, aVar4, rVar2, ((i36 << 24) & 234881024) | (i18 & 1008) | (i410 & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (i410 & 29360128) | (1879048192 & (i18 << 18)), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                list4 = listE;
                mVar3 = mVar4;
                cVar3 = cVarO;
                sVar2 = sVar3;
                t0Var3 = t0Var2;
                y0Var2 = y0Var2;
                lVar5 = lVarF;
                lVar4 = lVarD;
                pVar2 = pVarE;
                aVar3 = aVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                sVar2 = sVar;
                lVar4 = lVar2;
                t0Var3 = t0Var2;
                mVar3 = mVar2;
                cVar3 = cVar2;
                aVar3 = aVar2;
                list4 = list3;
                lVar5 = lVar;
                pVar2 = pVar;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p(list, mVar3, cVar3, aVar3, list4, sVar2, t0Var3, y0Var2, lVar5, lVar4, pVar2, lVar3, i15, i16, i17) { // from class: ga.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71432a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71433b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71434c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ er.a f71435d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ List f71436e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71437f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ y0 f71438g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.l f71439h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.l f71440j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ er.p f71441k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ er.l f71442l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ int f71443m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ int f71444n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ int f71445p;

                    {
                        this.f71438g = y0Var2;
                        this.f71439h = lVar5;
                        this.f71440j = lVar4;
                        this.f71441k = pVar2;
                        this.f71442l = lVar3;
                        this.f71443m = i15;
                        this.f71444n = i16;
                        this.f71445p = i17;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.w(this.f71432a, this.f71433b, this.f71434c, this.f71435d, this.f71436e, this.f71437f, null, this.f71438g, this.f71439h, this.f71440j, this.f71441k, this.f71442l, this.f71443m, this.f71444n, this.f71445p, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= MLKEMEngine.KyberPolyBytes;
        cVar2 = cVar;
        if ((i15 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                }
                i18 |= i47;
            } else {
                aVar2 = aVar;
            }
            i18 |= i47;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                list3 = list2;
                if (rVarH.G(list3)) {
                    i45 = 16384;
                }
                i18 |= i45;
            } else {
                list3 = list2;
            }
            i45 = PKIFailureInfo.certRevoked;
            i18 |= i45;
        } else {
            list3 = list2;
        }
        if ((i15 & 196608) != 0) {
            if ((i17 & 32) == 0) {
                i39 = PKIFailureInfo.notAuthorized;
            } else {
                i39 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i39;
        }
        i26 = i17 & 64;
        if (i26 != 0) {
            i18 |= 1572864;
            t0Var2 = t0Var;
        } else {
            t0Var2 = t0Var;
            if ((i15 & 1572864) == 0) {
                if (rVarH.W(t0Var2)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i27;
            }
        }
        i28 = i17 & 128;
        if (i28 != 0) {
            i18 |= 12582912;
            y0Var2 = y0Var;
        } else {
            y0Var2 = y0Var;
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(y0Var2)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i18 |= i29;
            }
        }
        if ((i15 & 100663296) != 0) {
            i18 |= ((i17 & 256) == 0 || !rVarH.G(lVar)) ? 33554432 : 67108864;
        }
        if ((i15 & 805306368) != 0) {
            i18 |= ((i17 & 512) == 0 || !rVarH.G(lVar2)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i16 & 6) == 0) {
            i35 = i16 | (((i17 & 1024) == 0 || !rVarH.G(pVar)) ? 2 : 4);
        } else {
            i35 = i16;
        }
        if ((i16 & 48) == 0) {
            if (rVarH.G(lVar3)) {
                i38 = 32;
            } else {
                i38 = 16;
            }
            i35 |= i38;
        }
        if ((i18 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (rVarH.r(z15, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i46 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if ((i17 & 8) != 0) {
                    zG = rVarH.G(list);
                    objE = rVarH.E();
                    if (zG) {
                        objE = new er.a() { // from class: ga.d
                            @Override // er.a
                            public final Object a() {
                                return o.o(list);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.d
                            @Override // er.a
                            public final Object a() {
                                return o.o(list);
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                    i18 &= -7169;
                } else {
                    aVar4 = aVar2;
                }
                if ((i17 & 16) != 0) {
                    listE = v.e(ea.v.a(null, rVarH, 0, 1));
                    i18 &= -57345;
                } else {
                    listE = list3;
                }
                if ((i17 & 32) != 0) {
                    a0Var = new a0<>();
                    i18 &= -458753;
                } else {
                    a0Var = sVar;
                }
                if (i26 != 0) {
                    t0Var2 = null;
                }
                if (i28 != 0) {
                    y0Var2 = null;
                }
                if ((i17 & 256) != 0) {
                    lVarF = ga.c.f();
                    i18 &= -234881025;
                } else {
                    lVarF = lVar;
                }
                if ((i17 & 512) != 0) {
                    lVarD = ga.c.d();
                    i18 &= -1879048193;
                } else {
                    lVarD = lVar2;
                }
                if ((i17 & 1024) != 0) {
                    i36 = i35 & (-15);
                    pVarE = ga.c.e();
                } else {
                    i36 = i35;
                    pVarE = pVar;
                }
                sVar3 = a0Var;
                i37 = -30905885;
            } else {
                if (i46 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i19 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if ((i17 & 8) != 0) {
                    zG = rVarH.G(list);
                    objE = rVarH.E();
                    if (zG) {
                        objE = new er.a() { // from class: ga.d
                            @Override // er.a
                            public final Object a() {
                                return o.o(list);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.d
                            @Override // er.a
                            public final Object a() {
                                return o.o(list);
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                    i18 &= -7169;
                } else {
                    aVar4 = aVar2;
                }
                if ((i17 & 16) != 0) {
                    listE = v.e(ea.v.a(null, rVarH, 0, 1));
                    i18 &= -57345;
                } else {
                    listE = list3;
                }
                if ((i17 & 32) != 0) {
                    a0Var = new a0<>();
                    i18 &= -458753;
                } else {
                    a0Var = sVar;
                }
                if (i26 != 0) {
                    t0Var2 = null;
                }
                if (i28 != 0) {
                    y0Var2 = null;
                }
                if ((i17 & 256) != 0) {
                    lVarF = ga.c.f();
                    i18 &= -234881025;
                } else {
                    lVarF = lVar;
                }
                if ((i17 & 512) != 0) {
                    lVarD = ga.c.d();
                    i18 &= -1879048193;
                } else {
                    lVarD = lVar2;
                }
                if ((i17 & 1024) != 0) {
                    i36 = i35 & (-15);
                    pVarE = ga.c.e();
                } else {
                    i36 = i35;
                    pVarE = pVar;
                }
                sVar3 = a0Var;
                i37 = -30905885;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(i37, i18, i36, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:285)");
            }
            if (!list.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay backstack cannot be empty");
            }
            List listS4 = ea.f.s(list, listE, lVar3, rVarH, (i18 & 14) | ((i18 >> 9) & 112) | ((i36 << 3) & 896), 0);
            rVar2 = rVarH;
            int i411 = i18 >> 6;
            ga.c.c(listS4, mVar4, cVarO, sVar3, t0Var2, y0Var2, lVarF, lVarD, pVarE, aVar4, rVar2, ((i36 << 24) & 234881024) | (i18 & 1008) | (i411 & 7168) | (57344 & i411) | (458752 & i411) | (3670016 & i411) | (i411 & 29360128) | (1879048192 & (i18 << 18)), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            list4 = listE;
            mVar3 = mVar4;
            cVar3 = cVarO;
            sVar2 = sVar3;
            t0Var3 = t0Var2;
            y0Var2 = y0Var2;
            lVar5 = lVarF;
            lVar4 = lVarD;
            pVar2 = pVarE;
            aVar3 = aVar4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            sVar2 = sVar;
            lVar4 = lVar2;
            t0Var3 = t0Var2;
            mVar3 = mVar2;
            cVar3 = cVar2;
            aVar3 = aVar2;
            list4 = list3;
            lVar5 = lVar;
            pVar2 = pVar;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p(list, mVar3, cVar3, aVar3, list4, sVar2, t0Var3, y0Var2, lVar5, lVar4, pVar2, lVar3, i15, i16, i17) { // from class: ga.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f71432a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f3.m f71433b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f3.c f71434c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ er.a f71435d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f71436e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fa.s f71437f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ y0 f71438g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ er.l f71439h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ er.l f71440j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ er.p f71441k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ er.l f71442l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ int f71443m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ int f71444n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f71445p;

                {
                    this.f71438g = y0Var2;
                    this.f71439h = lVar5;
                    this.f71440j = lVar4;
                    this.f71441k = pVar2;
                    this.f71442l = lVar3;
                    this.f71443m = i15;
                    this.f71444n = i16;
                    this.f71445p = i17;
                }

                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.w(this.f71432a, this.f71433b, this.f71434c, this.f71435d, this.f71436e, this.f71437f, null, this.f71438g, this.f71439h, this.f71440j, this.f71441k, this.f71442l, this.f71443m, this.f71444n, this.f71445p, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0110  */
    /* JADX WARN: Code duplicated, block: B:106:0x0122  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x017b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x0191  */
    /* JADX WARN: Code duplicated, block: B:140:0x0194  */
    /* JADX WARN: Code duplicated, block: B:143:0x0199  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:162:0x0232 A[LOOP:0: B:160:0x022c->B:162:0x0232, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x0272  */
    /* JADX WARN: Code duplicated, block: B:166:0x0274  */
    /* JADX WARN: Code duplicated, block: B:169:0x027c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0284  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0107  */
    public static final <T> void n(List<NavEntry<T>> list, f3.m mVar, f3.c cVar, fa.s<T> sVar, t0 t0Var, y0 y0Var, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar, er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar2, er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        f3.c cVarO;
        int i19;
        fa.s<T> a0Var;
        int i25;
        t0 t0Var2;
        int i26;
        int i27;
        y0 y0Var2;
        int i28;
        boolean z15;
        p076m2.r rVar2;
        final List<NavEntry<T>> list2;
        final er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVar2;
        final f3.c cVar2;
        final fa.s<T> sVar2;
        final y0 y0Var3;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar3;
        final er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar4;
        d5 d5VarM;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarF;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVarD;
        er.p<? super p114t0.h<fa.h<T>>, ? super Integer, p114t0.v> pVarE;
        f3.c cVar3;
        int i29;
        er.l<? super p114t0.h<fa.h<T>>, p114t0.v> lVar5;
        y0 y0Var4;
        f3.m mVar3;
        final fa.h<T> hVarA;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z16;
        boolean z17;
        Object objE;
        int i35;
        int i36;
        p076m2.r rVarH = rVar.h(-1264608794);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i37 = i16 & 2;
        if (i37 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    cVarO = cVar;
                    if (rVarH.W(cVarO)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        a0Var = sVar;
                        int i38 = rVarH.W(a0Var) ? 2048 : 1024;
                        i17 |= i38;
                    } else {
                        a0Var = sVar;
                    }
                    i17 |= i38;
                } else {
                    a0Var = sVar;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        t0Var2 = t0Var;
                        if (rVarH.W(t0Var2)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 32;
                    if (i27 != 0) {
                        if ((196608 & i15) == 0) {
                            y0Var2 = y0Var;
                            if (rVarH.G(y0Var2)) {
                                i28 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i28 = PKIFailureInfo.notAuthorized;
                            }
                            i17 |= i28;
                        }
                        if ((i15 & 1572864) != 0) {
                            if ((i16 & 64) == 0 || !rVarH.G(lVar)) {
                                i36 = PKIFailureInfo.signerNotTrusted;
                            } else {
                                i36 = PKIFailureInfo.badCertTemplate;
                            }
                            i17 |= i36;
                        }
                        if ((i15 & 12582912) != 0) {
                            i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                        }
                        if ((i15 & 100663296) != 0) {
                            i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(aVar)) {
                                i35 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i35 = 268435456;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i37 != 0) {
                                    mVar2 = f3.m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    cVarO = f3.c.INSTANCE.o();
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                    a0Var = new a0();
                                }
                                if (i25 != 0) {
                                    t0Var2 = null;
                                }
                                if (i27 != 0) {
                                    y0Var2 = null;
                                }
                                if ((i16 & 64) != 0) {
                                    lVarF = ga.c.f();
                                    i17 &= -3670017;
                                } else {
                                    lVarF = lVar;
                                }
                                if ((i16 & 128) != 0) {
                                    lVarD = ga.c.d();
                                    i17 &= -29360129;
                                } else {
                                    lVarD = lVar2;
                                }
                                if ((i16 & 256) != 0) {
                                    i17 &= -234881025;
                                    pVarE = ga.c.e();
                                } else {
                                    pVarE = pVar;
                                }
                                cVar3 = cVarO;
                                i29 = -1264608794;
                                lVar5 = lVarF;
                            } else {
                                rVarH.O();
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                if ((i16 & 64) != 0) {
                                    i17 &= -3670017;
                                }
                                if ((i16 & 128) != 0) {
                                    i17 &= -29360129;
                                }
                                if ((i16 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                lVarD = lVar2;
                                pVarE = pVar;
                                cVar3 = cVarO;
                                i29 = -1264608794;
                                lVar5 = lVar;
                            }
                            y0Var4 = y0Var2;
                            mVar3 = mVar2;
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                            }
                            if (!list.isEmpty()) {
                                throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                            }
                            int i39 = i17 >> 6;
                            t0 t0Var3 = t0Var2;
                            SceneState sceneStateB = fa.r.b(list, a0Var, t0Var3, aVar, rVarH, (i17 & 14) | (i39 & 112) | (i39 & 896) | ((i17 >> 18) & 7168), 0);
                            list2 = list;
                            hVarA = sceneStateB.a();
                            SceneInfo sceneInfo = new SceneInfo(hVarA);
                            List<fa.h<T>> listD = sceneStateB.d();
                            arrayList = new ArrayList(v.y(listD, 10));
                            it = listD.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new SceneInfo((fa.h) it.next()));
                            }
                            x xVarB = z.b(sceneInfo, arrayList, null, rVarH, 0, 4);
                            boolean z18 = !hVarA.a().isEmpty();
                            boolean zG = rVarH.G(list2) | rVarH.W(hVarA);
                            if ((1879048192 & i17) == 536870912) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zG;
                            objE = rVarH.E();
                            if (z17 || objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.a() { // from class: ga.g
                                    @Override // er.a
                                    public final Object a() {
                                        return o.x(list2, hVarA, aVar);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            ia.v.n(xVarB, z18, null, (er.a) objE, rVarH, 0, 4);
                            rVar2 = rVarH;
                            int i45 = i17 >> 3;
                            ga.c.a(sceneStateB, xVarB, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i45) | (458752 & i45) | (3670016 & i45) | (i45 & 29360128), 0);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            t0Var2 = t0Var3;
                            sVar2 = a0Var;
                            mVar2 = mVar3;
                            cVar2 = cVar3;
                            y0Var3 = y0Var4;
                            lVar3 = lVar5;
                            lVar4 = lVarD;
                            pVar2 = pVarE;
                        } else {
                            rVar2 = rVarH;
                            list2 = list;
                            rVar2.O();
                            pVar2 = pVar;
                            cVar2 = cVarO;
                            sVar2 = a0Var;
                            y0Var3 = y0Var2;
                            lVar3 = lVar;
                            lVar4 = lVar2;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            final List<NavEntry<T>> list3 = list2;
                            final f3.m mVar4 = mVar2;
                            final t0 t0Var4 = t0Var2;
                            d5VarM.a(new er.p(list3, mVar4, cVar2, sVar2, t0Var4, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final /* synthetic */ List f71449a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ f3.m f71450b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ f3.c f71451c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final /* synthetic */ fa.s f71452d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final /* synthetic */ y0 f71453e;

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                public final /* synthetic */ er.l f71454f;

                                /* JADX INFO: renamed from: g, reason: collision with root package name */
                                public final /* synthetic */ er.l f71455g;

                                /* JADX INFO: renamed from: h, reason: collision with root package name */
                                public final /* synthetic */ er.p f71456h;

                                /* JADX INFO: renamed from: j, reason: collision with root package name */
                                public final /* synthetic */ er.a f71457j;

                                /* JADX INFO: renamed from: k, reason: collision with root package name */
                                public final /* synthetic */ int f71458k;

                                /* JADX INFO: renamed from: l, reason: collision with root package name */
                                public final /* synthetic */ int f71459l;

                                {
                                    this.f71453e = y0Var3;
                                    this.f71454f = lVar3;
                                    this.f71455g = lVar4;
                                    this.f71456h = pVar2;
                                    this.f71457j = aVar;
                                    this.f71458k = i15;
                                    this.f71459l = i16;
                                }

                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 196608;
                    y0Var2 = y0Var;
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 64) == 0) {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 12582912) != 0) {
                        i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                    }
                    if ((i15 & 100663296) != 0) {
                        i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(aVar)) {
                            i35 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        }
                        y0Var4 = y0Var2;
                        mVar3 = mVar2;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                        }
                        if (!list.isEmpty()) {
                            throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                        }
                        int i310 = i17 >> 6;
                        t0 t0Var5 = t0Var2;
                        SceneState sceneStateB2 = fa.r.b(list, a0Var, t0Var5, aVar, rVarH, (i17 & 14) | (i310 & 112) | (i310 & 896) | ((i17 >> 18) & 7168), 0);
                        list2 = list;
                        hVarA = sceneStateB2.a();
                        SceneInfo sceneInfo2 = new SceneInfo(hVarA);
                        List<fa.h<T>> listD2 = sceneStateB2.d();
                        arrayList = new ArrayList(v.y(listD2, 10));
                        it = listD2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new SceneInfo((fa.h) it.next()));
                        }
                        x xVarB2 = z.b(sceneInfo2, arrayList, null, rVarH, 0, 4);
                        boolean z19 = !hVarA.a().isEmpty();
                        boolean zG2 = rVarH.G(list2) | rVarH.W(hVarA);
                        if ((1879048192 & i17) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zG2;
                        objE = rVarH.E();
                        if (z17) {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        }
                        ia.v.n(xVarB2, z19, null, (er.a) objE, rVarH, 0, 4);
                        rVar2 = rVarH;
                        int i46 = i17 >> 3;
                        ga.c.a(sceneStateB2, xVarB2, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i46) | (458752 & i46) | (3670016 & i46) | (i46 & 29360128), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        t0Var2 = t0Var5;
                        sVar2 = a0Var;
                        mVar2 = mVar3;
                        cVar2 = cVar3;
                        y0Var3 = y0Var4;
                        lVar3 = lVar5;
                        lVar4 = lVarD;
                        pVar2 = pVarE;
                    } else {
                        rVar2 = rVarH;
                        list2 = list;
                        rVar2.O();
                        pVar2 = pVar;
                        cVar2 = cVarO;
                        sVar2 = a0Var;
                        y0Var3 = y0Var2;
                        lVar3 = lVar;
                        lVar4 = lVar2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final List list4 = list2;
                        final f3.m mVar5 = mVar2;
                        final t0 t0Var6 = t0Var2;
                        d5VarM.a(new er.p(list4, mVar5, cVar2, sVar2, t0Var6, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ List f71449a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f3.m f71450b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f3.c f71451c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ fa.s f71452d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ y0 f71453e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ er.l f71454f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ er.l f71455g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ er.p f71456h;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ er.a f71457j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ int f71458k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ int f71459l;

                            {
                                this.f71453e = y0Var3;
                                this.f71454f = lVar3;
                                this.f71455g = lVar4;
                                this.f71456h = pVar2;
                                this.f71457j = aVar;
                                this.f71458k = i15;
                                this.f71459l = i16;
                            }

                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                t0Var2 = t0Var;
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        y0Var2 = y0Var;
                        if (rVarH.G(y0Var2)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 64) == 0) {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 12582912) != 0) {
                        i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                    }
                    if ((i15 & 100663296) != 0) {
                        i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(aVar)) {
                            i35 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        }
                        y0Var4 = y0Var2;
                        mVar3 = mVar2;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                        }
                        if (!list.isEmpty()) {
                            throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                        }
                        int i311 = i17 >> 6;
                        t0 t0Var7 = t0Var2;
                        SceneState sceneStateB3 = fa.r.b(list, a0Var, t0Var7, aVar, rVarH, (i17 & 14) | (i311 & 112) | (i311 & 896) | ((i17 >> 18) & 7168), 0);
                        list2 = list;
                        hVarA = sceneStateB3.a();
                        SceneInfo sceneInfo3 = new SceneInfo(hVarA);
                        List<fa.h<T>> listD3 = sceneStateB3.d();
                        arrayList = new ArrayList(v.y(listD3, 10));
                        it = listD3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new SceneInfo((fa.h) it.next()));
                        }
                        x xVarB3 = z.b(sceneInfo3, arrayList, null, rVarH, 0, 4);
                        boolean z110 = !hVarA.a().isEmpty();
                        boolean zG3 = rVarH.G(list2) | rVarH.W(hVarA);
                        if ((1879048192 & i17) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zG3;
                        objE = rVarH.E();
                        if (z17) {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        }
                        ia.v.n(xVarB3, z110, null, (er.a) objE, rVarH, 0, 4);
                        rVar2 = rVarH;
                        int i47 = i17 >> 3;
                        ga.c.a(sceneStateB3, xVarB3, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i47) | (458752 & i47) | (3670016 & i47) | (i47 & 29360128), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        t0Var2 = t0Var7;
                        sVar2 = a0Var;
                        mVar2 = mVar3;
                        cVar2 = cVar3;
                        y0Var3 = y0Var4;
                        lVar3 = lVar5;
                        lVar4 = lVarD;
                        pVar2 = pVarE;
                    } else {
                        rVar2 = rVarH;
                        list2 = list;
                        rVar2.O();
                        pVar2 = pVar;
                        cVar2 = cVarO;
                        sVar2 = a0Var;
                        y0Var3 = y0Var2;
                        lVar3 = lVar;
                        lVar4 = lVar2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final List list5 = list2;
                        final f3.m mVar6 = mVar2;
                        final t0 t0Var8 = t0Var2;
                        d5VarM.a(new er.p(list5, mVar6, cVar2, sVar2, t0Var8, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ List f71449a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f3.m f71450b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f3.c f71451c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ fa.s f71452d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ y0 f71453e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ er.l f71454f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ er.l f71455g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ er.p f71456h;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ er.a f71457j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ int f71458k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ int f71459l;

                            {
                                this.f71453e = y0Var3;
                                this.f71454f = lVar3;
                                this.f71455g = lVar4;
                                this.f71456h = pVar2;
                                this.f71457j = aVar;
                                this.f71458k = i15;
                                this.f71459l = i16;
                            }

                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                y0Var2 = y0Var;
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i312 = i17 >> 6;
                    t0 t0Var9 = t0Var2;
                    SceneState sceneStateB4 = fa.r.b(list, a0Var, t0Var9, aVar, rVarH, (i17 & 14) | (i312 & 112) | (i312 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB4.a();
                    SceneInfo sceneInfo4 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD4 = sceneStateB4.d();
                    arrayList = new ArrayList(v.y(listD4, 10));
                    it = listD4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB4 = z.b(sceneInfo4, arrayList, null, rVarH, 0, 4);
                    boolean z111 = !hVarA.a().isEmpty();
                    boolean zG4 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG4;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB4, z111, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i48 = i17 >> 3;
                    ga.c.a(sceneStateB4, xVarB4, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i48) | (458752 & i48) | (3670016 & i48) | (i48 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var9;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list6 = list2;
                    final f3.m mVar7 = mVar2;
                    final t0 t0Var10 = t0Var2;
                    d5VarM.a(new er.p(list6, mVar7, cVar2, sVar2, t0Var10, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            cVarO = cVar;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    a0Var = sVar;
                    if (rVarH.W(a0Var)) {
                    }
                    i17 |= i38;
                } else {
                    a0Var = sVar;
                }
                i17 |= i38;
            } else {
                a0Var = sVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    t0Var2 = t0Var;
                    if (rVarH.W(t0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        y0Var2 = y0Var;
                        if (rVarH.G(y0Var2)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 64) == 0) {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 12582912) != 0) {
                        i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                    }
                    if ((i15 & 100663296) != 0) {
                        i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(aVar)) {
                            i35 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        }
                        y0Var4 = y0Var2;
                        mVar3 = mVar2;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                        }
                        if (!list.isEmpty()) {
                            throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                        }
                        int i313 = i17 >> 6;
                        t0 t0Var11 = t0Var2;
                        SceneState sceneStateB5 = fa.r.b(list, a0Var, t0Var11, aVar, rVarH, (i17 & 14) | (i313 & 112) | (i313 & 896) | ((i17 >> 18) & 7168), 0);
                        list2 = list;
                        hVarA = sceneStateB5.a();
                        SceneInfo sceneInfo5 = new SceneInfo(hVarA);
                        List<fa.h<T>> listD5 = sceneStateB5.d();
                        arrayList = new ArrayList(v.y(listD5, 10));
                        it = listD5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new SceneInfo((fa.h) it.next()));
                        }
                        x xVarB5 = z.b(sceneInfo5, arrayList, null, rVarH, 0, 4);
                        boolean z112 = !hVarA.a().isEmpty();
                        boolean zG5 = rVarH.G(list2) | rVarH.W(hVarA);
                        if ((1879048192 & i17) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zG5;
                        objE = rVarH.E();
                        if (z17) {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        }
                        ia.v.n(xVarB5, z112, null, (er.a) objE, rVarH, 0, 4);
                        rVar2 = rVarH;
                        int i49 = i17 >> 3;
                        ga.c.a(sceneStateB5, xVarB5, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i49) | (458752 & i49) | (3670016 & i49) | (i49 & 29360128), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        t0Var2 = t0Var11;
                        sVar2 = a0Var;
                        mVar2 = mVar3;
                        cVar2 = cVar3;
                        y0Var3 = y0Var4;
                        lVar3 = lVar5;
                        lVar4 = lVarD;
                        pVar2 = pVarE;
                    } else {
                        rVar2 = rVarH;
                        list2 = list;
                        rVar2.O();
                        pVar2 = pVar;
                        cVar2 = cVarO;
                        sVar2 = a0Var;
                        y0Var3 = y0Var2;
                        lVar3 = lVar;
                        lVar4 = lVar2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final List list7 = list2;
                        final f3.m mVar8 = mVar2;
                        final t0 t0Var12 = t0Var2;
                        d5VarM.a(new er.p(list7, mVar8, cVar2, sVar2, t0Var12, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ List f71449a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f3.m f71450b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f3.c f71451c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ fa.s f71452d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ y0 f71453e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ er.l f71454f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ er.l f71455g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ er.p f71456h;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ er.a f71457j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ int f71458k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ int f71459l;

                            {
                                this.f71453e = y0Var3;
                                this.f71454f = lVar3;
                                this.f71455g = lVar4;
                                this.f71456h = pVar2;
                                this.f71457j = aVar;
                                this.f71458k = i15;
                                this.f71459l = i16;
                            }

                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                y0Var2 = y0Var;
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i314 = i17 >> 6;
                    t0 t0Var13 = t0Var2;
                    SceneState sceneStateB6 = fa.r.b(list, a0Var, t0Var13, aVar, rVarH, (i17 & 14) | (i314 & 112) | (i314 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB6.a();
                    SceneInfo sceneInfo6 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD6 = sceneStateB6.d();
                    arrayList = new ArrayList(v.y(listD6, 10));
                    it = listD6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB6 = z.b(sceneInfo6, arrayList, null, rVarH, 0, 4);
                    boolean z113 = !hVarA.a().isEmpty();
                    boolean zG6 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG6;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB6, z113, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i410 = i17 >> 3;
                    ga.c.a(sceneStateB6, xVarB6, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (i410 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var13;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list8 = list2;
                    final f3.m mVar9 = mVar2;
                    final t0 t0Var14 = t0Var2;
                    d5VarM.a(new er.p(list8, mVar9, cVar2, sVar2, t0Var14, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            t0Var2 = t0Var;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    y0Var2 = y0Var;
                    if (rVarH.G(y0Var2)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i315 = i17 >> 6;
                    t0 t0Var15 = t0Var2;
                    SceneState sceneStateB7 = fa.r.b(list, a0Var, t0Var15, aVar, rVarH, (i17 & 14) | (i315 & 112) | (i315 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB7.a();
                    SceneInfo sceneInfo7 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD7 = sceneStateB7.d();
                    arrayList = new ArrayList(v.y(listD7, 10));
                    it = listD7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB7 = z.b(sceneInfo7, arrayList, null, rVarH, 0, 4);
                    boolean z114 = !hVarA.a().isEmpty();
                    boolean zG7 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG7;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB7, z114, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i411 = i17 >> 3;
                    ga.c.a(sceneStateB7, xVarB7, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i411) | (458752 & i411) | (3670016 & i411) | (i411 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var15;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list9 = list2;
                    final f3.m mVar10 = mVar2;
                    final t0 t0Var16 = t0Var2;
                    d5VarM.a(new er.p(list9, mVar10, cVar2, sVar2, t0Var16, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            y0Var2 = y0Var;
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i36;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
            }
            if ((i15 & 100663296) != 0) {
                i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(aVar)) {
                    i35 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i35 = 268435456;
                }
                i17 |= i35;
            }
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                }
                y0Var4 = y0Var2;
                mVar3 = mVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                }
                int i316 = i17 >> 6;
                t0 t0Var17 = t0Var2;
                SceneState sceneStateB8 = fa.r.b(list, a0Var, t0Var17, aVar, rVarH, (i17 & 14) | (i316 & 112) | (i316 & 896) | ((i17 >> 18) & 7168), 0);
                list2 = list;
                hVarA = sceneStateB8.a();
                SceneInfo sceneInfo8 = new SceneInfo(hVarA);
                List<fa.h<T>> listD8 = sceneStateB8.d();
                arrayList = new ArrayList(v.y(listD8, 10));
                it = listD8.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SceneInfo((fa.h) it.next()));
                }
                x xVarB8 = z.b(sceneInfo8, arrayList, null, rVarH, 0, 4);
                boolean z115 = !hVarA.a().isEmpty();
                boolean zG8 = rVarH.G(list2) | rVarH.W(hVarA);
                if ((1879048192 & i17) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zG8;
                objE = rVarH.E();
                if (z17) {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                ia.v.n(xVarB8, z115, null, (er.a) objE, rVarH, 0, 4);
                rVar2 = rVarH;
                int i412 = i17 >> 3;
                ga.c.a(sceneStateB8, xVarB8, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i412) | (458752 & i412) | (3670016 & i412) | (i412 & 29360128), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                t0Var2 = t0Var17;
                sVar2 = a0Var;
                mVar2 = mVar3;
                cVar2 = cVar3;
                y0Var3 = y0Var4;
                lVar3 = lVar5;
                lVar4 = lVarD;
                pVar2 = pVarE;
            } else {
                rVar2 = rVarH;
                list2 = list;
                rVar2.O();
                pVar2 = pVar;
                cVar2 = cVarO;
                sVar2 = a0Var;
                y0Var3 = y0Var2;
                lVar3 = lVar;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final List list10 = list2;
                final f3.m mVar11 = mVar2;
                final t0 t0Var18 = t0Var2;
                d5VarM.a(new er.p(list10, mVar11, cVar2, sVar2, t0Var18, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71449a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71450b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71451c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71452d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ y0 f71453e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ er.l f71454f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ er.l f71455g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.p f71456h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.a f71457j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ int f71458k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ int f71459l;

                    {
                        this.f71453e = y0Var3;
                        this.f71454f = lVar3;
                        this.f71455g = lVar4;
                        this.f71456h = pVar2;
                        this.f71457j = aVar;
                        this.f71458k = i15;
                        this.f71459l = i16;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                cVarO = cVar;
                if (rVarH.W(cVarO)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    a0Var = sVar;
                    if (rVarH.W(a0Var)) {
                    }
                    i17 |= i38;
                } else {
                    a0Var = sVar;
                }
                i17 |= i38;
            } else {
                a0Var = sVar;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    t0Var2 = t0Var;
                    if (rVarH.W(t0Var2)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 32;
                if (i27 != 0) {
                    if ((196608 & i15) == 0) {
                        y0Var2 = y0Var;
                        if (rVarH.G(y0Var2)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i28 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i28;
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 64) == 0) {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i36 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 12582912) != 0) {
                        i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                    }
                    if ((i15 & 100663296) != 0) {
                        i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(aVar)) {
                            i35 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i35 = 268435456;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        } else {
                            if (i37 != 0) {
                                mVar2 = f3.m.INSTANCE;
                            }
                            if (i18 != 0) {
                                cVarO = f3.c.INSTANCE.o();
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                                a0Var = new a0();
                            }
                            if (i25 != 0) {
                                t0Var2 = null;
                            }
                            if (i27 != 0) {
                                y0Var2 = null;
                            }
                            if ((i16 & 64) != 0) {
                                lVarF = ga.c.f();
                                i17 &= -3670017;
                            } else {
                                lVarF = lVar;
                            }
                            if ((i16 & 128) != 0) {
                                lVarD = ga.c.d();
                                i17 &= -29360129;
                            } else {
                                lVarD = lVar2;
                            }
                            if ((i16 & 256) != 0) {
                                i17 &= -234881025;
                                pVarE = ga.c.e();
                            } else {
                                pVarE = pVar;
                            }
                            cVar3 = cVarO;
                            i29 = -1264608794;
                            lVar5 = lVarF;
                        }
                        y0Var4 = y0Var2;
                        mVar3 = mVar2;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                        }
                        if (!list.isEmpty()) {
                            throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                        }
                        int i317 = i17 >> 6;
                        t0 t0Var19 = t0Var2;
                        SceneState sceneStateB9 = fa.r.b(list, a0Var, t0Var19, aVar, rVarH, (i17 & 14) | (i317 & 112) | (i317 & 896) | ((i17 >> 18) & 7168), 0);
                        list2 = list;
                        hVarA = sceneStateB9.a();
                        SceneInfo sceneInfo9 = new SceneInfo(hVarA);
                        List<fa.h<T>> listD9 = sceneStateB9.d();
                        arrayList = new ArrayList(v.y(listD9, 10));
                        it = listD9.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new SceneInfo((fa.h) it.next()));
                        }
                        x xVarB9 = z.b(sceneInfo9, arrayList, null, rVarH, 0, 4);
                        boolean z116 = !hVarA.a().isEmpty();
                        boolean zG9 = rVarH.G(list2) | rVarH.W(hVarA);
                        if ((1879048192 & i17) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zG9;
                        objE = rVarH.E();
                        if (z17) {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        } else {
                            objE = new er.a() { // from class: ga.g
                                @Override // er.a
                                public final Object a() {
                                    return o.x(list2, hVarA, aVar);
                                }
                            };
                            rVarH.v(objE);
                        }
                        ia.v.n(xVarB9, z116, null, (er.a) objE, rVarH, 0, 4);
                        rVar2 = rVarH;
                        int i413 = i17 >> 3;
                        ga.c.a(sceneStateB9, xVarB9, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i413) | (458752 & i413) | (3670016 & i413) | (i413 & 29360128), 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        t0Var2 = t0Var19;
                        sVar2 = a0Var;
                        mVar2 = mVar3;
                        cVar2 = cVar3;
                        y0Var3 = y0Var4;
                        lVar3 = lVar5;
                        lVar4 = lVarD;
                        pVar2 = pVarE;
                    } else {
                        rVar2 = rVarH;
                        list2 = list;
                        rVar2.O();
                        pVar2 = pVar;
                        cVar2 = cVarO;
                        sVar2 = a0Var;
                        y0Var3 = y0Var2;
                        lVar3 = lVar;
                        lVar4 = lVar2;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        final List list11 = list2;
                        final f3.m mVar12 = mVar2;
                        final t0 t0Var110 = t0Var2;
                        d5VarM.a(new er.p(list11, mVar12, cVar2, sVar2, t0Var110, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ List f71449a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ f3.m f71450b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final /* synthetic */ f3.c f71451c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ fa.s f71452d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ y0 f71453e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final /* synthetic */ er.l f71454f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final /* synthetic */ er.l f71455g;

                            /* JADX INFO: renamed from: h, reason: collision with root package name */
                            public final /* synthetic */ er.p f71456h;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final /* synthetic */ er.a f71457j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final /* synthetic */ int f71458k;

                            /* JADX INFO: renamed from: l, reason: collision with root package name */
                            public final /* synthetic */ int f71459l;

                            {
                                this.f71453e = y0Var3;
                                this.f71454f = lVar3;
                                this.f71455g = lVar4;
                                this.f71456h = pVar2;
                                this.f71457j = aVar;
                                this.f71458k = i15;
                                this.f71459l = i16;
                            }

                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                y0Var2 = y0Var;
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i318 = i17 >> 6;
                    t0 t0Var111 = t0Var2;
                    SceneState sceneStateB10 = fa.r.b(list, a0Var, t0Var111, aVar, rVarH, (i17 & 14) | (i318 & 112) | (i318 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB10.a();
                    SceneInfo sceneInfo10 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD10 = sceneStateB10.d();
                    arrayList = new ArrayList(v.y(listD10, 10));
                    it = listD10.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB10 = z.b(sceneInfo10, arrayList, null, rVarH, 0, 4);
                    boolean z117 = !hVarA.a().isEmpty();
                    boolean zG10 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG10;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB10, z117, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i414 = i17 >> 3;
                    ga.c.a(sceneStateB10, xVarB10, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i414) | (458752 & i414) | (3670016 & i414) | (i414 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var111;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list12 = list2;
                    final f3.m mVar13 = mVar2;
                    final t0 t0Var112 = t0Var2;
                    d5VarM.a(new er.p(list12, mVar13, cVar2, sVar2, t0Var112, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            t0Var2 = t0Var;
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    y0Var2 = y0Var;
                    if (rVarH.G(y0Var2)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i319 = i17 >> 6;
                    t0 t0Var113 = t0Var2;
                    SceneState sceneStateB11 = fa.r.b(list, a0Var, t0Var113, aVar, rVarH, (i17 & 14) | (i319 & 112) | (i319 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB11.a();
                    SceneInfo sceneInfo11 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD11 = sceneStateB11.d();
                    arrayList = new ArrayList(v.y(listD11, 10));
                    it = listD11.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB11 = z.b(sceneInfo11, arrayList, null, rVarH, 0, 4);
                    boolean z118 = !hVarA.a().isEmpty();
                    boolean zG11 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG11;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB11, z118, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i415 = i17 >> 3;
                    ga.c.a(sceneStateB11, xVarB11, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i415) | (458752 & i415) | (3670016 & i415) | (i415 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var113;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list13 = list2;
                    final f3.m mVar14 = mVar2;
                    final t0 t0Var114 = t0Var2;
                    d5VarM.a(new er.p(list13, mVar14, cVar2, sVar2, t0Var114, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            y0Var2 = y0Var;
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i36;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
            }
            if ((i15 & 100663296) != 0) {
                i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(aVar)) {
                    i35 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i35 = 268435456;
                }
                i17 |= i35;
            }
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                }
                y0Var4 = y0Var2;
                mVar3 = mVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                }
                int i3110 = i17 >> 6;
                t0 t0Var115 = t0Var2;
                SceneState sceneStateB12 = fa.r.b(list, a0Var, t0Var115, aVar, rVarH, (i17 & 14) | (i3110 & 112) | (i3110 & 896) | ((i17 >> 18) & 7168), 0);
                list2 = list;
                hVarA = sceneStateB12.a();
                SceneInfo sceneInfo12 = new SceneInfo(hVarA);
                List<fa.h<T>> listD12 = sceneStateB12.d();
                arrayList = new ArrayList(v.y(listD12, 10));
                it = listD12.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SceneInfo((fa.h) it.next()));
                }
                x xVarB12 = z.b(sceneInfo12, arrayList, null, rVarH, 0, 4);
                boolean z119 = !hVarA.a().isEmpty();
                boolean zG12 = rVarH.G(list2) | rVarH.W(hVarA);
                if ((1879048192 & i17) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zG12;
                objE = rVarH.E();
                if (z17) {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                ia.v.n(xVarB12, z119, null, (er.a) objE, rVarH, 0, 4);
                rVar2 = rVarH;
                int i416 = i17 >> 3;
                ga.c.a(sceneStateB12, xVarB12, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i416) | (458752 & i416) | (3670016 & i416) | (i416 & 29360128), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                t0Var2 = t0Var115;
                sVar2 = a0Var;
                mVar2 = mVar3;
                cVar2 = cVar3;
                y0Var3 = y0Var4;
                lVar3 = lVar5;
                lVar4 = lVarD;
                pVar2 = pVarE;
            } else {
                rVar2 = rVarH;
                list2 = list;
                rVar2.O();
                pVar2 = pVar;
                cVar2 = cVarO;
                sVar2 = a0Var;
                y0Var3 = y0Var2;
                lVar3 = lVar;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final List list14 = list2;
                final f3.m mVar15 = mVar2;
                final t0 t0Var116 = t0Var2;
                d5VarM.a(new er.p(list14, mVar15, cVar2, sVar2, t0Var116, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71449a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71450b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71451c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71452d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ y0 f71453e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ er.l f71454f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ er.l f71455g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.p f71456h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.a f71457j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ int f71458k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ int f71459l;

                    {
                        this.f71453e = y0Var3;
                        this.f71454f = lVar3;
                        this.f71455g = lVar4;
                        this.f71456h = pVar2;
                        this.f71457j = aVar;
                        this.f71458k = i15;
                        this.f71459l = i16;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        cVarO = cVar;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                a0Var = sVar;
                if (rVarH.W(a0Var)) {
                }
                i17 |= i38;
            } else {
                a0Var = sVar;
            }
            i17 |= i38;
        } else {
            a0Var = sVar;
        }
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                t0Var2 = t0Var;
                if (rVarH.W(t0Var2)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            i27 = i16 & 32;
            if (i27 != 0) {
                if ((196608 & i15) == 0) {
                    y0Var2 = y0Var;
                    if (rVarH.G(y0Var2)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i28 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i28;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 64) == 0) {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i36 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i36;
                }
                if ((i15 & 12582912) != 0) {
                    i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
                }
                if ((i15 & 100663296) != 0) {
                    i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(aVar)) {
                        i35 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i35 = 268435456;
                    }
                    i17 |= i35;
                }
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    } else {
                        if (i37 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            cVarO = f3.c.INSTANCE.o();
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            a0Var = new a0();
                        }
                        if (i25 != 0) {
                            t0Var2 = null;
                        }
                        if (i27 != 0) {
                            y0Var2 = null;
                        }
                        if ((i16 & 64) != 0) {
                            lVarF = ga.c.f();
                            i17 &= -3670017;
                        } else {
                            lVarF = lVar;
                        }
                        if ((i16 & 128) != 0) {
                            lVarD = ga.c.d();
                            i17 &= -29360129;
                        } else {
                            lVarD = lVar2;
                        }
                        if ((i16 & 256) != 0) {
                            i17 &= -234881025;
                            pVarE = ga.c.e();
                        } else {
                            pVarE = pVar;
                        }
                        cVar3 = cVarO;
                        i29 = -1264608794;
                        lVar5 = lVarF;
                    }
                    y0Var4 = y0Var2;
                    mVar3 = mVar2;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                    }
                    if (!list.isEmpty()) {
                        throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                    }
                    int i3111 = i17 >> 6;
                    t0 t0Var117 = t0Var2;
                    SceneState sceneStateB13 = fa.r.b(list, a0Var, t0Var117, aVar, rVarH, (i17 & 14) | (i3111 & 112) | (i3111 & 896) | ((i17 >> 18) & 7168), 0);
                    list2 = list;
                    hVarA = sceneStateB13.a();
                    SceneInfo sceneInfo13 = new SceneInfo(hVarA);
                    List<fa.h<T>> listD13 = sceneStateB13.d();
                    arrayList = new ArrayList(v.y(listD13, 10));
                    it = listD13.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SceneInfo((fa.h) it.next()));
                    }
                    x xVarB13 = z.b(sceneInfo13, arrayList, null, rVarH, 0, 4);
                    boolean z1110 = !hVarA.a().isEmpty();
                    boolean zG13 = rVarH.G(list2) | rVarH.W(hVarA);
                    if ((1879048192 & i17) == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zG13;
                    objE = rVarH.E();
                    if (z17) {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    } else {
                        objE = new er.a() { // from class: ga.g
                            @Override // er.a
                            public final Object a() {
                                return o.x(list2, hVarA, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    ia.v.n(xVarB13, z1110, null, (er.a) objE, rVarH, 0, 4);
                    rVar2 = rVarH;
                    int i417 = i17 >> 3;
                    ga.c.a(sceneStateB13, xVarB13, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i417) | (458752 & i417) | (3670016 & i417) | (i417 & 29360128), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    t0Var2 = t0Var117;
                    sVar2 = a0Var;
                    mVar2 = mVar3;
                    cVar2 = cVar3;
                    y0Var3 = y0Var4;
                    lVar3 = lVar5;
                    lVar4 = lVarD;
                    pVar2 = pVarE;
                } else {
                    rVar2 = rVarH;
                    list2 = list;
                    rVar2.O();
                    pVar2 = pVar;
                    cVar2 = cVarO;
                    sVar2 = a0Var;
                    y0Var3 = y0Var2;
                    lVar3 = lVar;
                    lVar4 = lVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    final List list15 = list2;
                    final f3.m mVar16 = mVar2;
                    final t0 t0Var118 = t0Var2;
                    d5VarM.a(new er.p(list15, mVar16, cVar2, sVar2, t0Var118, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f71449a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f3.m f71450b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f3.c f71451c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ fa.s f71452d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ y0 f71453e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ er.l f71454f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ er.l f71455g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ er.p f71456h;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ er.a f71457j;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f71458k;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f71459l;

                        {
                            this.f71453e = y0Var3;
                            this.f71454f = lVar3;
                            this.f71455g = lVar4;
                            this.f71456h = pVar2;
                            this.f71457j = aVar;
                            this.f71458k = i15;
                            this.f71459l = i16;
                        }

                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            y0Var2 = y0Var;
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i36;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
            }
            if ((i15 & 100663296) != 0) {
                i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(aVar)) {
                    i35 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i35 = 268435456;
                }
                i17 |= i35;
            }
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                }
                y0Var4 = y0Var2;
                mVar3 = mVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                }
                int i3112 = i17 >> 6;
                t0 t0Var119 = t0Var2;
                SceneState sceneStateB14 = fa.r.b(list, a0Var, t0Var119, aVar, rVarH, (i17 & 14) | (i3112 & 112) | (i3112 & 896) | ((i17 >> 18) & 7168), 0);
                list2 = list;
                hVarA = sceneStateB14.a();
                SceneInfo sceneInfo14 = new SceneInfo(hVarA);
                List<fa.h<T>> listD14 = sceneStateB14.d();
                arrayList = new ArrayList(v.y(listD14, 10));
                it = listD14.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SceneInfo((fa.h) it.next()));
                }
                x xVarB14 = z.b(sceneInfo14, arrayList, null, rVarH, 0, 4);
                boolean z1111 = !hVarA.a().isEmpty();
                boolean zG14 = rVarH.G(list2) | rVarH.W(hVarA);
                if ((1879048192 & i17) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zG14;
                objE = rVarH.E();
                if (z17) {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                ia.v.n(xVarB14, z1111, null, (er.a) objE, rVarH, 0, 4);
                rVar2 = rVarH;
                int i418 = i17 >> 3;
                ga.c.a(sceneStateB14, xVarB14, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i418) | (458752 & i418) | (3670016 & i418) | (i418 & 29360128), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                t0Var2 = t0Var119;
                sVar2 = a0Var;
                mVar2 = mVar3;
                cVar2 = cVar3;
                y0Var3 = y0Var4;
                lVar3 = lVar5;
                lVar4 = lVarD;
                pVar2 = pVarE;
            } else {
                rVar2 = rVarH;
                list2 = list;
                rVar2.O();
                pVar2 = pVar;
                cVar2 = cVarO;
                sVar2 = a0Var;
                y0Var3 = y0Var2;
                lVar3 = lVar;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final List list16 = list2;
                final f3.m mVar17 = mVar2;
                final t0 t0Var1110 = t0Var2;
                d5VarM.a(new er.p(list16, mVar17, cVar2, sVar2, t0Var1110, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71449a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71450b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71451c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71452d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ y0 f71453e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ er.l f71454f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ er.l f71455g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.p f71456h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.a f71457j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ int f71458k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ int f71459l;

                    {
                        this.f71453e = y0Var3;
                        this.f71454f = lVar3;
                        this.f71455g = lVar4;
                        this.f71456h = pVar2;
                        this.f71457j = aVar;
                        this.f71458k = i15;
                        this.f71459l = i16;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        t0Var2 = t0Var;
        i27 = i16 & 32;
        if (i27 != 0) {
            if ((196608 & i15) == 0) {
                y0Var2 = y0Var;
                if (rVarH.G(y0Var2)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 64) == 0) {
                    i36 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i36 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i36;
            }
            if ((i15 & 12582912) != 0) {
                i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
            }
            if ((i15 & 100663296) != 0) {
                i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(aVar)) {
                    i35 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i35 = 268435456;
                }
                i17 |= i35;
            }
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                } else {
                    if (i37 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        cVarO = f3.c.INSTANCE.o();
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        a0Var = new a0();
                    }
                    if (i25 != 0) {
                        t0Var2 = null;
                    }
                    if (i27 != 0) {
                        y0Var2 = null;
                    }
                    if ((i16 & 64) != 0) {
                        lVarF = ga.c.f();
                        i17 &= -3670017;
                    } else {
                        lVarF = lVar;
                    }
                    if ((i16 & 128) != 0) {
                        lVarD = ga.c.d();
                        i17 &= -29360129;
                    } else {
                        lVarD = lVar2;
                    }
                    if ((i16 & 256) != 0) {
                        i17 &= -234881025;
                        pVarE = ga.c.e();
                    } else {
                        pVarE = pVar;
                    }
                    cVar3 = cVarO;
                    i29 = -1264608794;
                    lVar5 = lVarF;
                }
                y0Var4 = y0Var2;
                mVar3 = mVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
                }
                if (!list.isEmpty()) {
                    throw new IllegalArgumentException("NavDisplay entries cannot be empty");
                }
                int i3113 = i17 >> 6;
                t0 t0Var1111 = t0Var2;
                SceneState sceneStateB15 = fa.r.b(list, a0Var, t0Var1111, aVar, rVarH, (i17 & 14) | (i3113 & 112) | (i3113 & 896) | ((i17 >> 18) & 7168), 0);
                list2 = list;
                hVarA = sceneStateB15.a();
                SceneInfo sceneInfo15 = new SceneInfo(hVarA);
                List<fa.h<T>> listD15 = sceneStateB15.d();
                arrayList = new ArrayList(v.y(listD15, 10));
                it = listD15.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SceneInfo((fa.h) it.next()));
                }
                x xVarB15 = z.b(sceneInfo15, arrayList, null, rVarH, 0, 4);
                boolean z1112 = !hVarA.a().isEmpty();
                boolean zG15 = rVarH.G(list2) | rVarH.W(hVarA);
                if ((1879048192 & i17) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zG15;
                objE = rVarH.E();
                if (z17) {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: ga.g
                        @Override // er.a
                        public final Object a() {
                            return o.x(list2, hVarA, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                ia.v.n(xVarB15, z1112, null, (er.a) objE, rVarH, 0, 4);
                rVar2 = rVarH;
                int i419 = i17 >> 3;
                ga.c.a(sceneStateB15, xVarB15, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i419) | (458752 & i419) | (3670016 & i419) | (i419 & 29360128), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                t0Var2 = t0Var1111;
                sVar2 = a0Var;
                mVar2 = mVar3;
                cVar2 = cVar3;
                y0Var3 = y0Var4;
                lVar3 = lVar5;
                lVar4 = lVarD;
                pVar2 = pVarE;
            } else {
                rVar2 = rVarH;
                list2 = list;
                rVar2.O();
                pVar2 = pVar;
                cVar2 = cVarO;
                sVar2 = a0Var;
                y0Var3 = y0Var2;
                lVar3 = lVar;
                lVar4 = lVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                final List list17 = list2;
                final f3.m mVar18 = mVar2;
                final t0 t0Var1112 = t0Var2;
                d5VarM.a(new er.p(list17, mVar18, cVar2, sVar2, t0Var1112, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ List f71449a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f3.m f71450b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ f3.c f71451c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ fa.s f71452d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ y0 f71453e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ er.l f71454f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ er.l f71455g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ er.p f71456h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ er.a f71457j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ int f71458k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ int f71459l;

                    {
                        this.f71453e = y0Var3;
                        this.f71454f = lVar3;
                        this.f71455g = lVar4;
                        this.f71456h = pVar2;
                        this.f71457j = aVar;
                        this.f71458k = i15;
                        this.f71459l = i16;
                    }

                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        y0Var2 = y0Var;
        if ((i15 & 1572864) != 0) {
            if ((i16 & 64) == 0) {
                i36 = PKIFailureInfo.signerNotTrusted;
            } else {
                i36 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i36;
        }
        if ((i15 & 12582912) != 0) {
            i17 |= ((i16 & 128) == 0 || !rVarH.G(lVar2)) ? 4194304 : 8388608;
        }
        if ((i15 & 100663296) != 0) {
            i17 |= ((i16 & 256) == 0 || !rVarH.G(pVar)) ? 33554432 : 67108864;
        }
        if ((i15 & 805306368) == 0) {
            if (rVarH.G(aVar)) {
                i35 = PKIFailureInfo.duplicateCertReq;
            } else {
                i35 = 268435456;
            }
            i17 |= i35;
        }
        if ((i17 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    a0Var = new a0();
                }
                if (i25 != 0) {
                    t0Var2 = null;
                }
                if (i27 != 0) {
                    y0Var2 = null;
                }
                if ((i16 & 64) != 0) {
                    lVarF = ga.c.f();
                    i17 &= -3670017;
                } else {
                    lVarF = lVar;
                }
                if ((i16 & 128) != 0) {
                    lVarD = ga.c.d();
                    i17 &= -29360129;
                } else {
                    lVarD = lVar2;
                }
                if ((i16 & 256) != 0) {
                    i17 &= -234881025;
                    pVarE = ga.c.e();
                } else {
                    pVarE = pVar;
                }
                cVar3 = cVarO;
                i29 = -1264608794;
                lVar5 = lVarF;
            } else {
                if (i37 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    cVarO = f3.c.INSTANCE.o();
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    a0Var = new a0();
                }
                if (i25 != 0) {
                    t0Var2 = null;
                }
                if (i27 != 0) {
                    y0Var2 = null;
                }
                if ((i16 & 64) != 0) {
                    lVarF = ga.c.f();
                    i17 &= -3670017;
                } else {
                    lVarF = lVar;
                }
                if ((i16 & 128) != 0) {
                    lVarD = ga.c.d();
                    i17 &= -29360129;
                } else {
                    lVarD = lVar2;
                }
                if ((i16 & 256) != 0) {
                    i17 &= -234881025;
                    pVarE = ga.c.e();
                } else {
                    pVarE = pVar;
                }
                cVar3 = cVarO;
                i29 = -1264608794;
                lVar5 = lVarF;
            }
            y0Var4 = y0Var2;
            mVar3 = mVar2;
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(i29, i17, -1, "androidx.navigation3.ui.NavDisplay (NavDisplay.kt:457)");
            }
            if (!list.isEmpty()) {
                throw new IllegalArgumentException("NavDisplay entries cannot be empty");
            }
            int i3114 = i17 >> 6;
            t0 t0Var1113 = t0Var2;
            SceneState sceneStateB16 = fa.r.b(list, a0Var, t0Var1113, aVar, rVarH, (i17 & 14) | (i3114 & 112) | (i3114 & 896) | ((i17 >> 18) & 7168), 0);
            list2 = list;
            hVarA = sceneStateB16.a();
            SceneInfo sceneInfo16 = new SceneInfo(hVarA);
            List<fa.h<T>> listD16 = sceneStateB16.d();
            arrayList = new ArrayList(v.y(listD16, 10));
            it = listD16.iterator();
            while (it.hasNext()) {
                arrayList.add(new SceneInfo((fa.h) it.next()));
            }
            x xVarB16 = z.b(sceneInfo16, arrayList, null, rVarH, 0, 4);
            boolean z1113 = !hVarA.a().isEmpty();
            boolean zG16 = rVarH.G(list2) | rVarH.W(hVarA);
            if ((1879048192 & i17) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | zG16;
            objE = rVarH.E();
            if (z17) {
                objE = new er.a() { // from class: ga.g
                    @Override // er.a
                    public final Object a() {
                        return o.x(list2, hVarA, aVar);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: ga.g
                    @Override // er.a
                    public final Object a() {
                        return o.x(list2, hVarA, aVar);
                    }
                };
                rVarH.v(objE);
            }
            ia.v.n(xVarB16, z1113, null, (er.a) objE, rVarH, 0, 4);
            rVar2 = rVarH;
            int i4110 = i17 >> 3;
            ga.c.a(sceneStateB16, xVarB16, mVar3, cVar3, y0Var4, lVar5, lVarD, pVarE, rVar2, ((i17 << 3) & 8064) | (57344 & i4110) | (458752 & i4110) | (3670016 & i4110) | (i4110 & 29360128), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            t0Var2 = t0Var1113;
            sVar2 = a0Var;
            mVar2 = mVar3;
            cVar2 = cVar3;
            y0Var3 = y0Var4;
            lVar3 = lVar5;
            lVar4 = lVarD;
            pVar2 = pVarE;
        } else {
            rVar2 = rVarH;
            list2 = list;
            rVar2.O();
            pVar2 = pVar;
            cVar2 = cVarO;
            sVar2 = a0Var;
            y0Var3 = y0Var2;
            lVar3 = lVar;
            lVar4 = lVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            final List list18 = list2;
            final f3.m mVar19 = mVar2;
            final t0 t0Var1114 = t0Var2;
            d5VarM.a(new er.p(list18, mVar19, cVar2, sVar2, t0Var1114, y0Var3, lVar3, lVar4, pVar2, aVar, i15, i16) { // from class: ga.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f71449a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f3.m f71450b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f3.c f71451c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fa.s f71452d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ y0 f71453e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ er.l f71454f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ er.l f71455g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ er.p f71456h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ er.a f71457j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f71458k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ int f71459l;

                {
                    this.f71453e = y0Var3;
                    this.f71454f = lVar3;
                    this.f71455g = lVar4;
                    this.f71456h = pVar2;
                    this.f71457j = aVar;
                    this.f71458k = i15;
                    this.f71459l = i16;
                }

                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.y(this.f71449a, this.f71450b, this.f71451c, this.f71452d, null, this.f71453e, this.f71454f, this.f71455g, this.f71456h, this.f71457j, this.f71458k, this.f71459l, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(List list) {
        if (w0.p(list)) {
            v.N(list);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.v p(boolean z15, fa.h hVar, int i15, er.p pVar, boolean z16, er.l lVar, er.l lVar2, p114t0.h hVar2) {
        p114t0.v vVar;
        p114t0.v vVar2;
        p114t0.v vVar3;
        if (z15) {
            er.p pVarB = B(hVar);
            return (pVarB == null || (vVar3 = (p114t0.v) pVarB.B(hVar2, Integer.valueOf(i15))) == null) ? (p114t0.v) pVar.B(hVar2, Integer.valueOf(i15)) : vVar3;
        }
        if (z16) {
            er.l lVarZ = z(hVar, "popTransitionSpec");
            return (lVarZ == null || (vVar2 = (p114t0.v) lVarZ.b(hVar2)) == null) ? (p114t0.v) lVar.b(hVar2) : vVar2;
        }
        er.l lVarZ2 = z(hVar, "transitionSpec");
        return (lVarZ2 == null || (vVar = (p114t0.v) lVarZ2.b(hVar2)) == null) ? (p114t0.v) lVar2.b(hVar2) : vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p114t0.v q(er.l lVar, float f15, y0 y0Var, p114t0.h hVar) {
        return new p114t0.v(((p114t0.v) lVar.b(hVar)).getTargetContentEnter(), ((p114t0.v) lVar.b(hVar)).getInitialContentExit(), f15, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(fa.h hVar) {
        return y.a(q0.c(hVar.getClass()), hVar.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(fa.h hVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1734941436, i15, -1, "androidx.navigation3.ui.NavDisplay.<anonymous>.<anonymous> (NavDisplay.kt:742)");
            }
            hVar.getContent().B(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 t(k2 k2Var, Map map, p114t0.f fVar, final fa.h hVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1167420988, i15, -1, "androidx.navigation3.ui.NavDisplay.<anonymous> (NavDisplay.kt:731)");
        }
        d0.d(new c4[]{m7.n.c().d(m7.q.c(fr.t.c(k2Var.p(), k2Var.w()) ? androidx.lifecycle.j.b.RESUMED : androidx.lifecycle.j.b.STARTED, null, rVar, 0, 2)), ga.b.c().d(fVar), fa.o.c().d(v0.j(map, y.a(q0.c(hVar.getClass()), hVar.getKey())))}, y2.m.d(-1734941436, true, new er.p() { // from class: ga.e
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return o.s(hVar, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, c4.f122821i | 48);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(fa.g gVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(485036444, i15, -1, "androidx.navigation3.ui.NavDisplay.<anonymous>.<anonymous> (NavDisplay.kt:770)");
            }
            gVar.getContent().B(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(SceneState sceneState, x xVar, f3.m mVar, f3.c cVar, y0 y0Var, er.l lVar, er.l lVar2, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        ga.c.a(sceneState, xVar, mVar, cVar, y0Var, lVar, lVar2, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(List list, f3.m mVar, f3.c cVar, er.a aVar, List list2, fa.s sVar, t0 t0Var, y0 y0Var, er.l lVar, er.l lVar2, er.p pVar, er.l lVar3, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        ga.c.b(list, mVar, cVar, aVar, list2, sVar, t0Var, y0Var, lVar, lVar2, pVar, lVar3, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(List list, fa.h hVar, er.a aVar) {
        int size = list.size() - hVar.a().size();
        for (int i15 = 0; i15 < size; i15++) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(List list, f3.m mVar, f3.c cVar, fa.s sVar, t0 t0Var, y0 y0Var, er.l lVar, er.l lVar2, er.p pVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        ga.c.c(list, mVar, cVar, sVar, t0Var, y0Var, lVar, lVar2, pVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final <T> er.l<p114t0.h<fa.h<T>>, p114t0.v> z(fa.h<T> hVar, String str) {
        Object obj = hVar.e().get(str);
        if (w0.o(obj, 1)) {
            return (er.l) obj;
        }
        return null;
    }
}
