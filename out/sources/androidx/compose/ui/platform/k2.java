package androidx.compose.ui.platform;

import androidx.compose.ui.node.Owner;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001aB\u0010\r\u001a\u00020\u0004*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0082@¢\u0006\u0004\b\r\u0010\u000e\"\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/j2;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/m2;", "Ltq/e;", "", "", "block", "b", "(Landroidx/compose/ui/platform/j2;Ler/p;Ltq/e;)Ljava/lang/Object;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/z0;", "chainedInterceptor", "session", "c", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/z0;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lm2/b4;", "a", "Lm2/b4;", "LocalChainedPlatformTextInputInterceptor", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<z0> f10647a = p076m2.d0.j(a.f10648b);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/z0;", "c", "()Landroidx/compose/ui/platform/z0;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<z0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10648b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z0 a() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10650e;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f10649d = obj;
            this.f10650e |= PKIFailureInfo.systemUnavail;
            return k2.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10652e;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f10651d = obj;
            this.f10652e |= PKIFailureInfo.systemUnavail;
            return k2.c(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(j2 j2Var, er.p<? super m2, ? super tq.e<?>, ? extends Object> pVar, tq.e<?> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f10650e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f10650e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f10649d;
        Object objE = uq.b.e();
        int i16 = bVar.f10650e;
        if (i16 == 0) {
            oq.u.b(obj);
            if (!j2Var.getNode().getIsAttached()) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            Owner ownerT = g4.h.t(j2Var);
            z0 z0Var = (z0) g4.h.s(j2Var).getCompositionLocalMap().a(f10647a);
            bVar.f10650e = 1;
            if (c(ownerT, z0Var, pVar, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r5.R(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.c(r5, r7, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.node.Owner r5, androidx.compose.ui.platform.z0 r6, er.p<? super androidx.compose.ui.platform.m2, ? super tq.e<?>, ? extends java.lang.Object> r7, tq.e<?> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.k2.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.k2$c r0 = (androidx.compose.ui.platform.k2.c) r0
            int r1 = r0.f10652e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10652e = r1
            goto L18
        L13:
            androidx.compose.ui.platform.k2$c r0 = new androidx.compose.ui.platform.k2$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10651d
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f10652e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            oq.u.b(r8)
            goto L55
        L34:
            oq.u.b(r8)
            goto L46
        L38:
            oq.u.b(r8)
            if (r6 != 0) goto L4c
            r0.f10652e = r4
            java.lang.Object r5 = r5.R(r7, r0)
            if (r5 != r1) goto L46
            goto L54
        L46:
            oq.g r5 = new oq.g
            r5.<init>()
            throw r5
        L4c:
            r0.f10652e = r3
            java.lang.Object r5 = r6.c(r5, r7, r0)
            if (r5 != r1) goto L55
        L54:
            return r1
        L55:
            oq.g r5 = new oq.g
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.k2.c(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.z0, er.p, tq.e):java.lang.Object");
    }
}
