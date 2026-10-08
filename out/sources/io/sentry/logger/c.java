package io.sentry.logger;

import io.sentry.a1;
import io.sentry.b7;
import io.sentry.d7;
import io.sentry.e7;
import io.sentry.f5;
import io.sentry.g7;
import io.sentry.j1;
import io.sentry.m0;
import io.sentry.n5;
import io.sentry.protocol.g0;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.q4;
import io.sentry.q7;
import io.sentry.s8;
import io.sentry.util.i0;
import io.sentry.util.x;
import io.sentry.y3;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q4 f95159a;

    public c(q4 q4Var) {
        this.f95159a = q4Var;
    }

    private void b(g7 g7Var, h hVar, String str, Object... objArr) {
        q7 q7VarS = this.f95159a.s();
        try {
            if (!this.f95159a.isEnabled()) {
                q7VarS.getLogger().c(b7.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!q7VarS.getLogs().b()) {
                q7VarS.getLogger().c(b7.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            n5 n5VarC = hVar.c();
            if (n5VarC == null) {
                n5VarC = q7VarS.getDateProvider().a();
            }
            String strE = e(str, objArr);
            a1 a1VarZ = this.f95159a.z();
            y3 y3VarN = a1VarZ.N();
            j1 j1VarA = a1VarZ.a();
            if (j1VarA == null) {
                i0.h(a1VarZ, q7VarS);
            }
            v vVarE = j1VarA == null ? y3VarN.e() : j1VarA.w().n();
            s8 s8VarD = j1VarA == null ? y3VarN.d() : j1VarA.w().k();
            d7 d7Var = new d7(vVarE, n5VarC, strE, g7Var);
            d7Var.b(c(hVar, str, s8VarD, objArr));
            d7Var.c(Integer.valueOf(g7Var.getSeverityNumber()));
            this.f95159a.y().b(d7Var, a1VarZ);
        } catch (Throwable th4) {
            q7VarS.getLogger().b(b7.ERROR, "Error while capturing log event", th4);
        }
    }

    private HashMap<String, e7> c(h hVar, String str, s8 s8Var, Object... objArr) {
        HashMap<String, e7> map = new HashMap<>();
        map.put("sentry.origin", new e7(f5.STRING, hVar.b()));
        hVar.a();
        if (objArr != null) {
            int i15 = 0;
            for (Object obj : objArr) {
                map.put("sentry.message.parameter." + i15, new e7(d(obj), obj));
                i15++;
            }
            if (i15 > 0 && map.get("sentry.message.template") == null) {
                map.put("sentry.message.template", new e7(f5.STRING, str));
            }
        }
        p sdkVersion = this.f95159a.s().getSdkVersion();
        if (sdkVersion != null) {
            f5 f5Var = f5.STRING;
            map.put("sentry.sdk.name", new e7(f5Var, sdkVersion.e()));
            map.put("sentry.sdk.version", new e7(f5Var, sdkVersion.g()));
        }
        String environment = this.f95159a.s().getEnvironment();
        if (environment != null) {
            map.put("sentry.environment", new e7(f5.STRING, environment));
        }
        String release = this.f95159a.s().getRelease();
        if (release != null) {
            map.put("sentry.release", new e7(f5.STRING, release));
        }
        map.put("sentry.trace.parent_span_id", new e7(f5.STRING, s8Var));
        if (x.c()) {
            f(map);
        }
        g(map);
        return map;
    }

    private f5 d(Object obj) {
        if (obj instanceof Boolean) {
            return f5.BOOLEAN;
        }
        if (obj instanceof Integer) {
            return f5.INTEGER;
        }
        return obj instanceof Number ? f5.DOUBLE : f5.STRING;
    }

    private String e(String str, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            try {
                return String.format(str, objArr);
            } catch (Throwable th4) {
                this.f95159a.s().getLogger().b(b7.ERROR, "Error while running log through String.format", th4);
            }
        }
        return str;
    }

    private void f(HashMap<String, e7> map) {
        String strD;
        q7 q7VarS = this.f95159a.s();
        String serverName = q7VarS.getServerName();
        if (serverName != null) {
            map.put("server.address", new e7(f5.STRING, serverName));
        } else {
            if (!q7VarS.isAttachServerName() || (strD = m0.e().d()) == null) {
                return;
            }
            map.put("server.address", new e7(f5.STRING, strD));
        }
    }

    private void g(HashMap<String, e7> map) {
        g0 g0VarH = this.f95159a.z().H();
        if (g0VarH != null) {
            String strI = g0VarH.i();
            if (strI != null) {
                map.put("user.id", new e7(f5.STRING, strI));
            }
            String strK = g0VarH.k();
            if (strK != null) {
                map.put("user.name", new e7(f5.STRING, strK));
            }
            String strH = g0VarH.h();
            if (strH != null) {
                map.put("user.email", new e7(f5.STRING, strH));
            }
        }
    }

    @Override // io.sentry.logger.a
    public void a(g7 g7Var, h hVar, String str, Object... objArr) {
        b(g7Var, hVar, str, objArr);
    }
}
