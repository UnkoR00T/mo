package c10;

import java.util.Date;
import java.util.Map;
import my.JWSPayloadData;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc10/e;", "Lly/b;", "Lmy/c;", "<init>", "()V", "data", "", "b", "(Lmy/c;Ltq/e;)Ljava/lang/Object;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements ly.b<JWSPayloadData> {
    @Override // ly.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(JWSPayloadData jWSPayloadData, tq.e<? super String> eVar) {
        jo.a.b bVar = new jo.a.b();
        String issuer = jWSPayloadData.getIssuer();
        if (issuer != null) {
            bVar.g(issuer);
        }
        String subject = jWSPayloadData.getSubject();
        if (subject != null) {
            bVar.j(subject);
        }
        Date notBeforeTime = jWSPayloadData.getNotBeforeTime();
        if (notBeforeTime != null) {
            bVar.i(notBeforeTime);
        }
        Date expirationTime = jWSPayloadData.getExpirationTime();
        if (expirationTime != null) {
            bVar.e(expirationTime);
        }
        JWSPayloadData.a audienceType = jWSPayloadData.getAudienceType();
        if (audienceType != null) {
            if (audienceType instanceof JWSPayloadData.a.Multiple) {
                bVar.b(((JWSPayloadData.a.Multiple) audienceType).a());
            } else {
                if (!(audienceType instanceof JWSPayloadData.a.Single)) {
                    throw new p();
                }
                bVar.a(((JWSPayloadData.a.Single) audienceType).getAudience());
            }
        }
        String jwtID = jWSPayloadData.getJwtID();
        if (jwtID != null) {
            bVar.h(jwtID);
        }
        Date iat = jWSPayloadData.getIat();
        if (iat != null) {
            bVar.f(iat);
        }
        for (Map.Entry<String, Object> entry : jWSPayloadData.b().entrySet()) {
            bVar.d(entry.getKey(), entry.getValue());
        }
        return bVar.c().j().c().toString();
    }
}
