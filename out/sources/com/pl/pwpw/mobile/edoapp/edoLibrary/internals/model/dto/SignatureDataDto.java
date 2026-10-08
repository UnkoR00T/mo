package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import fr.t;
import p071kotlin.Metadata;
import uu.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignatureDataDto;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/h", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final /* data */ class SignatureDataDto {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDataDto f36965a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36966b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36967c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36968d = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureDataDto)) {
            return false;
        }
        SignatureDataDto signatureDataDto = (SignatureDataDto) obj;
        return t.c(this.f36965a, signatureDataDto.f36965a) && t.c(this.f36966b, signatureDataDto.f36966b) && t.c(this.f36967c, signatureDataDto.f36967c) && t.c(this.f36968d, signatureDataDto.f36968d);
    }

    public final int hashCode() {
        AdditionalDataDto additionalDataDto = this.f36965a;
        return this.f36968d.hashCode() + zp.a.a(this.f36967c, zp.a.a(this.f36966b, (additionalDataDto == null ? 0 : additionalDataDto.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "SignatureDataDto(additional=" + this.f36965a + ", sod=" + this.f36966b + ", authentication=" + this.f36967c + ", scenario=" + this.f36968d + ')';
    }
}
