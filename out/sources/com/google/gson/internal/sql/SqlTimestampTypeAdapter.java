package com.google.gson.internal.sql;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import java.sql.Timestamp;
import java.util.Date;
import zl.c;

/* JADX INFO: loaded from: classes4.dex */
class SqlTimestampTypeAdapter extends a0<Timestamp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b0 f36848b = new b0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(fVar.m(Date.class));
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0<Date> f36849a;

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(zl.a aVar) {
        Date dateB = this.f36849a.b(aVar);
        if (dateB != null) {
            return new Timestamp(dateB.getTime());
        }
        return null;
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Timestamp timestamp) {
        this.f36849a.d(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(a0<Date> a0Var) {
        this.f36849a = a0Var;
    }
}
