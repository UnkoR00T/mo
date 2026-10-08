package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import fr.t;
import p071kotlin.Metadata;
import uu.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/SignaturePayloadDto;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/i", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final /* data */ class SignaturePayloadDto {
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SignatureDataDto f36972d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignaturePayloadDto)) {
            return false;
        }
        SignaturePayloadDto signaturePayloadDto = (SignaturePayloadDto) obj;
        return t.c(this.f36969a, signaturePayloadDto.f36969a) && t.c(this.f36970b, signaturePayloadDto.f36970b) && t.c(this.f36971c, signaturePayloadDto.f36971c) && t.c(this.f36972d, signaturePayloadDto.f36972d);
    }

    public final int hashCode() {
        return this.f36972d.hashCode() + zp.a.a(this.f36971c, zp.a.a(this.f36970b, this.f36969a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SignaturePayloadDto(challenge=" + this.f36969a + ", certificate=" + this.f36970b + ", timestamp=" + this.f36971c + ", data=" + this.f36972d + ')';
    }
}
