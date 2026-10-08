package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentHashMap<Uri, c> f29263h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f29264i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f29265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f29266b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Map<String, String> f29269e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f29268d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f29270f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<e> f29271g = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentObserver f29267c = new d(this, null);

    private c(ContentResolver contentResolver, Uri uri) {
        this.f29265a = contentResolver;
        this.f29266b = uri;
    }

    public static c a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, c> concurrentHashMap = f29263h;
        c cVar = concurrentHashMap.get(uri);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(contentResolver, uri);
        c cVarPutIfAbsent = concurrentHashMap.putIfAbsent(uri, cVar2);
        if (cVarPutIfAbsent != null) {
            return cVarPutIfAbsent;
        }
        cVar2.f29265a.registerContentObserver(cVar2.f29266b, false, cVar2.f29267c);
        return cVar2;
    }

    private final Map<String, String> e() {
        try {
            HashMap map = new HashMap();
            Cursor cursorQuery = this.f29265a.query(this.f29266b, f29264i, null, null, null);
            if (cursorQuery == null) {
                return map;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                } catch (Throwable th4) {
                    cursorQuery.close();
                    throw th4;
                }
            }
            cursorQuery.close();
            return map;
        } catch (SQLiteException | SecurityException unused) {
            io.sentry.android.core.c2.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        synchronized (this.f29270f) {
            try {
                Iterator<e> it = this.f29271g.iterator();
                while (it.hasNext()) {
                    it.next().h();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final Map<String, String> c() {
        Map<String, String> mapE = f.h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? e() : this.f29269e;
        if (mapE == null) {
            synchronized (this.f29268d) {
                try {
                    mapE = this.f29269e;
                    if (mapE == null) {
                        mapE = e();
                        this.f29269e = mapE;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return mapE != null ? mapE : Collections.EMPTY_MAP;
    }

    public final void d() {
        synchronized (this.f29268d) {
            this.f29269e = null;
        }
    }
}
