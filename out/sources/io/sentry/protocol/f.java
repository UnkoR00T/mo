package io.sentry.protocol;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f95388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v f95389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f95390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f95391g;

    public static final class a implements t1<f> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            String strO2 = null;
            String strO3 = null;
            String strO4 = null;
            v vVarA = null;
            v vVarA2 = null;
            String strO5 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "associated_event_id":
                        vVarA = new v.a().a(k3Var, v0Var);
                        break;
                    case "replay_id":
                        vVarA2 = new v.a().a(k3Var, v0Var);
                        break;
                    case "url":
                        strO5 = k3Var.O2();
                        break;
                    case "name":
                        strO4 = k3Var.O2();
                        break;
                    case "contact_email":
                        strO3 = k3Var.O2();
                        break;
                    case "message":
                        strO2 = k3Var.O2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        k3Var.U2(v0Var, map, strH1);
                        break;
                }
            }
            k3Var.h0();
            if (strO2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                v0Var.b(b7.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            f fVar = new f(strO2);
            fVar.f95386b = strO3;
            fVar.f95387c = strO4;
            fVar.f95388d = vVarA;
            fVar.f95389e = vVarA2;
            fVar.f95390f = strO5;
            fVar.f95391g = map;
            return fVar;
        }
    }

    public f(String str) {
        g(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return io.sentry.util.v.a(this.f95385a, fVar.f95385a) && io.sentry.util.v.a(this.f95386b, fVar.f95386b) && io.sentry.util.v.a(this.f95387c, fVar.f95387c) && io.sentry.util.v.a(this.f95388d, fVar.f95388d) && io.sentry.util.v.a(this.f95389e, fVar.f95389e) && io.sentry.util.v.a(this.f95390f, fVar.f95390f) && io.sentry.util.v.a(this.f95391g, fVar.f95391g);
    }

    public void g(String str) {
        if (str.length() > 4096) {
            this.f95385a = str.substring(0, PKIFailureInfo.certConfirmed);
        } else {
            this.f95385a = str;
        }
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95385a, this.f95386b, this.f95387c, this.f95388d, this.f95389e, this.f95390f, this.f95391g);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("message").h(this.f95385a);
        if (this.f95386b != null) {
            l3Var.f("contact_email").h(this.f95386b);
        }
        if (this.f95387c != null) {
            l3Var.f("name").h(this.f95387c);
        }
        if (this.f95388d != null) {
            l3Var.f("associated_event_id");
            this.f95388d.serialize(l3Var, v0Var);
        }
        if (this.f95389e != null) {
            l3Var.f("replay_id");
            this.f95389e.serialize(l3Var, v0Var);
        }
        if (this.f95390f != null) {
            l3Var.f("url").h(this.f95390f);
        }
        Map<String, Object> map = this.f95391g;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f95391g.get(str));
            }
        }
        l3Var.h0();
    }

    public String toString() {
        return "Feedback{message='" + this.f95385a + "', contactEmail='" + this.f95386b + "', name='" + this.f95387c + "', associatedEventId=" + this.f95388d + ", replayId=" + this.f95389e + ", url='" + this.f95390f + "', unknown=" + this.f95391g + '}';
    }

    public f(f fVar) {
        this.f95385a = fVar.f95385a;
        this.f95386b = fVar.f95386b;
        this.f95387c = fVar.f95387c;
        this.f95388d = fVar.f95388d;
        this.f95389e = fVar.f95389e;
        this.f95390f = fVar.f95390f;
        this.f95391g = io.sentry.util.c.c(fVar.f95391g);
    }
}
