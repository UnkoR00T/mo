package io.sentry.internal.modules;

import io.sentry.b7;
import io.sentry.g1;
import io.sentry.v0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f95122d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final v0 f95123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f95124b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map<String, String> f95125c = null;

    public d(v0 v0Var) {
        this.f95123a = v0Var;
    }

    @Override // io.sentry.internal.modules.b
    public Map<String, String> a() {
        if (this.f95125c == null) {
            g1 g1VarA = this.f95124b.a();
            try {
                if (this.f95125c == null) {
                    this.f95125c = b();
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        return this.f95125c;
    }

    protected abstract Map<String, String> b();

    protected Map<String, String> c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f95122d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f95123a.c(b7.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            this.f95123a.b(b7.ERROR, "Error extracting modules.", e15);
            return treeMap;
        } catch (RuntimeException e16) {
            this.f95123a.a(b7.ERROR, e16, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
