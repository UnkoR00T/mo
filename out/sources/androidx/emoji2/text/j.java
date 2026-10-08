package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import x5.w;

/* JADX INFO: loaded from: classes3.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f12304k = new a();

    public static class a {
        public Typeface a(Context context, f6.g.b bVar) {
            return f6.g.a(context, null, new f6.g.b[]{bVar});
        }

        public f6.g.a b(Context context, f6.e eVar) {
            return f6.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f6.e f12306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f12307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f12308d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f12309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f12310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f12311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f12312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f12313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f12314j;

        b(Context context, f6.e eVar, a aVar) {
            i6.i.h(context, "Context cannot be null");
            i6.i.h(eVar, "FontRequest cannot be null");
            this.f12305a = context.getApplicationContext();
            this.f12306b = eVar;
            this.f12307c = aVar;
        }

        private void b() {
            synchronized (this.f12308d) {
                try {
                    this.f12312h = null;
                    ContentObserver contentObserver = this.f12313i;
                    if (contentObserver != null) {
                        this.f12307c.c(this.f12305a, contentObserver);
                        this.f12313i = null;
                    }
                    Handler handler = this.f12309e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f12314j);
                    }
                    this.f12309e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f12311g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f12310f = null;
                    this.f12311g = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        private f6.g.b e() {
            try {
                f6.g.a aVarB = this.f12307c.b(this.f12305a, this.f12306b);
                if (aVarB.e() == 0) {
                    f6.g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e15) {
                throw new RuntimeException("provider not found", e15);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            i6.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f12308d) {
                this.f12312h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f12308d) {
                try {
                    if (this.f12312h == null) {
                        return;
                    }
                    try {
                        f6.g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f12308d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            e6.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f12307c.a(this.f12305a, bVarE);
                            ByteBuffer byteBufferE = w.e(this.f12305a, null, bVarE.e());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferE);
                            e6.l.b();
                            synchronized (this.f12308d) {
                                try {
                                    e.i iVar = this.f12312h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            b();
                        } catch (Throwable th5) {
                            e6.l.b();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        synchronized (this.f12308d) {
                            try {
                                e.i iVar2 = this.f12312h;
                                if (iVar2 != null) {
                                    iVar2.a(th6);
                                }
                                b();
                            } catch (Throwable th7) {
                                throw th7;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    throw th8;
                }
            }
        }

        void d() {
            synchronized (this.f12308d) {
                try {
                    if (this.f12312h == null) {
                        return;
                    }
                    if (this.f12310f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f12311g = threadPoolExecutorB;
                        this.f12310f = threadPoolExecutorB;
                    }
                    this.f12310f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12315a.c();
                        }
                    });
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f12308d) {
                this.f12310f = executor;
            }
        }
    }

    public j(Context context, f6.e eVar) {
        super(new b(context, eVar, f12304k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
