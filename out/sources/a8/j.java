package a8;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f8.j f4509b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4512e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4516i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4520m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4510c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4511d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f8.y f4513f = f8.y.f60076a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4517j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4518k = 15000;

    public j(Context context) {
        this.f4508a = context;
        this.f4509b = new f8.j(context);
    }

    @Override // a8.d3
    public z2[] a(Handler handler, m8.k0 k0Var, c8.z zVar, i8.h hVar, g8.b bVar) {
        Handler handler2;
        ArrayList<z2> arrayList = new ArrayList<>();
        l(this.f4508a, this.f4510c, this.f4513f, this.f4512e, handler, k0Var, this.f4511d, arrayList);
        c8.a0 a0VarD = d(this.f4508a, this.f4514g, this.f4515h);
        if (a0VarD != null) {
            handler2 = handler;
            c(this.f4508a, this.f4510c, this.f4513f, this.f4512e, a0VarD, handler2, zVar, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.f4508a, hVar, handler2.getLooper(), this.f4510c, arrayList);
        h(this.f4508a, bVar, handler2.getLooper(), this.f4510c, arrayList);
        e(this.f4508a, this.f4510c, arrayList);
        f(this.f4508a, arrayList);
        i(this.f4508a, handler2, this.f4510c, arrayList);
        return (z2[]) arrayList.toArray(new z2[0]);
    }

    @Override // a8.d3
    public z2 b(z2 z2Var, Handler handler, m8.k0 k0Var, c8.z zVar, i8.h hVar, g8.b bVar) {
        if (z2Var.g() == 2) {
            return j(z2Var, this.f4508a, this.f4510c, this.f4513f, this.f4512e, handler, k0Var, this.f4511d);
        }
        return null;
    }

    protected void c(Context context, int i15, f8.y yVar, boolean z15, c8.a0 a0Var, Handler handler, c8.z zVar, ArrayList<z2> arrayList) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        arrayList.add(new c8.a1(context, m(), yVar, z15, handler, zVar, a0Var));
        if (i15 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i15 == 2) {
            size--;
        }
        try {
            try {
                i16 = size + 1;
                try {
                    arrayList.add(size, (z2) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, c8.z.class, c8.a0.class).newInstance(context, handler, zVar, a0Var));
                    w7.t.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i16;
                    i16 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i17 = i16 + 1;
                    try {
                        arrayList.add(i16, (z2) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, c8.z.class, c8.a0.class).newInstance(handler, zVar, a0Var));
                        w7.t.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i16 = i17;
                        i17 = i16;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        i18 = i17 + 1;
                        try {
                            arrayList.add(i17, (z2) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, c8.z.class, c8.a0.class).newInstance(handler, zVar, a0Var));
                            w7.t.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i17 = i18;
                            i18 = i17;
                        }
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        try {
                            i19 = i18 + 1;
                            try {
                                arrayList.add(i18, (z2) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, c8.z.class, c8.a0.class).newInstance(handler, zVar, a0Var));
                                w7.t.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused7) {
                                i18 = i19;
                                i19 = i18;
                            }
                        } catch (ClassNotFoundException unused8) {
                        }
                        try {
                            try {
                                Class<?> cls = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object objNewInstance = cls.getConstructor(c8.a0.class).newInstance(a0Var);
                                cls.getMethod("setEventHandlerAndListener", Handler.class, c8.z.class).invoke(objNewInstance, handler, zVar);
                                z2 z2Var = (z2) cls.getMethod("build", null).invoke(objNewInstance, null);
                                zj.p.q(z2Var);
                                i25 = i19 + 1;
                                try {
                                    arrayList.add(i19, z2Var);
                                    w7.t.f("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                } catch (ReflectiveOperationException unused9) {
                                    i19 = i25;
                                    i25 = i19;
                                }
                            } catch (Exception e15) {
                                throw new IllegalStateException("Error instantiating IAMF extension", e15);
                            }
                        } catch (ReflectiveOperationException unused10) {
                        }
                        try {
                            arrayList.add(i25, (z2) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, c8.z.class, c8.a0.class).newInstance(handler, zVar, a0Var));
                            w7.t.f("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused11) {
                        } catch (Exception e16) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e16);
                        }
                    } catch (Exception e17) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e17);
                    }
                } catch (Exception e18) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e18);
                }
            } catch (Exception e19) {
                throw new IllegalStateException("Error instantiating Opus extension", e19);
            }
        } catch (Exception e25) {
            throw new IllegalStateException("Error instantiating MIDI extension", e25);
        }
    }

    protected c8.a0 d(Context context, boolean z15, boolean z16) {
        return new c8.w0.f(context).i(z15).h(z16).g();
    }

    protected void e(Context context, int i15, ArrayList<z2> arrayList) {
        arrayList.add(new n8.b());
    }

    protected void f(Context context, ArrayList<z2> arrayList) {
        g(arrayList);
    }

    @Deprecated
    protected void g(ArrayList<z2> arrayList) {
        arrayList.add(new e8.f(n(this.f4508a), null));
    }

    protected void h(Context context, g8.b bVar, Looper looper, int i15, ArrayList<z2> arrayList) {
        for (int i16 = 0; i16 < 4; i16++) {
            arrayList.add(new g8.c(bVar, looper));
        }
    }

    protected void i(Context context, Handler handler, int i15, ArrayList<z2> arrayList) {
    }

    protected z2 j(z2 z2Var, Context context, int i15, f8.y yVar, boolean z15, Handler handler, m8.k0 k0Var, long j15) {
        if (!this.f4516i || z2Var.getClass() != m8.k.class) {
            return null;
        }
        m8.k.d dVarQ = new m8.k.d(context).t(m()).z(yVar).s(j15).u(z15).w(handler).x(k0Var).y(50).r(this.f4517j).q(this.f4518k);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarQ = dVarQ.p(this.f4519l);
        }
        return dVarQ.o();
    }

    protected void k(Context context, i8.h hVar, Looper looper, int i15, ArrayList<z2> arrayList) {
        arrayList.add(new i8.i(hVar, looper));
    }

    protected void l(Context context, int i15, f8.y yVar, boolean z15, Handler handler, m8.k0 k0Var, long j15, ArrayList<z2> arrayList) {
        int i16;
        int i17;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        m8.k.d dVarV = new m8.k.d(context).t(m()).z(yVar).s(j15).u(z15).w(handler).x(k0Var).y(50).r(this.f4517j).q(this.f4518k).v(this.f4520m);
        if (Build.VERSION.SDK_INT >= 34) {
            dVarV = dVarV.p(this.f4519l);
        }
        arrayList.add(dVarV.o());
        if (i15 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i15 == 2) {
            size--;
        }
        try {
            try {
                i16 = size + 1;
                try {
                    arrayList.add(size, (z2) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, m8.k0.class, cls).newInstance(Long.valueOf(j15), handler, k0Var, 50));
                    w7.t.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i16;
                    i16 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i17 = i16 + 1;
                    try {
                        arrayList.add(i16, (z2) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, m8.k0.class, cls).newInstance(Long.valueOf(j15), handler, k0Var, 50));
                        w7.t.f("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i16 = i17;
                        i17 = i16;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i17, (z2) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, m8.k0.class, cls).newInstance(Long.valueOf(j15), handler, k0Var, 50));
                    w7.t.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e15) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e15);
                }
            } catch (Exception e16) {
                throw new IllegalStateException("Error instantiating AV1 extension", e16);
            }
        } catch (Exception e17) {
            throw new IllegalStateException("Error instantiating VP9 extension", e17);
        }
    }

    protected f8.m.b m() {
        return this.f4509b;
    }

    protected e8.b.a n(Context context) {
        return new e8.a.b(context);
    }
}
