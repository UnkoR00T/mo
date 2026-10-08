package jg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f102530b = new k("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f102531c = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f102532a = new ConcurrentHashMap();

    protected p() {
    }

    public static p a() {
        return f102531c;
    }

    @Deprecated
    public String b(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        s.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f102532a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = p.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        k kVar = f102530b;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb5.append(str);
                        sb5.append(" version is ");
                        sb5.append(property);
                        kVar.e("LibraryVersion", sb5.toString());
                    } else {
                        k kVar2 = f102530b;
                        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb6.append("Failed to get app version for libraryName: ");
                        sb6.append(str);
                        kVar2.f("LibraryVersion", sb6.toString());
                    }
                } catch (IOException e15) {
                    e = e15;
                    str2 = property;
                    inputStream = resourceAsStream;
                    k kVar3 = f102530b;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb7.append("Failed to get app version for libraryName: ");
                    sb7.append(str);
                    kVar3.d("LibraryVersion", sb7.toString(), e);
                    resourceAsStream = inputStream;
                    property = str2;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        com.google.android.gms.common.util.i.a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                str2 = null;
            }
            if (resourceAsStream != null) {
                com.google.android.gms.common.util.i.a(resourceAsStream);
            }
            if (property == null) {
                f102530b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f102532a.put(str, property);
            return property;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
