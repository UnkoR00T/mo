package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ak.u0 f33108d = ak.u0.Q("applet", "base", "embed", "math", "meta", "object", "svg", "template");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ak.u0 f33109e = ak.u0.E("script");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ak.u0 f33110f = ak.u0.E("style");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ak.u0 f33111g = ak.u0.Q("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ak.u0 f33112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ak.u0 f33113i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33115b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33116c = new ArrayList();

    static {
        ak.u0.E("input");
        ak.u0.E("form");
        ak.u0.E("script");
        ak.u0.F("button", "input");
        ak.u0.F("button", "input");
        f33112h = ak.u0.F("a", "area");
        f33113i = ak.u0.Q("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
        ak.u0.E("form");
        ak.u0.E("input");
        ak.u0.F("input", "textarea");
        ak.u0.M("audio", "img", "input", "source", "video");
        ak.u0.E("iframe");
    }

    public o(String str) {
        if (!"a".matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (f33108d.contains("a")) {
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        this.f33114a = "a";
    }

    public final o a(q qVar) {
        String str;
        ak.u0 u0Var = f33112h;
        String str2 = this.f33114a;
        if (!u0Var.contains(str2) && !str2.equals("link")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(u0Var)));
        }
        if (!str2.equals("link") || (str = (String) this.f33115b.get("rel")) == null || f33113i.contains(str.toLowerCase(Locale.ENGLISH))) {
            String strA = qVar.a();
            Map map = this.f33115b;
            int i15 = l.f32777b;
            map.put("href", gp.b(strA, 65533));
            return this;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + 113);
        sb5.append("SafeUrl values for the href attribute are not allowed on <link rel=");
        sb5.append(str);
        sb5.append(">. Did you intend to use a TrustedResourceUrl?");
        throw new IllegalArgumentException(sb5.toString());
    }

    public final o b(String str) {
        Iterator it = Arrays.asList(p.a(str)).iterator();
        ak.u0 u0Var = f33111g;
        String str2 = this.f33114a;
        zj.p.B(!u0Var.contains(str2), "Element \"%s\" is a void element and so cannot have content.", str2);
        zj.p.B(!f33109e.contains(str2), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", str2);
        zj.p.B(!f33110f.contains(str2), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", str2);
        while (it.hasNext()) {
            this.f33116c.add(((n) it.next()).a());
        }
        return this;
    }

    public final n c() {
        StringBuilder sb5 = new StringBuilder("<");
        String str = this.f33114a;
        sb5.append(str);
        for (Map.Entry entry : this.f33115b.entrySet()) {
            sb5.append(" ");
            sb5.append((String) entry.getKey());
            sb5.append("=\"");
            sb5.append(l.a((String) entry.getValue()));
            sb5.append("\"");
        }
        boolean zContains = f33111g.contains(str);
        sb5.append(">");
        if (!zContains) {
            Iterator it = this.f33116c.iterator();
            while (it.hasNext()) {
                sb5.append((String) it.next());
            }
            sb5.append("</");
            sb5.append(str);
            sb5.append(">");
        }
        return new n(sb5.toString());
    }
}
