package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import fr.t;
import p071kotlin.Metadata;
import uu.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/IcaoDto;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/d", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final /* data */ class IcaoDto {
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36943a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36944b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36945c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36946d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36947e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36948f = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IcaoDto)) {
            return false;
        }
        IcaoDto icaoDto = (IcaoDto) obj;
        return t.c(this.f36943a, icaoDto.f36943a) && t.c(this.f36944b, icaoDto.f36944b) && t.c(this.f36945c, icaoDto.f36945c) && t.c(this.f36946d, icaoDto.f36946d) && t.c(this.f36947e, icaoDto.f36947e) && t.c(this.f36948f, icaoDto.f36948f);
    }

    public final int hashCode() {
        return this.f36948f.hashCode() + zp.a.a(this.f36947e, zp.a.a(this.f36946d, zp.a.a(this.f36945c, zp.a.a(this.f36944b, this.f36943a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "IcaoDto(DG1=" + this.f36943a + ", DG2=" + this.f36944b + ", DG11=" + this.f36945c + ", DG12=" + this.f36946d + ", DG13=" + this.f36947e + ", SOD=" + this.f36948f + ')';
    }
}
