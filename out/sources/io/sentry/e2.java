package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 implements h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f94853c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f94854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, t1<?>> f94855b;

    public e2(q7 q7Var) {
        this.f94854a = q7Var;
        HashMap map = new HashMap();
        this.f94855b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.protocol.a.C2240a());
        map.put(f.class, new f.a());
        map.put(io.sentry.protocol.b.class, new io.sentry.protocol.b.a());
        map.put(io.sentry.protocol.c.class, new io.sentry.protocol.c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(io.sentry.protocol.d.class, new io.sentry.protocol.d.a());
        map.put(io.sentry.protocol.e.class, new io.sentry.protocol.e.a());
        map.put(io.sentry.protocol.e.b.class, new io.sentry.protocol.e.b.a());
        map.put(io.sentry.protocol.f.class, new io.sentry.protocol.f.a());
        map.put(io.sentry.protocol.h.class, new io.sentry.protocol.h.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(io.sentry.protocol.j.class, new io.sentry.protocol.j.a());
        map.put(io.sentry.protocol.k.class, new io.sentry.protocol.k.a());
        map.put(io.sentry.protocol.l.class, new io.sentry.protocol.l.a());
        map.put(s3.class, new s3.b());
        map.put(t3.class, new t3.a());
        map.put(w3.class, new w3.b());
        map.put(x3.class, new x3.a());
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.profilemeasurements.a.C2239a());
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.profilemeasurements.b.a());
        map.put(io.sentry.protocol.m.class, new io.sentry.protocol.m.a());
        map.put(b4.class, new b4.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C2241a());
        map.put(io.sentry.rrweb.c.class, new io.sentry.rrweb.c.a());
        map.put(io.sentry.rrweb.e.class, new io.sentry.rrweb.e.a());
        map.put(io.sentry.rrweb.f.class, new io.sentry.rrweb.f.a());
        map.put(io.sentry.rrweb.g.class, new io.sentry.rrweb.g.a());
        map.put(io.sentry.rrweb.i.class, new io.sentry.rrweb.i.a());
        map.put(io.sentry.rrweb.j.class, new io.sentry.rrweb.j.a());
        map.put(io.sentry.protocol.o.class, new io.sentry.protocol.o.a());
        map.put(io.sentry.protocol.p.class, new io.sentry.protocol.p.a());
        map.put(q5.class, new q5.a());
        map.put(q6.class, new q6.a());
        map.put(r6.class, new r6.a());
        map.put(io.sentry.protocol.q.class, new io.sentry.protocol.q.a());
        map.put(a7.class, new a7.a());
        map.put(b7.class, new b7.a());
        map.put(c7.class, new c7.a());
        map.put(f7.class, new f7.a());
        map.put(io.sentry.protocol.w.class, new io.sentry.protocol.w.a());
        map.put(io.sentry.protocol.x.class, new io.sentry.protocol.x.a());
        map.put(r7.class, new r7.a());
        map.put(io.sentry.protocol.y.class, new io.sentry.protocol.y.a());
        map.put(io.sentry.protocol.z.class, new io.sentry.protocol.z.a());
        map.put(io.sentry.protocol.a0.class, new io.sentry.protocol.a0.a());
        map.put(e5.class, new e5.a());
        map.put(io.sentry.protocol.b0.class, new io.sentry.protocol.b0.a());
        map.put(io.sentry.protocol.c0.class, new io.sentry.protocol.c0.a());
        map.put(i8.class, new i8.a());
        map.put(n8.class, new n8.a());
        map.put(s8.class, new s8.a());
        map.put(u8.class, new u8.a());
        map.put(io.sentry.protocol.g0.class, new io.sentry.protocol.g0.a());
        map.put(io.sentry.protocol.g.class, new io.sentry.protocol.g.a());
        map.put(g9.class, new g9.a());
        map.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.c.a());
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.i0.a());
        map.put(io.sentry.protocol.h0.class, new io.sentry.protocol.h0.a());
    }

    private <T> boolean g(Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String h(Object obj, boolean z15) {
        StringWriter stringWriter = new StringWriter();
        b2 b2Var = new b2(stringWriter, this.f94854a.getMaxDepth());
        if (z15) {
            b2Var.j("\t");
        }
        b2Var.l(this.f94854a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.h1
    public <T> void a(T t15, Writer writer) throws IOException {
        io.sentry.util.v.c(t15, "The entity is required.");
        io.sentry.util.v.c(writer, "The Writer object is required.");
        v0 logger = this.f94854a.getLogger();
        b7 b7Var = b7.DEBUG;
        if (logger.d(b7Var)) {
            this.f94854a.getLogger().c(b7Var, "Serializing object: %s", h(t15, this.f94854a.isEnablePrettySerializationOutput()));
        }
        new b2(writer, this.f94854a.getMaxDepth()).l(this.f94854a.getLogger(), t15);
        writer.flush();
    }

    @Override // io.sentry.h1
    public void b(p5 p5Var, OutputStream outputStream) throws IOException {
        io.sentry.util.v.c(p5Var, "The SentryEnvelope object is required.");
        io.sentry.util.v.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f94853c));
        try {
            p5Var.b().serialize(new b2(bufferedWriter, this.f94854a.getMaxDepth()), this.f94854a.getLogger());
            bufferedWriter.write("\n");
            for (p6 p6Var : p5Var.c()) {
                try {
                    byte[] bArrI = p6Var.I();
                    p6Var.J().serialize(new b2(bufferedWriter, this.f94854a.getMaxDepth()), this.f94854a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrI);
                    bufferedWriter.write("\n");
                } catch (Exception e15) {
                    this.f94854a.getLogger().b(b7.ERROR, "Failed to create envelope item. Dropping it.", e15);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th4) {
            bufferedWriter.flush();
            throw th4;
        }
    }

    @Override // io.sentry.h1
    public <T> T c(Reader reader, Class<T> cls) {
        T tCast;
        try {
            z1 z1Var = new z1(reader);
            try {
                t1<?> t1Var = this.f94855b.get(cls);
                if (t1Var != null) {
                    tCast = cls.cast(t1Var.a(z1Var, this.f94854a.getLogger()));
                } else {
                    if (!g(cls)) {
                        z1Var.close();
                        return null;
                    }
                    tCast = (T) z1Var.K3();
                }
                z1Var.close();
                return tCast;
            } catch (Throwable th4) {
                try {
                    z1Var.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Exception e15) {
            this.f94854a.getLogger().b(b7.ERROR, "Error when deserializing", e15);
            return null;
        }
    }

    @Override // io.sentry.h1
    public p5 d(InputStream inputStream) {
        io.sentry.util.v.c(inputStream, "The InputStream object is required.");
        try {
            return this.f94854a.getEnvelopeReader().a(inputStream);
        } catch (IOException e15) {
            this.f94854a.getLogger().b(b7.ERROR, "Error deserializing envelope.", e15);
            return null;
        }
    }

    @Override // io.sentry.h1
    public <T, R> T e(Reader reader, Class<T> cls, t1<R> t1Var) {
        try {
            z1 z1Var = new z1(reader);
            try {
                T t15 = (!Collection.class.isAssignableFrom(cls) || t1Var == null) ? (T) z1Var.K3() : (T) z1Var.T3(this.f94854a.getLogger(), t1Var);
                z1Var.close();
                return t15;
            } catch (Throwable th4) {
                try {
                    z1Var.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            this.f94854a.getLogger().b(b7.ERROR, "Error when deserializing", th6);
            return null;
        }
    }

    @Override // io.sentry.h1
    public String f(Map<String, Object> map) {
        return h(map, false);
    }
}
