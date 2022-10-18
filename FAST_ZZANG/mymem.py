from fastapi import FastAPI, Request, Form
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles 
from fastapi.templating import Jinja2Templates 
from pydantic import BaseModel
from starlette.responses import JSONResponse



app = FastAPI() 
templates = Jinja2Templates(directory="templates") 
app.mount("/static", StaticFiles(directory="static"), name="static") 

@app.get('/', response_class=HTMLResponse) 
def zzang(request: Request):
    return templates.TemplateResponse("zzang.html", {"request": request}) 

@app.get('/zzang2', response_class=HTMLResponse) 
def zzang2(request: Request):
    return templates.TemplateResponse("zzang2.html", {"request": request}) 



# uvicorn mymem:app --reload