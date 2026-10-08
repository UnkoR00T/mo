package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class di0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final e40 f32039g = e40.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Long f32040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Boolean f32041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Integer f32042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Integer f32043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final ml0 f32044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final af0 f32045f;

    di0(Map map, boolean z15, int i15, int i16) {
        long j15;
        ml0 ml0Var;
        af0 af0Var;
        this.f32040a = fg0.h(map, "timeout");
        this.f32041b = fg0.i(map, "waitForReady");
        Integer numF = fg0.f(map, "maxResponseMessageBytes");
        this.f32042c = numF;
        if (numF != null) {
            zj.p.l(numF.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numF);
        }
        Integer numF2 = fg0.f(map, "maxRequestMessageBytes");
        this.f32043d = numF2;
        if (numF2 != null) {
            zj.p.l(numF2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numF2);
        }
        Map mapD = z15 ? fg0.d(map, "retryPolicy") : null;
        if (mapD == null) {
            j15 = 0;
            ml0Var = null;
        } else {
            int iIntValue = ((Integer) zj.p.r(fg0.f(mapD, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            zj.p.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, 5);
            long jLongValue = ((Long) zj.p.r(fg0.h(mapD, "initialBackoff"), "initialBackoff cannot be empty")).longValue();
            zj.p.k(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) zj.p.r(fg0.h(mapD, "maxBackoff"), "maxBackoff cannot be empty")).longValue();
            zj.p.k(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d15 = (Double) zj.p.r(fg0.e(mapD, "backoffMultiplier"), "backoffMultiplier cannot be empty");
            double dDoubleValue = d15.doubleValue();
            j15 = 0;
            zj.p.l(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d15);
            Long lH = fg0.h(mapD, "perAttemptRecvTimeout");
            zj.p.l(lH == null || lH.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lH);
            Set setA = zl0.a(mapD);
            zj.p.e((lH == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            ml0Var = new ml0(iMin, jLongValue, jLongValue2, dDoubleValue, lH, setA);
        }
        this.f32044e = ml0Var;
        Map mapD2 = z15 ? fg0.d(map, "hedgingPolicy") : null;
        if (mapD2 == null) {
            af0Var = null;
        } else {
            int iIntValue2 = ((Integer) zj.p.r(fg0.f(mapD2, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            zj.p.h(iIntValue2 >= 2, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            long jLongValue3 = ((Long) zj.p.r(fg0.h(mapD2, "hedgingDelay"), "hedgingDelay cannot be empty")).longValue();
            zj.p.k(jLongValue3 >= j15, "hedgingDelay must not be negative: %s", jLongValue3);
            af0Var = new af0(iMin2, jLongValue3, zl0.b(mapD2));
        }
        this.f32045f = af0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return zj.l.a(this.f32040a, di0Var.f32040a) && zj.l.a(this.f32041b, di0Var.f32041b) && zj.l.a(this.f32042c, di0Var.f32042c) && zj.l.a(this.f32043d, di0Var.f32043d) && zj.l.a(this.f32044e, di0Var.f32044e) && zj.l.a(this.f32045f, di0Var.f32045f);
    }

    public final int hashCode() {
        return zj.l.b(this.f32040a, this.f32041b, this.f32042c, this.f32043d, this.f32044e, this.f32045f);
    }

    public final String toString() {
        return zj.j.c(this).d("timeoutNanos", this.f32040a).d("waitForReady", this.f32041b).d("maxInboundMessageSize", this.f32042c).d("maxOutboundMessageSize", this.f32043d).d("retryPolicy", this.f32044e).d("hedgingPolicy", this.f32045f).toString();
    }
}
