package com.google.gson.internal.sql;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import zl.b;
import zl.c;

/* JADX INFO: loaded from: classes4.dex */
final class SqlDateTypeAdapter extends a0<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b0 f36844b = new b0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f36845a;

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(zl.a aVar) throws IOException {
        Date date;
        if (aVar.a0() == b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        synchronized (this) {
            TimeZone timeZone = this.f36845a.getTimeZone();
            try {
                try {
                    date = new Date(this.f36845a.parse(strQ2).getTime());
                    this.f36845a.setTimeZone(timeZone);
                } catch (ParseException e15) {
                    throw new u("Failed parsing '" + strQ2 + "' as SQL Date; at path " + aVar.E(), e15);
                }
            } catch (Throwable th4) {
                this.f36845a.setTimeZone(timeZone);
                throw th4;
            }
        }
        return date;
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.M();
            return;
        }
        synchronized (this) {
            str = this.f36845a.format((java.util.Date) date);
        }
        cVar.H0(str);
    }

    private SqlDateTypeAdapter() {
        this.f36845a = new SimpleDateFormat("MMM d, yyyy");
    }
}
