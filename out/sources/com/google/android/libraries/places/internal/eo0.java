package com.google.android.libraries.places.internal;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class eo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f32232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f32233b;

    eo0(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        this.f32233b = (Level) zj.p.r(level, "level");
        this.f32232a = (Logger) zj.p.r(logger, "logger");
    }

    private static String k(nr0 nr0Var) {
        return nr0Var.K() <= 64 ? nr0Var.I().o() : String.valueOf(nr0Var.J((int) Math.min(nr0Var.K(), 64L)).o()).concat("...");
    }

    private final boolean l() {
        return this.f32232a.isLoggable(this.f32233b);
    }

    final void a(int i15, int i16, nr0 nr0Var, int i17, boolean z15) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            String strK = k(nr0Var);
            String strValueOf = String.valueOf(i16);
            StringBuilder sb5 = new StringBuilder(strA.length() + 16 + strValueOf.length() + 11 + String.valueOf(z15).length() + 8 + String.valueOf(i17).length() + 7 + String.valueOf(strK).length());
            sb5.append(strA);
            sb5.append(" DATA: streamId=");
            sb5.append(i16);
            sb5.append(" endStream=");
            sb5.append(z15);
            sb5.append(" length=");
            sb5.append(i17);
            sb5.append(" bytes=");
            sb5.append(strK);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb5.toString());
        }
    }

    final void b(int i15, int i16, List list, boolean z15) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String string = list.toString();
            StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 35 + string.length() + 11 + String.valueOf(z15).length());
            sb5.append("INBOUND HEADERS: streamId=");
            sb5.append(i16);
            sb5.append(" headers=");
            sb5.append(string);
            sb5.append(" endStream=");
            sb5.append(z15);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb5.toString());
        }
    }

    final void c(int i15, int i16, ip0 ip0Var) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            String strValueOf = String.valueOf(ip0Var);
            StringBuilder sb5 = new StringBuilder(strA.length() + 22 + String.valueOf(i16).length() + 11 + strValueOf.length());
            sb5.append(strA);
            sb5.append(" RST_STREAM: streamId=");
            sb5.append(i16);
            sb5.append(" errorCode=");
            sb5.append(strValueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb5.toString());
        }
    }

    final void d(int i15) {
        if (l()) {
            this.f32232a.logp(this.f32233b, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", bo0.a(2).concat(" SETTINGS: ack=true"));
        }
    }

    final void e(int i15, xp0 xp0Var) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            EnumMap enumMap = new EnumMap(do0.class);
            for (do0 do0Var : do0.values()) {
                if (xp0Var.b(do0Var.zza())) {
                    enumMap.put(do0Var, Integer.valueOf(xp0Var.c(do0Var.zza())));
                }
            }
            String string = enumMap.toString();
            StringBuilder sb5 = new StringBuilder(strA.length() + 30 + String.valueOf(string).length());
            sb5.append(strA);
            sb5.append(" SETTINGS: ack=false settings=");
            sb5.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb5.toString());
        }
    }

    final void f(int i15, long j15) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            StringBuilder sb5 = new StringBuilder(strA.length() + 23 + String.valueOf(j15).length());
            sb5.append(strA);
            sb5.append(" PING: ack=false bytes=");
            sb5.append(j15);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb5.toString());
        }
    }

    final void g(int i15, long j15) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strValueOf = String.valueOf(j15);
            String strA = bo0.a(2);
            StringBuilder sb5 = new StringBuilder(strA.length() + 22 + strValueOf.length());
            sb5.append(strA);
            sb5.append(" PING: ack=true bytes=");
            sb5.append(j15);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", sb5.toString());
        }
    }

    final void h(int i15, int i16, int i17, List list) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String string = list.toString();
            StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 49 + String.valueOf(i17).length() + 9 + string.length());
            sb5.append("INBOUND PUSH_PROMISE: streamId=");
            sb5.append(i16);
            sb5.append(" promisedStreamId=");
            sb5.append(i17);
            sb5.append(" headers=");
            sb5.append(string);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", sb5.toString());
        }
    }

    final void i(int i15, int i16, ip0 ip0Var, rr0 rr0Var) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            String strValueOf = String.valueOf(ip0Var);
            int iS = rr0Var.s();
            nr0 nr0Var = new nr0();
            nr0Var.u0(rr0Var);
            String strK = k(nr0Var);
            StringBuilder sb5 = new StringBuilder(strA.length() + 23 + String.valueOf(i16).length() + 11 + strValueOf.length() + 8 + String.valueOf(iS).length() + 7 + String.valueOf(strK).length());
            sb5.append(strA);
            sb5.append(" GO_AWAY: lastStreamId=");
            sb5.append(i16);
            sb5.append(" errorCode=");
            sb5.append(strValueOf);
            sb5.append(" length=");
            sb5.append(iS);
            sb5.append(" bytes=");
            sb5.append(strK);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb5.toString());
        }
    }

    final void j(int i15, int i16, long j15) {
        if (l()) {
            Logger logger = this.f32232a;
            Level level = this.f32233b;
            String strA = bo0.a(i15);
            String strValueOf = String.valueOf(i16);
            StringBuilder sb5 = new StringBuilder(strA.length() + 25 + strValueOf.length() + 21 + String.valueOf(j15).length());
            sb5.append(strA);
            sb5.append(" WINDOW_UPDATE: streamId=");
            sb5.append(i16);
            sb5.append(" windowSizeIncrement=");
            sb5.append(j15);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb5.toString());
        }
    }
}
