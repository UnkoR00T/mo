package tv;

import fr.k;
import fu.r;
import fv.b0;
import fv.c0;
import fv.d0;
import fv.e0;
import fv.j;
import fv.u;
import fv.w;
import fv.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ov.h;
import p071kotlin.Metadata;
import pq.e1;
import vv.e;
import vv.g;
import vv.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0017\u000eB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00108\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0011\u0010\"¨\u0006#"}, d2 = {"Ltv/a;", "Lfv/w;", "Ltv/a$b;", "logger", "<init>", "(Ltv/a$b;)V", "Lfv/u;", "headers", "", "i", "Loq/i0;", "c", "(Lfv/u;I)V", "", "b", "(Lfv/u;)Z", "Ltv/a$a;", "level", "d", "(Ltv/a$a;)Ltv/a;", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Ltv/a$b;", "", "", "Ljava/util/Set;", "headersToRedact", "<set-?>", "Ltv/a$a;", "getLevel", "()Ltv/a$a;", "(Ltv/a$a;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Set<String> headersToRedact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile EnumC5026a level;

    /* JADX INFO: renamed from: tv.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ltv/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EnumC5026a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltv/a$b;", "", "", "message", "Loq/i0;", "a", "(Ljava/lang/String;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f192356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f192355b = new Companion.C5028a();

        /* JADX INFO: renamed from: tv.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Ltv/a$b$a;", "", "<init>", "()V", "Ltv/a$b;", "DEFAULT", "Ltv/a$b;", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f192356a = new Companion();

            /* JADX INFO: renamed from: tv.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv/a$b$a$a;", "Ltv/a$b;", "<init>", "()V", "", "message", "Loq/i0;", "a", "(Ljava/lang/String;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class C5028a implements b {
                @Override // tv.a.b
                public void a(String message) {
                    h.k(h.INSTANCE.g(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void a(String message);
    }

    public a(b bVar) {
        this.logger = bVar;
        this.headersToRedact = e1.e();
        this.level = EnumC5026a.NONE;
    }

    private final boolean b(u headers) {
        String strE = headers.e("Content-Encoding");
        return (strE == null || r.G(strE, "identity", true) || r.G(strE, "gzip", true)) ? false : true;
    }

    private final void c(u headers, int i15) {
        String strK = this.headersToRedact.contains(headers.f(i15)) ? "██" : headers.k(i15);
        this.logger.a(headers.f(i15) + ": " + strK);
    }

    @Override // fv.w
    public d0 a(w.a chain) throws Exception {
        String string;
        long j15;
        char c15;
        String string2;
        Charset charsetC;
        Charset charsetC2;
        EnumC5026a enumC5026a = this.level;
        b0 b0VarC = chain.C();
        if (enumC5026a == EnumC5026a.NONE) {
            return chain.a(b0VarC);
        }
        boolean z15 = enumC5026a == EnumC5026a.BODY;
        boolean z16 = z15 || enumC5026a == EnumC5026a.HEADERS;
        c0 body = b0VarC.getBody();
        j jVarB = chain.b();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("--> ");
        sb5.append(b0VarC.getMethod());
        sb5.append(' ');
        sb5.append(b0VarC.getUrl());
        if (jVarB != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(' ');
            sb6.append(jVarB.getProtocol());
            string = sb6.toString();
        } else {
            string = "";
        }
        sb5.append(string);
        String string3 = sb5.toString();
        if (!z16 && body != null) {
            string3 = string3 + " (" + body.a() + "-byte body)";
        }
        this.logger.a(string3);
        if (z16) {
            u headers = b0VarC.getHeaders();
            if (body != null) {
                x contentType = body.getF67282b();
                j15 = -1;
                if (contentType != null && headers.e("Content-Type") == null) {
                    this.logger.a("Content-Type: " + contentType);
                }
                if (body.a() != -1 && headers.e("Content-Length") == null) {
                    this.logger.a("Content-Length: " + body.a());
                }
            } else {
                j15 = -1;
            }
            int size = headers.size();
            for (int i15 = 0; i15 < size; i15++) {
                c(headers, i15);
            }
            if (!z15 || body == null) {
                this.logger.a("--> END " + b0VarC.getMethod());
            } else if (b(b0VarC.getHeaders())) {
                this.logger.a("--> END " + b0VarC.getMethod() + " (encoded body omitted)");
            } else if (body.f()) {
                this.logger.a("--> END " + b0VarC.getMethod() + " (duplex request body omitted)");
            } else if (body.g()) {
                this.logger.a("--> END " + b0VarC.getMethod() + " (one-shot body omitted)");
            } else {
                e eVar = new e();
                body.h(eVar);
                x contentType2 = body.getF67282b();
                if (contentType2 == null || (charsetC2 = contentType2.c(StandardCharsets.UTF_8)) == null) {
                    charsetC2 = StandardCharsets.UTF_8;
                }
                this.logger.a("");
                if (tv.b.a(eVar)) {
                    this.logger.a(eVar.n3(charsetC2));
                    this.logger.a("--> END " + b0VarC.getMethod() + " (" + body.a() + "-byte body)");
                } else {
                    this.logger.a("--> END " + b0VarC.getMethod() + " (binary " + body.a() + "-byte body omitted)");
                }
            }
        } else {
            j15 = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            d0 d0VarA = chain.a(b0VarC);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            e0 body2 = d0VarA.getBody();
            long f67344d = body2.getContentLength();
            String str = f67344d != j15 ? f67344d + "-byte" : "unknown-length";
            b bVar = this.logger;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("<-- ");
            sb7.append(d0VarA.getCode());
            if (d0VarA.getMessage().length() == 0) {
                string2 = "";
                c15 = ' ';
            } else {
                String message = d0VarA.getMessage();
                StringBuilder sb8 = new StringBuilder();
                c15 = ' ';
                sb8.append(' ');
                sb8.append(message);
                string2 = sb8.toString();
            }
            sb7.append(string2);
            sb7.append(c15);
            sb7.append(d0VarA.getRequest().getUrl());
            sb7.append(" (");
            sb7.append(millis);
            sb7.append("ms");
            sb7.append(z16 == 0 ? ", " + str + " body" : "");
            sb7.append(')');
            bVar.a(sb7.toString());
            if (z16) {
                u headers2 = d0VarA.getHeaders();
                int size2 = headers2.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    c(headers2, i16);
                }
                if (z15 && lv.e.b(d0VarA)) {
                    if (b(d0VarA.getHeaders())) {
                        this.logger.a("<-- END HTTP (encoded body omitted)");
                        return d0VarA;
                    }
                    g f67345e = body2.getSource();
                    f67345e.request(Long.MAX_VALUE);
                    e eVarV = f67345e.v();
                    Long l15 = null;
                    if (r.G("gzip", headers2.e("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(eVarV.getSize());
                        p pVar = new p(eVarV.clone());
                        try {
                            eVarV = new e();
                            eVarV.U1(pVar);
                            ar.b.a(pVar, null);
                            l15 = lValueOf;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ar.b.a(pVar, th4);
                                throw th5;
                            }
                        }
                    }
                    x f67343c = body2.getF67343c();
                    if (f67343c == null || (charsetC = f67343c.c(StandardCharsets.UTF_8)) == null) {
                        charsetC = StandardCharsets.UTF_8;
                    }
                    if (!tv.b.a(eVarV)) {
                        this.logger.a("");
                        this.logger.a("<-- END HTTP (binary " + eVarV.getSize() + "-byte body omitted)");
                        return d0VarA;
                    }
                    if (f67344d != 0) {
                        this.logger.a("");
                        this.logger.a(eVarV.clone().n3(charsetC));
                    }
                    if (l15 == null) {
                        this.logger.a("<-- END HTTP (" + eVarV.getSize() + "-byte body)");
                        return d0VarA;
                    }
                    this.logger.a("<-- END HTTP (" + eVarV.getSize() + "-byte, " + l15 + "-gzipped-byte body)");
                    return d0VarA;
                }
                this.logger.a("<-- END HTTP");
            }
            return d0VarA;
        } catch (Exception e15) {
            this.logger.a("<-- HTTP FAILED: " + e15);
            throw e15;
        }
    }

    public final a d(EnumC5026a level) {
        this.level = level;
        return this;
    }

    public /* synthetic */ a(b bVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? b.f192355b : bVar);
    }
}
