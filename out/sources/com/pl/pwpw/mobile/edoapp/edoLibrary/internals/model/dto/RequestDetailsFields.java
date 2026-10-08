package com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto;

import com.pl.pwpw.mobile.edoapp.edoLibrary.internals.model.dto.RequestDetailsFields;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import oq.k;
import oq.l;
import oq.o;
import p071kotlin.Metadata;
import uu.m;
import yu.u1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/RequestDetailsFields;", "", "Companion", "$serializer", "com/pl/pwpw/mobile/edoapp/edoLibrary/internals/model/dto/f", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@m
public final class RequestDetailsFields {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k[] f36960b = {l.b(o.PUBLICATION, new er.a() { // from class: lo.d
        @Override // er.a
        public final Object a() {
            return RequestDetailsFields.a();
        }
    })};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36961a;

    public RequestDetailsFields(ArrayList arrayList) {
        this.f36961a = arrayList;
    }

    public static final /* synthetic */ KSerializer a() {
        return new yu.f(u1.f229515a);
    }
}
