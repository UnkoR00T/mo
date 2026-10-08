package com.google.gson.internal.sql;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import com.google.gson.u;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import zl.b;
import zl.c;

/* JADX INFO: loaded from: classes4.dex */
final class SqlTimeTypeAdapter extends a0<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b0 f36846b = new b0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f36847a;

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(zl.a aVar) throws IOException {
        Time time;
        if (aVar.a0() == b.NULL) {
            aVar.O();
            return null;
        }
        String strQ2 = aVar.q2();
        synchronized (this) {
            TimeZone timeZone = this.f36847a.getTimeZone();
            try {
                try {
                    time = new Time(this.f36847a.parse(strQ2).getTime());
                    this.f36847a.setTimeZone(timeZone);
                } catch (ParseException e15) {
                    throw new u("Failed parsing '" + strQ2 + "' as SQL Time; at path " + aVar.E(), e15);
                }
            } catch (Throwable th4) {
                this.f36847a.setTimeZone(timeZone);
                throw th4;
            }
        }
        return time;
    }

    @Override // com.google.gson.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.M();
            return;
        }
        synchronized (this) {
            str = this.f36847a.format((Date) time);
        }
        cVar.H0(str);
    }

    private SqlTimeTypeAdapter() {
        this.f36847a = new SimpleDateFormat("hh:mm:ss a");
    }
}
