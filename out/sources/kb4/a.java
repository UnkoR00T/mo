package kb4;

import ay.j;
import dx.i;
import fr.q0;
import fr.t;
import fu.r;
import fv.e0;
import java.util.Iterator;
import jb4.PayloadErrorData;
import mx.Label;
import org.json.JSONObject;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.l;
import px.c;
import px.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkb4/a;", "Lpl/gov/coi/common/network/l;", "Lay/j;", "jsonSerializer", "Ldx/a;", "deactivateDomainErrorFactory", "<init>", "(Lay/j;Ldx/a;)V", "", "json", "Llb4/a;", "c", "(Ljava/lang/String;)Llb4/a;", "Ldx/b;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "Lm00/a;", "response", "Ldx/i$b;", "b", "(Lm00/a;)Ldx/i$b;", "domainError", "a", "(Ldx/b;)Ldx/b;", "Lay/j;", "Ldx/a;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f109789d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.a deactivateDomainErrorFactory;

    public a(j jVar, dx.a aVar) {
        this.jsonSerializer = jVar;
        this.deactivateDomainErrorFactory = aVar;
    }

    private final lb4.a c(String json) {
        JSONObject jSONObject = new JSONObject(json);
        if (jSONObject.has("errorCode") || jSONObject.has("error")) {
            return (lb4.a) this.jsonSerializer.a(json, q0.n(lb4.a.OldPayloadErrorDtoV1.class));
        }
        return (jSONObject.has("action") || jSONObject.has("message") || (jSONObject.get("code") instanceof String)) ? (lb4.a) this.jsonSerializer.a(json, q0.n(lb4.a.NewPayloadErrorDto.class)) : (lb4.a) this.jsonSerializer.a(json, q0.n(lb4.a.OldPayloadErrorDtoV2.class));
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    @Override // pl.gov.coi.common.network.l
    public dx.b a(dx.b domainError) {
        if (!(domainError instanceof dx.b.g.Http)) {
            return domainError;
        }
        PayloadErrorData payloadErrorDataD = d(domainError);
        String action = payloadErrorDataD != null ? payloadErrorDataD.getAction() : null;
        if (!t.c(action, "APP_UPDATE_REQUIRED")) {
            return t.c(action, "DEACTIVATE") ? this.deactivateDomainErrorFactory.b(true) : domainError;
        }
        String title = payloadErrorDataD.getTitle();
        Label labelB = title != null ? mx.b.b(title, "AppUpdateRequiredTitleLabelTag") : null;
        String message = payloadErrorDataD.getMessage();
        return new dx.b.AppUpdateRequired(labelB, message != null ? mx.b.b(message, "AppUpdateRequiredMessageLabelTag") : null);
    }

    @Override // pl.gov.coi.common.network.l
    public i.Left<dx.b> b(m00.a response) {
        PayloadErrorData payloadErrorDataA;
        dx.b.g.Http.a next;
        String strC;
        lb4.a aVarC;
        f.e(f.f163100a, "call, response:\n" + response, null, c.a(this), 2, null);
        Iterator<dx.b.g.Http.a> it = dx.b.g.Http.a.g().iterator();
        do {
            payloadErrorDataA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getCode() != response.getCode());
        dx.b.g.Http.a aVar = next;
        if (aVar == null) {
            aVar = dx.b.g.Http.a.UNKNOWN;
        }
        dx.b.g.Http.a aVar2 = aVar;
        String message = response.getMessage();
        e0 errorBody = response.getErrorBody();
        if (errorBody != null && (strC = errorBody.C()) != null) {
            if (response.getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String() != m00.c.JSON || r.t0(strC)) {
                strC = null;
            }
            if (strC != null && (aVarC = c(strC)) != null) {
                payloadErrorDataA = b.a(aVarC);
            }
        }
        return new i.Left<>(a(new dx.b.g.Http(null, aVar2, message, payloadErrorDataA, 1, null)));
    }
}
