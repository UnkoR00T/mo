package p002Aux;

import AUX.a;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.Messenger;
import com.pl.pwpw.mobile.edoapp.edoLibrary.messages.ProcessInfoMessage;
import fu.r;
import hc.g;
import hc.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p005Con.g1;
import p005Con.i1;
import p013aUX.w0;
import p028con.h3;
import p028con.j3;
import p028con.o3;
import p028con.p3;
import tq.e;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class v extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CertificateType f129c;

    public v(String str, CertificateType certificateType, a aVar, i iVar) {
        super(aVar, iVar);
        this.f128b = str;
        this.f129c = certificateType;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p002Aux.y
    public final Object a(w0 w0Var, int i15, int i16, e eVar) throws Throwable {
        u uVar;
        g1 g1Var;
        Object objA;
        w0 w0Var2;
        g1 g1Var2;
        if (eVar instanceof u) {
            uVar = (u) eVar;
            int i17 = uVar.f121h;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                uVar.f121h = i17 - PKIFailureInfo.systemUnavail;
            } else {
                uVar = new u(this, (d) eVar);
            }
        } else {
            uVar = new u(this, (d) eVar);
        }
        Object obj = uVar.f119f;
        Object objE = b.e();
        int i18 = uVar.f121h;
        if (i18 == 0) {
            u.b(obj);
            g gVar = this.f131a.f83071b;
            uVar.f117d = w0Var;
            uVar.f121h = 1;
            if (gVar.f(uVar) != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            w0Var = uVar.f117d;
            u.b(obj);
        } else {
            if (i18 == 2) {
                w0Var = uVar.f117d;
                u.b(obj);
                g1Var = g1.f258a;
                p000AUx.e eVarG = this.f131a.f83071b.g();
                byte[] bArrB = i1.b(this.f128b);
                o3 o3Var = o3.ECDSA_384;
                p3 p3Var = p3.ECDSA_X962;
                uVar.f117d = w0Var;
                uVar.f118e = g1Var;
                uVar.f121h = 3;
                objA = eVarG.a(bArrB, o3Var, p3Var, uVar);
                if (objA != objE) {
                    w0Var2 = w0Var;
                    g1Var2 = g1Var;
                    obj = objA;
                }
                return objE;
            }
            if (i18 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var2 = uVar.f118e;
            w0Var2 = uVar.f117d;
            u.b(obj);
        }
        g1Var2.getClass();
        String strA = r.A(g1.f259b.a((byte[]) obj));
        w0Var2.getClass();
        w0Var2.f5132l = strA;
        return i0.f148189a;
        Messenger messengerInstance = Messenger.INSTANCE.Instance();
        dv.b bVar = dv.b.IncorrectCan;
        messengerInstance.Send(new ProcessInfoMessage("Signing", 108));
        p000AUx.e eVarG2 = this.f131a.f83071b.g();
        h3 h3VarValueOf = h3.valueOf(this.f129c.name());
        o3 o3Var2 = o3.ECDSA_384;
        j3 j3Var = j3.SHA384;
        uVar.f117d = w0Var;
        uVar.f121h = 2;
        if (eVarG2.b(h3VarValueOf, o3Var2, j3Var, uVar) != objE) {
            g1Var = g1.f258a;
            p000AUx.e eVarG3 = this.f131a.f83071b.g();
            byte[] bArrB2 = i1.b(this.f128b);
            o3 o3Var3 = o3.ECDSA_384;
            p3 p3Var2 = p3.ECDSA_X962;
            uVar.f117d = w0Var;
            uVar.f118e = g1Var;
            uVar.f121h = 3;
            objA = eVarG3.a(bArrB2, o3Var3, p3Var2, uVar);
            if (objA != objE) {
                w0Var2 = w0Var;
                g1Var2 = g1Var;
                obj = objA;
                g1Var2.getClass();
                String strA2 = r.A(g1.f259b.a((byte[]) obj));
                w0Var2.getClass();
                w0Var2.f5132l = strA2;
                return i0.f148189a;
            }
        }
        return objE;
    }
}
