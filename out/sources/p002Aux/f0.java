package p002Aux;

import AUX.a;
import hc.i;
import p028con.k3;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f62b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64d;

    public f0(k3 k3Var, String str, String str2, a aVar, i iVar) {
        super(aVar, iVar);
        this.f62b = k3Var;
        this.f63c = str;
        this.f64d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (r6.b(r8, r1, r2, r5) == r7) goto L28;
     */
    @Override // p002Aux.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p013aUX.w0 r5, int r6, int r7, tq.e r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r8 instanceof p002Aux.e0
            if (r5 == 0) goto L13
            r5 = r8
            Aux.e0 r5 = (p002Aux.e0) r5
            int r6 = r5.f61f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r7
            if (r0 == 0) goto L13
            int r6 = r6 - r7
            r5.f61f = r6
            goto L1a
        L13:
            Aux.e0 r5 = new Aux.e0
            vq.d r8 = (vq.d) r8
            r5.<init>(r4, r8)
        L1a:
            java.lang.Object r6 = r5.f59d
            java.lang.Object r7 = uq.b.e()
            int r8 = r5.f61f
            r0 = 3
            r1 = 2
            r2 = 1
            if (r8 == 0) goto L41
            if (r8 == r2) goto L3d
            if (r8 == r1) goto L39
            if (r8 != r0) goto L31
            oq.u.b(r6)
            goto L9f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            oq.u.b(r6)
            goto L78
        L3d:
            oq.u.b(r6)
            goto L51
        L41:
            oq.u.b(r6)
            hc.i r6 = r4.f131a
            hc.g r6 = r6.f83071b
            r5.f61f = r2
            java.lang.Object r6 = r6.f(r5)
            if (r6 != r7) goto L51
            goto L9e
        L51:
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger$Companion r6 = com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger.INSTANCE
            com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger r6 = r6.Instance()
            com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessStartedMessage r8 = new com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessStartedMessage
            dv.b r2 = dv.b.IncorrectCan
            r2 = 110(0x6e, float:1.54E-43)
            java.lang.String r3 = "Resetting PIN"
            r8.<init>(r3, r2)
            r6.Send(r8)
            hc.i r6 = r4.f131a
            hc.g r6 = r6.f83071b
            AUx.d r6 = r6.a()
            con.k3 r8 = p028con.k3.Puk
            r5.f61f = r1
            java.lang.Object r6 = r6.c(r8, r5)
            if (r6 != r7) goto L78
            goto L9e
        L78:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 == 0) goto La2
            hc.i r6 = r4.f131a
            hc.g r6 = r6.f83071b
            AUx.d r6 = r6.a()
            con.k3 r8 = r4.f62b
            java.lang.String r1 = r4.f63c
            byte[] r1 = fu.r.D(r1)
            java.lang.String r2 = r4.f64d
            byte[] r2 = fu.r.D(r2)
            r5.f61f = r0
            java.lang.Object r5 = r6.b(r8, r1, r2, r5)
            if (r5 != r7) goto L9f
        L9e:
            return r7
        L9f:
            oq.i0 r5 = oq.i0.f148189a
            return r5
        La2:
            gc.g r5 = new gc.g
            java.lang.String r6 = "PUK is blocked."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p002Aux.f0.a(aUX.w0, int, int, tq.e):java.lang.Object");
    }
}
