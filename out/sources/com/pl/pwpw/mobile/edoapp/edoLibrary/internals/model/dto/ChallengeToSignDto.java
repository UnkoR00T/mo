package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import fr.t;
import p071kotlin.Metadata;
import uu.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/ChallengeToSignDto;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/b", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final /* data */ class ChallengeToSignDto {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36939c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeToSignDto)) {
            return false;
        }
        ChallengeToSignDto challengeToSignDto = (ChallengeToSignDto) obj;
        return t.c(this.f36937a, challengeToSignDto.f36937a) && t.c(this.f36938b, challengeToSignDto.f36938b) && t.c(this.f36939c, challengeToSignDto.f36939c);
    }

    public final int hashCode() {
        return this.f36939c.hashCode() + zp.a.a(this.f36938b, this.f36937a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChallengeToSignDto(challenge=" + this.f36937a + ", timestamp=" + this.f36938b + ", fingerprint=" + this.f36939c + ')';
    }
}
