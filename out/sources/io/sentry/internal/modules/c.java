package io.sentry.internal.modules;

import io.sentry.b7;
import io.sentry.v0;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pattern f95117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pattern f95118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ClassLoader f95119g;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f95120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f95121b;

        public a(String str, String str2) {
            this.f95120a = str;
            this.f95121b = str2;
        }
    }

    public c(v0 v0Var) {
        this(c.class.getClassLoader(), v0Var);
    }

    private a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f95118f.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private List<a> e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f95119g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarD = d(f(resources.nextElement()));
                if (aVarD != null) {
                    arrayList.add(aVarD);
                }
            }
            return arrayList;
        } catch (Throwable th4) {
            this.f95123a.b(b7.ERROR, "Unable to detect modules via manifest files.", th4);
            return arrayList;
        }
    }

    private String f(URL url) {
        Matcher matcher = this.f95117e.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        HashMap map = new HashMap();
        for (a aVar : e()) {
            map.put(aVar.f95120a, aVar.f95121b);
        }
        return map;
    }

    c(ClassLoader classLoader, v0 v0Var) {
        super(v0Var);
        this.f95117e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f95118f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f95119g = io.sentry.util.b.a(classLoader);
    }
}
