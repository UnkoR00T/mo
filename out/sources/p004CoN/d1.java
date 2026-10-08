package p004CoN;

import AUX.a;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsDto;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsFields;
import fr.t;
import hc.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p002Aux.a0;
import p002Aux.b0;
import p002Aux.d0;
import p002Aux.f0;
import p002Aux.h0;
import p002Aux.j0;
import p002Aux.l0;
import p002Aux.n0;
import p002Aux.p0;
import p002Aux.r0;
import p002Aux.t0;
import p002Aux.v;
import p002Aux.v0;
import p002Aux.y;
import p013aUX.w0;
import p028con.k3;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f253f = new ArrayList();

    public d1(RequestDetailsDto requestDetailsDto, String str, String str2, a aVar, i iVar) {
        RequestType requestType;
        List list;
        List list2;
        this.f248a = str;
        this.f249b = str2;
        this.f250c = aVar;
        this.f251d = iVar;
        if (requestDetailsDto != null) {
            RequestDetailsFields requestDetailsFields = requestDetailsDto.f36951b;
            if (requestDetailsFields != null && (list2 = requestDetailsFields.f36961a) != null && !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!t.c((String) it.next(), "DG2")) {
                        this.f253f.add(new r0(this.f251d));
                        this.f253f.add(new l0(this.f251d));
                        this.f253f.add(new n0(this.f251d));
                        this.f253f.add(new p0(this.f251d));
                        this.f253f.add(new v0(this.f251d));
                        break;
                    }
                }
            }
            RequestDetailsFields requestDetailsFields2 = requestDetailsDto.f36951b;
            if (requestDetailsFields2 != null && (list = requestDetailsFields2.f36961a) != null && list.contains("DG2")) {
                this.f253f.add(new t0(this.f251d));
            }
            CertificateType certificateType = requestDetailsDto.f36958i;
            if (certificateType != null && (requestType = requestDetailsDto.f36953d) != RequestType.RESET_PIN && requestType != RequestType.CHANGE_PIN) {
                int i15 = b1.f241a[certificateType.ordinal()];
                if (i15 == 1) {
                    this.f253f.add(new p002Aux.t(this.f250c, this.f251d));
                } else if (i15 == 2) {
                    this.f253f.add(new h0(this.f250c, this.f251d));
                } else {
                    if (i15 != 3) {
                        throw new p();
                    }
                    this.f253f.add(new j0(this.f250c, this.f251d));
                }
            }
            RequestType requestType2 = requestDetailsDto.f36953d;
            RequestType requestType3 = RequestType.SIGN;
            if (requestType2 == requestType3) {
                k3 k3VarA = a(requestDetailsDto.f36958i);
                k3 k3Var = k3.Presence;
                if (k3VarA != k3Var) {
                    this.f253f.add(new a0(k3VarA, this.f248a, this.f250c, this.f251d));
                }
                this.f253f.add(new v(requestDetailsDto.f36955f, requestDetailsDto.f36958i, this.f250c, this.f251d));
                k3 k3VarA2 = a(requestDetailsDto.f36958i);
                if (k3VarA2 != k3Var) {
                    this.f253f.add(new b0(k3VarA2, this.f250c, this.f251d));
                }
            }
            if (requestDetailsDto.f36953d == RequestType.CHANGE_PIN) {
                this.f253f.add(new d0(a(requestDetailsDto.f36958i), this.f248a, this.f249b, this.f250c, this.f251d));
            }
            if (requestDetailsDto.f36953d == RequestType.RESET_PIN) {
                this.f253f.add(new f0(a(requestDetailsDto.f36958i), this.f248a, this.f249b, this.f250c, this.f251d));
            }
            RequestType requestType4 = requestDetailsDto.f36953d;
            this.f252e = (requestType4 != requestType3 || requestDetailsDto.f36958i == CertificateType.PRESENCE) ? (requestType4 == requestType3 && requestDetailsDto.f36958i == CertificateType.PRESENCE) ? this.f253f.size() - 1 : this.f253f.size() : this.f253f.size() - 3;
        }
    }

    public static k3 a(CertificateType certificateType) {
        int i15 = b1.f241a[certificateType.ordinal()];
        if (i15 == 1) {
            return k3.Presence;
        }
        if (i15 == 2) {
            return k3.Authentication;
        }
        if (i15 == 3) {
            return k3.Authorization;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(w0 w0Var, d dVar) throws Throwable {
        c1 c1Var;
        Iterator it;
        int i15;
        if (dVar instanceof c1) {
            c1Var = (c1) dVar;
            int i16 = c1Var.f247j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                c1Var.f247j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                c1Var = new c1(this, dVar);
            }
        } else {
            c1Var = new c1(this, dVar);
        }
        Object obj = c1Var.f245g;
        Object objE = b.e();
        int i17 = c1Var.f247j;
        if (i17 == 0) {
            u.b(obj);
            it = this.f253f.iterator();
            i15 = 0;
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i18 = c1Var.f244f;
            it = c1Var.f243e;
            w0 w0Var2 = c1Var.f242d;
            u.b(obj);
            i15 = i18;
            w0Var = w0Var2;
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i19 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            int i25 = this.f252e;
            c1Var.f242d = w0Var;
            c1Var.f243e = it;
            c1Var.f244f = i19;
            c1Var.f247j = 1;
            if (((y) next).a(w0Var, i15, i25, c1Var) == objE) {
                return objE;
            }
            i15 = i19;
        }
        return w0Var;
    }
}
