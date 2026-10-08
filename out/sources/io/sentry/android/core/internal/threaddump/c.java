package io.sentry.android.core.internal.threaddump;

import io.sentry.b7;
import io.sentry.c7;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.z;
import io.sentry.q7;
import io.sentry.w7;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f93935f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f93936g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f93937h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f93938i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f93939j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f93940k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f93941l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f93942m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f93943n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f93944o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f93945p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f93946q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f93947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7 f93949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, DebugImage> f93950d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<b0> f93951e = new ArrayList();

    public c(q7 q7Var, boolean z15) {
        this.f93947a = q7Var;
        this.f93948b = z15;
        this.f93949c = new w7(q7Var);
    }

    private static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    private void b(b0 b0Var, c7 c7Var) {
        Map<String, c7> mapK = b0Var.k();
        if (mapK == null) {
            mapK = new HashMap<>();
        }
        c7 c7Var2 = mapK.get(c7Var.f());
        if (c7Var2 != null) {
            c7Var2.l(Math.max(c7Var2.g(), c7Var.g()));
        } else {
            mapK.put(c7Var.f(), new c7(c7Var));
        }
        b0Var.t(mapK);
    }

    private Integer d(Matcher matcher, int i15, Integer num) {
        String strGroup = matcher.group(i15);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long e(Matcher matcher, int i15, Long l15) {
        String strGroup = matcher.group(i15);
        return (strGroup == null || strGroup.length() == 0) ? l15 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer g(Matcher matcher, int i15, Integer num) {
        String strGroup = matcher.group(i15);
        if (strGroup != null && strGroup.length() != 0) {
            int i16 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i16);
            if (i16 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean h(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private a0 j(b bVar, b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f93937h.matcher("");
        Matcher matcher2 = f93938i.matcher("");
        Matcher matcher3 = f93939j.matcher("");
        Matcher matcher4 = f93940k.matcher("");
        Matcher matcher5 = f93942m.matcher("");
        Matcher matcher6 = f93941l.matcher("");
        Matcher matcher7 = f93944o.matcher("");
        Matcher matcher8 = f93943n.matcher("");
        Matcher matcher9 = f93945p.matcher("");
        Matcher matcher10 = f93946q.matcher("");
        z zVar = null;
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f93947a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f93930b;
            matcher10 = matcher10;
            if (h(matcher2, str)) {
                zVar = new z();
                String str2 = String.format("%s.%s", matcher2.group(1), matcher2.group(2));
                zVar.E(str2);
                zVar.z(matcher2.group(3));
                zVar.y(matcher2.group(4));
                zVar.C(g(matcher2, 5, null));
                zVar.A(this.f93949c.f(str2));
                arrayList.add(zVar);
                matcher2 = matcher2;
            } else {
                if (h(matcher, str)) {
                    z zVar2 = new z();
                    zVar2.G(matcher.group(3));
                    zVar2.z(matcher.group(6));
                    zVar2.C(d(matcher, 7, null));
                    zVar2.B("0x" + matcher.group(2));
                    zVar2.H("native");
                    String strGroup = matcher.group(8);
                    String strA = strGroup == null ? null : a(strGroup);
                    if (strA != null) {
                        if (!this.f93950d.containsKey(strA)) {
                            DebugImage debugImage = new DebugImage();
                            debugImage.setDebugId(strA);
                            debugImage.setType("elf");
                            debugImage.setCodeFile(matcher.group(4));
                            debugImage.setCodeId(strGroup);
                            this.f93950d.put(strA, debugImage);
                        }
                        zVar2.x("rel:" + strA);
                    } else {
                        matcher2 = matcher2;
                    }
                    arrayList.add(zVar2);
                    zVar = null;
                } else {
                    matcher2 = matcher2;
                    if (h(matcher3, str)) {
                        zVar = new z();
                        String str3 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                        zVar.E(str3);
                        zVar.z(matcher3.group(3));
                        zVar.A(this.f93949c.f(str3));
                        zVar.F(Boolean.TRUE);
                        arrayList.add(zVar);
                    } else if (h(matcher4, str)) {
                        if (zVar != null) {
                            c7 c7Var = new c7();
                            c7Var.l(1);
                            c7Var.h(matcher4.group(1));
                            c7Var.j(matcher4.group(2));
                            c7Var.i(matcher4.group(3));
                            zVar.D(c7Var);
                            b(b0Var, c7Var);
                        }
                    } else if (h(matcher5, str)) {
                        if (zVar != null) {
                            c7 c7Var2 = new c7();
                            c7Var2.l(2);
                            c7Var2.h(matcher5.group(1));
                            c7Var2.j(matcher5.group(2));
                            c7Var2.i(matcher5.group(3));
                            zVar.D(c7Var2);
                            b(b0Var, c7Var2);
                        }
                    } else if (!h(matcher6, str)) {
                        if (!h(matcher7, str)) {
                            if (!h(matcher8, str)) {
                                if (!h(matcher9, str)) {
                                    if (str.length() == 0) {
                                        break;
                                    }
                                    matcher10 = matcher10;
                                    if (h(matcher10, str)) {
                                        break;
                                    }
                                } else if (zVar != null) {
                                    c7 c7Var3 = new c7();
                                    c7Var3.l(8);
                                    zVar.D(c7Var3);
                                    b(b0Var, c7Var3);
                                }
                            } else if (zVar != null) {
                                c7 c7Var4 = new c7();
                                c7Var4.l(8);
                                c7Var4.h(matcher8.group(1));
                                c7Var4.j(matcher8.group(2));
                                c7Var4.i(matcher8.group(3));
                                zVar.D(c7Var4);
                                b(b0Var, c7Var4);
                            }
                        } else if (zVar != null) {
                            c7 c7Var5 = new c7();
                            c7Var5.l(8);
                            c7Var5.h(matcher7.group(1));
                            c7Var5.j(matcher7.group(2));
                            c7Var5.i(matcher7.group(3));
                            c7Var5.k(e(matcher7, 4, null));
                            zVar.D(c7Var5);
                            b(b0Var, c7Var5);
                        }
                        matcher10 = matcher10;
                    } else if (zVar != null) {
                        c7 c7Var6 = new c7();
                        c7Var6.l(4);
                        c7Var6.h(matcher6.group(1));
                        c7Var6.j(matcher6.group(2));
                        c7Var6.i(matcher6.group(3));
                        zVar.D(c7Var6);
                        b(b0Var, c7Var6);
                    }
                }
                matcher2 = matcher2;
            }
            matcher2 = matcher2;
        }
        Collections.reverse(arrayList);
        a0 a0Var = new a0(arrayList);
        a0Var.e(Boolean.TRUE);
        return a0Var;
    }

    private b0 k(b bVar) {
        b0 b0Var = new b0();
        Matcher matcher = f93935f.matcher("");
        Matcher matcher2 = f93936g.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z15 = false;
        if (aVarB == null) {
            this.f93947a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (h(matcher, aVarB.f93930b)) {
            Long lE = e(matcher, 4, null);
            if (lE == null) {
                this.f93947a.getLogger().c(b7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            b0Var.u(lE);
            b0Var.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    b0Var.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    b0Var.z(strGroup);
                }
            }
        } else if (h(matcher2, aVarB.f93930b)) {
            Long lE2 = e(matcher2, 3, null);
            if (lE2 == null) {
                this.f93947a.getLogger().c(b7.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            b0Var.u(lE2);
            b0Var.w(matcher2.group(1));
        }
        String strM = b0Var.m();
        if (strM != null) {
            boolean zEquals = strM.equals("main");
            b0Var.v(Boolean.valueOf(zEquals));
            b0Var.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f93948b) {
                z15 = true;
            }
            b0Var.r(Boolean.valueOf(z15));
        }
        b0Var.y(j(bVar, b0Var));
        return b0Var;
    }

    public List<DebugImage> c() {
        return new ArrayList(this.f93950d.values());
    }

    public List<b0> f() {
        return this.f93951e;
    }

    public void i(b bVar) {
        Matcher matcher = f93935f.matcher("");
        Matcher matcher2 = f93936g.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f93947a.getLogger().c(b7.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = aVarB.f93930b;
            if (h(matcher, str) || h(matcher2, str)) {
                bVar.d();
                b0 b0VarK = k(bVar);
                if (b0VarK != null) {
                    this.f93951e.add(b0VarK);
                }
            }
        }
    }
}
