package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType;
import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsDto;
import fr.t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import oq.k;
import oq.l;
import oq.o;
import p071kotlin.Metadata;
import uu.m;
import yu.u1;
import yu.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsDto;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/e", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final /* data */ class RequestDetailsDto {
    public static final e Companion = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k[] f36949k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestDetailsFields f36951b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestType f36953d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36955f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CertificateType f36958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f36959j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Client f36950a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36952c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SignInfo f36954e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36956g = 600;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36957h = 600;

    static {
        o oVar = o.PUBLICATION;
        f36949k = new k[]{null, null, null, l.b(oVar, new er.a() { // from class: lo.a
            @Override // er.a
            public final Object a() {
                return w.a("com.pl.pwpw.mobile.edoapp.edoLibrary.api.RequestType", RequestType.values());
            }
        }), null, null, null, null, l.b(oVar, new er.a() { // from class: lo.b
            @Override // er.a
            public final Object a() {
                return w.a("com.pl.pwpw.mobile.edoapp.edoLibrary.api.CertificateType", CertificateType.values());
            }
        }), l.b(oVar, new er.a() { // from class: lo.c
            @Override // er.a
            public final Object a() {
                return RequestDetailsDto.c();
            }
        })};
    }

    public RequestDetailsDto(RequestDetailsFields requestDetailsFields, RequestType requestType, String str, CertificateType certificateType, List list) {
        this.f36951b = requestDetailsFields;
        this.f36953d = requestType;
        this.f36955f = str;
        this.f36958i = certificateType;
        this.f36959j = list;
    }

    public static final /* synthetic */ KSerializer c() {
        return new yu.f(u1.f229515a);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CertificateType getF36958i() {
        return this.f36958i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestDetailsDto)) {
            return false;
        }
        RequestDetailsDto requestDetailsDto = (RequestDetailsDto) obj;
        return t.c(this.f36950a, requestDetailsDto.f36950a) && t.c(this.f36951b, requestDetailsDto.f36951b) && t.c(this.f36952c, requestDetailsDto.f36952c) && this.f36953d == requestDetailsDto.f36953d && t.c(this.f36954e, requestDetailsDto.f36954e) && t.c(this.f36955f, requestDetailsDto.f36955f) && this.f36956g == requestDetailsDto.f36956g && this.f36957h == requestDetailsDto.f36957h && this.f36958i == requestDetailsDto.f36958i && t.c(this.f36959j, requestDetailsDto.f36959j);
    }

    public final int hashCode() {
        Client client = this.f36950a;
        int iHashCode = (client == null ? 0 : client.hashCode()) * 31;
        RequestDetailsFields requestDetailsFields = this.f36951b;
        int iHashCode2 = (iHashCode + (requestDetailsFields == null ? 0 : requestDetailsFields.hashCode())) * 31;
        String str = this.f36952c;
        int iHashCode3 = (this.f36953d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        SignInfo signInfo = this.f36954e;
        int iHashCode4 = (iHashCode3 + (signInfo == null ? 0 : signInfo.hashCode())) * 31;
        String str2 = this.f36955f;
        int iHashCode5 = (Integer.hashCode(this.f36957h) + ((Integer.hashCode(this.f36956g) + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        CertificateType certificateType = this.f36958i;
        return this.f36959j.hashCode() + ((iHashCode5 + (certificateType != null ? certificateType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RequestDetailsDto(client=" + this.f36950a + ", fields=" + this.f36951b + ", additionalPartnerInfo=" + this.f36952c + ", requestType=" + this.f36953d + ", signInfo=" + this.f36954e + ", challenge=" + this.f36955f + ", remainingSessionTime=" + this.f36956g + ", maxSessionTime=" + this.f36957h + ", certificateType=" + this.f36958i + ", operationSecurity=" + this.f36959j + ')';
    }
}
